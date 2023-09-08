package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.page.C83800f0;
import java.util.HashMap;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$t */
public class AppBrandRuntime$$t implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f238197d;

    public AppBrandRuntime$$t(AppBrandRuntime appBrandRuntime) {
        this.f238197d = appBrandRuntime;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        String str2;
        AppBrandRuntime appBrandRuntime = this.f238197d;
        HashMap hashMap = new HashMap();
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            str2 = "active";
        } else if (ordinal == 1) {
            str2 = "background";
        } else if (ordinal == 2) {
            str2 = "suspend";
        } else {
            return;
        }
        hashMap.put("status", str2);
        C83800f0 f0Var = new C83800f0();
        f0Var.mo115165o(hashMap);
        f0Var.mo115194p(appBrandRuntime.mo113047b0());
        f0Var.mo115158h();
    }
}
