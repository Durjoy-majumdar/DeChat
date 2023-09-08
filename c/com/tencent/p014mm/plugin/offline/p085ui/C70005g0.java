package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.plugin.offline.C30326g;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import id2.C76313t;

/* renamed from: com.tencent.mm.plugin.offline.ui.g0 */
public class C70005g0 implements C72379f1.C72386d {

    /* renamed from: a */
    public final /* synthetic */ C76313t.C76321i f202022a;

    /* renamed from: b */
    public final /* synthetic */ C70034w f202023b;

    public C70005g0(C70034w wVar, C76313t.C76321i iVar) {
        this.f202023b = wVar;
        this.f202022a = iVar;
    }

    /* renamed from: a */
    public void mo96341a() {
        C69990b bVar = this.f202023b.f202061b;
        if (bVar != null) {
            C76313t.C76321i iVar = this.f202022a;
            ((WalletOfflineCoinPurseUI) bVar).mo96290K7(0, iVar.f223577f, "", iVar.f223579h);
        }
        C30326g.m39026a(this.f202022a.f223579h, 20000);
        Log.m105924i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do cancel pay");
    }
}
