package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$l */
public class WalletLqtSaveFetchUI$$l implements C71654w.C71657c {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtSaveFetchUI f208259a;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$l$a */
    public class C71771a implements Runnable {
        public C71771a() {
        }

        public void run() {
            WalletLqtArriveTimeLayout walletLqtArriveTimeLayout = WalletLqtSaveFetchUI$$l.this.f208259a.f208159H;
            walletLqtArriveTimeLayout.setMinimumHeight(walletLqtArriveTimeLayout.getHeight());
        }
    }

    public WalletLqtSaveFetchUI$$l(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208259a = walletLqtSaveFetchUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo98826a(boolean r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cache updated show Error:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " errMsg:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WalletLqtSaveFetchUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r0 = r6.f208259a
            int r2 = r0.f208173T
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x0043
            if (r7 == 0) goto L_0x002d
            r0.mo98987Z7(r8)
            goto L_0x0041
        L_0x002d:
            com.tencent.mm.plugin.wallet.balance.model.lqt.w r7 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w.f207659q
            com.tencent.mm.plugin.wallet_core.model.Bankcard r7 = r7.mo98819b(r4)
            r0.f208177V = r7
            if (r7 != 0) goto L_0x0043
            java.lang.String r7 = "mDefaultBankcard is null!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            java.lang.String r7 = ""
            r0.mo98987Z7(r7)
        L_0x0041:
            r7 = 0
            goto L_0x0044
        L_0x0043:
            r7 = 1
        L_0x0044:
            if (r7 != 0) goto L_0x0047
            return
        L_0x0047:
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r7 = r6.f208259a
            boolean r8 = r7.f208184Y0
            if (r8 != 0) goto L_0x005c
            r7.f208184Y0 = r5
            te3.u53 r8 = r7.mo98978Q7()
            boolean r8 = r8.f228293r
            if (r8 == 0) goto L_0x005c
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r7 = r7.mWcKeyboard
            r7.mo104751o()
        L_0x005c:
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r7 = r6.f208259a
            r7.hideLoading()
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r7 = r6.f208259a
            r7.mo98991d8()
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r7 = r6.f208259a
            r7.getClass()
            com.tencent.mm.plugin.wallet.balance.model.lqt.w r8 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w.f207659q
            te3.nc0 r8 = r8.f207675n
            if (r8 == 0) goto L_0x00b8
            int r0 = r8.f184460e
            if (r0 != r5) goto L_0x0077
            r0 = 1
            goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            r7.f208168Q0 = r0
            int r0 = r8.f184461f
            if (r0 != r5) goto L_0x0089
            boolean r0 = r7.f208176U0
            if (r0 != 0) goto L_0x0089
            r0 = 0
            r1 = -1
            r7.mo98984W7(r0, r1)
            r7.f208176U0 = r5
        L_0x0089:
            te3.k33 r0 = r8.f184459d
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = r0.f183885d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00c1
            android.widget.TextView r0 = r7.f208166P
            r0.setVisibility(r4)
            android.widget.TextView r0 = r7.f208166P
            te3.k33 r1 = r8.f184459d
            java.lang.String r1 = r1.f183885d
            r0.setText(r1)
            te3.k33 r0 = r8.f184459d
            java.lang.String r0 = r0.f183887f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00c1
            android.widget.TextView r0 = r7.f208166P
            com.tencent.mm.plugin.wallet.balance.ui.lqt.q2 r1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.q2
            r1.<init>(r7, r8)
            r0.setOnClickListener(r1)
            goto L_0x00c1
        L_0x00b8:
            r7.f208168Q0 = r4
            android.widget.TextView r7 = r7.f208166P
            r8 = 8
            r7.setVisibility(r8)
        L_0x00c1:
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r7 = r6.f208259a
            int r8 = r7.f208187a1
            r0 = 14
            if (r8 != r0) goto L_0x00da
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r7 = r7.f208199i
            java.lang.String r7 = r7.getText()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x00da
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r8 = r6.f208259a
            r8.mo98990c8(r7, r5)
        L_0x00da:
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r7 = r6.f208259a
            int r8 = r7.f208173T
            if (r8 != r5) goto L_0x00eb
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout r7 = r7.f208159H
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$l$a r8 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$l$a
            r8.<init>()
            r7.post(r8)
            goto L_0x00fe
        L_0x00eb:
            if (r8 != r3) goto L_0x00fe
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r7 = r7.f208199i
            java.lang.String r7 = r7.getText()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x00fe
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r8 = r6.f208259a
            r8.mo98990c8(r7, r5)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI$$l.mo98826a(boolean, java.lang.String):void");
    }
}
