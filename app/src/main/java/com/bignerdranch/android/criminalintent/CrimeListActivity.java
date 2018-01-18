package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by krzyszof on 16.01.18.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
