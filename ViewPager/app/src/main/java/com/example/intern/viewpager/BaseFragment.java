package com.example.intern.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by intern on 25/01/2017.
 */

public class BaseFragment extends Fragment {
    private String text;
    private int page;

    public static BaseFragment newInstant(int page,String text){
        BaseFragment fragment = new BaseFragment();
        Bundle argBundle = new Bundle();
        argBundle.putInt("page",page);
        argBundle.putString("content",text);
        fragment.setArguments(argBundle);
        return fragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("page");
        text = getArguments().getString("content");


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.layout_fragment,container,false);
        TextView textView = (TextView) view.findViewById(R.id.textview);
        textView.setText(page+" , " + text);
        return view;
    }
}
