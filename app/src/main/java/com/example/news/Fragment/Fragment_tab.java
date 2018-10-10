package com.example.news.Fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;

import com.example.news.R;


public class Fragment_tab extends Fragment {

    TableRow customtitle;
    private LinearLayout container;
    private TabLayout tabLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tabactivity,container, false);
        // Setting ViewPager for each Tabs
//        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
        // Set Tabs inside Toolbar
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
//        tabs.setupWithViewPager(viewPager);
        container = (LinearLayout) view.findViewById(R.id.fragment_container);


        tabLayout.addTab(tabLayout.newTab().setText(R.string.top));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.videos));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.briefs));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.manipur));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.photos));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.livetv));
        replaceFragment(new FragmentTop());
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    replaceFragment(new FragmentTop());
                } else if (tab.getPosition() == 1) {
                    replaceFragment(new FragmentVedios());
                }else if (tab.getPosition() == 2) {
                    replaceFragment(new FragmentTop());
                }else if (tab.getPosition() == 3) {
                    replaceFragment(new FragmentTop());
                }else if (tab.getPosition() == 4) {
                    replaceFragment(new FragmentPhotos());
                } else {
                    replaceFragment(new FragmentTop());
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return view;
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);

        transaction.commit();
    }


}
