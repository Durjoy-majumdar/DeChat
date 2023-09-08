package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.n0 */
public class C72405n0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ Orders.ShowInfo f210638g;

    /* renamed from: h */
    public final /* synthetic */ WalletOrderInfoNewUI f210639h;

    public C72405n0(WalletOrderInfoNewUI walletOrderInfoNewUI, Orders.ShowInfo showInfo) {
        this.f210639h = walletOrderInfoNewUI;
        this.f210638g = showInfo;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "onClick showInfo, jump url: %s", this.f210638g.f209705n);
        this.f210639h.mo99595T7(this.f210638g.f209705n);
    }
}
