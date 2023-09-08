package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.view.View;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.a */
public final class C4327a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderAtFeedManageUIC f18802d;

    /* renamed from: e */
    public final /* synthetic */ FinderAtFeedManageUIC.C4247a f18803e;

    public C4327a(FinderAtFeedManageUIC finderAtFeedManageUIC, FinderAtFeedManageUIC.C4247a aVar) {
        this.f18802d = finderAtFeedManageUIC;
        this.f18803e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAtFeedManageUIC$ViewActionCallback$updateState$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        RefreshLoadMoreLayout g3 = this.f18802d.mo5114g3();
        C87412m.m108593f(g3, "rlLayout");
        RefreshLoadMoreLayout.m66897N(g3, 0, false, 3, (Object) null);
        this.f18803e.mo5115a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAtFeedManageUIC$ViewActionCallback$updateState$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
