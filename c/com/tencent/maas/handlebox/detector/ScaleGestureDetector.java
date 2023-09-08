package com.tencent.maas.handlebox.detector;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import j20.C117292a;
import k20.C9556a;

public class ScaleGestureDetector {
    private static final int ANCHORED_SCALE_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_SCALE_MODE_NONE = 0;
    private static final int ANCHORED_SCALE_MODE_STYLUS = 2;
    private static final float SCALE_FACTOR = 0.5f;
    private static final String TAG = "ScaleGestureDetector";
    private static final long TOUCH_STABILIZE_TIME = 128;
    private byte _hellAccFlag_;
    /* access modifiers changed from: private */
    public int mAnchoredScaleMode;
    /* access modifiers changed from: private */
    public float mAnchoredScaleStartX;
    /* access modifiers changed from: private */
    public float mAnchoredScaleStartY;
    private final Context mContext;
    private float mCurrSpan;
    private float mCurrSpanX;
    private float mCurrSpanY;
    private long mCurrTime;
    private boolean mEventBeforeOrAboveStartingGestureEvent;
    private float mFocusX;
    private float mFocusY;
    private GestureDetector mGestureDetector;
    private final Handler mHandler;
    private boolean mInProgress;
    private float mInitialSpan;
    private final OnScaleGestureListener mListener;
    private int mMinSpan;
    private float mPrevSpan;
    private float mPrevSpanX;
    private float mPrevSpanY;
    private long mPrevTime;
    private boolean mQuickScaleEnabled;
    private int mSpanSlop;
    private boolean mStylusScaleEnabled;

    public interface OnScaleGestureListener {
        boolean onScale(ScaleGestureDetector scaleGestureDetector);

        boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector);

