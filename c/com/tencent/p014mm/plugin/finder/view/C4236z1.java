package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.t54;

/* renamed from: com.tencent.mm.plugin.finder.view.z1 */
public final class C4236z1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderExtendReadingView f18553d;

    /* renamed from: e */
    public final /* synthetic */ t54 f18554e;

    public C4236z1(FinderExtendReadingView finderExtendReadingView, t54 t54) {
        this.f18553d = finderExtendReadingView;
        this.f18554e = t54;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingView$showRedPacketCover$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super t54, C13598b0> lVar = this.f18553d.f17709g;
        if (lVar != null) {
            lVar.invoke(this.f18554e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView$showRedPacketCover$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
