package com.saidur.bariwala.ui.mbariwala.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.saidur.bariwala.R;
import com.saidur.bariwala.ui.mbariwala.home.denpaonadar.TabAdapter;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    TabLayout tabLayout;
    TabItem t0,t2;
    ViewPager viewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // textView.setText(s);
            }
        });
initView(v);

        return v;
    }

    private void initView(View v) {
        tabLayout=(TabLayout)v.findViewById(R.id.varatiatab);
        t0=v.findViewById(R.id.t0);
        t2=v.findViewById(R.id.t2);

        viewPager=(ViewPager)v.findViewById(R.id.varatiaViewpager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        TabAdapter adapter = new TabAdapter(getActivity().getSupportFragmentManager(), tabLayout.getTabCount());
        tabLayout.setTabTextColors(Color.parseColor("#FF000000"), Color.parseColor("#B80007"));
        // tabLayout.setBackgroundColor(Color.parseColor("#FA8B8F"), Color.parseColor("#B80007"));
        viewPager.setAdapter(adapter);
        prepareViewpager();
    }

    private void prepareViewpager() {
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
              /*  if(tab.getPosition()==1)
                {
                    t1.setBackgroundResource(R.drawable.tabselected_bg);
                   // tabLayout.getChildAt(1).setBackground();
                   // tabLayout.getChildAt(1).setBackgroundColor(Color.parseColor("#FF0001"));
                    //t2.setBackgroundResource(R.drawable.tabselected_bg);
                   // t2.setBackgroundColor(Color.GREEN);
                }*/
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}