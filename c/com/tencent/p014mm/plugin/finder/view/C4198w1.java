package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.w1 */
public final class C4198w1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4191v0 f18491d;

    public C4198w1(C4191v0 v0Var) {
        this.f18491d = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendActivityView$showPostActivitySheet$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f18491d.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendActivityView$showPostActivitySheet$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
