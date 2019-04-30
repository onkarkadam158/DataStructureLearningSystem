package com.example.datastructurelearning.Stack.Display;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DisplayPageAdapter extends FragmentPagerAdapter {

    int NumberOfTabs;
    public DisplayPageAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                DisplayTheory displayTheory = new DisplayTheory();
                return displayTheory;
            case 1:
                DisplayGraphicalCode displayGraphicalCode = new DisplayGraphicalCode();
                return displayGraphicalCode;
            case 2:
                DisplayApplications displayApplications = new DisplayApplications();
                return displayApplications;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return NumberOfTabs;
    }
}