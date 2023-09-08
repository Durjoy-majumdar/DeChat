package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$k */
public class AppBrandUI$$k implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandUI f246523d;

    public AppBrandUI$$k(AppBrandUI appBrandUI) {
        this.f246523d = appBrandUI;
    }

    public Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        Log.m105925i("MicroMsg.AppBrandUI", "onPause: isScreenOn = [%b]", bool);
        if (bool.booleanValue()) {
            return null;
        }
        AppBrandUI.m104031Q7(this.f246523d);
        return null;
    }
}
