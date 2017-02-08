package com.geniusnine.android.rangolii.Glass;

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
        imageId.add(R.drawable.gl1);
        imageId.add(R.drawable.gl2);
        imageId.add(R.drawable.gl3);
        imageId.add(R.drawable.gl4);
        imageId.add(R.drawable.gl5);
        imageId.add(R.drawable.gl6);
        imageId.add(R.drawable.gl7);
        imageId.add(R.drawable.g21);
        imageId.add(R.drawable.g22);
        imageId.add(R.drawable.g23);
        imageId.add(R.drawable.gl8);
        imageId.add(R.drawable.gl9);
        imageId.add(R.drawable.gl10);
        imageId.add(R.drawable.gl11);
        imageId.add(R.drawable.gl12);
        imageId.add(R.drawable.gl13);
        imageId.add(R.drawable.gl14);
        imageId.add(R.drawable.gl15);
        imageId.add(R.drawable.gl16);
        imageId.add(R.drawable.gl17);
        imageId.add(R.drawable.gl18);
        imageId.add(R.drawable.gl19);
        imageId.add(R.drawable.gl20);


    }
    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
