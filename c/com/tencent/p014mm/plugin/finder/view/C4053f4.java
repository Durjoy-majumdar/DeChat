package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.f4 */
public final class C4053f4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostOriginView f18167d;

    public C4053f4(FinderPostOriginView finderPostOriginView) {
        this.f18167d = finderPostOriginView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$initNoticeView$1$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderPostOriginView.m4213c(this.f18167d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$initNoticeView$1$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
