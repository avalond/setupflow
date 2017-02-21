package com.bzitrology.setupflow;

import com.stepstone.stepper.Step;
import com.stepstone.stepper.VerificationError;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

/**
 * @author by kevin.
 */

public class SetpFragment extends Fragment implements Step {

  public static SetpFragment newInstance() {
    SetpFragment fragment = new SetpFragment();
    return fragment;
  }


  @Override public VerificationError verifyStep() {
    return null;
  }


  @Override public void onSelected() {

  }


  @Override public void onError(@NonNull VerificationError error) {

  }
}
