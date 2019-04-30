package com.example.datastructurelearning.Stack;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class StackPageAdapter extends FragmentPagerAdapter {

    int NumberOfTabs;

    public StackPageAdapter(FragmentManager fm, int NumberOfTabs) {

        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }

    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                StackTheory stackTheory = new StackTheory();
                return stackTheory;
            case 1:
                StackOperations stackOperations  = new StackOperations();
                return stackOperations;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NumberOfTabs;
    }
}
