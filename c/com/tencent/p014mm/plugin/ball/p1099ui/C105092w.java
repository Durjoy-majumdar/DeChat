package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.ball.ui.w */
public class C105092w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f311885d;

    /* renamed from: e */
    public final /* synthetic */ AnimatorListenerAdapter f311886e;

    /* renamed from: f */
    public final /* synthetic */ C105085q f311887f;

    public C105092w(C105085q qVar, boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f311887f = qVar;
        this.f311885d = z;
        this.f311886e = animatorListenerAdapter;
    }

    public void run() {
        this.f311887f.mo149234c(this.f311885d, this.f311886e);
    }
}
