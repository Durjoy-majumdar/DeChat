package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.h0 */
public class C5804h0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ String f21946g;

    /* renamed from: h */
    public final /* synthetic */ String f21947h;

    /* renamed from: i */
    public final /* synthetic */ int f21948i;

    /* renamed from: j */
    public final /* synthetic */ WalletOrderInfoNewUI f21949j;

    public C5804h0(WalletOrderInfoNewUI walletOrderInfoNewUI, String str, String str2, int i) {
        this.f21949j = walletOrderInfoNewUI;
        this.f21946g = str;
        this.f21947h = str2;
        this.f21948i = i;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C115669n.INSTANCE.mo160131h(22110, 1, this.f21949j.f210138p);
        C75228t.m90224Q(this.f21946g, this.f21947h, this.f21948i, 8);
    }
}
