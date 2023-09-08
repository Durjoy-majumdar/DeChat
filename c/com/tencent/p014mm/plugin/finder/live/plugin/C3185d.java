package com.tencent.p014mm.plugin.finder.live.plugin;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import tf0.C64916p1;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.d */
public final class C3185d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin.C3163e f15179d;

    /* renamed from: e */
    public final /* synthetic */ FinderJumpInfo f15180e;

    public C3185d(FinderLiveAnchorAfterPlugin.C3163e eVar, FinderJumpInfo finderJumpInfo) {
        this.f15179d = eVar;
        this.f15180e = finderJumpInfo;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$CommonInfoViewHolder$renderJumpView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C64916p1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        Context context = this.f15179d.f15130C.getContext();
        C87412m.m108593f(context, "jumpTv.context");
        C64916p1.C64917a.m76438e((C64916p1) c, context, this.f15180e, (C86299o) null, 0, (C60905o) null, 24, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$CommonInfoViewHolder$renderJumpView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
