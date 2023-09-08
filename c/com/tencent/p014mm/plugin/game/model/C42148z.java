package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;

/* renamed from: com.tencent.mm.plugin.game.model.z */
public class C42148z implements C40324j.C40326a {
    public C42148z(C42036a0 a0Var) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r5 < 864000) goto L_0x0051;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo288a(int r5, int r6, java.lang.String r7, ob0.C47350c r8) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "MicroMsg.GameMessageService"
            if (r5 != 0) goto L_0x0030
            if (r6 != 0) goto L_0x0030
            ob0.c$d r3 = r8.f127056b
            pe3.a r3 = r3.f127083a
            if (r3 != 0) goto L_0x000f
            goto L_0x0030
        L_0x000f:
            py1.l4 r3 = (py1.C47622l4) r3
            java.lang.Object[] r5 = new java.lang.Object[r0]
            long r6 = r3.f127859d
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5[r1] = r6
            java.lang.String r6 = "ReportInactiveUser success time: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
            long r5 = r3.f127859d
            r7 = 10
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            r7 = 864000(0xd2f00, double:4.268727E-318)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            goto L_0x0051
        L_0x0030:
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r1] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r3[r0] = r5
            r5 = 2
            r3[r5] = r7
            r5 = 3
            ob0.c$d r6 = r8.f127056b
            pe3.a r6 = r6.f127083a
            r3[r5] = r6
            java.lang.String r5 = "ReportInactiveUser cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r3)
        L_0x004e:
            r5 = 86400(0x15180, double:4.26873E-319)
        L_0x0051:
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_REDDOT_EMPTY_REPORT_MIN_DURATION_SEC_LONG
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r7.mo119677K(r8, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.C42148z.mo288a(int, int, java.lang.String, ob0.c):void");
    }
}
