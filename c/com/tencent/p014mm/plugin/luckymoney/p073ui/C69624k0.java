package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.k0 */
public class C69624k0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C69158a0 f200985g;

    /* renamed from: h */
    public final /* synthetic */ LuckyMoneyDetailUI f200986h;

    public C69624k0(LuckyMoneyDetailUI luckyMoneyDetailUI, C69158a0 a0Var) {
        this.f200986h = luckyMoneyDetailUI;
        this.f200985g = a0Var;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[5];
        LuckyMoneyDetailUI luckyMoneyDetailUI = this.f200986h;
        int i = this.f200985g.f198948J;
        int i2 = LuckyMoneyDetailUI.f199792r2;
        luckyMoneyDetailUI.getClass();
        objArr[0] = Integer.valueOf(i == 2 ? 13 : 7);
        objArr[1] = 0;
        objArr[2] = 0;
        objArr[3] = 0;
        objArr[4] = 3;
        nVar.mo160131h(11701, objArr);
        C69242l1.m81604j(this.f200986h, 1, false);
    }
}
