package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx0.C22260f;
import s90.C77630j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.j1 */
public final class C18299j1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18253h1 f50614d;

    public C18299j1(C18253h1 h1Var) {
        this.f50614d = h1Var;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$fillingHeader$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C18253h1 h1Var = this.f50614d;
        C87412m.m108593f(view, "view");
        h1Var.f50494e.f51443n.mo22984k(h1Var.f50327a, 20);
        C22260f fVar = h1Var.f50494e.f51436d.f50233d;
        C19623o0 o0Var = h1Var.f50327a;
        C87412m.m108593f(o0Var, "info");
        fVar.mo35421d(view, o0Var, (C77630j) null, 0, false);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$fillingHeader$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
