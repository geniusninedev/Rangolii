package com.geniusnine.android.rangolii.Floating;

/**
 * Created by Dev on 12-12-2016.
 */


import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class EasterImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public EasterImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.g1);
        imageId.add(R.drawable.g2);
        imageId.add(R.drawable.g3);
        imageId.add(R.drawable.g4);
        imageId. add(R.drawable.g5);
        imageId.add(R.drawable.g6);
        imageId.add(R.drawable.g7);
        imageId.add(R.drawable.g8);
        imageId.add(R.drawable.g9);
        imageId.add(R.drawable.g10);
        imageId.add(R.drawable.g11);
        imageId.add(R.drawable.g12);
        imageId.add(R.drawable.g13);
        imageId.add(R.drawable.g14);
        imageId.add(R.drawable.g15);
        imageId.add(R.drawable.g16);
        imageId.add(R.drawable.g17);
        imageId.add(R.drawable.g18);
        imageId.add(R.drawable.g19);

    }
    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
