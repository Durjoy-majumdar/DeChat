package com.tencent.p014mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat;
import jk0.C87984h;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.DuplicateStateCoverViewContainer */
public class DuplicateStateCoverViewContainer extends CoverViewContainer {
    public DuplicateStateCoverViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean contains = CoverViewContainer.m101092a(this).contains(motionEvent.getRawX(), motionEvent.getRawY());
        if (motionEvent.getActionMasked() == 0 && !mo114740g(motionEvent.getX(), motionEvent.getY()) && !contains) {
            return false;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!dispatchTouchEvent && motionEvent.getActionMasked() != 0) {
            int childCount = getChildCount();
            int pointerId = isMotionEventSplittingEnabled() ? 1 << motionEvent.getPointerId(motionEvent.getActionIndex()) : -1;
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (childAt instanceof CoverViewContainer) {
                    CoverViewContainer coverViewContainer = (CoverViewContainer) childAt;
                    coverViewContainer.getClass();
                    if (!(coverViewContainer instanceof DuplicateStateCoverViewContainer)) {
                        continue;
                    }
                }
                if (AppBrandViewMotionCompat.m104661a(childAt) && AppBrandViewMotionCompat.m104662b(this, x, y, childAt, (PointF) null) && childAt.isDuplicateParentStateEnabled()) {
                    C90259e.m112993a(this, motionEvent, false, childAt, pointerId);
                    if ((childAt instanceof C87984h) && ((C87984h) childAt).mo115841a()) {
                        break;
                    }
                }
            }
        }
        return dispatchTouchEvent;
    }

    public DuplicateStateCoverViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
