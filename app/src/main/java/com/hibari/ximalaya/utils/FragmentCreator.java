package com.hibari.ximalaya.utils;

import com.hibari.ximalaya.base.BaseFragment;
import com.hibari.ximalaya.fragments.HistoryFragment;
import com.hibari.ximalaya.fragments.RecommendFragment;
import com.hibari.ximalaya.fragments.SubscriptionFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Hibari_Yo
 * @date: 2020-02-22
 * @description:
 */

public class FragmentCreator {

    public static final int INDEX_RECOMMEND = 0;
    public static final int INDEX_SUBSCRIPTION = 1;
    public static final int INDEX_HISTORY = 2;

    public static final int PAGE_COUNT = 3;

    private static Map<Integer, BaseFragment> sCache = new HashMap<>();

    public static BaseFragment getFragment(int index) {
        BaseFragment baseFragment = sCache.get(index);
        if (baseFragment != null) {
            return baseFragment;
        }

        switch (index) {
            case INDEX_RECOMMEND:
                baseFragment = new RecommendFragment();
                break;
            case INDEX_SUBSCRIPTION:
                baseFragment = new SubscriptionFragment();
                break;
            case INDEX_HISTORY:
                baseFragment = new HistoryFragment();
                break;
            default:
                break;
        }
        return baseFragment;
    }

}
