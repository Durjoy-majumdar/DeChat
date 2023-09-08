package com.tencent.p014mm.plugin.appbrand.page;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.page.o0 */
public class C83861o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f244845d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f244846e;

    /* renamed from: f */
    public final /* synthetic */ long f244847f;

    /* renamed from: g */
    public final /* synthetic */ C83849m0 f244848g;

    public C83861o0(C83849m0 m0Var, int i, JSONObject jSONObject, long j) {
        this.f244848g = m0Var;
        this.f244845d = i;
        this.f244846e = jSONObject;
        this.f244847f = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r8 = r9.f244848g.mo110175F(r6, r5);
        r9.f244848g.mo116355i(r6, r5);
        r9.f244848g.mo116354h0(r9.f244847f, r5, r6, com.tencent.p014mm.plugin.appbrand.page.C83817h4.NAVIGATE_BACK, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.page.m0 r0 = r9.f244848g
            byte[] r0 = r0.f244744o
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r9.f244848g     // Catch:{ all -> 0x008b }
            r1.mo116366r()     // Catch:{ all -> 0x008b }
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r9.f244848g     // Catch:{ all -> 0x008b }
            com.tencent.mm.plugin.appbrand.page.i0 r6 = r1.getCurrentPage()     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0079
            int r1 = r6.getCurrentRenderPagesCount()     // Catch:{ all -> 0x008b }
            r2 = 1
            if (r1 > r2) goto L_0x0022
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r9.f244848g     // Catch:{ all -> 0x008b }
            com.tencent.mm.plugin.appbrand.page.i0 r1 = r1.mo116377t(r6)     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0022
            goto L_0x0079
        L_0x0022:
            int r1 = r9.f244845d     // Catch:{ all -> 0x008b }
            int r3 = r6.getCurrentRenderPagesCount()     // Catch:{ all -> 0x008b }
            int r3 = r3 - r2
            if (r1 > r3) goto L_0x0034
            int r1 = r9.f244845d     // Catch:{ all -> 0x008b }
            org.json.JSONObject r3 = r9.f244846e     // Catch:{ all -> 0x008b }
            r6.mo116297i(r1, r3, r2)     // Catch:{ all -> 0x008b }
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x0034:
            int r1 = r9.f244845d     // Catch:{ all -> 0x008b }
            com.tencent.mm.plugin.appbrand.page.m0 r2 = r9.f244848g     // Catch:{ all -> 0x008b }
            r2.getClass()     // Catch:{ all -> 0x008b }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r2 = r2.f244745p     // Catch:{ all -> 0x008b }
            java.util.ListIterator r2 = r2.listIterator()     // Catch:{ all -> 0x008b }
        L_0x0041:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x008b }
            r5 = r3
            com.tencent.mm.plugin.appbrand.page.i0 r5 = (com.tencent.p014mm.plugin.appbrand.page.C83820i0) r5     // Catch:{ all -> 0x008b }
            if (r1 > 0) goto L_0x004b
            goto L_0x0063
        L_0x004b:
            int r3 = r5.getCurrentRenderPagesCount()     // Catch:{ all -> 0x008b }
            if (r1 < r3) goto L_0x005d
            int r3 = r5.getCurrentRenderPagesCount()     // Catch:{ all -> 0x008b }
            int r1 = r1 - r3
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x008b }
            if (r3 != 0) goto L_0x0041
            goto L_0x0063
        L_0x005d:
            org.json.JSONObject r2 = r9.f244846e     // Catch:{ all -> 0x008b }
            r3 = 0
            r5.mo116297i(r1, r2, r3)     // Catch:{ all -> 0x008b }
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            com.tencent.mm.plugin.appbrand.page.m0 r0 = r9.f244848g
            com.tencent.mm.plugin.appbrand.page.m0$$c0 r8 = r0.mo110175F(r6, r5)
            com.tencent.mm.plugin.appbrand.page.m0 r0 = r9.f244848g
            r0.mo116355i(r6, r5)
            com.tencent.mm.plugin.appbrand.page.m0 r2 = r9.f244848g
            long r3 = r9.f244847f
            com.tencent.mm.plugin.appbrand.page.h4 r7 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.NAVIGATE_BACK
            r2.mo116354h0(r3, r5, r6, r7, r8)
            return
        L_0x0079:
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r9.f244848g     // Catch:{ all -> 0x008b }
            java.lang.String r1 = r1.f244738f     // Catch:{ all -> 0x008b }
            com.tencent.mm.plugin.appbrand.l$e r2 = com.tencent.p014mm.plugin.appbrand.C83231l.C83235e.BACK     // Catch:{ all -> 0x008b }
            com.tencent.p014mm.plugin.appbrand.C83231l.m102146g(r1, r2)     // Catch:{ all -> 0x008b }
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r9.f244848g     // Catch:{ all -> 0x008b }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.f244737e     // Catch:{ all -> 0x008b }
            r1.mo113063k()     // Catch:{ all -> 0x008b }
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x008b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83861o0.run():void");
    }
}
