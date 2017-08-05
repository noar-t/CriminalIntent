package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by noah on 5/18/17.
 * Instantiates an instance of a singlefragmentactivity and uses a crimlistfragment for the fragment
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        // initializes crime fragment to hold the crime list elements
        return new CrimeListFragment();
    }
}
