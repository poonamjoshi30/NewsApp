package com.example.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.news.Fragment.FragmentPhotos;
import com.example.news.Fragment.FragmentTop;
import com.example.news.Fragment.Fragment_tab;

public class NavaginationDrawer extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener{

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigationdrawer);
//        binding = DataBindingUtil.setContentView(this, R.layout.navigationdrawer);
//        binding.setViewModel(ViewModelProviders.of(this).get(NavigationViewModel.class));
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);

        if (savedInstanceState == null) {
            displayView(0);
        }

            displayView(0);

    }
    private class SlideMenuClickListener implements
            ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                displayView(position);


        }
    }

    public void onDrawerItemSelected(View view, int position) {

            displayView(position);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, "")
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        menu.add(0, 1, 1, "History").setIcon(R.mipmap.notification)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        menu.add(0, 1, 1, "History").setIcon(R.mipmap.help)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getOrder()) {

            case 1:

                break;
            default:
                break;
        }
        return true;
    }


    public void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new Fragment_tab();
                title = getString(R.string.home);
                break;
            case 1:
                fragment = new FragmentTop();
                title = getString(R.string.etimes);
                break;
            case 2:
                fragment = new FragmentTop();
                title = getString(R.string.india);
                break;
            case 3:
                fragment = new FragmentPhotos();
                title = getString(R.string.photos1);
                break;
            case 4:
                fragment = new FragmentTop();
                title = getString(R.string.tv);
                break;
            case 5:
                fragment = new FragmentTop();
                title = getString(R.string.sports);
                break;
            case 6:
                fragment = new FragmentTop();
                title = getString(R.string.Signout);
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title

            getSupportActionBar().setTitle(title);
        }
    }

}