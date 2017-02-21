package com.bzitrology.setupflow;

import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;

import android.content.Context;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;

/**
 * @author by kevin.
 */

public class SampFragmentSetAdapter extends AbstractFragmentStepAdapter {
  public SampFragmentSetAdapter(@NonNull FragmentManager fm, @NonNull Context context) {
    super(fm, context);
  }


  @Override public Step createStep(@IntRange(from = 0L) int position) {
    switch (position) {
      case 0:
        return  SetpFragment.newInstance();
      case 1:
        return  SetpFragment.newInstance();
      case 2:
        return  SetpFragment.newInstance();
      default:
        throw new IllegalArgumentException("postion");
    }
  }


  @Override public int getCount() {
    return 3;
  }
}
