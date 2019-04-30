package com.example.datastructurelearning.Introduction.Pointers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PointerPagerAdapter extends FragmentStatePagerAdapter {

    int NumberOfTabs;
    public PointerPagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                PointerTheory theory = new PointerTheory();
                return theory;
            case 1:
                PointerGraphicalCode graphicalCode = new PointerGraphicalCode();
                return graphicalCode;
            case 2:
                PointerApplications applications = new PointerApplications();
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
