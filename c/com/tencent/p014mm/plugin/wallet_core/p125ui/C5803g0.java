package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.g0 */
public class C5803g0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ String f21944g;

    /* renamed from: h */
    public final /* synthetic */ WalletOrderInfoNewUI f21945h;

    public C5803g0(WalletOrderInfoNewUI walletOrderInfoNewUI, String str) {
        this.f21945h = walletOrderInfoNewUI;
        this.f21944g = str;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C115669n.INSTANCE.mo160131h(22110, 1, this.f21945h.f210138p);
        C75228t.m90221N(this.f21945h, this.f21944g, true);
    }
}
