package com.geniusnine.android.rangolii.Wooden;

/**
 * Created by Dev on 09-12-2016.
 */


import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class CartoonImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public CartoonImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.w1);
        imageId.add(R.drawable.w2);
        imageId.add(R.drawable.w3);
        imageId.add(R.drawable.w4);
        imageId.add(R.drawable.w5);
        imageId.add(R.drawable.w6);
        imageId.add(R.drawable.w7);
        imageId.add(R.drawable.w8);
        imageId.add(R.drawable.w9);
        imageId.add(R.drawable.w21);
        imageId.add(R.drawable.w20);
        imageId.add(R.drawable.w10);
        imageId.add(R.drawable.w11);
        imageId.add(R.drawable.w12);
        imageId.add(R.drawable.w13);
        imageId.add(R.drawable.w14);
        imageId.add(R.drawable.w15);
        imageId.add(R.drawable.w19);
        imageId.add(R.drawable.w17);
        imageId.add(R.drawable.w18);
        imageId.add(R.drawable.w20);


    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
