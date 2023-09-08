package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m53.C10756c;
import m53.C10764j;
import rs1.C13273i6;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.f */
public final class C4332f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13273i6.C13274a f18810d;

    /* renamed from: e */
    public final /* synthetic */ C13273i6 f18811e;

    public C4332f(C13273i6.C13274a aVar, C13273i6 i6Var) {
        this.f18810d = aVar;
        this.f18811e = i6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1$onBindViewHolder$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.FinderLiveIncomeListUIC", "click encash, encashInterceptJumpInfo:" + this.f18810d.mo12731a());
        Long l = this.f18810d.f37681e;
        long j = 0;
        if ((l != null ? l.longValue() : 0) > 0) {
            C10756c cVar = (C10756c) C86709a0.m107533q(C10756c.class);
            Activity context = this.f18811e.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivity mMActivity = (MMActivity) context;
            C10764j jVar = new C10764j();
            C13273i6.C13274a aVar = this.f18810d;
            jVar.f32234a = aVar.f37680d.f130896e;
            Long l2 = aVar.f37681e;
            if (l2 != null) {
                j = l2.longValue();
            }
            jVar.f32235b = j;
            jVar.f32236c = aVar.f37682f;
            jVar.f32237d = aVar.f37683g;
            jVar.f32238e = aVar.f37686j;
            C13598b0 b0Var = C13598b0.f38549a;
            cVar.C70(mMActivity, jVar, new WeakReference(this.f18811e));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1$onBindViewHolder$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
