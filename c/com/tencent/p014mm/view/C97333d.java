package com.tencent.p014mm.view;

import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.view.d */
public class C97333d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f285691d;

    /* renamed from: e */
    public final /* synthetic */ AnimationLayout f285692e;

    public C97333d(AnimationLayout animationLayout, Runnable runnable) {
        this.f285692e = animationLayout;
        this.f285691d = runnable;
    }

    public boolean onPreDraw() {
        this.f285692e.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f285691d.run();
        return true;
    }
}
