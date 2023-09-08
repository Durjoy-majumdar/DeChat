package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.live.view.t0 */
public final class C3231t0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15358d;

    public C3231t0(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        this.f15358d = finderLiveMultiNoticeView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeView$backBtn$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f15358d.mo3333e();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeView$backBtn$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
