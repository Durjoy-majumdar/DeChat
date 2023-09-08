package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81781e0;
import p284zb.C91635f;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w */
public final class C82264w extends C81781e0 {

    /* renamed from: a */
    public final String f241172a;

    /* renamed from: b */
    public final String f241173b;

    public C82264w(C81925i2 i2Var) {
        C86812g H0;
        AppBrandInitConfigLU l1;
        C86812g H02;
        AppBrandInitConfigLU l15;
        boolean z = i2Var instanceof C91635f;
        String str = null;
        C91635f fVar = z ? (C91635f) i2Var : null;
        String str2 = (fVar == null || (H02 = fVar.getRuntime()) == null || (l15 = H02.mo113036W()) == null) ? null : l15.f234838r;
        String str3 = "";
        this.f241172a = str2 == null ? str3 : str2;
        C91635f fVar2 = z ? (C91635f) i2Var : null;
        if (!(fVar2 == null || (H0 = fVar2.getRuntime()) == null || (l1 = H0.mo113036W()) == null)) {
            str = l1.f234837q;
        }
        this.f241173b = str != null ? str : str3;
    }

    /* renamed from: a */
    public String mo114162a() {
        return this.f241173b;
    }

    /* renamed from: d */
    public String mo114165d() {
        return this.f241172a;
    }
}
