package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.p1 */
public class C82747p1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f242069d;

    /* renamed from: e */
    public final /* synthetic */ String f242070e;

    /* renamed from: f */
    public final /* synthetic */ WeakReference f242071f;

    /* renamed from: g */
    public final /* synthetic */ int f242072g;

    /* renamed from: h */
    public final /* synthetic */ C82751q1 f242073h;

    public C82747p1(C82751q1 q1Var, C81925i2 i2Var, String str, WeakReference weakReference, int i) {
        this.f242073h = q1Var;
        this.f242069d = i2Var;
        this.f242070e = str;
        this.f242071f = weakReference;
        this.f242072g = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x001f, LOOP_START, PHI: r1 
      PHI: (r1v1 op3.j) = (r1v0 op3.j), (r1v15 op3.j) binds: [B:0:0x0000, B:4:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.media.q1$b> r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C82751q1.f242077g
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.appbrand.jsapi.media.q1$b r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.media.C82751q1.C82753b) r1
            com.tencent.mm.plugin.appbrand.i2 r2 = r5.f242069d
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r2.getRuntime()
            java.lang.String r3 = r5.f242070e
            op3.j r1 = r1.mo115018a(r2, r3)
            if (r1 == 0) goto L_0x0007
        L_0x0021:
            java.lang.ref.WeakReference r0 = r5.f242071f
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x00c9
            java.lang.ref.WeakReference r0 = r5.f242071f
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.i2 r0 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r0
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = "fail:file not found"
            if (r1 == 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r2 = r1.mo182596a(r2)
            com.tencent.mm.plugin.appbrand.jsapi.media.q1$e r2 = (com.tencent.p014mm.plugin.appbrand.jsapi.media.C82751q1.C82756e) r2
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x00a2
            r0 = 2
            if (r2 == r0) goto L_0x0054
            com.tencent.mm.plugin.appbrand.jsapi.media.q1 r0 = r5.f242073h
            java.lang.String r1 = "fail"
            java.lang.String r0 = r0.mo115109j(r1)
            goto L_0x00a8
        L_0x0054:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            r0 = 1
            java.lang.Object r3 = r1.mo182596a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.q1$c r3 = (com.tencent.p014mm.plugin.appbrand.jsapi.media.C82751q1.C82754c) r3
            int r3 = r3.f242078a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "width"
            r2.put(r4, r3)
            java.lang.Object r3 = r1.mo182596a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.q1$c r3 = (com.tencent.p014mm.plugin.appbrand.jsapi.media.C82751q1.C82754c) r3
            int r3 = r3.f242079b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "height"
            r2.put(r4, r3)
            java.lang.Object r3 = r1.mo182596a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.q1$c r3 = (com.tencent.p014mm.plugin.appbrand.jsapi.media.C82751q1.C82754c) r3
            java.lang.String r3 = r3.f242080c
            java.lang.String r4 = "orientation"
            r2.put(r4, r3)
            java.lang.Object r0 = r1.mo182596a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.q1$c r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.media.C82751q1.C82754c) r0
            java.lang.String r0 = r0.f242081d
            java.lang.String r1 = "type"
            r2.put(r1, r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.q1 r0 = r5.f242073h
            java.lang.String r1 = "ok"
            java.lang.String r0 = r0.mo115112m(r1, r2)
            goto L_0x00a8
        L_0x00a2:
            com.tencent.mm.plugin.appbrand.jsapi.media.q1 r1 = r5.f242073h
            java.lang.String r0 = r1.mo115109j(r0)
        L_0x00a8:
            java.lang.ref.WeakReference r1 = r5.f242071f
            java.lang.Object r1 = r1.get()
            com.tencent.mm.plugin.appbrand.i2 r1 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r1
            int r2 = r5.f242072g
            r1.mo109647a(r2, r0)
            goto L_0x00c9
        L_0x00b6:
            java.lang.ref.WeakReference r1 = r5.f242071f
            java.lang.Object r1 = r1.get()
            com.tencent.mm.plugin.appbrand.i2 r1 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r1
            int r2 = r5.f242072g
            com.tencent.mm.plugin.appbrand.jsapi.media.q1 r3 = r5.f242073h
            java.lang.String r0 = r3.mo115109j(r0)
            r1.mo109647a(r2, r0)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.C82747p1.run():void");
    }
}
