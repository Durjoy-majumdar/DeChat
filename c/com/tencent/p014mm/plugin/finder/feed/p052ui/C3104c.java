package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.c */
public final class C3104c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFriendLikeTimelineUI f14964d;

    public C3104c(FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
        this.f14964d = finderFriendLikeTimelineUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderFriendLikeTimelineUI.m2783V7(this.f14964d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
