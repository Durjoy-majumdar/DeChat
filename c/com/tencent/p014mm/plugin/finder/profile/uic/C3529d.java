package com.tencent.p014mm.plugin.finder.profile.uic;

import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileFeedUIC;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.d */
public final class C3529d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileFeedUIC f16381d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileFeedUIC.C3431a f16382e;

    public C3529d(FinderProfileFeedUIC finderProfileFeedUIC, FinderProfileFeedUIC.C3431a aVar) {
        this.f16381d = finderProfileFeedUIC;
        this.f16382e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f16381d.getFeedLoader().requestRefresh();
        FinderRefreshLayout finderRefreshLayout = this.f16382e.f17932d;
        int i = WxRefreshLayout.f56656G;
        finderRefreshLayout.mo26640x(false);
        this.f16382e.mo3802b();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
