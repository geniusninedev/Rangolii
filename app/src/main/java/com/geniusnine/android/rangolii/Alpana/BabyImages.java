package com.geniusnine.android.rangolii.Alpana;

/**
 * Created by Dev on 09-12-2016.
 */


import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class BabyImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public BabyImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.a2);
        imageId.add(R.drawable.a13);
        imageId.add(R.drawable.a14);
        imageId.add(R.drawable.a15);
        imageId.add(R.drawable.a17);
        imageId.add(R.drawable.a18);
        imageId.add(R.drawable.a19);
        imageId.add(R.drawable.a20);
        imageId.add(R.drawable.a21);
        imageId.add(R.drawable.a22);
        imageId.add(R.drawable.a23);
        imageId.add(R.drawable.a1);
        imageId.add(R.drawable.a3);
        imageId.add(R.drawable.a4);
        imageId.add(R.drawable.a5);
        imageId.add(R.drawable.a6);
        imageId.add(R.drawable.a16);
        imageId.add(R.drawable.a7);
        imageId.add(R.drawable.a8);
        imageId.add(R.drawable.a9);
        imageId.add(R.drawable.a10);
        imageId.add(R.drawable.a11);
        imageId.add(R.drawable.a12);




    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
