package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.m0 */
public class C72401m0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOrderInfoNewUI f210633g;

    public C72401m0(WalletOrderInfoNewUI walletOrderInfoNewUI) {
        this.f210633g = walletOrderInfoNewUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        if (!Util.isNullOrNil(this.f210633g.f210149u)) {
            WalletOrderInfoNewUI walletOrderInfoNewUI = this.f210633g;
            if (((HashSet) walletOrderInfoNewUI.f210127i).contains(walletOrderInfoNewUI.f210149u)) {
                WalletOrderInfoNewUI walletOrderInfoNewUI2 = this.f210633g;
                ((HashSet) walletOrderInfoNewUI2.f210127i).remove(walletOrderInfoNewUI2.f210149u);
                this.f210633g.f210112X0.setChecked(false);
                return;
            }
            WalletOrderInfoNewUI walletOrderInfoNewUI3 = this.f210633g;
            ((HashSet) walletOrderInfoNewUI3.f210127i).add(walletOrderInfoNewUI3.f210149u);
            this.f210633g.f210112X0.setChecked(true);
        }
    }
}
