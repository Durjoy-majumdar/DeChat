package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.i */
public class C69606i extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C69158a0 f200960g;

    /* renamed from: h */
    public final /* synthetic */ LuckyMoneyBusiDetailUI f200961h;

    public C69606i(LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI, C69158a0 a0Var) {
        this.f200961h = luckyMoneyBusiDetailUI;
        this.f200960g = a0Var;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[5];
        LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = this.f200961h;
        int i = this.f200960g.f198948J;
        int i2 = LuckyMoneyBusiDetailUI.f199679P;
        luckyMoneyBusiDetailUI.getClass();
        objArr[0] = Integer.valueOf(i == 2 ? 13 : 7);
        objArr[1] = 0;
        objArr[2] = 0;
        objArr[3] = 0;
        objArr[4] = 4;
        nVar.mo160131h(11701, objArr);
        Intent intent = new Intent();
        intent.setClass(this.f200961h.getContext(), LuckyMoneyMyRecordUI.class);
        intent.putExtra("key_type", 2);
        LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI2 = this.f200961h;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI3 = luckyMoneyBusiDetailUI2;
        C117292a.m165358d(luckyMoneyBusiDetailUI3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$14", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyBusiDetailUI2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(luckyMoneyBusiDetailUI3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$14", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
