package com.example.leduyenminh.mh_dshs;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class thongtinhs_fragment extends Fragment {
    View view;
    public thongtinhs_fragment(){ }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //String[] NAMES={"a", "b", "c", "d"};

        view = inflater.inflate(R.layout.thongtinhs_fragment, container, false);
        //ViewPager viewPager = (ViewPager) view.findViewById(R.id.container);
        // ArrayAdapter<String>  listViewAdapter = new ArrayAdapter<String>(
        //  getActivity(),android.R.layout.simple_list_item_1);

        return view;
    }
}
