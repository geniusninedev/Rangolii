package com.geniusnine.android.rangolii;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import  com.geniusnine.android.rangolii.Chowk.Chowk1;
import  com.geniusnine.android.rangolii.Dotted.Dotted1;
import  com.geniusnine.android.rangolii.FreeHand.Freehand1;
import  com.geniusnine.android.rangolii.Flower.Flower1;
import  com.geniusnine.android.rangolii.Alpana.Alpana1;
import  com.geniusnine.android.rangolii.Wooden.wooden1;
import  com.geniusnine.android.rangolii.Floating.Floating1;
import  com.geniusnine.android.rangolii.Glass.Glass1;
import  com.geniusnine.android.rangolii.Sanskar.Sanskar1;
import  com.geniusnine.android.rangolii.Portraitrangoli.Portrait1;
import  com.geniusnine.android.rangolii.themes.Themes1;
import  com.geniusnine.android.rangolii.Veg.Veg1;
import  com.geniusnine.android.rangolii.Salt.Salt1;
import  com.geniusnine.android.rangolii.Rice.Rice1;
import  com.geniusnine.android.rangolii.Pulses.Pulses1;
import android.content.pm.ActivityInfo;
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
ListView RangoliListview;
    ArrayAdapter<String> adapter;
    String[] ragolilist={"Chowk Rangoli","Dotted Rangoli","FreeHand Rangoli","Flower Petals Rangoli","Alpana","Wooden Rangoli","Floating Rangoli","Glass Rangoli","Sanskar Rangoli","Rangoli With Vegetables",
    "Rangoli With Salt","Rangoli With Rice","Rangoli With Pulses"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.content_main,R.id.textview1, ragolilist);
        ListView categories=(ListView)findViewById(R.id.listview);
        categories.setAdapter(adapter);

        categories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent=new Intent(MainActivity.this,Chowk1.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent=new Intent(MainActivity.this,Dotted1.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent=new Intent(MainActivity.this,Freehand1.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent=new Intent(MainActivity.this,Flower1.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent=new Intent(MainActivity.this,Alpana1.class);
                    startActivity(intent);
                }
                if(position==5){
                    Intent intent=new Intent(MainActivity.this,wooden1.class);
                    startActivity(intent);
                }
                if(position==6) {
                    Intent intent = new Intent(MainActivity.this, Floating1.class);
                    startActivity(intent);
                }
                if(position==7){
                    Intent intent=new Intent(MainActivity.this,Glass1.class);
                    startActivity(intent);
                }
                if(position==8){
                    Intent intent=new Intent(MainActivity.this,Sanskar1.class);
                    startActivity(intent);
                }
               if(position==9){
                    Intent intent=new Intent(MainActivity.this,Veg1.class);
                    startActivity(intent);
                }

               if(position==10){
                    Intent intent=new Intent(MainActivity.this,Salt1.class);
                    startActivity(intent);
                }
                if(position==11){
                    Intent intent=new Intent(MainActivity.this,Rice1.class);
                    startActivity(intent);
                }
                if(position==12){
                    Intent intent=new Intent(MainActivity.this,Pulses1.class);
                    startActivity(intent);
                }


            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intro=new Intent(MainActivity.this,Intro.class);
            startActivity(intro);
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent Tips=new Intent(MainActivity.this,Tips1.class);
            startActivity(Tips);

        } else if (id == R.id.nav_slideshow) {
            Intent Tips=new Intent(MainActivity.this,Portrait1.class);
            startActivity(Tips);

        } else if (id == R.id.nav_manage) {
            Intent Tips=new Intent(MainActivity.this,Themes1.class);
            startActivity(Tips);

        } else if (id == R.id.nav_share) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "http://www.geniusnine.com/");
            startActivity(Intent.createChooser(i, "Share via"));
            return true;

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
