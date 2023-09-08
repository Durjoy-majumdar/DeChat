package com.tencent.p014mm.plugin.report.service;

import lj2.C88544a;

/* renamed from: com.tencent.mm.plugin.report.service.n$$g */
public final /* synthetic */ class n$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f346980d;

    /* renamed from: e */
    public final /* synthetic */ int f346981e;

    /* renamed from: f */
    public final /* synthetic */ String f346982f;

    /* renamed from: g */
    public final /* synthetic */ boolean f346983g;

    public /* synthetic */ n$$g(int i, int i2, String str, boolean z) {
        this.f346980d = i;
        this.f346981e = i2;
        this.f346982f = str;
        this.f346983g = z;
    }

    public final void run() {
        int i = this.f346980d;
        int i2 = this.f346981e;
        String str = this.f346982f;
        boolean z = this.f346983g;
        boolean z2 = C88544a.f255755b;
        C115666i.m162698e((long) i, (long) i2, str, z2, z2, z);
    }
}
