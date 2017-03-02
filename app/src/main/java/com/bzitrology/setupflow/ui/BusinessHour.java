package com.bzitrology.setupflow.ui;

import com.bzitrology.setupflow.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by kevin.
 */
public class BusinessHour extends AppCompatActivity {
  private RecyclerView mServerTypeRv;
  private LinearLayoutManager mLinearLayoutManager;


  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.business_layout);
    mServerTypeRv = (RecyclerView) findViewById(R.id.servertype);
  }
}
