package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdNewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.i */
public class C43344i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtBalanceAutoTransferUI f117212d;

    public C43344i(WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI) {
        this.f117212d = walletLqtBalanceAutoTransferUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f117212d;
        int i2 = WalletLqtBalanceAutoTransferUI.f117170t;
        walletLqtBalanceAutoTransferUI.getClass();
        Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "go to pwd");
        Intent intent = new Intent(walletLqtBalanceAutoTransferUI, WalletCheckPwdNewUI.class);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        walletLqtBalanceAutoTransferUI.startActivityForResult(intent, 32);
    }
}
