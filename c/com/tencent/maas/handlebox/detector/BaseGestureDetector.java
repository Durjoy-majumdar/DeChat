package com.tencent.maas.handlebox.detector;

import android.content.Context;
import android.view.MotionEvent;

public abstract class BaseGestureDetector {
    public static final float PRESSURE_THRESHOLD = 0.67f;
    public final Context mContext;
    public MotionEvent mCurrEvent;
    public float mCurrPressure;
    public boolean mGestureInProgress;
    public MotionEvent mPrevEvent;
    public float mPrevPressure;
    public long mTimeDelta;

    public BaseGestureDetector(Context context) {
        this.mContext = context;
    }

    public long getEventTime() {
        return this.mCurrEvent.getEventTime();
    }

    public long getTimeDelta() {
        return this.mTimeDelta;
    }

    public abstract void handleInProgressEvent(int i, MotionEvent motionEvent);

    public abstract void handleStartProgressEvent(int i, MotionEvent motionEvent);

    public boolean isInProgress() {
        return this.mGestureInProgress;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (!this.mGestureInProgress) {
            handleStartProgressEvent(action, motionEvent);
            return true;
        }
        handleInProgressEvent(action, motionEvent);
        return true;
    }

    public void resetState() {
        MotionEvent motionEvent = this.mPrevEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.mPrevEvent = null;
        }
        MotionEvent motionEvent2 = this.mCurrEvent;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.mCurrEvent = null;
        }
        this.mGestureInProgress = false;
    }

    public void updateStateByEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.mPrevEvent;
        MotionEvent motionEvent3 = this.mCurrEvent;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
            this.mCurrEvent = null;
        }
        this.mCurrEvent = MotionEvent.obtain(motionEvent);
        this.mTimeDelta = motionEvent.getEventTime() - motionEvent2.getEventTime();
        this.mCurrPressure = motionEvent.getPressure(motionEvent.getActionIndex());
        this.mPrevPressure = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }
}
