package com.tuacy.table.core;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 表格View @tuacy
 */
public class TableView extends View {

	public TableView(Context context) {
		this(context, null);
	}

	public TableView(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public TableView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
	}
}
