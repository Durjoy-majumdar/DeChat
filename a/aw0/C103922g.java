package aw0;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: aw0.g */
public final class C103922g {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r13 != 23) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m138622a(android.content.Context r12, int r13, boolean r14, aw0.C79636p r15) {
        /*
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            aw.d r1 = (p447aw.C103918d) r1
            boolean r1 = r1.mo125776TW(r12, r13)
            java.lang.String r2 = "checkPermission already had"
            java.lang.String r3 = "MicroMsg.FloatBallPermissionUtil"
            r4 = 1
            if (r1 == 0) goto L_0x001a
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            m138624c(r15, r4)
            return
        L_0x001a:
            r1 = 0
            r5 = 6
            r6 = 23
            if (r13 == r5) goto L_0x002b
            r5 = 16
            if (r13 == r5) goto L_0x0027
            if (r13 == r6) goto L_0x002b
            goto L_0x002e
        L_0x0027:
            java.lang.String r1 = "req_perm_cnt_game_download"
            goto L_0x002e
        L_0x002b:
            java.lang.String r1 = "req_perm_cnt"
        L_0x002e:
            if (r1 == 0) goto L_0x006c
            com.tencent.mm.plugin.ball.service.r r5 = com.tencent.p014mm.plugin.ball.service.C105050r.m140969d()
            java.lang.String r5 = r5.mo149194c()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r5)
            r7 = 0
            int r5 = r5.decodeInt(r1, r7)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r8[r7] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8[r4] = r9
            java.lang.String r9 = "checkPermission from type:%d reqCnt: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r8)
            r8 = 3
            if (r5 < r8) goto L_0x005c
            m138624c(r15, r7)
            return
        L_0x005c:
            com.tencent.mm.plugin.ball.service.r r7 = com.tencent.p014mm.plugin.ball.service.C105050r.m140969d()
            int r5 = r5 + r4
            java.lang.String r7 = r7.mo149194c()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)
            r7.encode((java.lang.String) r1, (int) r5)
        L_0x006c:
            r1 = 2131830204(0x7f1125bc, float:1.9293399E38)
            if (r13 == r6) goto L_0x00c8
            r5 = 33
            if (r13 == r5) goto L_0x00c0
            switch(r13) {
                case 1: goto L_0x00a3;
                case 2: goto L_0x009b;
                case 3: goto L_0x0093;
                case 4: goto L_0x008b;
                case 5: goto L_0x009b;
                case 6: goto L_0x00c8;
                case 7: goto L_0x0083;
                default: goto L_0x0078;
            }
        L_0x0078:
            switch(r13) {
                case 16: goto L_0x00b8;
                case 17: goto L_0x00b0;
                case 18: goto L_0x00ab;
                default: goto L_0x007b;
            }
        L_0x007b:
            r1 = 2131830197(0x7f1125b5, float:1.9293385E38)
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x0083:
            r1 = 2131830203(0x7f1125bb, float:1.9293397E38)
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x008b:
            r1 = 2131830202(0x7f1125ba, float:1.9293395E38)
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x0093:
            r1 = 2131830205(0x7f1125bd, float:1.92934E38)
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x009b:
            r1 = 2131830207(0x7f1125bf, float:1.9293405E38)
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x00a3:
            r1 = 2131830198(0x7f1125b6, float:1.9293387E38)
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x00ab:
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x00b0:
            r1 = 2131830199(0x7f1125b7, float:1.9293389E38)
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x00b8:
            r1 = 2131830201(0x7f1125b9, float:1.9293393E38)
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x00c0:
            r1 = 2131830200(0x7f1125b8, float:1.929339E38)
            java.lang.String r1 = r12.getString(r1)
            goto L_0x00cc
        L_0x00c8:
            java.lang.String r1 = r12.getString(r1)
        L_0x00cc:
            r7 = r1
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            boolean r0 = r0.mo125776TW(r12, r13)
            if (r0 == 0) goto L_0x00e0
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            m138624c(r15, r4)
            goto L_0x00f0
        L_0x00e0:
            aw0.f r8 = new aw0.f
            r8.<init>(r15)
            r10 = 0
            java.lang.String r11 = vc3.C78382a.m94650b()
            r5 = r12
            r6 = r13
            r9 = r14
            com.tencent.p014mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.m105696H7(r5, r6, r7, r8, r9, r10, r11)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aw0.C103922g.m138622a(android.content.Context, int, boolean, aw0.p):void");
    }

    /* renamed from: b */
    public static boolean m138623b() {
        return ((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext());
    }

    /* renamed from: c */
    public static void m138624c(C79636p pVar, boolean z) {
        if (pVar != null) {
            pVar.mo109774a(z);
        }
    }
}
