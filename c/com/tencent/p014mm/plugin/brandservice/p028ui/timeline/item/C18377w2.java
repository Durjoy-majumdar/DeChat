package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18401z2;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.w2 */
public final class C18377w2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18401z2.C18402a f50915d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50916e;

    /* renamed from: f */
    public final /* synthetic */ int f50917f;

    public C18377w2(C18401z2.C18402a aVar, C19623o0 o0Var, int i) {
        this.f50915d = aVar;
        this.f50916e = o0Var;
        this.f50917f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot$initFeedBack$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C18401z2.C18402a aVar = this.f50915d;
        C18315n nVar = new C18315n(aVar.f51030E, this.f50916e, aVar.f51029D, this.f50917f);
        nVar.mo26452d(this.f50915d.f51038M);
        nVar.show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot$initFeedBack$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
