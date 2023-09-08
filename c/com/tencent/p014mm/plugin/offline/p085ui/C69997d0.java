package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.offline.C30326g;
import com.tencent.p014mm.sdk.platformtools.Log;
import id2.C76313t;

/* renamed from: com.tencent.mm.plugin.offline.ui.d0 */
public class C69997d0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76313t.C76321i f202010d;

    /* renamed from: e */
    public final /* synthetic */ C70034w f202011e;

    public C69997d0(C70034w wVar, C76313t.C76321i iVar) {
        this.f202011e = wVar;
        this.f202010d = iVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C69990b bVar = this.f202011e.f202061b;
        if (bVar != null) {
            C76313t.C76321i iVar = this.f202010d;
            ((WalletOfflineCoinPurseUI) bVar).mo96290K7(0, iVar.f223577f, "", iVar.f223579h);
        }
        C30326g.m39026a(this.f202010d.f223579h, 20000);
        Log.m105924i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do cancel pay");
    }
}
