package com.miymayster.olya.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    ListView mListView;
    View mDrawer;
    byte openedPageId = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            openedPageId = savedInstanceState.getByte("openedPageId");
        }
        String[] titles = getResources().getStringArray(R.array.titles);
        ArrayAdapter<String> titlesAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titles);
        mListView = (ListView) findViewById(R.id.navigation_list);
        mListView.setAdapter(titlesAdapter);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mDrawer = findViewById(R.id.navigation_drawer);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mDrawerLayout.closeDrawer(mDrawer);
                openPage((byte) position);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        openPage(openedPageId);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putByte("openedPageId", openedPageId);
    }

    private void openPage(byte pageId) {
        openedPageId = pageId;
        if (pageId == -1) {
            setTitle(getString(R.string.app_name));
            Fragment fragment = new MainFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_fragment, fragment).commit();
        } else {
            String[] titles = getResources().getStringArray(R.array.titles);
            setTitle(titles[pageId]);
            Fragment fragment;
            switch (pageId) {
                case 0:
                    fragment = new InterestingMonumentsFragment();
                    break;
                case 1:
                    fragment = new ParksFragment();
                    break;
                case 2:
                    fragment = new RestaurantsFragment();
                    break;
                case 3:
                    fragment = new CinemasFragment();
                    break;
                default:
                    return;
            }
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_fragment, fragment).commit();
        }
    }
}
