package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.offline.ui.u */
public class C70030u implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70034w f202056d;

    public C70030u(C70034w wVar) {
        this.f202056d = wVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((WalletOfflineCoinPurseUI) this.f202056d.f202061b).mo96300V7(false);
        Log.m105924i("MicroMsg.OfflineLogicMgr", "do changeBankcard");
    }
}
