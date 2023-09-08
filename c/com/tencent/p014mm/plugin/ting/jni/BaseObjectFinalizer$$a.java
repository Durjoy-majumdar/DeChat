package com.tencent.p014mm.plugin.ting.jni;

/* renamed from: com.tencent.mm.plugin.ting.jni.BaseObjectFinalizer$$a */
public final /* synthetic */ class BaseObjectFinalizer$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f347452d;

    public /* synthetic */ BaseObjectFinalizer$$a(long j) {
        this.f347452d = j;
    }

    public final void run() {
        BaseObjectFinalizer.m168904registerObject$lambda0(this.f347452d);
    }
}
