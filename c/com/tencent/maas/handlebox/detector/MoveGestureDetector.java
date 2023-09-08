package com.tencent.maas.handlebox.detector;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

public class MoveGestureDetector extends BaseGestureDetector {
    private static final PointF FOCUS_DELTA_ZERO = new PointF();
    private PointF mCurrFocusInternal;
    private PointF mFocusDeltaExternal = new PointF();
    private PointF mFocusExternal = new PointF();
    private final OnMoveGestureListener mListener;
    private PointF mPrevFocusInternal;

    public interface OnMoveGestureListener {
        boolean onMove(MoveGestureDetector moveGestureDetector);

        boolean onMoveBegin(MoveGestureDetector moveGestureDetector);

        void onMoveEnd(MoveGestureDetector moveGestureDetector);
    }

    public static class SimpleOnMoveGestureListener implements OnMoveGestureListener {
        public boolean onMove(MoveGestureDetector moveGestureDetector) {
            return false;
        }

        public boolean onMoveBegin(MoveGestureDetector moveGestureDetector) {
            return true;
        }

        public void onMoveEnd(MoveGestureDetector moveGestureDetector) {
        }
    }

    public MoveGestureDetector(Context context, OnMoveGestureListener onMoveGestureListener) {
        super(context);
        this.mListener = onMoveGestureListener;
    }

    private PointF determineFocalPoint(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = (float) pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    public PointF getFocusDelta() {
        return this.mFocusDeltaExternal;
    }

    public float getFocusX() {
        return this.mFocusExternal.x;
    }

    public float getFocusY() {
        return this.mFocusExternal.y;
    }

    public void handleInProgressEvent(int i, MotionEvent motionEvent) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
            } else if (this.mPrevEvent != null) {
                updateStateByEvent(motionEvent);
                if (this.mCurrPressure / this.mPrevPressure > 0.67f && this.mListener.onMove(this)) {
                    this.mPrevEvent.recycle();
                    this.mPrevEvent = MotionEvent.obtain(motionEvent);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        this.mListener.onMoveEnd(this);
        resetState();
    }

    public void handleStartProgressEvent(int i, MotionEvent motionEvent) {
        if (i == 0) {
            resetState();
            this.mPrevEvent = MotionEvent.obtain(motionEvent);
            this.mTimeDelta = 0;
            updateStateByEvent(motionEvent);
        } else if (i == 2) {
            this.mGestureInProgress = this.mListener.onMoveBegin(this);
        }
    }

    public void updateStateByEvent(MotionEvent motionEvent) {
        PointF pointF;
        super.updateStateByEvent(motionEvent);
        MotionEvent motionEvent2 = this.mPrevEvent;
        this.mCurrFocusInternal = determineFocalPoint(motionEvent);
        this.mPrevFocusInternal = determineFocalPoint(motionEvent2);
        if (motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = FOCUS_DELTA_ZERO;
        } else {
            PointF pointF2 = this.mCurrFocusInternal;
            float f = pointF2.x;
            PointF pointF3 = this.mPrevFocusInternal;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.mFocusDeltaExternal = pointF;
        PointF pointF4 = this.mFocusExternal;
        pointF4.x += pointF.x;
        pointF4.y += pointF.y;
    }
}
