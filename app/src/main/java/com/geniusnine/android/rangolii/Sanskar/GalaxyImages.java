package com.geniusnine.android.rangolii.Sanskar;

/**
 * Created by Dev on 12-12-2016.
 */




import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class GalaxyImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public GalaxyImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.s1);
        imageId.add(R.drawable.s2);
        imageId.add(R.drawable.s3);
        imageId.add(R.drawable.s4);
        imageId.add(R.drawable.s5);
        imageId.add(R.drawable.s6);
        imageId.add(R.drawable.s7);
        imageId.add(R.drawable.s8);
        imageId.add(R.drawable.s9);
        imageId.add(R.drawable.s10);
        imageId.add(R.drawable.s11);
        imageId.add(R.drawable.s12);
        imageId.add(R.drawable.s13);
        imageId.add(R.drawable.s14);
        imageId.add(R.drawable.s15);
        imageId.add(R.drawable.s16);
        imageId.add(R.drawable.s17);
        imageId.add(R.drawable.s18);
        imageId.add(R.drawable.s19);
        imageId.add(R.drawable.s20);
        imageId.add(R.drawable.s21);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
