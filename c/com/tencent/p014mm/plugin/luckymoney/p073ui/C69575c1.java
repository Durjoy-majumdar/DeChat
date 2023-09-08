package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyHistoryEnvelopeUI;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.c1 */
public class C69575c1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f200880d;

    /* renamed from: e */
    public final /* synthetic */ C77994sf2 f200881e;

    /* renamed from: f */
    public final /* synthetic */ LuckyMoneyHistoryEnvelopeUI.C69407i f200882f;

    /* renamed from: g */
    public final /* synthetic */ LuckyMoneyHistoryEnvelopeUI.C69408j f200883g;

    public C69575c1(LuckyMoneyHistoryEnvelopeUI.C69408j jVar, C60905o oVar, C77994sf2 sf22, LuckyMoneyHistoryEnvelopeUI.C69407i iVar) {
        this.f200883g = jVar;
        this.f200880d = oVar;
        this.f200881e = sf22;
        this.f200882f = iVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f200883g.mo95584k(this.f200880d, this.f200881e, true, this.f200882f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
