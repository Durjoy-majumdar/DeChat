package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import te3.ne4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.e0 */
public final class C18238e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18296j0 f50430d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50431e;

    /* renamed from: f */
    public final /* synthetic */ ne4 f50432f;

    /* renamed from: g */
    public final /* synthetic */ int f50433g;

    public C18238e0(C18296j0 j0Var, C19623o0 o0Var, ne4 ne4, int i) {
        this.f50430d = j0Var;
        this.f50431e = o0Var;
        this.f50432f = ne4;
        this.f50433g = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent$BizRecCardCommonSlot$refreshUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f50430d.mo22818j(this.f50431e, this.f50432f, view, this.f50433g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent$BizRecCardCommonSlot$refreshUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
