package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$b */
public class WalletBalanceSaveUI$$b implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ View.OnClickListener f207854d;

    public WalletBalanceSaveUI$$b(WalletBalanceSaveUI walletBalanceSaveUI, View.OnClickListener onClickListener) {
        this.f207854d = onClickListener;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            this.f207854d.onClick((View) null);
        }
        return true;
    }
}
