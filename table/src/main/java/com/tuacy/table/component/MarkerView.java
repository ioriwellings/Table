package com.tuacy.table.component;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

public abstract class MarkerView extends RelativeLayout {

	public MarkerView(Context context, int layoutResource) {
		super(context);
		setupLayoutResource(layoutResource);
	}

	private void setupLayoutResource(int layoutResource) {

		View inflated = LayoutInflater.from(getContext()).inflate(layoutResource, this);

		inflated.setLayoutParams(
			new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
		inflated.measure(MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED), MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));

		// measure(getWidth(), getHeight());
		inflated.layout(0, 0, inflated.getMeasuredWidth(), inflated.getMeasuredHeight());
	}

	public void draw(Canvas canvas, float posx, float posy) {

		// take offsets into consideration
		posx += getXOffset(posx);
		posy += getYOffset(posy);

		// translate to the correct position and draw
		canvas.translate(posx, posy);
		draw(canvas);
		canvas.translate(-posx, -posy);
	}

//	public abstract void refreshContent(Entry e, Highlight highlight);

	public abstract int getXOffset(float xpos);

	public abstract int getYOffset(float ypos);

}
