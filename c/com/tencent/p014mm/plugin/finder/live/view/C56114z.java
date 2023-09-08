package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2;
import j20.C117292a;
import java.util.ArrayList;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.z */
public final class C56114z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159984d;

    /* renamed from: e */
    public final /* synthetic */ int f159985e;

    public C56114z(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2, int i) {
        this.f159984d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
        this.f159985e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f159984d;
        finderLiveCameraOptBeautyPowerfulDetailsViewV2.setSelectedEffect((FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k) C110818d0.m150917O(finderLiveCameraOptBeautyPowerfulDetailsViewV2.getEffectItems(), this.f159985e));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
