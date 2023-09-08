package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.c2 */
public final class C4029c2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedLiveNoticeView f18094d;

    public C4029c2(FinderFeedLiveNoticeView finderFeedLiveNoticeView) {
        this.f18094d = finderFeedLiveNoticeView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderFeedLiveNoticeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderFeedLiveNoticeView.m4157a(this.f18094d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderFeedLiveNoticeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
