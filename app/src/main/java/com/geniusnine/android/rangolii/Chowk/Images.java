package com.geniusnine.android.rangolii.Chowk;

/**
 * Created by Dev on 09-12-2016.
 */



import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class Images {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public Images() {
     imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.c1);
        imageId.add(R.drawable.c2);
        imageId.add(R.drawable.c3);
        imageId.add(R.drawable.c4);
        imageId.add(R.drawable.c5);
        imageId.add(R.drawable.c7);
        imageId.add(R.drawable.c8);
        imageId.add(R.drawable.c9);
        imageId.add(R.drawable.c10);
        imageId.add(R.drawable.c12);
        imageId.add(R.drawable.c11);
        imageId.add(R.drawable.c13);
        imageId.add(R.drawable.c14);
        imageId.add(R.drawable.c15);
        imageId.add(R.drawable.c16);
        imageId.add(R.drawable.c17);
        imageId.add(R.drawable.c18);
        imageId.add(R.drawable.c19);
        imageId.add(R.drawable.c20);


    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
