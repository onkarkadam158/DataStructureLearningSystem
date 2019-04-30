package com.example.datastructurelearning.Introduction.Functions;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FunctionPagerAdapter extends FragmentStatePagerAdapter {

    int NumberOfTabs;
    public FunctionPagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                FunctionTheory theory = new FunctionTheory();
                return theory;
            case 1:
                FunctionGraphicalCode graphicalCode = new FunctionGraphicalCode();
                return graphicalCode;
            case 2:
                FunctionApplications applications = new FunctionApplications();
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
