package com.hibari.ximalaya.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hibari.ximalaya.R;
import com.hibari.ximalaya.base.BaseFragment;

/**
 * @author: Hibari_Yo
 * @date: 2020-02-22
 * @description:
 */

public class SubscriptionFragment extends BaseFragment {
    @Override
    protected View onSubViewLoaded(LayoutInflater layoutInflater, ViewGroup container) {
        View view = layoutInflater.inflate(R.layout.fragment_subscription, container,false);
        return view;
    }
}
