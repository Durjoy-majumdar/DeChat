package com.tencent.p014mm.plugin.report.service;

import lj2.C88544a;

/* renamed from: com.tencent.mm.plugin.report.service.n$$k */
public final /* synthetic */ class n$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f346993d;

    /* renamed from: e */
    public final /* synthetic */ String f346994e;

    /* renamed from: f */
    public final /* synthetic */ boolean f346995f;

    public /* synthetic */ n$$k(int i, String str, boolean z) {
        this.f346993d = i;
        this.f346994e = str;
        this.f346995f = z;
    }

    public final void run() {
        int i = this.f346993d;
        String str = this.f346994e;
        boolean z = this.f346995f;
        boolean z2 = C88544a.f255755b;
        C115666i.m162697d((long) i, str, z2, z2, z);
    }
}
