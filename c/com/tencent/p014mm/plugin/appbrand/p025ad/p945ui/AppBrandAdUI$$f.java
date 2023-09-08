package com.tencent.p014mm.plugin.appbrand.p025ad.p945ui;

import ai0.C79557i;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81114e;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81116f;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$f */
public class AppBrandAdUI$$f implements C79557i.C79559b {

    /* renamed from: a */
    public final /* synthetic */ AppBrandAdUI f238415a;

    public AppBrandAdUI$$f(AppBrandAdUI appBrandAdUI) {
        this.f238415a = appBrandAdUI;
    }

    /* renamed from: a */
    public void mo109643a(String str) {
        if (this.f238415a.f238402e != null && "menu".equalsIgnoreCase(str)) {
            C81116f fVar = new C81116f();
            fVar.f238391i = str;
            fVar.mo113281s((C88267e) this.f238415a.f238402e.f238150p);
            C81114e eVar = new C81114e();
            eVar.f238387i = str;
            eVar.mo113280s((C88267e) this.f238415a.f238402e.f238150p);
        }
    }

    public void onDetach() {
    }
}
