package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.page.C83897r;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.page.o */
public class C83860o implements C83897r.C40516e {

    /* renamed from: a */
    public final /* synthetic */ C83897r f244843a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandMenuHeader f244844b;

    public C83860o(AppBrandMenuHeader appBrandMenuHeader, C83897r rVar) {
        this.f244844b = appBrandMenuHeader;
        this.f244843a = rVar;
    }

    /* renamed from: a */
    public void mo116419a(String str) {
        AppBrandMenuHeader appBrandMenuHeader = this.f244844b;
        int i = AppBrandMenuHeader.f244378q;
        appBrandMenuHeader.getClass();
        if (Util.isNullOrNil(str)) {
            appBrandMenuHeader.f244387o.setVisibility(8);
            return;
        }
        appBrandMenuHeader.f244387o.setText(str);
        appBrandMenuHeader.f244387o.setVisibility(0);
    }
}
