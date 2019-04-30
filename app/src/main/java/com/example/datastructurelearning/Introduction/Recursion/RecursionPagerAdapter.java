package com.example.datastructurelearning.Introduction.Recursion;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class RecursionPagerAdapter extends FragmentStatePagerAdapter {

    int NumberOfTabs;
    public RecursionPagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                RecursionTheory theory = new RecursionTheory();
                return theory;
            case 1:
                RecursionGraphicalCode graphicalCode = new RecursionGraphicalCode();
                return graphicalCode;
            case 2:
                RecursionApplications applications = new RecursionApplications();
                return applications;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NumberOfTabs;
    }
}
