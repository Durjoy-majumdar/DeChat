package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.a1 */
public final class C18782a1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCollapsibleTextView f52566d;

    public C18782a1(FinderCollapsibleTextView finderCollapsibleTextView) {
        this.f52566d = finderCollapsibleTextView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderCollapsibleTextView finderCollapsibleTextView = this.f52566d;
        int i = FinderCollapsibleTextView.f52536t;
        finderCollapsibleTextView.mo23657e();
        Context context = this.f52566d.getContext();
        C87412m.m108593f(context, "context");
        FinderCollapsibleTextView finderCollapsibleTextView2 = this.f52566d;
        ((C58417y0) C86312j.m106911c(C58417y0.class)).sy0(context, false, 1, finderCollapsibleTextView2.f52544n, finderCollapsibleTextView2.f52543j);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
