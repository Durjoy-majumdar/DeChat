package hi0;

import android.text.TextUtils;
import hp3.C87581a;
import op3.C117878c;
import te3.e75;

/* renamed from: hi0.a */
public abstract class C87491a<_Ret, _CmdStruct> implements C87581a<_Ret, C117878c<String, String, _CmdStruct>> {
    /* renamed from: b */
    public abstract _Ret mo58858b(String str, String str2, _CmdStruct _cmdstruct);

    /* renamed from: c */
    public final String mo121955c(String str, String str2) {
        String str3 = "PredownloadCmdSequence$" + mo58860e() + '$' + str;
        if (TextUtils.isEmpty(str2)) {
            return str3;
        }
        return str3 + '$' + str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            op3.c r1 = (op3.C117878c) r1
            r2 = 1
            java.lang.Object r3 = r1.mo182596a(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r5 = "MicroMsg.AppBrand.Predownload.AbstractCmd"
            r6 = 0
            r7 = 2
            if (r4 == 0) goto L_0x0027
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r17.mo58860e()
            r3[r6] = r4
            java.lang.String r4 = "precondition(%s) invalid appId"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r3)
            goto L_0x00e8
        L_0x0027:
            java.lang.Object r4 = r1.mo182596a(r7)
            te3.e75 r4 = r0.mo58859d(r4)
            if (r4 != 0) goto L_0x0041
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r17.mo58860e()
            r3[r6] = r4
            java.lang.String r4 = "precondition(%s) null CmdBase"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r3)
            goto L_0x00e8
        L_0x0041:
            ii0.a r8 = ii0.C87732a.INSTANCE
            int r9 = r4.f132768f
            ii0.a$e r10 = ii0.C87732a.f254023e
            java.lang.Class r11 = r17.getClass()
            r12 = -1
            int r10 = r10.mo122146a(r11, r12)
            r8.mo122144a(r9, r10)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r11 = r4.f132766d
            long r13 = js0.C88022n.m109570a(r11)
            r11 = 3
            java.lang.Object[] r15 = new java.lang.Object[r11]
            java.lang.String r16 = r17.mo58860e()
            r15[r6] = r16
            java.lang.Long r16 = java.lang.Long.valueOf(r13)
            r15[r2] = r16
            java.lang.Long r16 = java.lang.Long.valueOf(r9)
            r15[r7] = r16
            java.lang.String r7 = "precondition(%s) DealEndTime %d , now %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r15)
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x008c
            int r3 = r4.f132768f
            ii0.a$e r4 = ii0.C87732a.f254024f
            java.lang.Class r5 = r17.getClass()
            int r4 = r4.mo122146a(r5, r12)
            r8.mo122144a(r3, r4)
            goto L_0x00e8
        L_0x008c:
            java.lang.String r7 = r4.f132770h
            wi0.d r9 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.m99451h1()
            java.lang.String r7 = r0.mo121955c(r3, r7)
            java.lang.String r10 = "0"
            java.lang.String r7 = r9.mo61553Lo(r7, r10)
            r9 = 0
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r9)
            int r7 = r4.f132767e
            long r13 = js0.C88022n.m109570a(r7)
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.String r11 = r17.mo58860e()
            r7[r6] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r9)
            r7[r2] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r15 = 2
            r7[r15] = r11
            java.lang.String r11 = "precondition(%s), lastSeq %d, cmdSeq %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r7)
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d7
            int r3 = r4.f132768f
            ii0.a$e r4 = ii0.C87732a.f254025g
            java.lang.Class r5 = r17.getClass()
            int r4 = r4.mo122146a(r5, r12)
            r8.mo122144a(r3, r4)
            goto L_0x00e8
        L_0x00d7:
            if (r5 != 0) goto L_0x00ea
            int r3 = r4.f132768f
            ii0.a$e r4 = ii0.C87732a.f254026h
            java.lang.Class r5 = r17.getClass()
            int r4 = r4.mo122146a(r5, r12)
            r8.mo122144a(r3, r4)
        L_0x00e8:
            r3 = 0
            goto L_0x00fc
        L_0x00ea:
            java.lang.String r4 = r4.f132770h
            java.lang.String r5 = java.lang.Long.toString(r13)
            wi0.d r7 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.m99451h1()
            java.lang.String r3 = r0.mo121955c(r3, r4)
            r7.mo61552B9(r3, r5)
            r3 = 1
        L_0x00fc:
            if (r3 != 0) goto L_0x0107
            lp3.b r1 = lp3.C88643g.m110544b()
            r2 = 0
            r1.mo72091a(r2)
            goto L_0x011c
        L_0x0107:
            java.lang.Object r3 = r1.mo182596a(r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r1.mo182596a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 2
            java.lang.Object r1 = r1.mo182596a(r4)
            java.lang.Object r2 = r0.mo58858b(r3, r2, r1)
        L_0x011c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C87491a.call(java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public abstract e75 mo58859d(_CmdStruct _cmdstruct);

    /* renamed from: e */
    public abstract String mo58860e();
}
