package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.j3 */
public final class C18301j3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18291i3 f50620d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50621e;

    /* renamed from: f */
    public final /* synthetic */ int f50622f;

    public C18301j3(C18291i3 i3Var, C19623o0 o0Var, int i) {
        this.f50620d = i3Var;
        this.f50621e = o0Var;
        this.f50622f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$initHead$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C18291i3 i3Var = this.f50620d;
        C18315n nVar = new C18315n(i3Var.f50573e, this.f50621e, i3Var.f50572d, this.f50622f);
        nVar.mo26452d(this.f50620d.f50579k);
        nVar.show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$initHead$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
