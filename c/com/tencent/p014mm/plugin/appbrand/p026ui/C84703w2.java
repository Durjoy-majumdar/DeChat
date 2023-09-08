package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.w2 */
public class C84703w2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C84690v2 f247088d;

    public C84703w2(C84690v2 v2Var) {
        this.f247088d = v2Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplash$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C84690v2 v2Var = this.f247088d;
        AppBrandRuntime appBrandRuntime = v2Var.f247067x;
        if (appBrandRuntime == null) {
            C32224a<C13598b0> aVar = v2Var.f247058D;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (v2Var.f247064J) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplash$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else {
            C83231l.m102146g(appBrandRuntime.f238147j, C83231l.C83235e.CLOSE);
            this.f247088d.f247067x.mo113006E();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplash$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
