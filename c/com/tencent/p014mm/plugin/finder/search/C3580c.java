package com.tencent.p014mm.plugin.finder.search;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.search.c */
public final class C3580c implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderContactSearchUI f16633d;

    public C3580c(FinderContactSearchUI finderContactSearchUI) {
        this.f16633d = finderContactSearchUI;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderContactSearchUI$ContactSearchProfileAdapter$bindData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        FinderContactSearchUI finderContactSearchUI = this.f16633d;
        C87412m.m108593f(view, LocaleUtil.ITALIAN);
        finderContactSearchUI.onContactItemLongClick(view);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI$ContactSearchProfileAdapter$bindData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
