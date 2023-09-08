package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentLinkedDeque;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$h */
public class AppBrandRuntime$$h extends ConcurrentLinkedDeque<C1727m> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f238178d;

    public AppBrandRuntime$$h(AppBrandRuntime appBrandRuntime) {
        this.f238178d = appBrandRuntime;
    }

    public boolean add(Object obj) {
        C1727m mVar = (C1727m) obj;
        boolean add = super.add(mVar);
        if (mVar instanceof C90988l) {
            Log.m105925i("MicroMsg.AppBrandRuntime", "mConfigs.add(AppBrandSysConfig[%s]) appId[%s], ret[%b]", mVar.getClass().getName(), this.f238178d.f238147j, Boolean.valueOf(add));
            C81247g3.m99555k(this.f238178d, true);
        }
        return add;
    }
}
