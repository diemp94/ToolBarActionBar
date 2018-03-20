package com.proyecto.diego.toolbaractionbar.Adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.proyecto.diego.toolbaractionbar.Fragments.FirstFragment;
import com.proyecto.diego.toolbaractionbar.Fragments.SecondFragment;
import com.proyecto.diego.toolbaractionbar.Fragments.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter{

    private int numberOfTabs;


    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
