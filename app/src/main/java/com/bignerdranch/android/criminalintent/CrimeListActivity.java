package com.bignerdranch.android.criminalintent;

import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by noah on 5/18/17.
 * Instantiates an instance of a singlefragmentactivity and uses a crimlistfragment for the fragment
 */

public class CrimeListActivity extends SingleFragmentActivity implements CrimeListFragment.Callbacks {

    @Override
    protected Fragment createFragment() {
        // initializes crime fragment to hold the crime list elements
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }

    @Override
    public void onCrimeSelected (Crime crime) {
        if (findViewById(R.id.detail_fragment_container) == null) {
            Intent intent = CrimePagerActivity.newIntent(this, crime.getId());
            startActivity(intent);
        }
        else {
            Fragment newDetail = CrimeFragment.newInstance(crime.getId());

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.detail_fragment_container, newDetail)
                    .commit();
        }
    }
}
