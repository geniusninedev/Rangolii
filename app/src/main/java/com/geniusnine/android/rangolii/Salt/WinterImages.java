package com.geniusnine.android.rangolii.Salt;

/**
 * Created by Dev on 12-12-2016.
 */



import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class WinterImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public WinterImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.sa1);
        imageId.add(R.drawable.sa2);
        imageId.add(R.drawable.sa3);
        imageId.add(R.drawable.sa4);
        imageId.add(R.drawable.sa5);
        imageId.add(R.drawable.sa6);
        imageId.add(R.drawable.sa7);
        imageId.add(R.drawable.sa8);
        imageId.add(R.drawable.sa9);
        imageId.add(R.drawable.sa10);
        imageId.add(R.drawable.sa11);
        imageId.add(R.drawable.sa12);
        imageId.add(R.drawable.sa13);
        imageId.add(R.drawable.sa14);
        imageId.add(R.drawable.sa15);
        imageId.add(R.drawable.sa16);
        imageId.add(R.drawable.sa17);
        imageId.add(R.drawable.sa18);
        imageId.add(R.drawable.sa19);
        imageId.add(R.drawable.sa20);


    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
