package com.geniusnine.android.rangolii.Pulses;

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
        imageId.add(R.drawable.pu1);
        imageId.add(R.drawable.pu2);
        imageId.add(R.drawable.pu3);
        imageId.add(R.drawable.pu4);
        imageId.add(R.drawable.pu5);
        imageId.add(R.drawable.pu6);
        imageId.add(R.drawable.pu7);
        imageId.add(R.drawable.pu8);
        imageId.add(R.drawable.pu9);
        imageId.add(R.drawable.pu10);
        imageId.add(R.drawable.pu11);
        imageId.add(R.drawable.pu12);
        imageId.add(R.drawable.pu13);
        imageId.add(R.drawable.pu14);
        imageId.add(R.drawable.pu15);
        imageId.add(R.drawable.pu16);
        imageId.add(R.drawable.pu17);
        imageId.add(R.drawable.pu18);
        imageId.add(R.drawable.pu19);
        imageId.add(R.drawable.pu20);


    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
