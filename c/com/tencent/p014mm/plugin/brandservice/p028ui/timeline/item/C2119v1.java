package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.v1 */
public final class C2119v1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f12085d;

    public C2119v1(C32224a<C13598b0> aVar) {
        this.f12085d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$refreshJumpLink$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f12085d.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$refreshJumpLink$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
