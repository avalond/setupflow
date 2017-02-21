package com.bzitrology.setupflow;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.stepstone.stepper.StepperLayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kevin on 2/20/17.
 */
public class SetUpActivity extends AppCompatActivity {

  @BindView(R.id.stepperLayout) StepperLayout stepperLayout;
  @BindView(R.id.previousBt) TextView mPreviousBt;
  @BindView(R.id.informationTv) TextView mInformationTv;
  @BindView(R.id.nextBt) TextView mNextBt;


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.set_up_flow);
    ButterKnife.bind(this);
    setviews();
  }


  private void setviews() {

    mPreviousBt.setVisibility(View.INVISIBLE);
  }
}
