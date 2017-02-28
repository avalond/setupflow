package com.bzitrology.setupflow.Fragments;

import com.bzitrology.setupflow.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author by kevin.
 */

public class PageFragment extends Fragment {
	public static PageFragment newInstance() {
		PageFragment fragment = new PageFragment();
		return fragment;
	}


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}


	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_page, container, false);
		return view;
	}
}
