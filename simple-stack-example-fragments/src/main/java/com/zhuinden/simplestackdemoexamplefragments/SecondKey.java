package com.zhuinden.simplestackdemoexamplefragments;

import android.support.v4.app.Fragment;

import com.google.auto.value.AutoValue;

/**
 * Created by Zhuinden on 2017.02.01..
 */

@AutoValue
public abstract class SecondKey implements Key {
    @Override
    public Fragment createFragment() {
        return new SecondFragment();
    }

    @Override
    public Class<? extends Fragment> getFragmentClass() {
        return SecondFragment.class;
    }

    @Override
    public String getFragmentTag() {
        return "SecondKey";
    }

    public static SecondKey create() {
        return new AutoValue_SecondKey();
    }
}
