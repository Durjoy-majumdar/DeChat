package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.l1 */
public final class C4092l1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Integer, C13598b0> f18229d;

    /* renamed from: e */
    public final /* synthetic */ int f18230e;

    public C4092l1(C32226l<? super Integer, C13598b0> lVar, int i) {
        this.f18229d = lVar;
        this.f18230e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f18229d.invoke(Integer.valueOf(this.f18230e));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
