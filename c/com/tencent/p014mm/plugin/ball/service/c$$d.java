package com.tencent.p014mm.plugin.ball.service;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.ball.model.BallInfo;

/* renamed from: com.tencent.mm.plugin.ball.service.c$$d */
public class c$$d extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C105035c f311776d;

    public c$$d(C105035c cVar) {
        this.f311776d = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f311776d.mo149176F0((BallInfo) null, 1.0f);
    }
}
