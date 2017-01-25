package com.example.intern.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by intern on 25/01/2017.
 */

public class Adapter_ViewPagerFragment extends FragmentPagerAdapter {
    private int pageNumber;
    public Adapter_ViewPagerFragment(FragmentManager fm,int pageNumber) {
        super(fm);
        this.pageNumber = pageNumber;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return BaseFragment.newInstant(0,"Home");
            case 1:
                return BaseFragment.newInstant(1,"Friends");
            case 2:
                return BaseFragment.newInstant(2,"Setting");
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return pageNumber;
    }
}
