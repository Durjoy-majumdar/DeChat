package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.t1 */
public final class C18359t1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18335q1 f50841d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50842e;

    public C18359t1(C18335q1 q1Var, C19623o0 o0Var) {
        this.f50841d = q1Var;
        this.f50842e = o0Var;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$refreshHead$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C18508z2 z2Var = this.f50841d.f50743d;
        z2Var.f51442j = this.f50842e;
        z2Var.mo23134A();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$refreshHead$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
