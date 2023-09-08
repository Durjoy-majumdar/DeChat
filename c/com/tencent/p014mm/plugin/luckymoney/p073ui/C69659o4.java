package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.o4 */
public class C69659o4 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69497p f201045d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f201046e;

    public C69659o4(LuckyMoneyPickEnvelopeUI.C69498r rVar, LuckyMoneyPickEnvelopeUI.C69497p pVar) {
        this.f201046e = rVar;
        this.f201045d = pVar;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (this.f201045d.f200615b != null) {
            int k = this.f201046e.mo17364k();
            LuckyMoneyPickEnvelopeUI.m81900I7(LuckyMoneyPickEnvelopeUI.this, k);
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "longclick normalVh realPos : %s ，mSelectPos：%s", Integer.valueOf(k), Integer.valueOf(LuckyMoneyPickEnvelopeUI.this.f200557u));
            LuckyMoneyPickEnvelopeUI.C69498r.m81928C(this.f201046e, view, 1, this.f201045d.f200615b.f228202f);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
