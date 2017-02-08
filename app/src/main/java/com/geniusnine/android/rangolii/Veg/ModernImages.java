package com.geniusnine.android.rangolii.Veg;

/**
 * Created by Dev on 12-12-2016.
 */



import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class ModernImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public ModernImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.v1);
        imageId.add(R.drawable.v2);
        imageId.add(R.drawable.v3);
        imageId.add(R.drawable.v4);
        imageId.add(R.drawable.v5);
        imageId.add(R.drawable.v6);
        imageId.add(R.drawable.v7);
        imageId.add(R.drawable.v8);
        imageId.add(R.drawable.v9);
        imageId.add(R.drawable.v10);
        imageId.add(R.drawable.v11);
        imageId.add(R.drawable.v12);
        imageId.add(R.drawable.v13);
        imageId.add(R.drawable.v14);
        imageId.add(R.drawable.v16);
        imageId.add(R.drawable.v17);
        imageId.add(R.drawable.v18);
        imageId.add(R.drawable.v19);
        imageId.add(R.drawable.v20);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
