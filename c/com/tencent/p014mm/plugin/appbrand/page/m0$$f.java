package com.tencent.p014mm.plugin.appbrand.page;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$f */
public class m0$$f implements m0$$x {

    /* renamed from: d */
    public boolean f244774d = false;

    /* renamed from: e */
    public boolean f244775e = false;

    /* renamed from: f */
    public final /* synthetic */ C83817h4 f244776f;

    /* renamed from: g */
    public final /* synthetic */ C83820i0 f244777g;

    /* renamed from: h */
    public final /* synthetic */ C83820i0 f244778h;

    /* renamed from: i */
    public final /* synthetic */ long f244779i;

    /* renamed from: j */
    public final /* synthetic */ C83849m0 f244780j;

    public m0$$f(C83849m0 m0Var, C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2, long j) {
        this.f244780j = m0Var;
        this.f244776f = h4Var;
        this.f244777g = i0Var;
        this.f244778h = i0Var2;
        this.f244779i = j;
    }

    /* renamed from: h5 */
    public void mo116384h5(boolean z) {
        this.f244775e = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            boolean r0 = r13.f244774d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r13.f244774d = r0
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r13.f244780j
            int r1 = r1.getPageCount()
            if (r1 != 0) goto L_0x0011
            return
        L_0x0011:
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r13.f244780j
            byte[] r1 = r1.f244744o
            monitor-enter(r1)
            com.tencent.mm.plugin.appbrand.page.m0 r2 = r13.f244780j     // Catch:{ all -> 0x013a }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r2 = r2.f244745p     // Catch:{ all -> 0x013a }
            java.lang.Object r2 = r2.peekFirst()     // Catch:{ all -> 0x013a }
            com.tencent.mm.plugin.appbrand.page.i0 r2 = (com.tencent.p014mm.plugin.appbrand.page.C83820i0) r2     // Catch:{ all -> 0x013a }
            monitor-exit(r1)     // Catch:{ all -> 0x013a }
            com.tencent.mm.plugin.appbrand.page.h4 r1 = r13.f244776f
            boolean r1 = com.tencent.p014mm.plugin.appbrand.page.C83829i4.m103115b(r1)
            r3 = 0
            if (r1 == 0) goto L_0x002f
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r13.f244780j
            r1.mo116355i(r2, r3)
        L_0x002f:
            boolean r1 = r13.f244775e
            r1 = r1 ^ r0
            com.tencent.mm.plugin.appbrand.page.h4 r4 = r13.f244776f
            com.tencent.mm.plugin.appbrand.page.h4 r5 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.REDIRECT_TO
            r6 = 0
            if (r4 == r5) goto L_0x004c
            com.tencent.mm.plugin.appbrand.page.h4 r5 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.REWRITE_ROUTE
            if (r4 == r5) goto L_0x004c
            com.tencent.mm.plugin.appbrand.page.h4 r5 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.SWITCH_TAB
            if (r4 == r5) goto L_0x004c
            com.tencent.mm.plugin.appbrand.page.h4 r5 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.RE_LAUNCH
            if (r4 == r5) goto L_0x004c
            com.tencent.mm.plugin.appbrand.page.h4 r5 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.AUTO_RE_LAUNCH
            if (r4 != r5) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r4 = 0
            goto L_0x004d
        L_0x004c:
            r4 = 1
        L_0x004d:
            java.lang.String r5 = "MicroMsg.AppBrandPageContainer"
            java.lang.String r7 = "navigateToNext$navigateTask.run(), before switch page, appId[%s], out[%s] in[%s] animate[%b] close[%b] type[%s]"
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.tencent.mm.plugin.appbrand.page.m0 r9 = r13.f244780j
            java.lang.String r9 = r9.getAppId()
            r8[r6] = r9
            com.tencent.mm.plugin.appbrand.page.i0 r9 = r13.f244777g
            if (r9 != 0) goto L_0x0062
            r9 = r3
            goto L_0x006a
        L_0x0062:
            java.lang.String r9 = r9.getCurrentUrl()
            java.lang.String r9 = p225rc.C89925n.m112488a(r9)
        L_0x006a:
            r8[r0] = r9
            r9 = 2
            com.tencent.mm.plugin.appbrand.page.i0 r10 = r13.f244778h
            java.lang.String r10 = r10.getCurrentUrl()
            java.lang.String r10 = p225rc.C89925n.m112488a(r10)
            r8[r9] = r10
            r9 = 3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            r8[r9] = r10
            r9 = 4
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            r8[r9] = r10
            r9 = 5
            com.tencent.mm.plugin.appbrand.page.h4 r10 = r13.f244776f
            r8[r9] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r8)
            com.tencent.mm.plugin.appbrand.page.m0 r5 = r13.f244780j
            r5.getClass()
            if (r2 != 0) goto L_0x0097
            goto L_0x00cd
        L_0x0097:
            if (r4 == 0) goto L_0x00ab
            byte[] r7 = r5.f244744o
            monitor-enter(r7)
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r8 = r5.f244745p     // Catch:{ all -> 0x00a8 }
            r8.remove(r2)     // Catch:{ all -> 0x00a8 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r8 = r5.f244746q     // Catch:{ all -> 0x00a8 }
            r8.remove(r2)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r7)     // Catch:{ all -> 0x00a8 }
            goto L_0x00ab
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a8 }
            throw r0
        L_0x00ab:
            boolean r7 = r2.f244676A
            if (r7 != 0) goto L_0x00b4
            r2.f244676A = r0
            r2.mo116224D()
        L_0x00b4:
            com.tencent.mm.plugin.appbrand.page.s0 r0 = new com.tencent.mm.plugin.appbrand.page.s0
            r0.<init>(r5, r4, r2)
            if (r1 == 0) goto L_0x00c7
            com.tencent.mm.plugin.appbrand.page.m0$$x r0 = r5.mo116358j0(r0)
            java.lang.Object r4 = r5.mo116034X(r2)
            r5.mo116341g0(r2, r4, r0)
            goto L_0x00ce
        L_0x00c7:
            r5.mo116340g(r2)
            r0.run()
        L_0x00cd:
            r4 = r3
        L_0x00ce:
            com.tencent.mm.plugin.appbrand.page.m0 r0 = r13.f244780j
            long r10 = r13.f244779i
            com.tencent.mm.plugin.appbrand.page.i0 r5 = r13.f244778h
            com.tencent.mm.plugin.appbrand.page.h4 r12 = r13.f244776f
            if (r5 != 0) goto L_0x00dc
            r0.getClass()
            goto L_0x011f
        L_0x00dc:
            byte[] r7 = r0.f244744o
            monitor-enter(r7)
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r8 = r0.f244745p     // Catch:{ all -> 0x0137 }
            r8.remove(r5)     // Catch:{ all -> 0x0137 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r8 = r0.f244745p     // Catch:{ all -> 0x0137 }
            r8.push(r5)     // Catch:{ all -> 0x0137 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r8 = r0.f244746q     // Catch:{ all -> 0x0137 }
            r8.remove(r5)     // Catch:{ all -> 0x0137 }
            monitor-exit(r7)     // Catch:{ all -> 0x0137 }
            r5.bringToFront()
            r0.requestLayout()
            r0.invalidate()
            boolean r7 = r5.f244676A
            if (r7 == 0) goto L_0x0103
            r5.f244676A = r6
            r5.f244677B = r6
            r5.mo116226F()
        L_0x0103:
            com.tencent.mm.plugin.appbrand.page.t0 r6 = new com.tencent.mm.plugin.appbrand.page.t0
            r7 = r6
            r8 = r0
            r9 = r5
            r7.<init>(r8, r9, r10, r12)
            if (r1 == 0) goto L_0x0119
            com.tencent.mm.plugin.appbrand.page.m0$$x r1 = r0.mo116358j0(r6)
            java.lang.Object r3 = r0.mo116033W(r5)
            r0.mo116341g0(r5, r3, r1)
            goto L_0x011f
        L_0x0119:
            r0.mo116340g(r5)
            r6.run()
        L_0x011f:
            com.tencent.mm.plugin.appbrand.page.m0 r0 = r13.f244780j
            com.tencent.mm.plugin.appbrand.page.h4 r1 = r13.f244776f
            com.tencent.mm.plugin.appbrand.page.i0 r5 = r13.f244778h
            com.tencent.mm.plugin.appbrand.page.m0$$b0 r6 = new com.tencent.mm.plugin.appbrand.page.m0$$b0
            r6.<init>(r3, r4)
            r0.mo116333S(r1, r2, r5, r6)
            com.tencent.mm.plugin.appbrand.page.m0 r0 = r13.f244780j
            com.tencent.mm.plugin.appbrand.page.i0 r1 = r13.f244778h
            com.tencent.mm.plugin.appbrand.page.h4 r3 = r13.f244776f
            r0.mo110176G(r2, r1, r3)
            return
        L_0x0137:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0137 }
            throw r0
        L_0x013a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x013a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.m0$$f.run():void");
    }
}
