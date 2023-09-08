package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.p0 */
public class C4144p0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4191v0 f18368d;

    public C4144p0(C4191v0 v0Var) {
        this.f18368d = v0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f18368d.mo5072g();
        this.f18368d.getClass();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
