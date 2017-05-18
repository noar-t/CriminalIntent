package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by noah on 5/18/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
