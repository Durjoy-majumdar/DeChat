package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p225rc.g$$i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.a */
public class C82571a implements g$$i {

    /* renamed from: a */
    public final /* synthetic */ C82381f f241679a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f241680b;

    /* renamed from: c */
    public final /* synthetic */ int f241681c;

    /* renamed from: d */
    public final /* synthetic */ C82576b f241682d;

    public C82571a(C82576b bVar, C82381f fVar, JSONObject jSONObject, int i) {
        this.f241682d = bVar;
        this.f241679a = fVar;
        this.f241680b = jSONObject;
        this.f241681c = i;
    }

    /* renamed from: c */
    public void mo1686c(String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            Log.m105920e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "SYS_PERM_DENIED");
            C82576b bVar = this.f241682d;
            bVar.f241689g = true;
            this.f241679a.mo109647a(this.f241681c, bVar.mo115109j("fail:system permission denied"));
            return;
        }
        Log.m105924i("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "PERMISSION_GRANTED, do invoke again");
        this.f241682d.mo1505u(this.f241679a, this.f241680b, this.f241681c);
    }
}
