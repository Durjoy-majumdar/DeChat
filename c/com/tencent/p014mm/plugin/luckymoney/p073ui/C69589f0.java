package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.f0 */
public class C69589f0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C69158a0 f200902g;

    /* renamed from: h */
    public final /* synthetic */ LuckyMoneyDetailUI f200903h;

    public C69589f0(LuckyMoneyDetailUI luckyMoneyDetailUI, C69158a0 a0Var) {
        this.f200903h = luckyMoneyDetailUI;
        this.f200902g = a0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2066a(android.view.View r15) {
        /*
            r14 = this;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r15 = r14.f200903h
            com.tencent.mm.plugin.luckymoney.model.a0 r0 = r14.f200902g
            int r1 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.f199792r2
            r15.getClass()
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r0.f198955R
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2[r4] = r3
            java.lang.String r3 = r0.f198952N
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2[r6] = r3
            java.lang.String r3 = "MicroMsg.LuckyMoneyDetailUI"
            java.lang.String r8 = "onClick tips, jumpChangeType: %s, url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r2)
            java.lang.String r2 = r0.f198952N
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            java.lang.String r8 = ""
            r9 = 13184(0x3380, float:1.8475E-41)
            if (r2 != 0) goto L_0x014f
            int r2 = r0.f198955R
            if (r2 == r6) goto L_0x00a7
            if (r2 == r1) goto L_0x008f
            r10 = 3
            if (r2 == r10) goto L_0x0040
            goto L_0x014f
        L_0x0040:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x007f }
            java.lang.String r10 = r0.f198952N     // Catch:{ Exception -> 0x007f }
            r2.<init>(r10)     // Catch:{ Exception -> 0x007f }
            java.lang.String r10 = "username"
            java.lang.String r10 = r2.optString(r10)     // Catch:{ Exception -> 0x007f }
            java.lang.String r11 = "path"
            java.lang.String r2 = r2.optString(r11)     // Catch:{ Exception -> 0x007f }
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent r11 = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent     // Catch:{ Exception -> 0x007f }
            r11.<init>()     // Catch:{ Exception -> 0x007f }
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r12 = r11.f9522d     // Catch:{ Exception -> 0x007f }
            r12.f9526a = r10     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r8)     // Catch:{ Exception -> 0x007f }
            r12.f9527b = r2     // Catch:{ Exception -> 0x007f }
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r2 = r11.f9522d     // Catch:{ Exception -> 0x007f }
            r10 = 1100(0x44c, float:1.541E-42)
            r2.f9529d = r10     // Catch:{ Exception -> 0x007f }
            r2.f9528c = r4     // Catch:{ Exception -> 0x007f }
            r2.f9531f = r15     // Catch:{ Exception -> 0x007f }
            r11.publish()     // Catch:{ Exception -> 0x007f }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x007f }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x007f }
            r10[r4] = r7     // Catch:{ Exception -> 0x007f }
            java.lang.String r11 = r0.f198952N     // Catch:{ Exception -> 0x007f }
            r10[r6] = r11     // Catch:{ Exception -> 0x007f }
            r2.mo160131h(r9, r10)     // Catch:{ Exception -> 0x007f }
            goto L_0x014d
        L_0x007f:
            r2 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r11 = r2.getMessage()
            r10[r4] = r11
            java.lang.String r11 = "handle jump weapp error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r11, r10)
            goto L_0x014f
        L_0x008f:
            androidx.appcompat.app.AppCompatActivity r2 = r15.getContext()
            java.lang.String r10 = r0.f198952N
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90219L(r2, r10, r6)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r4] = r7
            java.lang.String r11 = r0.f198952N
            r10[r6] = r11
            r2.mo160131h(r9, r10)
            goto L_0x014d
        L_0x00a7:
            java.lang.String r2 = r0.f198952N
            java.lang.String r10 = "weixin://wcpay/lqtdetail"
            boolean r2 = r2.startsWith(r10)
            if (r2 != 0) goto L_0x0118
            java.lang.String r2 = r0.f198952N
            java.lang.String r10 = "weixin://wcpay/lqt/detail"
            boolean r2 = r2.startsWith(r10)
            if (r2 == 0) goto L_0x00be
            goto L_0x0118
        L_0x00be:
            java.lang.String r2 = r0.f198952N
            java.lang.String r10 = "weixin://wcpay/lqt/save"
            boolean r2 = r2.startsWith(r10)
            if (r2 == 0) goto L_0x014f
            java.lang.String r2 = r0.f198952N
            com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1.m84124b(r2)
            java.lang.String r2 = r0.f198952N
            java.lang.String r2 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1.m84123a(r2)
            ep3.c r10 = new ep3.c
            r10.<init>()
            java.lang.Class<com.tencent.mm.plugin.wallet.balance.model.lqt.f0> r11 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0.class
            hp3.b r10 = r10.mo136940b(r15, r11)
            com.tencent.mm.plugin.wallet.balance.model.lqt.f0 r10 = (com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0) r10
            if (r10 == 0) goto L_0x0105
            com.tencent.mm.plugin.wallet.balance.model.lqt.f0$b r11 = r10.f117126b
            if (r11 != 0) goto L_0x00e8
            goto L_0x0105
        L_0x00e8:
            r11 = 0
            android.app.Dialog r11 = com.tencent.p014mm.wallet_core.p137ui.C75197d0.m90163d(r15, r4, r4, r11)
            com.tencent.mm.plugin.wallet.balance.model.lqt.f0$b r12 = r10.f117126b
            lp3.c r12 = r12.mo67528b()
            com.tencent.mm.plugin.luckymoney.ui.i0 r13 = new com.tencent.mm.plugin.luckymoney.ui.i0
            r13.<init>(r15, r10, r11, r2)
            lp3.c r2 = r12.mo123062e(r13)
            com.tencent.mm.plugin.luckymoney.ui.g0 r10 = new com.tencent.mm.plugin.luckymoney.ui.g0
            r10.<init>(r15, r11)
            r2.mo123065b(r10)
            goto L_0x010a
        L_0x0105:
            java.lang.String r2 = "fetchLqtDetail() interactorGlueApi == null || interactorGlueApi.fetchLqtDetail == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
        L_0x010a:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r4] = r7
            java.lang.String r11 = r0.f198952N
            r10[r6] = r11
            r2.mo160131h(r9, r10)
            goto L_0x014d
        L_0x0118:
            java.lang.String r2 = r0.f198952N
            com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1.m84124b(r2)
            java.lang.Class<ie3.c> r2 = ie3.C76324c.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ie3.c r2 = (ie3.C76324c) r2
            androidx.appcompat.app.AppCompatActivity r10 = r15.getContext()
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            boolean r2 = r2.startLqtDetailUseCase(r10, r11)
            if (r2 != 0) goto L_0x0140
            androidx.appcompat.app.AppCompatActivity r2 = r15.getContext()
            java.lang.String r10 = "wallet"
            java.lang.String r11 = ".balance.ui.lqt.WalletLqtDetailUI"
            ke3.C88144b.m109789g(r2, r10, r11)
        L_0x0140:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r4] = r7
            java.lang.String r11 = r0.f198952N
            r10[r6] = r11
            r2.mo160131h(r9, r10)
        L_0x014d:
            r2 = 1
            goto L_0x0150
        L_0x014f:
            r2 = 0
        L_0x0150:
            if (r2 != 0) goto L_0x01ca
            java.lang.String r2 = r0.f198952N
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r10 = 12
            if (r2 != 0) goto L_0x01b0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "detail.changeUrl:"
            r2.append(r8)
            java.lang.String r8 = r0.f198952N
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.lang.String r2 = r0.f198952N
            java.lang.String r3 = "weixin://wxpay"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0195
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90243e0(r10, r6)
            androidx.appcompat.app.AppCompatActivity r15 = r15.getContext()
            ie3.C76331i.m91758b(r15, r6)
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r5
            java.lang.String r0 = r0.f198952N
            r1[r6] = r0
            r15.mo160131h(r9, r1)
            goto L_0x01ca
        L_0x0195:
            r2 = 7
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90243e0(r2, r6)
            androidx.appcompat.app.AppCompatActivity r15 = r15.getContext()
            java.lang.String r2 = r0.f198952N
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90219L(r15, r2, r6)
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r7
            java.lang.String r0 = r0.f198952N
            r1[r6] = r0
            r15.mo160131h(r9, r1)
            goto L_0x01ca
        L_0x01b0:
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90243e0(r10, r6)
            androidx.appcompat.app.AppCompatActivity r15 = r15.getContext()
            ie3.C76331i.m91758b(r15, r6)
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r4] = r5
            r0[r6] = r8
            r15.mo160131h(r9, r0)
            java.lang.String r15 = "detail.changeUrl is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r15)
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.C69589f0.mo2066a(android.view.View):void");
    }
}
