package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69232i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import nj3.C76879j;
import ob0.C89132b;
import te3.C77923eq1;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.z */
public class C69729z implements C87581a<Object, C89132b.C89134c<C77923eq1>> {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyDetailUI f201154a;

    public C69729z(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f201154a = luckyMoneyDetailUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            return null;
        }
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "do query detail: errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C77923eq1 eq12 = (C77923eq1) cVar.f256796d;
            Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "do query detail: retcode: %s, retmsg: %s", Integer.valueOf(eq12.f227282d), eq12.f227283e);
            if (eq12.f227282d == 0) {
                C69158a0 e = C69232i1.m81581e(eq12);
                LuckyMoneyDetailUI luckyMoneyDetailUI = this.f201154a;
                luckyMoneyDetailUI.f199859c2 = e;
                luckyMoneyDetailUI.mo95564X7(e);
                return null;
            }
            C76879j.m92726T(this.f201154a.getContext(), eq12.f227283e);
            this.f201154a.finish();
            return null;
        }
        C76879j.m92726T(this.f201154a.getContext(), cVar.f256795c);
        this.f201154a.finish();
        return null;
    }
}
