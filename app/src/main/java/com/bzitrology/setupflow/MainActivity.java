package com.bzitrology.setupflow;

import com.bzitrology.setupflow.ui.BusinessHour;
import com.bzitrology.setupflow.ui.CreateRestaurantFormActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kevin.
 */

public class MainActivity extends AppCompatActivity {
  private Button mShowFlow;
  private Button mHour;


  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.choose_button);

    mShowFlow = (Button) findViewById(R.id.flow);
    mHour = (Button) findViewById(R.id.hour);

    mShowFlow.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, CreateRestaurantFormActivity.class);
        startActivity(intent);
      }
    });

    mHour.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, BusinessHour.class);
        startActivity(intent);
      }
    });
  }
}
