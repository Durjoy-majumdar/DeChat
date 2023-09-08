package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.d3 */
public final class C4868d3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C69597g3 f19953d;

    public C4868d3(C69597g3 g3Var) {
        this.f19953d = g3Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$initUIC$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f19953d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$initUIC$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
