package com.example.leduyenminh.mh_dshs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter{


        private final List<Fragment> fragmentList = new ArrayList<>();
        private final List<String> FragmentListTitles = new ArrayList<>();
        public ViewPagerAdapter(FragmentManager fm){
            super(fm);
        }
        @Override
        public int getCount(){
            return FragmentListTitles.size();
        }
        @Override
        public Fragment getItem(int i){
            return fragmentList.get(i);
        }
        @Override
        public CharSequence getPageTitle (int i){
            return FragmentListTitles.get(i);
        }
        @Override
        public long getItemId(int i){
            return 0;
        }


        public void AddFragment (Fragment fragment, String title)
        {
            fragmentList.add(fragment);
            FragmentListTitles.add(title);
        }

    }

