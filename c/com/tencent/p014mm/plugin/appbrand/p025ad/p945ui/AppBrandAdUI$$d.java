package com.tencent.p014mm.plugin.appbrand.p025ad.p945ui;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81112d;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81114e;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84674s4;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C88267e;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$d */
public class AppBrandAdUI$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAdUI f238413d;

    public AppBrandAdUI$$d(AppBrandAdUI appBrandAdUI) {
        this.f238413d = appBrandAdUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f238413d.f238402e != null) {
            C81112d dVar = new C81112d();
            dVar.f238382i = "menu";
            dVar.f238383j = "close";
            dVar.mo113279s((C88267e) this.f238413d.f238402e.f238150p);
            C83231l.m102146g(this.f238413d.f238402e.f238147j, C83231l.C83235e.CLOSE);
            this.f238413d.f238402e.mo113063k();
            C81114e eVar = new C81114e();
            eVar.f238387i = "menu";
            eVar.mo113280s((C88267e) this.f238413d.f238402e.f238150p);
        }
        this.f238413d.finish();
        ((C84674s4) C89909e.m112436a(C84674s4.class)).mo111332aG(this.f238413d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
