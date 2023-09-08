package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.widget.Button;
import android.widget.CompoundButton;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.k */
public class C71960k implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C77398g f208729a;

    public C71960k(WalletPayUI walletPayUI, C77398g gVar) {
        this.f208729a = gVar;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Button f = this.f208729a.mo107526f(-2);
        if (z) {
            f.setEnabled(false);
        } else {
            f.setEnabled(true);
        }
    }
}
