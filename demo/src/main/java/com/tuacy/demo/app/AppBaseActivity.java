package com.tuacy.demo.app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tuacy.common.base.BaseActivity;

public abstract class AppBaseActivity extends BaseActivity {

	protected Context mContext;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContext = this;
	}
}
