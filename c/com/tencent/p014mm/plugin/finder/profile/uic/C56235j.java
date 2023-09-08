package com.tencent.p014mm.plugin.finder.profile.uic;

import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileMusicUIC;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.j */
public final class C56235j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileMusicUIC f160671d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileMusicUIC.C56215a f160672e;

    public C56235j(FinderProfileMusicUIC finderProfileMusicUIC, FinderProfileMusicUIC.C56215a aVar) {
        this.f160671d = finderProfileMusicUIC;
        this.f160672e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileMusicUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        RefreshLoadMoreLayout e3 = this.f160671d.mo78515e3();
        C87412m.m108593f(e3, "rlLayout");
        RefreshLoadMoreLayout.m66897N(e3, 0, false, 3, (Object) null);
        this.f160672e.mo5115a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileMusicUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
