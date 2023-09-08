package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81411c0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.x1 */
public final class C82500x1 implements C81411c0 {

    /* renamed from: a */
    public final /* synthetic */ C81413f0 f241567a;

    public C82500x1(C81413f0 f0Var) {
        this.f241567a = f0Var;
    }

    public boolean accept(String str) {
        C87412m.m108594g(str, "path");
        return this.f241567a.f238949g.mo113721h(new C86009m1(str), false);
    }

    public String key() {
        return "saved_temp";
    }
}
