package com.tencent.p014mm.view;

import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.view.b */
public class C97330b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f285677d;

    /* renamed from: e */
    public final /* synthetic */ AnimationLayout f285678e;

    public C97330b(AnimationLayout animationLayout, Runnable runnable) {
        this.f285678e = animationLayout;
        this.f285677d = runnable;
    }

    public boolean onPreDraw() {
        this.f285678e.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f285677d.run();
        return true;
    }
}
