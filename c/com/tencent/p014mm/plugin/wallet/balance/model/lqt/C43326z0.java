package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C50958qg3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.z0 */
public class C43326z0 implements C87581a<Void, C89132b.C89134c<C50958qg3>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f117164a;

    public C43326z0(C71615a1 a1Var, C46888b bVar) {
        this.f117164a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102 A[Catch:{ IOException -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0121 A[Catch:{ IOException -> 0x0138 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            ob0.b$c r0 = (ob0.C89132b.C89134c) r0
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            int r5 = r0.f256793a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r3[r6] = r5
            int r5 = r0.f256794b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 2
            r3[r7] = r5
            java.lang.String r5 = "MicroMsg.LqtSaveFetchInteractor"
            java.lang.String r8 = "on pre redeem fund finish, cgiBack: %s, errType: %s, errCode: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r3)
            int r3 = r0.f256793a
            r8 = 0
            if (r3 != 0) goto L_0x017a
            int r3 = r0.f256794b
            if (r3 != 0) goto L_0x017a
            T r3 = r0.f256796d
            te3.qg3 r3 = (te3.C50958qg3) r3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r9 = r3.f140309d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r4] = r9
            java.lang.String r9 = r3.f140310e
            r2[r6] = r9
            java.lang.String r9 = r3.f140311f
            r2[r7] = r9
            java.lang.String r9 = "on pre redeem fund finsih, retcode: %s, retmsg: %s, redeem_listid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r2)
            int r2 = r3.f140309d
            if (r2 != 0) goto L_0x006a
            java.lang.String r0 = r3.f140313h
            com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1.m84125c(r0)
            lp3.b r0 = r1.f117164a
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r4] = r3
            r0.mo72093c(r2)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 663(0x297, double:3.276E-321)
            r12 = 9
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            goto L_0x018e
        L_0x006a:
            te3.yr2 r2 = r3.f140312g
            if (r2 != 0) goto L_0x0075
            te3.v40 r9 = r3.f140314i
            if (r9 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r9 = 0
            goto L_0x0076
        L_0x0075:
            r9 = 1
        L_0x0076:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            if (r2 == 0) goto L_0x00b9
            com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent r2 = new com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent
            r2.<init>()
            com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent$a r7 = r2.f107805d
            T r0 = r0.f256796d
            te3.qg3 r0 = (te3.C50958qg3) r0
            te3.yr2 r0 = r0.f140312g
            r7.f107806a = r0
            te3.zr2 r7 = r0.f145481g
            r10 = 4
            if (r7 == 0) goto L_0x0093
            int r7 = r7.f146193e
            if (r7 != r10) goto L_0x0093
            goto L_0x00a4
        L_0x0093:
            te3.zr2 r7 = r0.f145482h
            if (r7 == 0) goto L_0x009c
            int r7 = r7.f146193e
            if (r7 != r10) goto L_0x009c
            goto L_0x00a4
        L_0x009c:
            te3.zr2 r0 = r0.f145480f
            if (r0 == 0) goto L_0x00a6
            int r0 = r0.f146193e
            if (r0 != r10) goto L_0x00a6
        L_0x00a4:
            r0 = 1
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r10
            java.lang.String r7 = "pre redeem fund has dialog, can continue: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r0)
            r2.publish()
            goto L_0x0151
        L_0x00b9:
            te3.v40 r2 = r3.f140314i
            if (r2 == 0) goto L_0x0151
            com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent r2 = new com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent
            r2.<init>()
            com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent$a r11 = r2.f107805d     // Catch:{ IOException -> 0x0138 }
            T r12 = r0.f256796d     // Catch:{ IOException -> 0x0138 }
            te3.qg3 r12 = (te3.C50958qg3) r12     // Catch:{ IOException -> 0x0138 }
            te3.v40 r12 = r12.f140314i     // Catch:{ IOException -> 0x0138 }
            byte[] r12 = r12.toByteArray()     // Catch:{ IOException -> 0x0138 }
            r11.f107807b = r12     // Catch:{ IOException -> 0x0138 }
            T r0 = r0.f256796d     // Catch:{ IOException -> 0x0138 }
            te3.qg3 r0 = (te3.C50958qg3) r0     // Catch:{ IOException -> 0x0138 }
            te3.v40 r0 = r0.f140314i     // Catch:{ IOException -> 0x0138 }
            java.lang.String r11 = "halfPage"
            gy3.C87412m.m108594g(r0, r11)     // Catch:{ IOException -> 0x0138 }
            te3.al r11 = r0.f143297n     // Catch:{ IOException -> 0x0138 }
            r12 = 36
            if (r11 == 0) goto L_0x00fd
            int r13 = r11.f130608j     // Catch:{ IOException -> 0x0138 }
            if (r13 != r7) goto L_0x00ed
            te3.ox r13 = r11.f130609n     // Catch:{ IOException -> 0x0138 }
            int r13 = r13.f139410d     // Catch:{ IOException -> 0x0138 }
            if (r13 != r12) goto L_0x00ed
            r13 = 1
            goto L_0x00ee
        L_0x00ed:
            r13 = 0
        L_0x00ee:
            if (r13 == 0) goto L_0x00f8
            te3.ox r11 = r11.f130609n     // Catch:{ IOException -> 0x0138 }
            int r11 = r11.f139415i     // Catch:{ IOException -> 0x0138 }
            if (r11 != r6) goto L_0x00f8
            r11 = 1
            goto L_0x00f9
        L_0x00f8:
            r11 = 0
        L_0x00f9:
            if (r11 != r6) goto L_0x00fd
            r11 = 1
            goto L_0x00fe
        L_0x00fd:
            r11 = 0
        L_0x00fe:
            te3.al r0 = r0.f143298o     // Catch:{ IOException -> 0x0138 }
            if (r0 == 0) goto L_0x011e
            int r13 = r0.f130608j     // Catch:{ IOException -> 0x0138 }
            if (r13 != r7) goto L_0x010e
            te3.ox r7 = r0.f130609n     // Catch:{ IOException -> 0x0138 }
            int r7 = r7.f139410d     // Catch:{ IOException -> 0x0138 }
            if (r7 != r12) goto L_0x010e
            r7 = 1
            goto L_0x010f
        L_0x010e:
            r7 = 0
        L_0x010f:
            if (r7 == 0) goto L_0x0119
            te3.ox r0 = r0.f130609n     // Catch:{ IOException -> 0x0138 }
            int r0 = r0.f139415i     // Catch:{ IOException -> 0x0138 }
            if (r0 != r6) goto L_0x0119
            r0 = 1
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            if (r0 != r6) goto L_0x011e
            r0 = 1
            goto L_0x011f
        L_0x011e:
            r0 = 0
        L_0x011f:
            if (r11 != 0) goto L_0x0126
            if (r0 == 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r0 = 0
            goto L_0x0127
        L_0x0126:
            r0 = 1
        L_0x0127:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0138 }
            java.lang.String r0 = "pre redeem fund has half page, can continue: %s"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0138 }
            r7[r4] = r10     // Catch:{ IOException -> 0x0138 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r7)     // Catch:{ IOException -> 0x0138 }
            r2.publish()     // Catch:{ IOException -> 0x0138 }
            goto L_0x0151
        L_0x0138:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "failed to get byte array: "
            r2.append(r7)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x0151:
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x0161
            lp3.b r0 = r1.f117164a
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r4] = r3
            r0.mo72093c(r2)
            goto L_0x016c
        L_0x0161:
            lp3.b r0 = r1.f117164a
            if (r9 == 0) goto L_0x0167
            r2 = r8
            goto L_0x0169
        L_0x0167:
            java.lang.String r2 = r3.f140310e
        L_0x0169:
            r0.mo72091a(r2)
        L_0x016c:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 663(0x297, double:3.276E-321)
            r12 = 10
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            goto L_0x018e
        L_0x017a:
            lp3.b r0 = r1.f117164a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo72091a(r2)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 663(0x297, double:3.276E-321)
            r12 = 11
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
        L_0x018e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43326z0.call(java.lang.Object):java.lang.Object");
    }
}
