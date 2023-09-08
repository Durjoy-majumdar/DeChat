package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.o */
public class C82600o extends C82601p {
    private static final int CTRL_INDEX = 340;
    private static final String NAME = "enableLocationUpdate";

    /* renamed from: x */
    public void mo114896x(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        super.mo114904A(i2Var, jSONObject, i);
        C82581d0 d0Var = this.f241719h;
        if (d0Var != null && !d0Var.f241702n) {
            AppBrandBackgroundRunningMonitor.m100056a(i2Var, 2, 2, false);
        }
    }
}
