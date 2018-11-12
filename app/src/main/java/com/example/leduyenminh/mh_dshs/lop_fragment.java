package com.example.leduyenminh.mh_dshs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


    public class lop_fragment extends Fragment {
        View view;
        public lop_fragment(){ }
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            //String[] NAMES={"a", "b", "c", "d"};

            view = inflater.inflate(R.layout.lop_fragment, container, false);
            //ViewPager viewPager = (ViewPager) view.findViewById(R.id.container);
            // ArrayAdapter<String>  listViewAdapter = new ArrayAdapter<String>(
            //  getActivity(),android.R.layout.simple_list_item_1);

            return view;
        }
    }

