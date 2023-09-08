package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import js0.C88020k;
import tm0.C90551r;
import zp3.C79406f;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.j */
public class C81121j extends C82926s {
    private static final int CTRL_INDEX = 1166;
    public static final String NAME = "resizeSplashAd";

    /* renamed from: i */
    public String f238400i = "launch";

    /* renamed from: s */
    public void mo113284s(C81925i2 i2Var, C40482o oVar, int[] iArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.C113379b.SOURCE, Util.nullAs(this.f238400i, "launch"));
        int i = iArr[0];
        int i2 = iArr[1];
        int f = C88020k.m109555f(i);
        int f2 = C88020k.m109555f(i2);
        int f3 = C88020k.m109555f(C79406f.m96347a(i2Var.getContext(), 8.0f) + C90551r.m113380y(i2Var));
        hashMap.put("screenWidth", Integer.valueOf(f));
        hashMap.put("screenHeight", Integer.valueOf(f2));
        hashMap.put("rightButtonTop", Integer.valueOf(f3));
        Log.m105925i("MicroMsg.JsApiResizeSplashAd", "dispatch, screenWidth:%s, screenHeight:%s,  rightButtonTop:%s", Integer.valueOf(f), Integer.valueOf(f2), Integer.valueOf(f3));
        mo115165o(hashMap);
        mo115194p(i2Var);
        mo115159i(oVar);
    }
}
