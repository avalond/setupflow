package com.bzitrology.setupflow;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  private TabLayout mTabLayout;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mTabLayout = (TabLayout) findViewById(R.id.tablayout);
    mTabLayout.addTab(mTabLayout.newTab().setText("Tab 4"));

    mTabLayout.addTab(mTabLayout.newTab().setText("Tab 5"));

    mTabLayout.addTab(mTabLayout.newTab().setText("Tab 6"));

    mTabLayout.addTab(mTabLayout.newTab().setText("Tab 7"));

  }
}
