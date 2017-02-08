package com.geniusnine.android.rangolii.Flower;

/**
 * Created by Dev on 09-12-2016.
 */



import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class AutumnImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public AutumnImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.fl1);
        imageId.add(R.drawable.fl2);
        imageId.add(R.drawable.fl3);
        imageId.add(R.drawable.fl4);
        imageId.add(R.drawable.fl5);
        imageId.add(R.drawable.fl6);
        imageId.add(R.drawable.fl7);
        imageId.add(R.drawable.fl8);
        imageId.add(R.drawable.fl9);
        imageId.add(R.drawable.fl10);
        imageId.add(R.drawable.fl11);
        imageId.add(R.drawable.fl12);
        imageId.add(R.drawable.fl13);
        imageId.add(R.drawable.fl14);
        imageId.add(R.drawable.fl15);
        imageId.add(R.drawable.fl16);
        imageId.add(R.drawable.fl17);
        imageId.add(R.drawable.fl18);
        imageId.add(R.drawable.fl19);
        imageId.add(R.drawable.fl20);
        imageId.add(R.drawable.fl21);
        imageId.add(R.drawable.fl22);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
