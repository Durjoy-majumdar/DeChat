package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13273i6;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.g */
public final class C4333g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13273i6 f18812d;

    /* renamed from: e */
    public final /* synthetic */ C13273i6.C13274a f18813e;

    public C4333g(C13273i6 i6Var, C13273i6.C13274a aVar) {
        this.f18812d = i6Var;
        this.f18813e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1$onBindViewHolder$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13273i6.m12630c3(this.f18812d, this.f18813e.f37684h);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1$onBindViewHolder$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
