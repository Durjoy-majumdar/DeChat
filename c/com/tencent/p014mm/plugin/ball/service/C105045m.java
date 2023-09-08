package com.tencent.p014mm.plugin.ball.service;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.ball.model.BallInfo;

/* renamed from: com.tencent.mm.plugin.ball.service.m */
public class C105045m extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ BallInfo f311794d;

    /* renamed from: e */
    public final /* synthetic */ C105035c f311795e;

    public C105045m(C105035c cVar, BallInfo ballInfo) {
        this.f311795e = cVar;
        this.f311794d = ballInfo;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.f311795e.f311761k) {
            this.f311795e.mo149176F0(this.f311794d, 1.0f);
        }
    }
}
