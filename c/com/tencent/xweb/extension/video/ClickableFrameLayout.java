package com.tencent.xweb.extension.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class ClickableFrameLayout extends FrameLayout {
    private GestureDetector mGestureDetector;
    private View.OnClickListener mOnClickListener;

    public ClickableFrameLayout(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mOnClickListener != null;
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
        this.mGestureDetector = gestureDetector;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.mOnClickListener = onClickListener;
    }

    public ClickableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ClickableFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
