package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.b0 */
public class C71703b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f207886d;

    public C71703b0(WalletBalanceSaveUI walletBalanceSaveUI, TextView textView) {
        this.f207886d = textView;
    }

    public void run() {
        TextView textView = this.f207886d;
        if (textView != null) {
            textView.sendAccessibilityEvent(8);
        }
    }
}
