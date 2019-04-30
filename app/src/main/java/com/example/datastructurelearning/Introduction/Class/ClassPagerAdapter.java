package com.example.datastructurelearning.Introduction.Class;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ClassPagerAdapter extends FragmentStatePagerAdapter {

    int NumberOfTabs;
    public ClassPagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                ClassTheory theory = new ClassTheory();
                return theory;
            case 1:
                ClassGraphicalCode graphicalCode = new ClassGraphicalCode();
                return graphicalCode;
            case 2:
                ClassApplications applications = new ClassApplications();
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
