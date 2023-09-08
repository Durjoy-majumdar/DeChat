package com.tencent.p014mm.plugin.appbrand.utils;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.p1 */
public final class C84775p1 implements C84799z0 {

    /* renamed from: a */
    public final C82381f f247199a;

    public C84775p1(C82381f fVar) {
        C87412m.m108594g(fVar, "component");
        this.f247199a = fVar;
    }

    public Activity getActivity() {
        return AndroidContextUtil.castActivityOrNull(this.f247199a.getContext());
    }
}
