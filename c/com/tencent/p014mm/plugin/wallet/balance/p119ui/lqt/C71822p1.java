package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import hp3.C87581a;
import te3.C50734ou2;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.p1 */
public class C71822p1 implements C87581a<Object, C50734ou2> {

    /* renamed from: a */
    public final /* synthetic */ Dialog f208363a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtPlanHomeUI f208364b;

    public C71822p1(WalletLqtPlanHomeUI walletLqtPlanHomeUI, Dialog dialog) {
        this.f208364b = walletLqtPlanHomeUI;
        this.f208363a = dialog;
    }

    public Object call(Object obj) {
        C50734ou2 ou22 = (C50734ou2) obj;
        WalletLqtPlanHomeUI walletLqtPlanHomeUI = this.f208364b;
        int i = WalletLqtPlanHomeUI.f208085s;
        walletLqtPlanHomeUI.mo98953I7(false);
        new MMHandler().postDelayed(new C71815o1(this), 800);
        return null;
    }
}
