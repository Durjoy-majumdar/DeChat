package eu0;

import f62.C31922b1;

/* renamed from: eu0.j */
public final class C86697j implements C31922b1 {

    /* renamed from: d */
    public static final C86697j f251707d = new C86697j();

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0173  */
    /* renamed from: X5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo10269X5(java.lang.String r19, java.util.Map<java.lang.String, java.lang.String> r20, ob0.C35136m.C35137a r21) {
        /*
            r18 = this;
            r0 = r20
            boolean r1 = f40.C86709a0.m107522a()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "MicroMsg.WMPFVoip.NotifyNewXMLConsumer"
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "values is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            return r2
        L_0x0015:
            r3 = -1
            java.lang.String r4 = ".sysmsg.WxaNativeVoipNotify.type"
            java.lang.Object r4 = sx3.C90364q0.m113145d(r0, r4)     // Catch:{ all -> 0x0023 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0023 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r4 = -1
        L_0x0024:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "subType="
            r5.append(r6)
            r6 = r19
            r5.append(r6)
            java.lang.String r6 = "  type="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            r5 = 2
            r6 = 1
            if (r4 == r6) goto L_0x0081
            if (r4 == r5) goto L_0x004a
            goto L_0x0080
        L_0x004a:
            java.lang.String r4 = ".sysmsg.WxaNativeVoipNotify.room_status"
            java.lang.Object r0 = sx3.C90364q0.m113145d(r0, r4)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0056 }
        L_0x0056:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "roomStatus="
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            eu0.b r0 = eu0.C86683b.f251674a
            r1 = 5
            if (r3 == r1) goto L_0x007b
            r1 = 10
            if (r3 == r1) goto L_0x0075
            goto L_0x0080
        L_0x0075:
            eu0.g r1 = eu0.C86693g.f251702d
            r0.mo121069f(r1)
            goto L_0x0080
        L_0x007b:
            eu0.f r1 = eu0.C86692f.f251701d
            r0.mo121069f(r1)
        L_0x0080:
            return r2
        L_0x0081:
            java.lang.String r1 = ".sysmsg.WxaNativeVoipNotify.appid"
            java.lang.Object r1 = sx3.C90364q0.m113145d(r0, r1)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = ".sysmsg.WxaNativeVoipNotify.userinfo.icon_url"
            java.lang.Object r1 = sx3.C90364q0.m113145d(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = ".sysmsg.WxaNativeVoipNotify.room_id"
            java.lang.Object r1 = sx3.C90364q0.m113145d(r0, r1)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = ".sysmsg.WxaNativeVoipNotify.room_type"
            java.lang.Object r1 = sx3.C90364q0.m113145d(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = ".sysmsg.WxaNativeVoipNotify.userinfo.name"
            java.lang.Object r3 = sx3.C90364q0.m113145d(r0, r3)
            r15 = r3
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r3 = ".sysmsg.WxaNativeVoipNotify.expire_time"
            java.lang.Object r3 = sx3.C90364q0.m113145d(r0, r3)     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00bb }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x00bb }
            r17 = r3
            goto L_0x00bf
        L_0x00bb:
            r3 = 60
            r17 = 60
        L_0x00bf:
            java.lang.String r3 = ".sysmsg.WxaNativeVoipNotify.path_banner"
            java.lang.Object r3 = sx3.C90364q0.m113145d(r0, r3)
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r3 = ".sysmsg.WxaNativeVoipNotify.path_answer"
            java.lang.Object r3 = sx3.C90364q0.m113145d(r0, r3)
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            r3 = 0
            java.lang.String r4 = ".sysmsg.WxaNativeVoipNotify.debug_mode"
            java.lang.Object r0 = sx3.C90364q0.m113145d(r0, r4)     // Catch:{ all -> 0x00df }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00df }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x00df }
            goto L_0x00e0
        L_0x00df:
            r0 = 0
        L_0x00e0:
            if (r0 == 0) goto L_0x00eb
            if (r0 == r6) goto L_0x00e9
            if (r0 == r5) goto L_0x00e7
            goto L_0x00eb
        L_0x00e7:
            r12 = 2
            goto L_0x00ec
        L_0x00e9:
            r12 = 1
            goto L_0x00ec
        L_0x00eb:
            r12 = 0
        L_0x00ec:
            eu0.b r0 = eu0.C86683b.f251674a
            java.lang.String r4 = "appId"
            gy3.C87412m.m108594g(r8, r4)
            java.lang.String r4 = "roomId"
            gy3.C87412m.m108594g(r9, r4)
            java.lang.String r4 = "pathBanner"
            gy3.C87412m.m108594g(r10, r4)
            java.lang.String r4 = "name"
            gy3.C87412m.m108594g(r15, r4)
            java.lang.String r4 = "roomType"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "pathAnswer"
            gy3.C87412m.m108594g(r11, r4)
            com.tencent.mm.plugin.appbrand.utils.h0$a r4 = com.tencent.p014mm.plugin.appbrand.utils.C84742h0.f247143a
            java.lang.String r4 = r4.mo117462a(r8, r12)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = "canJoinVOIP message["
            r7.append(r13)
            r7.append(r4)
            r13 = 93
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            java.lang.String r13 = "MicroMsg.WMPFVoip.WMPFVoipCallInManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r7)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0173
            r0 = 9
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.b75 r4 = new te3.b75
            r4.<init>()
            r4.f131003e = r0
            r4.f131002d = r9
            r1.f127066a = r4
            te3.c75 r0 = new te3.c75
            r0.<init>()
            r1.f127067b = r0
            java.lang.String r0 = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus"
            r1.f127068c = r0
            r0 = 5036(0x13ac, float:7.057E-42)
            r1.f127069d = r0
            ob0.c r0 = r1.mo72403a()
            du0.a r1 = du0.C31289a.f83781d
            ob0.C89144l0.m111429e(r0, r1, r6)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r6] = r3
            r3 = 28142(0x6dee, float:3.9435E-41)
            r0.mo160131h(r3, r1)
            goto L_0x0196
        L_0x0173:
            eu0.i r3 = new eu0.i
            r3.<init>()
            jp.d r4 = eu0.C86683b.f251681h
            if (r4 == 0) goto L_0x0183
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener r4 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener) r4
            r4.f248093a = r3
            r4.mo118163a()
        L_0x0183:
            eu0.b$b r3 = new eu0.b$b
            long r13 = java.lang.System.nanoTime()
            r7 = r3
            r16 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17)
            eu0.C86683b.f251676c = r3
            eu0.e r1 = eu0.C86690e.f251700d
            r0.mo121069f(r1)
        L_0x0196:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: eu0.C86697j.mo10269X5(java.lang.String, java.util.Map, ob0.m$a):ob0.m$b");
    }
}
