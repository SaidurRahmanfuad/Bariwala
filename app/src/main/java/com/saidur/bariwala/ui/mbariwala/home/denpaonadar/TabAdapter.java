package com.saidur.bariwala.ui.mbariwala.home.denpaonadar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.saidur.bariwala.ui.mbariwala.home.denpaonadar.PaiduserFragment;
import com.saidur.bariwala.ui.mbariwala.home.denpaonadar.PayableFragment;

public class TabAdapter extends FragmentPagerAdapter {
    int totalTabs;

    public TabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        totalTabs = behavior;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                // tab.setBackgroundResource(R.drawable.tabselected_bg);
                return new PaiduserFragment();
            case 1:
                return new PayableFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
