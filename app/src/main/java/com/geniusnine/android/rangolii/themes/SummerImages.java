package com.geniusnine.android.rangolii.themes;

/**
 * Created by Dev on 12-12-2016.
 */




import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;
import java.util.Random;


public class SummerImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public SummerImages() {

        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.t1);
        imageId.add(R.drawable.t2);
        imageId.add(R.drawable.t3);
        imageId.add(R.drawable.t4);
        imageId.add(R.drawable.t5);

        imageId.add(R.drawable.t6);
        imageId.add(R.drawable.t7);
        imageId.add(R.drawable.t8);
        imageId.add(R.drawable.t9);

        imageId.add(R.drawable.t10);
        imageId.add(R.drawable.t11);
        imageId.add(R.drawable.t12);
        imageId.add(R.drawable.t13);
        imageId.add(R.drawable.t14);
        imageId.add(R.drawable.t15);
        imageId.add(R.drawable.t16);
        imageId.add(R.drawable.t17);
        imageId.add(R.drawable.t18);
        imageId.add(R.drawable.t20);
        imageId.add(R.drawable.t21);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
