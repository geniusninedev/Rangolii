package com.geniusnine.android.rangolii.Dotted;

/**
 * Created by Dev on 09-12-2016.
 */



import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class AnimalImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public AnimalImages() {
        imageId = new ArrayList<Integer>();

        imageId.add(R.drawable.d3);
        imageId.add(R.drawable.d4);
        imageId.add(R.drawable.d5);
        imageId.add(R.drawable.d6);
        imageId.add(R.drawable.d7);
        imageId.add(R.drawable.d8);
        imageId.add(R.drawable.d9);
        imageId.add(R.drawable.d10);
        imageId.add(R.drawable.d11);
        imageId.add(R.drawable.d12);
        imageId.add(R.drawable.d13);
        imageId.add(R.drawable.d14);
        imageId.add(R.drawable.d15);
        imageId.add(R.drawable.d16);
        imageId.add(R.drawable.d17);
        imageId.add(R.drawable.d18);
        imageId.add(R.drawable.d19);

        imageId.add(R.drawable.d1);
        imageId.add(R.drawable.d2);
        imageId.add(R.drawable.d21);
        imageId.add(R.drawable.d20);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
