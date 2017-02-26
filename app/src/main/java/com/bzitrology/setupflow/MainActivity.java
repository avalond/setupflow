package com.bzitrology.setupflow;

import com.bzitrology.setupflow.adapter.MyFragmentPagerAdapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	private TabLayout mTabLayout;
	private ViewPager mViewPager;
	private MyFragmentPagerAdapter mPagerAdapter;
	private Context mContext;


	@Override

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = MainActivity.this;
		mTabLayout = (TabLayout) findViewById(R.id.tablayout);
		mViewPager = (ViewPager) findViewById(R.id.viewPager);

		FragmentManager manager = getSupportFragmentManager();
		mPagerAdapter = new MyFragmentPagerAdapter(manager, mContext);
		mViewPager.setAdapter(mPagerAdapter);
		mTabLayout.setTabTextColors(Color.GRAY, Color.BLACK);

		mTabLayout.setupWithViewPager(mViewPager);
	}
}
