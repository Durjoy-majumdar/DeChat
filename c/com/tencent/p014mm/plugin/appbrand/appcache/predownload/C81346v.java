package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import com.tencent.p014mm.plugin.appbrand.config.C81652f;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.v */
public final class C81346v extends C81652f {

    /* renamed from: p */
    public final /* synthetic */ String f238819p;

    /* renamed from: q */
    public final /* synthetic */ long f238820q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81346v(String str, long j) {
        super(str);
        this.f238819p = str;
        this.f238820q = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009f A[Catch:{ Exception -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab A[Catch:{ Exception -> 0x0069 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10094h(int r10, int r11, java.lang.String r12, te3.C49335eu3 r13, ob0.C117747y r14) {
        /*
            r9 = this;
            te3.hc r13 = (te3.C49684hc) r13
            kr0.g1 r6 = kr0.C88273g1.SCAN_CODE_FOR_WXA
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.i> r7 = com.tencent.p014mm.plugin.appbrand.config.C81660i.class
            java.lang.String r8 = "MicroMsg.WxaAttributesBatchPreLoader"
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            super.mo10094h(r1, r2, r3, r4, r5)
            long r0 = r9.f238820q
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b7 }
            r14.<init>()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r2 = "preloadByQBarRawString::onCgiBack, qbarString:"
            r14.append(r2)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r2 = r9.f238819p     // Catch:{ Exception -> 0x00b7 }
            r14.append(r2)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r2 = ", errType:"
            r14.append(r2)     // Catch:{ Exception -> 0x00b7 }
            r14.append(r10)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r10 = ", errCode:"
            r14.append(r10)     // Catch:{ Exception -> 0x00b7 }
            r14.append(r11)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r10 = ", errMsg:"
            r14.append(r10)     // Catch:{ Exception -> 0x00b7 }
            if (r12 != 0) goto L_0x0040
            java.lang.String r12 = ""
        L_0x0040:
            r14.append(r12)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r10 = " cost:"
            r14.append(r10)     // Catch:{ Exception -> 0x00b7 }
            r14.append(r0)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r10 = r14.toString()     // Catch:{ Exception -> 0x00b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)     // Catch:{ Exception -> 0x00b7 }
            java.util.LinkedList r10 = new java.util.LinkedList     // Catch:{ Exception -> 0x00b7 }
            r10.<init>()     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object r11 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r7)     // Catch:{ Exception -> 0x00b7 }
            com.tencent.mm.plugin.appbrand.config.i r11 = (com.tencent.p014mm.plugin.appbrand.config.C81660i) r11     // Catch:{ Exception -> 0x00b7 }
            r12 = 113(0x71, float:1.58E-43)
            gy3.C87412m.m108591d(r13)     // Catch:{ Exception -> 0x00b7 }
            r11.mo114001Lo(r12, r13, r10)     // Catch:{ Exception -> 0x00b7 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x00b7 }
        L_0x0069:
            boolean r11 = r10.hasNext()     // Catch:{ Exception -> 0x00b7 }
            if (r11 == 0) goto L_0x00d7
            java.lang.Object r11 = r10.next()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00b7 }
            if (r11 == 0) goto L_0x0080
            int r12 = r11.length()     // Catch:{ Exception -> 0x00b7 }
            if (r12 != 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r12 = 0
            goto L_0x0081
        L_0x0080:
            r12 = 1
        L_0x0081:
            if (r12 != 0) goto L_0x0069
            java.lang.Object r12 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r7)     // Catch:{ Exception -> 0x00b7 }
            com.tencent.mm.plugin.appbrand.config.i r12 = (com.tencent.p014mm.plugin.appbrand.config.C81660i) r12     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r13 = "appInfo"
            java.lang.String[] r13 = new java.lang.String[]{r13}     // Catch:{ Exception -> 0x00b7 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r11 = r12.mo114000LL(r11, r13)     // Catch:{ Exception -> 0x00b7 }
            if (r11 == 0) goto L_0x0069
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r11 = r11.mo113940m2()     // Catch:{ Exception -> 0x0069 }
            boolean r11 = r11.mo113970a()     // Catch:{ Exception -> 0x0069 }
            if (r11 == 0) goto L_0x00ab
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r11 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g     // Catch:{ Exception -> 0x0069 }
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r11 = r11.mo116962a()     // Catch:{ Exception -> 0x0069 }
            com.tencent.luggage.sdk.processes.LuggageServiceType r12 = com.tencent.luggage.sdk.processes.LuggageServiceType.WAGAME     // Catch:{ Exception -> 0x0069 }
            r11.mo116954S(r12, r6)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0069
        L_0x00ab:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r11 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g     // Catch:{ Exception -> 0x0069 }
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r11 = r11.mo116962a()     // Catch:{ Exception -> 0x0069 }
            com.tencent.luggage.sdk.processes.LuggageServiceType r12 = com.tencent.luggage.sdk.processes.LuggageServiceType.WASERVICE     // Catch:{ Exception -> 0x0069 }
            r11.mo116954S(r12, r6)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0069
        L_0x00b7:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "preloadByQBarRawString::batchUpdateWithProto with qbarString:"
            r11.append(r12)
            java.lang.String r12 = r9.f238819p
            r11.append(r12)
            java.lang.String r12 = ", failed exception="
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r10)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81346v.mo10094h(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }
}
