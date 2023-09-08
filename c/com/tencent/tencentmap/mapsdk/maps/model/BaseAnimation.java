package com.tencent.tencentmap.mapsdk.maps.model;

import android.view.animation.Interpolator;

public abstract class BaseAnimation implements Animation {
    private AnimationListener mAnimationListener;
    private long mDuration;
    private Interpolator mInterpolator;

    public AnimationListener getAnimationListener() {
        return this.mAnimationListener;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Interpolator getInterpolator() {
        return this.mInterpolator;
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.mAnimationListener = animationListener;
    }

    public void setDuration(long j) {
        this.mDuration = j;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }
}
