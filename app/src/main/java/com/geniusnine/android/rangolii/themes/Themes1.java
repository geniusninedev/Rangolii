package com.geniusnine.android.rangolii.themes;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.geniusnine.android.rangolii.Chowk.FragmentPagerAdapter;
import com.geniusnine.android.rangolii.Intro;
import com.geniusnine.android.rangolii.MainActivity;
import com.geniusnine.android.rangolii.R;

import java.util.ArrayList;

public class Themes1 extends AppCompatActivity implements
        View.OnClickListener, ViewPager.OnPageChangeListener {

    private Button btnImagePrevious, btnImageNext;
    private int position = 0, totalImage;
    private ViewPager viewPage;
    private ArrayList<Integer> itemData;
    private FragmentPagerAdapter adapter;
    private SummerImages imageId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);
        imageId = new SummerImages();
        itemData = imageId.getImageItem();
        totalImage = itemData.size();
        setPage(position);

        adapter = new FragmentPagerAdapter(getSupportFragmentManager(), itemData);
        viewPage.setAdapter(adapter);
        viewPage.setOnPageChangeListener(Themes1.this);

        btnImagePrevious.setOnClickListener(this);
        btnImageNext.setOnClickListener(this);
        btnImageNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnImagePrevious) {
            position--;
            viewPage.setCurrentItem(position);
        } else if (v == btnImageNext) {
            position++;
            viewPage.setCurrentItem(position);
        }
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {
    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
    }

    @Override
    public void onPageSelected(int position) {
        this.position = position;
        setPage(position);
    }

    private void setPage(int page) {
        if (page == 0 && totalImage > 0) {
            btnImageNext.setVisibility(View.VISIBLE);
            btnImagePrevious.setVisibility(View.INVISIBLE);
        } else if (page == totalImage - 1 && totalImage > 0) {
            btnImageNext.setVisibility(View.INVISIBLE);
            btnImagePrevious.setVisibility(View.VISIBLE);
        } else {
            btnImageNext.setVisibility(View.VISIBLE);
            btnImagePrevious.setVisibility(View.VISIBLE);
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
               // Intent intro=new Intent(Themes1.this,MainActivity.class);
                finish();
                //startActivity(intro);

                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}