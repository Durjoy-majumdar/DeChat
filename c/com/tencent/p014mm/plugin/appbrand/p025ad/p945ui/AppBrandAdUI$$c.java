package com.tencent.p014mm.plugin.appbrand.p025ad.p945ui;

import android.view.View;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81112d;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$c */
public class AppBrandAdUI$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAdUI f238412d;

    public AppBrandAdUI$$c(AppBrandAdUI appBrandAdUI) {
        this.f238412d = appBrandAdUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f238412d.f238402e != null) {
            C81112d dVar = new C81112d();
            dVar.f238382i = "menu";
            dVar.f238383j = "back";
            dVar.mo113279s((C88267e) this.f238412d.f238402e.f238150p);
        }
        this.f238412d.finish();
        this.f238412d.overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
