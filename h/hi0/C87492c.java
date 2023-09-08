package hi0;

import te3.e75;
import te3.h75;

/* renamed from: hi0.c */
public class C87492c extends C87491a<Boolean, h75> {

    /* renamed from: a */
    public final int f253489a;

    /* renamed from: b */
    public final String f253490b;

    public C87492c(int i, String str) {
        this.f253489a = i;
        this.f253490b = str;
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        return ((h75) obj).f134481d;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdGetCode";
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d0  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo58858b(java.lang.String r17, java.lang.String r18, te3.h75 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            java.lang.String r5 = "MicroMsg.AppBrand.Predownload.CmdGetCode"
            if (r4 == 0) goto L_0x0018
            java.lang.String r1 = "getCode nil appId"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L_0x0018:
            java.lang.String r4 = r3.f134487j
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0031
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r8] = r1
            r3[r7] = r2
            java.lang.String r1 = "getCode(%s | %s), nil md5"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r3)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L_0x0031:
            java.lang.String r4 = r3.f134488n
            int r9 = r3.f134489o
            r10 = 36
            java.lang.String r11 = ""
            if (r9 == 0) goto L_0x0088
            r12 = 6
            if (r9 == r12) goto L_0x0085
            r12 = 12
            java.lang.String r13 = "__WITHOUT_PLUGINCODE__"
            if (r9 == r12) goto L_0x0089
            r12 = 13
            if (r9 == r12) goto L_0x006e
            r12 = 22
            java.lang.String r13 = "__WITHOUT_MULTI_PLUGINCODE__"
            if (r9 == r12) goto L_0x0089
            r12 = 23
            if (r9 == r12) goto L_0x0057
            java.lang.String r13 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r4)
            goto L_0x0089
        L_0x0057:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r4)
            r9.append(r4)
            r9.append(r10)
            r9.append(r13)
            java.lang.String r13 = r9.toString()
            goto L_0x0089
        L_0x006e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r4)
            r9.append(r4)
            r9.append(r10)
            r9.append(r13)
            java.lang.String r13 = r9.toString()
            goto L_0x0089
        L_0x0085:
            java.lang.String r13 = "__PLUGINCODE__"
            goto L_0x0089
        L_0x0088:
            r13 = r11
        L_0x0089:
            r4 = 0
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r9 == 0) goto L_0x00b6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r12 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
        L_0x00ae:
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            goto L_0x00b7
        L_0x00b6:
            r9 = r4
        L_0x00b7:
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r9 = com.tencent.p014mm.plugin.appbrand.launching.C83396o0.m102337b(r9, r8)
            if (r9 == 0) goto L_0x0105
            int r9 = r9.pkgVersion
            int r10 = r3.f134486i
            if (r9 < r10) goto L_0x0105
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r1[r8] = r4
            r1[r7] = r2
            int r2 = r3.f134486i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r6] = r2
            java.lang.String r2 = "call, localUsage(%d) ok, cmd_appId(%s), cmd_version(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            ii0.a r1 = ii0.C87732a.INSTANCE
            te3.e75 r2 = r3.f134481d
            int r2 = r2.f132768f
            r3 = 44
            r1.mo122144a(r2, r3)
            r1 = 14
            int r2 = r0.f253489a
            if (r1 != r2) goto L_0x0102
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 != 0) goto L_0x00f6
            boolean r1 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r1 == 0) goto L_0x0102
        L_0x00f6:
            zt3.t r1 = zt3.C119157j.f356862d
            hi0.c$$a r2 = new hi0.c$$a
            r2.<init>()
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183895z(r2)
        L_0x0102:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L_0x0105:
            boolean r9 = r3.f134485h
            if (r9 == 0) goto L_0x0138
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.t1> r9 = com.tencent.p014mm.plugin.appbrand.appcache.C29301t1.class
            java.lang.Object r9 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r9)
            com.tencent.mm.plugin.appbrand.appcache.t1 r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C29301t1) r9
            int r10 = r3.f134486i
            com.tencent.mm.plugin.appbrand.appcache.s1 r9 = r9.mo56578qq(r2, r7, r10)
            if (r9 == 0) goto L_0x0138
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r8] = r2
            int r2 = r3.f134486i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r7] = r2
            java.lang.String r2 = "call IsEncrypt=true, encryptPkg ok, cmd_appId(%s), cmd_version(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            ii0.a r1 = ii0.C87732a.INSTANCE
            te3.e75 r2 = r3.f134481d
            int r2 = r2.f132768f
            r3 = 45
            r1.mo122144a(r2, r3)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L_0x0138:
            java.lang.Class<ki0.d> r6 = ki0.C88154d.class
            java.lang.Object r6 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r6)
            ki0.d r6 = (ki0.C88154d) r6
            int r9 = r0.f253489a
            te3.e75 r10 = r3.f134481d
            int r10 = r10.f132767e
            long r10 = js0.C88022n.m109570a(r10)
            java.lang.String r12 = r0.f253490b
            r6.getClass()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            if (r13 != 0) goto L_0x01ad
            ki0.c r13 = new ki0.c
            r13.<init>()
            r13.field_appId = r2
            int r14 = r3.f134486i
            r13.field_version = r14
            boolean r14 = r3.f134485h
            r13.field_type = r14
            java.lang.String r14 = r3.f134488n
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r14)
            r13.field_packageKey = r14
            int r14 = r3.f134489o
            r13.field_packageType = r14
            java.lang.String[] r14 = new java.lang.String[r8]
            boolean r14 = r6.get(r13, r14)
            r13.field_firstTimeTried = r8
            r15 = r5
            r4 = 0
            r13.field_lastRetryTime = r4
            r13.field_retriedCount = r8
            int r4 = r3.f134483f
            r13.field_retryTimes = r4
            int r4 = r3.f134484g
            long r4 = (long) r4
            r13.field_retryInterval = r4
            int r4 = r3.f134482e
            r13.field_networkType = r4
            java.lang.String r4 = r3.f134487j
            r13.field_pkgMd5 = r4
            te3.e75 r3 = r3.f134481d
            int r3 = r3.f132768f
            r13.field_reportId = r3
            r13.field_scene = r9
            r13.field_cmdSequence = r10
            r13.field_localRequestKey = r12
            if (r14 == 0) goto L_0x01a5
            java.lang.String[] r3 = new java.lang.String[r8]
            boolean r3 = r6.update(r13, r3)
            goto L_0x01a9
        L_0x01a5:
            boolean r3 = r6.insert(r13)
        L_0x01a9:
            if (r3 == 0) goto L_0x01ae
            r4 = r13
            goto L_0x01af
        L_0x01ad:
            r15 = r5
        L_0x01ae:
            r4 = 0
        L_0x01af:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            if (r4 == 0) goto L_0x01b5
            r5 = 1
            goto L_0x01b6
        L_0x01b5:
            r5 = 0
        L_0x01b6:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3[r8] = r5
            java.lang.String r5 = "getCode, writeCmd %b"
            r6 = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r3)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.f> r3 = com.tencent.p014mm.plugin.appbrand.appstorage.C29324f.class
            java.lang.Object r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r3)
            com.tencent.mm.plugin.appbrand.appstorage.f r3 = (com.tencent.p014mm.plugin.appbrand.appstorage.C29324f) r3
            r3.mo56602jo(r2, r1)
            if (r4 == 0) goto L_0x01d0
            goto L_0x01d1
        L_0x01d0:
            r7 = 0
        L_0x01d1:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C87492c.mo58858b(java.lang.String, java.lang.String, te3.h75):java.lang.Boolean");
    }
}
