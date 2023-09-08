package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.mogic.WxViewPager;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.base.CustomViewPager */
public class CustomViewPager extends WxViewPager {
    private static final String TAG = "MicroMsg.CustomViewPager";
    private boolean mCanSlide = true;
    private boolean mCanSlideBySide = true;
    private SwipeBackLayout.C19854d mSwipeBackListener = null;

    public CustomViewPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        SwipeBackLayout.C19854d dVar = this.mSwipeBackListener;
        if (dVar != null && dVar.enableSwipeBack()) {
            if (!this.mSwipeBackListener.mo26409F()) {
                this.mSwipeBackListener.mo26410a(motionEvent);
            } else if (this.mSwipeBackListener.mo26415i() == 1) {
                this.mSwipeBackListener.mo26410a(motionEvent);
                return true;
            } else if (this.mSwipeBackListener.mo26413f(motionEvent)) {
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isGutterDrag(float f, float f2) {
        if (this.mCanSlideBySide) {
            return super.isGutterDrag(f, f2);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "get a Exception", new Object[0]);
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "get a Exception", new Object[0]);
            return false;
        }
    }

    public void setCanSlide(boolean z) {
        this.mCanSlide = z;
    }

    public void setCanSlideBySide(boolean z) {
        this.mCanSlideBySide = z;
    }

    public void setSwipeBackListener(SwipeBackLayout.C19854d dVar) {
        this.mSwipeBackListener = dVar;
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
