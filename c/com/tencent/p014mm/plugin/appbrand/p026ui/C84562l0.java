package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.l0 */
public class C84562l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C84552k0 f246761d;

    public C84562l0(C84552k0 k0Var) {
        this.f246761d = k0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C84552k0 k0Var = this.f246761d;
        if (k0Var.f246746y0) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C83231l.m102146g(k0Var.f246743x.f238147j, C83231l.C83235e.CLOSE);
        this.f246761d.f246743x.mo113006E();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
