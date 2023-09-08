package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.u0 */
public class C71836u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f208388d;

    public C71836u0(WalletLqtPlanAddUI walletLqtPlanAddUI, TextView textView) {
        this.f208388d = textView;
    }

    public void run() {
        TextView textView = this.f208388d;
        if (textView != null) {
            textView.sendAccessibilityEvent(8);
        }
    }
}
