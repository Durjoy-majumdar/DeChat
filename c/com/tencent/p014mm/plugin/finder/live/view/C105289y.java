package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ks3.C109054b;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.y */
public final class C105289y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsView f312804d;

    /* renamed from: e */
    public final /* synthetic */ int f312805e;

    public C105289y(FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView, int i) {
        this.f312804d = finderLiveCameraOptBeautyPowerfulDetailsView;
        this.f312805e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsView$BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = this.f312804d;
        finderLiveCameraOptBeautyPowerfulDetailsView.setSelectedEffect((C109054b) C110818d0.m150917O(finderLiveCameraOptBeautyPowerfulDetailsView.getEffectItems(), this.f312805e));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsView$BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
