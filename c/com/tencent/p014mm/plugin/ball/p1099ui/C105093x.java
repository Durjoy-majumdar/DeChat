package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.ball.ui.x */
public class C105093x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f311888d;

    /* renamed from: e */
    public final /* synthetic */ AnimatorListenerAdapter f311889e;

    /* renamed from: f */
    public final /* synthetic */ C105085q f311890f;

    public C105093x(C105085q qVar, boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f311890f = qVar;
        this.f311888d = z;
        this.f311889e = animatorListenerAdapter;
    }

    public void run() {
        if (this.f311890f.mo149235e()) {
            this.f311890f.f311870d.mo149222e(this.f311888d, this.f311889e);
        }
    }
}
