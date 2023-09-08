package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.f1 */
public class C43297f1 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C71624d1 f117138a;

    public C43297f1(C71624d1 d1Var) {
        this.f117138a = d1Var;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "onInterrupt %s", obj);
        this.f117138a.f207603b.hideLoading();
        C88643g.m110544b().mo72091a(obj);
    }
}
