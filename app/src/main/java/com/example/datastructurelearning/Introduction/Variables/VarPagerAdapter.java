package com.example.datastructurelearning.Introduction.Variables;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class VarPagerAdapter extends FragmentStatePagerAdapter {

    int NumberOfTabs;
    public VarPagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                VarTheory theory = new VarTheory();
                return theory;
            case 1:
                VarGraphicalCode graphicalCode = new VarGraphicalCode();
                return graphicalCode;
            case 2:
                VarApplications applications = new VarApplications();
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
