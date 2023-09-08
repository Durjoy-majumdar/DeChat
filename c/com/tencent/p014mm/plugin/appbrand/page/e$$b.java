package com.tencent.p014mm.plugin.appbrand.page;

import java.util.ListIterator;
import p225rc.C89915f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.e$$b */
public class e$$b extends C89915f<C83853m4> {

    /* renamed from: e */
    public C83853m4 f244628e;

    /* renamed from: f */
    public final /* synthetic */ ListIterator f244629f;

    /* renamed from: g */
    public final /* synthetic */ C83787e f244630g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e$$b(C83787e eVar, ListIterator listIterator, ListIterator listIterator2) {
        super(listIterator);
        this.f244630g = eVar;
        this.f244629f = listIterator2;
    }

    public Object next() {
        C83853m4 m4Var = (C83853m4) this.f244629f.next();
        this.f244628e = m4Var;
        return m4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void remove() {
        /*
            r4 = this;
            java.util.ListIterator r0 = r4.f244629f
            r0.remove()
            com.tencent.mm.plugin.appbrand.page.m4 r0 = r4.f244628e
            if (r0 == 0) goto L_0x0034
            com.tencent.mm.plugin.appbrand.page.e r0 = r4.f244630g
            com.tencent.mm.plugin.appbrand.page.o4 r0 = r0.f244625d
            if (r0 == 0) goto L_0x0034
            com.tencent.mm.plugin.appbrand.page.d1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r0.f244549A
            if (r1 == 0) goto L_0x0034
            com.tencent.mm.plugin.appbrand.page.m0 r2 = r1.mo113042Z()
            if (r2 == 0) goto L_0x0034
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r1.mo113042Z()
            com.tencent.mm.plugin.appbrand.page.x2 r1 = r1.f244753x
            long r2 = r0.mo116149D0()
            android.util.LongSparseArray<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.f245153c
            r0.remove(r2)
            android.util.LongSparseArray<com.tencent.mm.plugin.appbrand.page.h4> r0 = r1.f245151a
            r0.remove(r2)
            android.util.LongSparseArray<com.tencent.mm.plugin.appbrand.page.h4> r0 = r1.f245152b
            r0.remove(r2)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.e$$b.remove():void");
    }
}
