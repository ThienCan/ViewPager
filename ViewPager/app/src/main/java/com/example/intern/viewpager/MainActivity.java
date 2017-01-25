package com.example.intern.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        Adapter_ViewPagerFragment adapterViewPagerFragment = new Adapter_ViewPagerFragment(getSupportFragmentManager(),3);
        viewPager.setAdapter(adapterViewPagerFragment);
    }
}
