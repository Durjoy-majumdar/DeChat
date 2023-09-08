package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import te3.C77964lj3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.h1 */
public class C71632h1 implements C87581a<C77964lj3, C77964lj3> {

    /* renamed from: a */
    public final /* synthetic */ C71624d1 f207625a;

    public C71632h1(C71624d1 d1Var) {
        this.f207625a = d1Var;
    }

    public Object call(Object obj) {
        C77964lj3 lj32 = (C77964lj3) obj;
        C71624d1 d1Var = this.f207625a;
        d1Var.f207604c = lj32.f227817g;
        d1Var.f207603b.hideLoading();
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "get tradeNo: %s", this.f207625a.f207604c);
        return lj32;
    }
}
