package com.geniusnine.android.rangolii.FreeHand;

/**
 * Created by Dev on 09-12-2016.
 */



import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class AutumnImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public AutumnImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.f1);
        imageId.add(R.drawable.f2);
        imageId.add(R.drawable.f3);
        imageId.add(R.drawable.f4);
        imageId.add(R.drawable.f5);
        imageId.add(R.drawable.f6);
        imageId.add(R.drawable.f7);
        imageId.add(R.drawable.f8);
        imageId.add(R.drawable.f9);
        imageId.add(R.drawable.f10);
        imageId.add(R.drawable.f11);
        imageId.add(R.drawable.f12);
        imageId.add(R.drawable.f13);
        imageId.add(R.drawable.f14);
        imageId.add(R.drawable.f15);
        imageId.add(R.drawable.f16);
        imageId.add(R.drawable.f17);
        imageId.add(R.drawable.f18);
        imageId.add(R.drawable.f19);
        imageId.add(R.drawable.f20);
        imageId.add(R.drawable.f21);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
