package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import te3.ne4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.v0 */
public final class C18370v0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18380x0 f50893d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50894e;

    /* renamed from: f */
    public final /* synthetic */ ne4 f50895f;

    /* renamed from: g */
    public final /* synthetic */ int f50896g;

    public C18370v0(C18380x0 x0Var, C19623o0 o0Var, ne4 ne4, int i) {
        this.f50893d = x0Var;
        this.f50894e = o0Var;
        this.f50895f = ne4;
        this.f50896g = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardFinder$BizTLRecCardVideo$refreshUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f50893d.mo22818j(this.f50894e, this.f50895f, view, this.f50896g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardFinder$BizTLRecCardVideo$refreshUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
