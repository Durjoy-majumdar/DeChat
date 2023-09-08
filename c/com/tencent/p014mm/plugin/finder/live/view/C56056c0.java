package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import sx3.C110818d0;
import w50.C65933h;

/* renamed from: com.tencent.mm.plugin.finder.live.view.c0 */
public final class C56056c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveCameraOptMakeupView f159874d;

    /* renamed from: e */
    public final /* synthetic */ int f159875e;

    public C56056c0(FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView, int i) {
        this.f159874d = finderLiveCameraOptMakeupView;
        this.f159875e = i;
    }

    public final void onClick(View view) {
        C32226l<C65933h.C65935b, C13598b0> onMakeupSuitChanged;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView = this.f159874d;
        finderLiveCameraOptMakeupView.setSelectedMakeup((C65933h.C65935b) C110818d0.m150917O(finderLiveCameraOptMakeupView.getEffectItems(), this.f159875e));
        FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView2 = this.f159874d;
        C65933h.C65935b bVar = finderLiveCameraOptMakeupView2.f159675e;
        if (!(bVar == null || (onMakeupSuitChanged = finderLiveCameraOptMakeupView2.getOnMakeupSuitChanged()) == null)) {
            onMakeupSuitChanged.invoke(bVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
