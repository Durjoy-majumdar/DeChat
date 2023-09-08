package com.tencent.maas.handlebox.detector;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public abstract class TwoFingerGestureDetector extends BaseGestureDetector {
    private float mBottomSlopEdge;
    public float mCurrFingerDiffX;
    public float mCurrFingerDiffY;
    private float mCurrLen;
    private final float mEdgeSlop;
    public float mPrevFingerDiffX;
    public float mPrevFingerDiffY;
    private float mPrevLen;
    private float mRightSlopEdge;

    public TwoFingerGestureDetector(Context context) {
        super(context);
        this.mEdgeSlop = (float) ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    public static float getRawX(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getX(i) + rawX;
        }
        return 0.0f;
    }

    public static float getRawY(MotionEvent motionEvent, int i) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getY(i) + rawY;
        }
        return 0.0f;
    }

    public float getCurrentSpan() {
        if (this.mCurrLen == -1.0f) {
            float f = this.mCurrFingerDiffX;
            float f2 = this.mCurrFingerDiffY;
            this.mCurrLen = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
        }
        return this.mCurrLen;
    }

    public float getPreviousSpan() {
        if (this.mPrevLen == -1.0f) {
            float f = this.mPrevFingerDiffX;
            float f2 = this.mPrevFingerDiffY;
            this.mPrevLen = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
        }
        return this.mPrevLen;
    }

    public abstract void handleInProgressEvent(int i, MotionEvent motionEvent);

    public abstract void handleStartProgressEvent(int i, MotionEvent motionEvent);

    public boolean isSloppyGesture(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        float f = this.mEdgeSlop;
        float f2 = ((float) displayMetrics.widthPixels) - f;
        this.mRightSlopEdge = f2;
        float f3 = ((float) displayMetrics.heightPixels) - f;
        this.mBottomSlopEdge = f3;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float rawX2 = getRawX(motionEvent, 1);
        float rawY2 = getRawY(motionEvent, 1);
        boolean z = rawX < f || rawY < f || rawX > f2 || rawY > f3;
        boolean z2 = rawX2 < f || rawY2 < f || rawX2 > f2 || rawY2 > f3;
        return (z && z2) || z || z2;
    }

    public void updateStateByEvent(MotionEvent motionEvent) {
        super.updateStateByEvent(motionEvent);
        MotionEvent motionEvent2 = this.mPrevEvent;
        this.mCurrLen = -1.0f;
        this.mPrevLen = -1.0f;
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        this.mPrevFingerDiffX = motionEvent2.getX(1) - x;
        this.mPrevFingerDiffY = motionEvent2.getY(1) - y;
        float x2 = motionEvent.getX(0);
        float y2 = motionEvent.getY(0);
        this.mCurrFingerDiffX = motionEvent.getX(1) - x2;
        this.mCurrFingerDiffY = motionEvent.getY(1) - y2;
    }
}
