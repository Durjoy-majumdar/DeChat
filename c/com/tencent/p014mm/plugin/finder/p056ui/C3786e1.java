package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.ui.e1 */
public final class C3786e1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedUI f17261d;

    public C3786e1(FinderLikedFeedUI finderLikedFeedUI) {
        this.f17261d = finderLikedFeedUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f17261d.mo4062O7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
