package com.paragon.paulyu.myapplication;

import android.app.LoaderManager;
import android.content.Loader;
import android.support.design.widget.TabLayout;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import android.os.Bundle;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

import android.widget.TextView;
import android.widget.ImageButton;

import java.util.ArrayList;

import cards.CARD_main;
import heroes.HERO_main;
import layout.MainFragment;
//import layout.card_gallery;
import background.BackgroundThread;
import layout.card_gallery;


public class Main extends AppCompatActivity
implements LoaderManager.LoaderCallbacks<ArrayList<String>> {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private static int NUM_ITEMS = 4;
    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.fragment_container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        }

        // start AsyncTaskLoader
        this.getLoaderManager().initLoader(5, null, this);
    }
//
//    @Override
//    public void onFragmentInteraction(Uri uri) {
//
//    }



    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */

    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new MainFragment();
                case 1:
                    return new HERO_main();
                case 2:
                    return new CARD_main();
                case 3:
                    return new card_gallery();
            }

            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return NUM_ITEMS;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "News";
                case 1:
                    return "Heroes";
                case 2:
                    return "Cards";
                case 3:
                    return "Test";
            }
            return null;
        }
    }
    
    @Override
    public Loader<ArrayList<String>> onCreateLoader(int id, Bundle args) {
        BackgroundThread loader = new BackgroundThread(this);
        return loader;
    }

    CARD_main cardItem;
//    card_gallery card_gallery;
//    HERO_main heroItem;

    @Override
    public void onLoadFinished(Loader<ArrayList<String>> loader, ArrayList<String> data) {

//        cardItem = new CARD_main();
//        heroItem = new HERO_main();

//        Bundle args = new Bundle();
//        args.putStringArrayList("data", data);
//        Log.d("Data", data.toString());
//        cardItem.setArguments(args);
//        ObjectMapper objectMapper = new ObjectMapper();
//        MainFragment mainFragment = new MainFragment();
//        HERO_main = new HERO_main();
//        card_gallery card_gallery = new card_gallery();
    }

    @Override
    public void onLoaderReset(Loader<ArrayList<String>> loader) {

    }
}
