package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.y1 */
public final class C4216y1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderExtendReadingView f18514d;

    /* renamed from: e */
    public final /* synthetic */ String f18515e;

    public C4216y1(FinderExtendReadingView finderExtendReadingView, String str) {
        this.f18514d = finderExtendReadingView;
        this.f18515e = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setSuccState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super String, C13598b0> lVar = this.f18514d.f17707e;
        if (lVar != null) {
            lVar.invoke(this.f18515e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setSuccState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
