package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f32.C75675d;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C89132b;
import te3.C51504u72;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.p0 */
public class C69661p0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C89132b.C89134c f201048d;

    /* renamed from: e */
    public final /* synthetic */ C69666q0 f201049e;

    public C69661p0(C69666q0 q0Var, C89132b.C89134c cVar) {
        this.f201049e = q0Var;
        this.f201048d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$42$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "click fissison entrance： %s", ((C51504u72) this.f201048d.f256796d).f142652h);
        C75675d.m90931a(22, this.f201049e.f201054a.f199861d2);
        C75228t.m90219L(this.f201049e.f201054a.getContext(), ((C51504u72) this.f201048d.f256796d).f142652h, true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$42$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
