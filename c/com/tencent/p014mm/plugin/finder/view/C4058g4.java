package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.g4 */
public final class C4058g4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostOriginView f18177d;

    public C4058g4(FinderPostOriginView finderPostOriginView) {
        this.f18177d = finderPostOriginView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$initNoticedView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104428a aVar = this.f18177d.f17919t;
        if (aVar != null) {
            aVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$initNoticedView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
