package com.tencent.p014mm.app;

import com.tencent.p014mm.app.C114663g0;

/* renamed from: com.tencent.mm.app.f0 */
public class C114662f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C114663g0.C114666c f343516d;

    /* renamed from: e */
    public final /* synthetic */ String f343517e;

    /* renamed from: f */
    public final /* synthetic */ int f343518f;

    /* renamed from: g */
    public final /* synthetic */ long f343519g;

    /* renamed from: h */
    public final /* synthetic */ long f343520h;

    public C114662f0(C114663g0.C114666c cVar, String str, int i, long j, long j2) {
        this.f343516d = cVar;
        this.f343517e = str;
        this.f343518f = i;
        this.f343519g = j;
        this.f343520h = j2;
    }

    public void run() {
        this.f343516d.mo105673b(this.f343517e, this.f343518f, this.f343519g, this.f343520h);
    }
}
