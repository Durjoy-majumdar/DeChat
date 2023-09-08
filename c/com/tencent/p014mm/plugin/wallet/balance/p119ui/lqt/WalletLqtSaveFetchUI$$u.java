package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71652v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import qo3.C101218e0;
import te3.C51892wy;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$u */
public class WalletLqtSaveFetchUI$$u implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ int f208290a;

    /* renamed from: b */
    public final /* synthetic */ C51892wy f208291b;

    /* renamed from: c */
    public final /* synthetic */ C71652v f208292c;

    /* renamed from: d */
    public final /* synthetic */ C71652v f208293d;

    /* renamed from: e */
    public final /* synthetic */ C101218e0 f208294e;

    /* renamed from: f */
    public final /* synthetic */ WalletLqtSaveFetchUI f208295f;

    public WalletLqtSaveFetchUI$$u(WalletLqtSaveFetchUI walletLqtSaveFetchUI, int i, C51892wy wyVar, C71652v vVar, C71652v vVar2, C101218e0 e0Var) {
        this.f208295f = walletLqtSaveFetchUI;
        this.f208290a = i;
        this.f208291b = wyVar;
        this.f208292c = vVar;
        this.f208293d = vVar2;
        this.f208294e = e0Var;
    }

    public void onClick(View view) {
        Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "showCommonPromptText, scene: %s, promptInfo.jump_type: %s", Integer.valueOf(this.f208290a), Integer.valueOf(this.f208291b.f144347f));
        int i = this.f208290a;
        if (i >= 0) {
            C115669n.INSTANCE.mo160131h(20287, Integer.valueOf(i));
        }
        C51892wy wyVar = this.f208291b;
        int i2 = wyVar.f144347f;
        if (i2 == 1) {
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208295f;
            C71652v vVar = this.f208292c;
            C71652v vVar2 = this.f208293d;
            int i3 = WalletLqtSaveFetchUI.f208151m1;
            C101218e0 Y7 = walletLqtSaveFetchUI.mo98986Y7(vVar, vVar2, (C71652v) null);
            this.f208295f.mo98974M7(Y7, this.f208293d);
            C101218e0 e0Var = this.f208294e;
            if (e0Var != null) {
                e0Var.mo140680z();
            }
            if (Y7 != null && !Y7.mo140661h()) {
                Y7.mo140655A();
            }
        } else if (i2 == 2) {
            C75228t.m90219L(this.f208295f.getContext(), this.f208291b.f144348g, true);
        } else if (i2 == 3) {
            C75228t.m90224Q(wyVar.f144349h, wyVar.f144348g, 0, 1000);
        }
    }
}
