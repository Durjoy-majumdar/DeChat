package com.tencent.p014mm.plugin.finder.live.plugin;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import cl1.C54991o;
import cl1.C55001u;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import tf0.C13883o1;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.b */
public final class C3183b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f15177d;

    public C3183b(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin) {
        this.f15177d = finderLiveAnchorAfterPlugin;
    }

    public final void onClick(View view) {
        Class cls = C55001u.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$CommonInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C54991o) this.f15177d.mo87696x0(C54991o.class)).f154350p0 = false;
        Intent intent = new Intent();
        intent.putExtra("KEY_LIVE_ID", ((C55001u) this.f15177d.mo87696x0(cls)).f154420q.f182392d);
        intent.putExtra("KEY_OBJECT_ID", ((C55001u) this.f15177d.mo87696x0(cls)).f154416j);
        intent.putExtra("KEY_OBJECT_NONCE_ID", ((C55001u) this.f15177d.mo87696x0(cls)).f154423t);
        intent.putExtra("KEY_IF_USE_NEW_VALUE", false);
        Context context = this.f15177d.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13293xI(context, intent);
        if (this.f15177d.f15108p.getLiveRole() == 1) {
            ((C54108o) C86312j.m106911c(C54108o.class)).Px0(C54067f0.C0049b.SEE_GIFT_LIST, String.valueOf(1));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$CommonInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
