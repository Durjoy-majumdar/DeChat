package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.y3 */
public final class C4219y3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostOriginView f18522d;

    public C4219y3(FinderPostOriginView finderPostOriginView) {
        this.f18522d = finderPostOriginView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderPostOriginView finderPostOriginView = this.f18522d;
        int i = FinderPostOriginView.f17904B;
        finderPostOriginView.mo4677i(true, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
