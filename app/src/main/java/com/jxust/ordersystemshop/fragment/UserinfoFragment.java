package com.jxust.ordersystemshop.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jxust.ordersystemshop.R;

/**
 * 商家发布界面
 */
public class UserinfoFragment extends Fragment {

    private View view;
    public UserinfoFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return view = inflater.inflate(R.layout.fragment_message, container, false);
    }

}
