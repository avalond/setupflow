package com.bzitrology.setupflow.adapter;

import com.bzitrology.setupflow.Fragments.MenuFragment;
import com.bzitrology.setupflow.Fragments.PageFragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author by kevin.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
	public final int COUNT = 2;
	private String[] titles = new String[] { "restaurant information", "Menu information" };
	private Context mContext;


	public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
		super(fm);
		this.mContext = context;
	}


	@Override
	public Fragment getItem(int position) {
		switch (position) {
			case 0:
				return PageFragment.newInstance();
			case 1:
				return MenuFragment.newInstance();
			default:
				return null;
		}
	}


	@Override
	public int getCount() {
		return COUNT;
	}


	@Override
	public CharSequence getPageTitle(int position) {
		return titles[position];
	}
}
