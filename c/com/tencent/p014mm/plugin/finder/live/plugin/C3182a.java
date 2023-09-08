package com.tencent.p014mm.plugin.finder.live.plugin;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import cl1.C55001u;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import tf0.C13883o1;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.a */
public final class C3182a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f15176d;

    public C3182a(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin) {
        this.f15176d = finderLiveAnchorAfterPlugin;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$CommonInfoAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("PARAM_FINDER_LIVE_ID", ((C55001u) this.f15176d.mo87696x0(C55001u.class)).f154420q.f182392d);
        Context context = this.f15176d.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13259Ix(context, intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$CommonInfoAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
