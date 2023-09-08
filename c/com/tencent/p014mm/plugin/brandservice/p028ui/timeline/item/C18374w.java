package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.w */
public final class C18374w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18368v f50908d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50909e;

    /* renamed from: f */
    public final /* synthetic */ int f50910f;

    public C18374w(C18368v vVar, C19623o0 o0Var, int i) {
        this.f50908d = vVar;
        this.f50909e = o0Var;
        this.f50910f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem$initFeedBack$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C18368v vVar = this.f50908d;
        C18315n nVar = new C18315n(vVar.f50872a, this.f50909e, vVar.f50873b, this.f50910f);
        nVar.mo26452d(this.f50908d.f50885n);
        nVar.show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem$initFeedBack$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
