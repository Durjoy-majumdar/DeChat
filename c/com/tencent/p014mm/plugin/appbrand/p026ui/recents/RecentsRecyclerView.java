package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.RecentsRecyclerView */
class RecentsRecyclerView extends LoadMoreRecyclerView {
    public RecentsRecyclerView(Context context) {
        super(context);
        setChildrenDrawingOrderEnabled(true);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getItemAnimator() == null || !getItemAnimator().mo17325n()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getItemAnimator() == null || !getItemAnimator().mo17325n()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getItemAnimator() != null && getItemAnimator().mo17325n()) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IndexOutOfBoundsException unused) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            return super.onTouchEvent(obtain);
        }
    }

    public RecentsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChildrenDrawingOrderEnabled(true);
    }

    public RecentsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setChildrenDrawingOrderEnabled(true);
    }
}
