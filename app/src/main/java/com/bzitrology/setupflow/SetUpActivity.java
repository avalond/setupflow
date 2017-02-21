package com.bzitrology.setupflow;

import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kevin on 2/20/17.
 */
public class SetUpActivity extends AppCompatActivity {

  @BindView(R.id.viewpager) ViewPager mViewpager;


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.set_up_flow);
    ButterKnife.bind(this);
  }

}
