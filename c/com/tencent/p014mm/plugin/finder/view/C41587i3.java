package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76875f0;

/* renamed from: com.tencent.mm.plugin.finder.view.i3 */
public final class C41587i3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C41573e3.C41574a f111932d;

    /* renamed from: e */
    public final /* synthetic */ C11184p0 f111933e;

    /* renamed from: f */
    public final /* synthetic */ C76875f0 f111934f;

    public C41587i3(C41573e3.C41574a aVar, C11184p0 p0Var, C76875f0 f0Var) {
        this.f111932d = aVar;
        this.f111933e = p0Var;
        this.f111934f = f0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$showTopMemuItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C41573e3.f111902a.mo64660c(3, this.f111932d);
        this.f111933e.onMMMenuItemSelected(this.f111934f, 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$showTopMemuItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
