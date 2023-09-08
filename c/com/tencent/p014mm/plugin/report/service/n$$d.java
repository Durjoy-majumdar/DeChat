package com.tencent.p014mm.plugin.report.service;

import lj2.C88544a;

/* renamed from: com.tencent.mm.plugin.report.service.n$$d */
public final /* synthetic */ class n$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f346972d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f346973e;

    public /* synthetic */ n$$d(int i, byte[] bArr) {
        this.f346972d = i;
        this.f346973e = bArr;
    }

    public final void run() {
        int i = this.f346972d;
        byte[] bArr = this.f346973e;
        long j = (long) i;
        boolean z = C88544a.f255755b;
        C115666i.m162696c(j, bArr, z, z);
    }
}
