package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$y */
public class WalletLqtSaveFetchUI$$y implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ String f208299a;

    /* renamed from: b */
    public final /* synthetic */ String f208300b;

    /* renamed from: c */
    public final /* synthetic */ String f208301c;

    /* renamed from: d */
    public final /* synthetic */ C7092q.C7093a f208302d;

    public WalletLqtSaveFetchUI$$y(WalletLqtSaveFetchUI walletLqtSaveFetchUI, String str, String str2, String str3, C7092q.C7093a aVar) {
        this.f208299a = str;
        this.f208300b = str2;
        this.f208301c = str3;
        this.f208302d = aVar;
    }

    public void onClick(View view) {
        Log.m105919d("MicroMsg.WalletLqtSaveFetchUI", "click link text: %s %s url:%s", this.f208299a, this.f208300b, this.f208301c);
        C7092q.C7093a aVar = this.f208302d;
        if (aVar != null) {
            aVar.onClick(view);
        }
    }
}
