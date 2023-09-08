package com.tencent.p014mm.plugin.ball.service;

import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.ball.service.c$$e */
public class c$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f311777d;

    /* renamed from: e */
    public final /* synthetic */ int f311778e;

    /* renamed from: f */
    public final /* synthetic */ C105035c f311779f;

    public c$$e(C105035c cVar, int i, int i2) {
        this.f311779f = cVar;
        this.f311777d = i;
        this.f311778e = i2;
    }

    public void run() {
        C105035c cVar = this.f311779f;
        cVar.mo149177G0(this.f311777d, this.f311778e, true, true, cVar.f311766p != 0, (AnimatorListenerAdapter) null);
    }
}
