package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import te3.C78014xp3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.c1 */
public class C71623c1 implements C87581a<Void, C78014xp3> {

    /* renamed from: a */
    public final /* synthetic */ String f207600a;

    /* renamed from: b */
    public final /* synthetic */ C71624d1 f207601b;

    public C71623c1(C71624d1 d1Var, String str) {
        this.f207601b = d1Var;
        this.f207600a = str;
    }

    public Object call(Object obj) {
        C78014xp3 xp32 = (C78014xp3) obj;
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "%s doRedeemFund finish: %s", Integer.valueOf(this.f207601b.hashCode()), xp32);
        this.f207601b.f207603b.hideLoading();
        this.f207601b.mo98811c(this.f207600a);
        C46888b bVar = this.f207601b.f207613l;
        if (bVar == null) {
            return null;
        }
        bVar.mo72093c(xp32);
        return null;
    }
}
