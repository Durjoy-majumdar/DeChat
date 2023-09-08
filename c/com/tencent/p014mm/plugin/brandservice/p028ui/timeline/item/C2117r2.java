package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.r2 */
public final class C2117r2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Integer, C13598b0> f12083d;

    public C2117r2(C32226l<? super Integer, C13598b0> lVar) {
        this.f12083d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$refreshJumpLink$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f12083d.invoke(25);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$refreshJumpLink$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
