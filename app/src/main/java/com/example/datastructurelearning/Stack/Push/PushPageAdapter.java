package com.example.datastructurelearning.Stack.Push;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PushPageAdapter extends FragmentPagerAdapter {

    int NumberOfTabs;
    public PushPageAdapter(FragmentManager fm,int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                PushTheory pushTheory = new PushTheory();
                return pushTheory;
            case 1:
                PushGraphicalCode pushGraphicalCode = new PushGraphicalCode();
                return pushGraphicalCode;
            case 2:
                PushApplications pushApplications = new PushApplications();
                return pushApplications;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return NumberOfTabs;
    }
}
