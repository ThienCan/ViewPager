package com.example.intern.viewpagerusingpageradapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by intern on 25/01/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private int[] mResource;

    public ViewPagerAdapter(Context context, int[] mResource) {
        this.context = context;
        this.mResource = mResource;
    }

    @Override
    public int getCount() {
        return mResource.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_items,container,false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.image_pager_items);
        imageView.setImageResource(mResource[position]);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view ==object;
    }
}
