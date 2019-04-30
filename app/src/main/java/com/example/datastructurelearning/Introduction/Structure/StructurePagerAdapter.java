package com.example.datastructurelearning.Introduction.Structure;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class StructurePagerAdapter extends FragmentStatePagerAdapter {

    int NumberOfTabs;
    public StructurePagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                StructureTheory theory = new StructureTheory();
                return theory;
            case 1:
                StructureGraphicalCode graphicalCode = new StructureGraphicalCode();
                return graphicalCode;
            case 2:
                StructureApplications applications = new StructureApplications();
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
