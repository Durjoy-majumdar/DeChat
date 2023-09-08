package com.tencent.p014mm.plugin.offline.p085ui;

import android.app.Activity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import id2.C76313t;

/* renamed from: com.tencent.mm.plugin.offline.ui.e0 */
public class C70000e0 implements C72379f1.C72388f {

    /* renamed from: a */
    public final /* synthetic */ C76313t.C76321i f202015a;

    /* renamed from: b */
    public final /* synthetic */ C70034w f202016b;

    public C70000e0(C70034w wVar, C76313t.C76321i iVar) {
        this.f202016b = wVar;
        this.f202015a = iVar;
    }

    /* renamed from: a */
    public void mo96337a(String str, FavorPayInfo favorPayInfo, boolean z) {
        Activity activity = this.f202016b.f202060a;
        if (activity instanceof MMActivity) {
            ((MMActivity) activity).hideVKB();
        }
        C69990b bVar = this.f202016b.f202061b;
        if (bVar != null) {
            C76313t.C76321i iVar = this.f202015a;
            ((WalletOfflineCoinPurseUI) bVar).mo96290K7(1, iVar.f223577f, str, iVar.f223579h);
        }
        Log.m105924i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do pay");
    }
}
