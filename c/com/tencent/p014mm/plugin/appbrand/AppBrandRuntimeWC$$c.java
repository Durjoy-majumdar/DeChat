package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import fy3.C32224a;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$c */
public final /* synthetic */ class AppBrandRuntimeWC$$c implements C32224a {

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f238313d;

    /* renamed from: e */
    public final /* synthetic */ String f238314e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandInitConfigWC f238315f;

    public /* synthetic */ AppBrandRuntimeWC$$c(AppBrandInitConfigWC appBrandInitConfigWC, String str, AppBrandInitConfigWC appBrandInitConfigWC2) {
        this.f238313d = appBrandInitConfigWC;
        this.f238314e = str;
        this.f238315f = appBrandInitConfigWC2;
    }

    public final Object invoke() {
        AppBrandInitConfigWC appBrandInitConfigWC = this.f238313d;
        String str = this.f238314e;
        AppBrandInitConfigWC appBrandInitConfigWC2 = this.f238315f;
        boolean z = AppBrandRuntimeWC.f238264Q1;
        return C90599h.m113511d(appBrandInitConfigWC.f239367i) ? Boolean.TRUE : C90599h.m113509b(appBrandInitConfigWC.f239367i, str) ? Boolean.TRUE : (!C90599h.m113509b(appBrandInitConfigWC.f239367i, appBrandInitConfigWC2.f239367i) || appBrandInitConfigWC.f234813Q0 != appBrandInitConfigWC2.f234813Q0) ? Boolean.FALSE : Boolean.TRUE;
    }
}
