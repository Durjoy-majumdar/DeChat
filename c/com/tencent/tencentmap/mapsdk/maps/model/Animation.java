package com.tencent.tencentmap.mapsdk.maps.model;

import android.view.animation.Interpolator;

public interface Animation {
    AnimationListener getAnimationListener();

    long getDuration();

    Interpolator getInterpolator();

    void setAnimationListener(AnimationListener animationListener);

    void setDuration(long j);

    void setInterpolator(Interpolator interpolator);
}
