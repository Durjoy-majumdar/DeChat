package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import id2.C76313t;

/* renamed from: com.tencent.mm.plugin.offline.ui.c0 */
public class C69993c0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76313t.C76321i f202004d;

    /* renamed from: e */
    public final /* synthetic */ C70034w f202005e;

    public C69993c0(C70034w wVar, C76313t.C76321i iVar) {
        this.f202005e = wVar;
        this.f202004d = iVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C69990b bVar = this.f202005e.f202061b;
        if (bVar != null) {
            C76313t.C76321i iVar = this.f202004d;
            ((WalletOfflineCoinPurseUI) bVar).mo96290K7(1, iVar.f223577f, "", iVar.f223579h);
        }
        Log.m105924i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do pay");
    }
}
