package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import gy3.C45983e0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import sf1.C13671a;

/* renamed from: com.tencent.mm.plugin.finder.view.f6 */
public final class C4056f6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f18171d;

    /* renamed from: e */
    public final /* synthetic */ long f18172e;

    /* renamed from: f */
    public final /* synthetic */ C45983e0 f18173f;

    public C4056f6(View view, long j, C45983e0 e0Var) {
        this.f18171d = view;
        this.f18172e = j;
        this.f18173f = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13671a aVar = C13671a.f38718a;
        Context context = this.f18171d.getContext();
        C87412m.m108593f(context, "contentView.context");
        aVar.mo13058a(context, this.f18172e, this.f18173f.f124000d, 58);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
