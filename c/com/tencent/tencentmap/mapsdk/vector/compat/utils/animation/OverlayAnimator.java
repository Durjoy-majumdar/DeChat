package com.tencent.tencentmap.mapsdk.vector.compat.utils.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

public abstract class OverlayAnimator {

    /* renamed from: a */
    private Object f349228a;

    /* renamed from: b */
    private long f349229b;

    /* renamed from: c */
    private AnimatorSet f349230c = new AnimatorSet();

    public OverlayAnimator(Object obj, long j) {
        this.f349228a = obj;
        this.f349229b = j;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f349230c.addListener(animatorListener);
    }

    public void cancelAnimation() {
        synchronized (this) {
            this.f349230c.cancel();
        }
    }

    public abstract ValueAnimator createSegmentAnimator(int i);

    public void endAnimation() {
        synchronized (this) {
            this.f349230c.end();
        }
    }

    public AnimatorSet getAnimatorSet() {
        return this.f349230c;
    }

    public long getDuration() {
        return this.f349229b;
    }

    public Object getObject() {
        return this.f349228a;
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f349230c = animatorSet;
    }

    public void setDuration(long j) {
        this.f349229b = j;
    }

    public void setObject(Object obj) {
        this.f349228a = obj;
    }

    public void startAnimation() {
        synchronized (this) {
            if (!this.f349230c.isRunning()) {
                this.f349230c.start();
            }
        }
    }
}
