package com.tencent.p014mm.plugin.report.service;

/* renamed from: com.tencent.mm.plugin.report.service.n$$h */
public final /* synthetic */ class n$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f346984d;

    /* renamed from: e */
    public final /* synthetic */ int f346985e;

    /* renamed from: f */
    public final /* synthetic */ String f346986f;

    /* renamed from: g */
    public final /* synthetic */ boolean f346987g;

    /* renamed from: h */
    public final /* synthetic */ boolean f346988h;

    public /* synthetic */ n$$h(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        this.f346984d = i;
        this.f346985e = i2;
        this.f346986f = str;
        this.f346987g = z;
        this.f346988h = z3;
    }

    public final void run() {
        int i = this.f346984d;
        C115666i.m162698e((long) i, (long) this.f346985e, this.f346986f, this.f346987g, false, this.f346988h);
    }
}
