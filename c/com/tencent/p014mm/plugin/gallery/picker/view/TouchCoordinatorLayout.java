package com.tencent.p014mm.plugin.gallery.picker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.tencent.mm.plugin.gallery.picker.view.TouchCoordinatorLayout */
public class TouchCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: D */
    public View.OnTouchListener f198263D;

    public TouchCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f198263D;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setTouchListener(View.OnTouchListener onTouchListener) {
        this.f198263D = onTouchListener;
    }

    public TouchCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
