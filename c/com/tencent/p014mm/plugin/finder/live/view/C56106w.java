package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.finder.live.view.w */
public final class C56106w extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C56081l f159972d;

    public C56106w(C56081l lVar) {
        this.f159972d = lVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f159972d.f159930o.setVisibility(0);
    }
}
