package hi0;

import te3.e75;
import te3.m75;

/* renamed from: hi0.j */
public class C87497j extends C87491a<Boolean, m75> {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f A[Catch:{ Exception -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca A[Catch:{ Exception -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00df A[Catch:{ Exception -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e1 A[Catch:{ Exception -> 0x0108 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo58858b(java.lang.String r12, java.lang.String r13, java.lang.Object r14) {
        /*
            r11 = this;
            te3.m75 r14 = (te3.m75) r14
            java.lang.String r0 = r14.f137896e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.String r5 = "MicroMsg.AppBrand.Predownload.CmdIssueContact"
            if (r1 == 0) goto L_0x001e
            java.lang.Object[] r14 = new java.lang.Object[r4]
            r14[r2] = r12
            r14[r3] = r13
            java.lang.String r12 = "call[%s | %s], empty base64"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r12, r14)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L_0x0116
        L_0x001e:
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ Exception -> 0x0108 }
            te3.o55 r1 = new te3.o55     // Catch:{ Exception -> 0x0108 }
            r1.<init>()     // Catch:{ Exception -> 0x0108 }
            r1.parseFrom(r0)     // Catch:{ Exception -> 0x0108 }
            wi0.e0 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()     // Catch:{ Exception -> 0x0108 }
            java.lang.String r6 = "versionInfo"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch:{ Exception -> 0x0108 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r0.mo114000LL(r12, r6)     // Catch:{ Exception -> 0x0108 }
            r6 = 0
            if (r0 != 0) goto L_0x003e
            r0 = r6
            goto L_0x0042
        L_0x003e:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r0.mo113942o2()     // Catch:{ Exception -> 0x0108 }
        L_0x0042:
            java.util.LinkedList<te3.n55> r7 = r1.f138969e     // Catch:{ Exception -> 0x0108 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x0108 }
        L_0x0048:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x0108 }
            if (r8 == 0) goto L_0x0065
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x0108 }
            te3.n55 r8 = (te3.n55) r8     // Catch:{ Exception -> 0x0108 }
            java.lang.String r9 = "WxaAppVersionInfo"
            java.lang.String r10 = r8.f138424d     // Catch:{ Exception -> 0x0108 }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0108 }
            if (r9 == 0) goto L_0x0048
            java.lang.String r6 = r8.f138425e     // Catch:{ Exception -> 0x0108 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r6 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionInfo.m100125a(r6)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0048
        L_0x0065:
            if (r6 != 0) goto L_0x0076
            ii0.a r0 = ii0.C87732a.INSTANCE     // Catch:{ Exception -> 0x0108 }
            te3.e75 r14 = r14.f137895d     // Catch:{ Exception -> 0x0108 }
            int r14 = r14.f132768f     // Catch:{ Exception -> 0x0108 }
            r1 = 87
            r0.mo122144a(r14, r1)     // Catch:{ Exception -> 0x0108 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0108 }
            goto L_0x0116
        L_0x0076:
            ii0.a r7 = ii0.C87732a.INSTANCE     // Catch:{ Exception -> 0x0108 }
            te3.e75 r8 = r14.f137895d     // Catch:{ Exception -> 0x0108 }
            int r8 = r8.f132768f     // Catch:{ Exception -> 0x0108 }
            r9 = 88
            r7.mo122144a(r8, r9)     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x008c
            int r8 = r0.f239452d     // Catch:{ Exception -> 0x0108 }
            int r9 = r6.f239452d     // Catch:{ Exception -> 0x0108 }
            if (r8 >= r9) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r8 = 0
            goto L_0x008d
        L_0x008c:
            r8 = 1
        L_0x008d:
            if (r8 == 0) goto L_0x00ca
            wi0.e0 r9 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()     // Catch:{ Exception -> 0x0108 }
            pe3.b r10 = r1.f138968d     // Catch:{ Exception -> 0x0108 }
            java.util.LinkedList<te3.n55> r1 = r1.f138969e     // Catch:{ Exception -> 0x0108 }
            r9.mo114003SE(r12, r10, r1, r3)     // Catch:{ Exception -> 0x0108 }
            wi0.e0 r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()     // Catch:{ Exception -> 0x0108 }
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0108 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r1 = r1.mo114000LL(r12, r9)     // Catch:{ Exception -> 0x0108 }
            if (r1 == 0) goto L_0x00a8
            r1 = 1
            goto L_0x00a9
        L_0x00a8:
            r1 = 0
        L_0x00a9:
            if (r1 == 0) goto L_0x00bb
            java.lang.Class<xi0.b> r9 = xi0.C38728b.class
            java.lang.Object r9 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r9)     // Catch:{ Exception -> 0x0108 }
            xi0.b r9 = (xi0.C38728b) r9     // Catch:{ Exception -> 0x0108 }
            xi0.b$a$b r10 = new xi0.b$a$b     // Catch:{ Exception -> 0x0108 }
            r10.<init>(r12)     // Catch:{ Exception -> 0x0108 }
            r9.mo61739Lo(r10)     // Catch:{ Exception -> 0x0108 }
        L_0x00bb:
            te3.e75 r14 = r14.f137895d     // Catch:{ Exception -> 0x0108 }
            int r14 = r14.f132768f     // Catch:{ Exception -> 0x0108 }
            if (r1 == 0) goto L_0x00c4
            r9 = 85
            goto L_0x00c6
        L_0x00c4:
            r9 = 86
        L_0x00c6:
            r7.mo122144a(r14, r9)     // Catch:{ Exception -> 0x0108 }
            goto L_0x00d4
        L_0x00ca:
            te3.e75 r14 = r14.f137895d     // Catch:{ Exception -> 0x0108 }
            int r14 = r14.f132768f     // Catch:{ Exception -> 0x0108 }
            r1 = 84
            r7.mo122144a(r14, r1)     // Catch:{ Exception -> 0x0108 }
            r1 = 0
        L_0x00d4:
            java.lang.String r14 = "call[%s | %s], record.ver %d, issue.ver %d, doIssue %b, issueRet %b"
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0108 }
            r7[r2] = r12     // Catch:{ Exception -> 0x0108 }
            r7[r3] = r13     // Catch:{ Exception -> 0x0108 }
            if (r0 != 0) goto L_0x00e1
            r0 = -1
            goto L_0x00e3
        L_0x00e1:
            int r0 = r0.f239452d     // Catch:{ Exception -> 0x0108 }
        L_0x00e3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0108 }
            r7[r4] = r0     // Catch:{ Exception -> 0x0108 }
            r0 = 3
            int r6 = r6.f239452d     // Catch:{ Exception -> 0x0108 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0108 }
            r7[r0] = r6     // Catch:{ Exception -> 0x0108 }
            r0 = 4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x0108 }
            r7[r0] = r6     // Catch:{ Exception -> 0x0108 }
            r0 = 5
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0108 }
            r7[r0] = r6     // Catch:{ Exception -> 0x0108 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r14, r7)     // Catch:{ Exception -> 0x0108 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0116
        L_0x0108:
            r14 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r2] = r12
            r0[r3] = r13
            java.lang.String r12 = "call[%s | %s], decode base64"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r14, r12, r0)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
        L_0x0116:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C87497j.mo58858b(java.lang.String, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        return ((m75) obj).f137895d;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdIssueContact";
    }
}
