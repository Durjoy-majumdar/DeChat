package com.tencent.p014mm.plugin.luckymoney.story;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.TouchCoordinatorLayout */
public class TouchCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: D */
    public List<View.OnTouchListener> f199576D = new ArrayList();

    /* renamed from: E */
    public boolean f199577E = false;

    public TouchCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (View.OnTouchListener onTouch : this.f199576D) {
            onTouch.onTouch(this, motionEvent);
        }
        if (this.f199577E) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
