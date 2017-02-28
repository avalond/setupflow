package com.bzitrology.setupflow;

import ernestoyaquello.com.verticalstepperform.VerticalStepperFormLayout;
import ernestoyaquello.com.verticalstepperform.interfaces.VerticalStepperForm;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements VerticalStepperForm {
	private Context mContext;
	private VerticalStepperFormLayout mVerticalStepperFormLayout;

	private static final int LAYOUT_RESTAURANT_NAME = 0;
	private static final int LAYOUT_DESCRIPTION = 1;
	private static final int LAYOUT_PHONE = 2;
	private static final int LAYOUT_FAX = 3;
	private static final int LAYOUT_ADDRESS = 4;


	@Override

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = MainActivity.this;
	}


	@Override public View createStepContentView(int stepNumber) {
		return null;
	}


	@Override public void onStepOpening(int stepNumber) {

	}


	@Override public void sendData() {

	}
}
