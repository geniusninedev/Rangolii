package com.geniusnine.android.rangolii.Rice;

/**
 * Created by Dev on 12-12-2016.
 */



import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class ElegantImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public ElegantImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.r1);
        imageId.add(R.drawable.r2);
        imageId.add(R.drawable.r3);
        imageId.add(R.drawable.r4);
        imageId.add(R.drawable.r5);
        imageId.add(R.drawable.r6);
        imageId.add(R.drawable.r7);
        imageId.add(R.drawable.r8);
        imageId.add(R.drawable.r9);
        imageId.add(R.drawable.r10);
        imageId.add(R.drawable.r11);
        imageId.add(R.drawable.r12);
        imageId.add(R.drawable.r13);
        imageId.add(R.drawable.r14);
        imageId.add(R.drawable.r15);
        imageId.add(R.drawable.r16);
        imageId.add(R.drawable.r17);
        imageId.add(R.drawable.r18);
        imageId.add(R.drawable.r19);
        imageId.add(R.drawable.r20);
        imageId.add(R.drawable.r21);
        imageId.add(R.drawable.r22);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
