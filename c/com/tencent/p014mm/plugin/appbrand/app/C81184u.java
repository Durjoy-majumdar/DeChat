package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import yq0.C91548e;
import yq0.C91572m;

/* renamed from: com.tencent.mm.plugin.appbrand.app.u */
public class C81184u implements C91548e.C91552d {

    /* renamed from: com.tencent.mm.plugin.appbrand.app.u$a */
    public class C81185a extends C91548e {
        public C81185a(C81184u uVar, C91548e.C91554e eVar, C91572m mVar) {
            super(eVar, mVar);
        }

        /* renamed from: c */
        public boolean mo113354c(AppBrandRuntime appBrandRuntime) {
            if (appBrandRuntime instanceof AppBrandRuntimeWC) {
                return ((AppBrandRuntimeWC) appBrandRuntime).mo113210l1().f234815R0.mo76931c();
            }
            return false;
        }
    }

    public C81184u(C81180q qVar) {
    }

    /* renamed from: a */
    public C91548e mo113353a(C91548e.C91554e eVar, C91572m mVar) {
        return new C81185a(this, eVar, mVar);
    }
}
