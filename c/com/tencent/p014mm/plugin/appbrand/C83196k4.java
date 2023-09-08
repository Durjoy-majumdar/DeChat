package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.k4 */
public class C83196k4 extends C83231l.C83234d {

    /* renamed from: d */
    public final /* synthetic */ String f242997d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f242998e;

    public C83196k4(String str, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f242997d = str;
        this.f242998e = appBrandRuntimeWC;
    }

    /* renamed from: c */
    public void mo109497c() {
        Log.m105925i("MicroMsg.SinglePageModeLogic", "onDestroy appid:%s", this.f242997d);
        C83231l.m102144e(this.f242997d, this);
        AppBrandRuntimeWC appBrandRuntimeWC = this.f242998e;
        String str = appBrandRuntimeWC.f238147j;
        int i = appBrandRuntimeWC.mo113213o1().f261073s;
        String str2 = appBrandRuntimeWC.mo113213o1().f261075u;
        ((C119157j) C119157j.f356862d).mo183876g(new C83244l4(str, i, str2), "SinglePageMode#cleanData");
    }
}
