package com.example.intern.viewpagerusingpageradapter;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private int[] imageResources={R.drawable.spring,R.drawable.summer,R.drawable.autumn,R.drawable.winter};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(this,imageResources);
        viewPager.setAdapter(viewPagerAdapter);


    }
}
