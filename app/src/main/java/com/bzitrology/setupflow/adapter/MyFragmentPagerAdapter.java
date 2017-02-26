package com.bzitrology.setupflow.adapter;

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
	private Context context;


	public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
		super(fm);
		this.context = context;
	}


	@Override
	public Fragment getItem(int position) {
		switch (position) {
			case 0:
				return PageFragment.newInstance(position + 1);
			case 1:
				return PageFragment.newInstance(position + 1);
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
