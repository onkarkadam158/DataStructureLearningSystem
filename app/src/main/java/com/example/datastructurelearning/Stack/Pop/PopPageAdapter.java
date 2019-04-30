package com.example.datastructurelearning.Stack.Pop;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PopPageAdapter extends FragmentPagerAdapter {

    int NumberOfTabs;
    public PopPageAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                PopTheory popTheory = new PopTheory();
                return popTheory;
            case 1:
                PopGraphicalCode popGraphicalCode = new PopGraphicalCode();
                return popGraphicalCode;
            case 2:
                PopApplications popApplications = new PopApplications();
                return popApplications;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return NumberOfTabs;
    }
}

