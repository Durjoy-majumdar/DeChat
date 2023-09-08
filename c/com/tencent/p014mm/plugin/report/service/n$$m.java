package com.tencent.p014mm.plugin.report.service;

import lj2.C88544a;

/* renamed from: com.tencent.mm.plugin.report.service.n$$m */
public final /* synthetic */ class n$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f347000d;

    /* renamed from: e */
    public final /* synthetic */ int f347001e;

    /* renamed from: f */
    public final /* synthetic */ String f347002f;

    public /* synthetic */ n$$m(int i, int i2, String str) {
        this.f347000d = i;
        this.f347001e = i2;
        this.f347002f = str;
    }

    public final void run() {
        int i = this.f347000d;
        int i2 = this.f347001e;
        String str = this.f347002f;
        boolean z = C88544a.f255755b;
        C115666i.m162698e((long) i, (long) i2, str, z, z, false);
    }
}
