package com.geniusnine.android.rangolii.Portraitrangoli;

/**
 * Created by Dev on 12-12-2016.
 */



import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class LoveImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public LoveImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.p1);
        imageId.add(R.drawable.p2);
        imageId.add(R.drawable.p3);
        imageId.add(R.drawable.p4);
        imageId.add(R.drawable.p5);
        imageId.add(R.drawable.p6);
        imageId.add(R.drawable.p7);
        imageId.add(R.drawable.p8);
        imageId.add(R.drawable.p9);
        imageId.add(R.drawable.p22);
        imageId.add(R.drawable.p23);

        imageId.add(R.drawable.p12);
        imageId.add(R.drawable.p13);
        imageId.add(R.drawable.p14);
        imageId.add(R.drawable.p15);
        imageId.add(R.drawable.p16);
        imageId.add(R.drawable.p19);
        imageId.add(R.drawable.p20);
        imageId.add(R.drawable.p21);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
