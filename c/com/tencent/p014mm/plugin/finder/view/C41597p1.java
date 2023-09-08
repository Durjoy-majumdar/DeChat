package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import di3.C86312j;
import er1.C58684b;
import fe1.C58969q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;

/* renamed from: com.tencent.mm.plugin.finder.view.p1 */
public final class C41597p1 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderContactSortView f111965d;

    public C41597p1(FinderContactSortView finderContactSortView) {
        this.f111965d = finderContactSortView;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderContactSortView$init$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (j >= 0 && j < ((long) this.f111965d.getDatas().size())) {
            Intent intent = new Intent();
            Object obj = this.f111965d.getDatas().get((int) j).f128466b;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
            intent.putExtra("finder_username", ((C58969q) obj).getUsername());
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f111965d.getContext();
            C87412m.m108593f(context, "context");
            aVar.mo12871c(context, intent);
            Context context2 = this.f111965d.getContext();
            C87412m.m108593f(context2, "context");
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderContactSortView$init$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