        void onScaleEnd(ScaleGestureDetector scaleGestureDetector);
    }

    public static class SimpleOnScaleGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
        public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public ScaleGestureDetector(Context context, OnScaleGestureListener onScaleGestureListener) {
        this(context, onScaleGestureListener, (Handler) null);
    }

    private boolean inAnchoredScaleMode() {
        return this.mAnchoredScaleMode != 0;
    }

    public float getCurrentSpan() {
        return this.mCurrSpan;
    }

    public float getCurrentSpanX() {
        return this.mCurrSpanX;
    }

    public float getCurrentSpanY() {
        return this.mCurrSpanY;
    }

    public long getEventTime() {
        return this.mCurrTime;
    }

    public float getFocusX() {
        return this.mFocusX;
    }

    public float getFocusY() {
        return this.mFocusY;
    }

    public int getMinSpan() {
        return this.mMinSpan;
    }

    public float getPreviousSpan() {
        return this.mPrevSpan;
    }

    public float getPreviousSpanX() {
        return this.mPrevSpanX;
    }

    public float getPreviousSpanY() {
        return this.mPrevSpanY;
    }

    public float getScaleFactor() {
        if (inAnchoredScaleMode()) {
            boolean z = this.mEventBeforeOrAboveStartingGestureEvent;
            boolean z2 = (z && this.mCurrSpan < this.mPrevSpan) || (!z && this.mCurrSpan > this.mPrevSpan);
            float abs = Math.abs(1.0f - (this.mCurrSpan / this.mPrevSpan)) * SCALE_FACTOR;
            if (this.mPrevSpan <= ((float) this.mSpanSlop)) {
                return 1.0f;
            }
            return z2 ? 1.0f + abs : 1.0f - abs;
        }
        float f = this.mPrevSpan;
        if (f > 0.0f) {
            return this.mCurrSpan / f;
        }
        return 1.0f;
    }

    public long getTimeDelta() {
        return this.mCurrTime - this.mPrevTime;
    }

    public boolean isInProgress() {
        return this.mInProgress;
    }

    public boolean isQuickScaleEnabled() {
        return this.mQuickScaleEnabled;
    }

    public boolean isStylusScaleEnabled() {
        return this.mStylusScaleEnabled;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        MotionEvent motionEvent2 = motionEvent;
        this.mCurrTime = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mQuickScaleEnabled) {
            GestureDetector gestureDetector = this.mGestureDetector;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent2);
            C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/maas/handlebox/detector/ScaleGestureDetector", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/maas/handlebox/detector/ScaleGestureDetector", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z = (motionEvent.getButtonState() & 32) != 0;
        boolean z2 = this.mAnchoredScaleMode == 2 && !z;
        boolean z3 = actionMasked == 1 || actionMasked == 3 || z2;
        float f3 = 0.0f;
        if (actionMasked == 0 || z3) {
            if (this.mInProgress) {
                this.mListener.onScaleEnd(this);
                this.mInProgress = false;
                this.mInitialSpan = 0.0f;
                this.mAnchoredScaleMode = 0;
            } else if (inAnchoredScaleMode() && z3) {
                this.mInProgress = false;
                this.mInitialSpan = 0.0f;
                this.mAnchoredScaleMode = 0;
            }
            if (z3) {
                return true;
            }
        }
        if (!this.mInProgress && this.mStylusScaleEnabled && !inAnchoredScaleMode() && !z3 && z) {
            this.mAnchoredScaleStartX = motionEvent.getX();
            this.mAnchoredScaleStartY = motionEvent.getY();
            this.mAnchoredScaleMode = 2;
            this.mInitialSpan = 0.0f;
        }
        boolean z4 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z2;
        boolean z5 = actionMasked == 6;
        int actionIndex = z5 ? motionEvent.getActionIndex() : -1;
        int i = z5 ? pointerCount - 1 : pointerCount;
        if (inAnchoredScaleMode()) {
            f2 = this.mAnchoredScaleStartX;
            f = this.mAnchoredScaleStartY;
            if (motionEvent.getY() < f) {
                this.mEventBeforeOrAboveStartingGestureEvent = true;
            } else {
                this.mEventBeforeOrAboveStartingGestureEvent = false;
            }
        } else {
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (actionIndex != i2) {
                    f4 += motionEvent2.getX(i2);
                    f5 += motionEvent2.getY(i2);
                }
            }
            float f6 = (float) i;
            float f7 = f4 / f6;
            f = f5 / f6;
            f2 = f7;
        }
        float f8 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (actionIndex != i3) {
                f3 += Math.abs(motionEvent2.getX(i3) - f2);
                f8 += Math.abs(motionEvent2.getY(i3) - f);
            }
        }
        float f9 = (float) i;
        float f15 = (f3 / f9) * 3.0f;
        float f16 = (f8 / f9) * 3.0f;
        float hypot = inAnchoredScaleMode() ? f16 : (float) Math.hypot((double) f15, (double) f16);
        boolean z6 = this.mInProgress;
        this.mFocusX = f2;
        this.mFocusY = f;
        if (!inAnchoredScaleMode() && this.mInProgress && (hypot < ((float) this.mMinSpan) || z4)) {
            inAnchoredScaleMode();
            this.mListener.onScaleEnd(this);
            this.mInProgress = false;
            this.mInitialSpan = hypot;
        }
        if (z4) {
            this.mCurrSpanX = f15;
            this.mPrevSpanX = f15;
            this.mCurrSpanY = f16;
            this.mPrevSpanY = f16;
            this.mCurrSpan = hypot;
            this.mPrevSpan = hypot;
            this.mInitialSpan = hypot;
        }
        int i4 = inAnchoredScaleMode() ? this.mSpanSlop : this.mMinSpan;
        if (!this.mInProgress && hypot >= ((float) i4) && (z6 || Math.abs(hypot - this.mInitialSpan) > ((float) this.mSpanSlop))) {
            this.mCurrSpanX = f15;
            this.mPrevSpanX = f15;
            this.mCurrSpanY = f16;
            this.mPrevSpanY = f16;
            this.mCurrSpan = hypot;
            this.mPrevSpan = hypot;
            this.mPrevTime = this.mCurrTime;
            this.mInProgress = this.mListener.onScaleBegin(this);
        }
        if (actionMasked == 2) {
            this.mCurrSpanX = f15;
            this.mCurrSpanY = f16;
            this.mCurrSpan = hypot;
            if (this.mInProgress ? this.mListener.onScale(this) : true) {
                this.mPrevSpanX = this.mCurrSpanX;
                this.mPrevSpanY = this.mCurrSpanY;
                this.mPrevSpan = this.mCurrSpan;
                this.mPrevTime = this.mCurrTime;
            }
        }
        return true;
    }

    public void resetMinSpan() {
        this.mMinSpan = (int) (((float) ViewConfiguration.get(this.mContext).getScaledMinimumScalingSpan()) * 1.0f);
    }

    public void setMinSpan(int i) {
        this.mMinSpan = i;
    }

    public void setQuickScaleEnabled(boolean z) {
        this.mQuickScaleEnabled = z;
        if (z && this.mGestureDetector == null) {
            this.mGestureDetector = new GestureDetector(this.mContext, new GestureDetector.SimpleOnGestureListener() {
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    float unused = ScaleGestureDetector.this.mAnchoredScaleStartX = motionEvent.getX();
                    float unused2 = ScaleGestureDetector.this.mAnchoredScaleStartY = motionEvent.getY();
                    int unused3 = ScaleGestureDetector.this.mAnchoredScaleMode = 1;
                    return true;
                }
            }, this.mHandler);
        }
    }

    public void setStylusScaleEnabled(boolean z) {
        this.mStylusScaleEnabled = z;
    }

    public ScaleGestureDetector(Context context, OnScaleGestureListener onScaleGestureListener, Handler handler) {
        this.mAnchoredScaleMode = 0;
        this.mContext = context;
        this.mListener = onScaleGestureListener;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mSpanSlop = viewConfiguration.getScaledTouchSlop() * 2;
        this.mMinSpan = (int) (((float) viewConfiguration.getScaledMinimumScalingSpan()) * 1.0f);
        this.mHandler = handler;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            setQuickScaleEnabled(true);
        }
        if (i > 22) {
            setStylusScaleEnabled(true);
        }
    }
}
