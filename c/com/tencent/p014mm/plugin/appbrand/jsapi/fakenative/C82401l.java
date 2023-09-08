package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81692d4;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import kr0.C88267e;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.l */
public final class C82401l<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntimeWC f241465a;

    /* renamed from: b */
    public final /* synthetic */ C88267e f241466b;

    /* renamed from: c */
    public final /* synthetic */ int f241467c;

    /* renamed from: d */
    public final /* synthetic */ C82399k f241468d;

    public C82401l(AppBrandRuntimeWC appBrandRuntimeWC, C88267e eVar, int i, C82399k kVar) {
        this.f241465a = appBrandRuntimeWC;
        this.f241466b = eVar;
        this.f241467c = i;
        this.f241468d = kVar;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        Bitmap a = C81692d4.m100243a(this.f241465a);
        C88267e eVar = this.f241466b;
        int i = this.f241467c;
        C82399k kVar = this.f241468d;
        if (a == null || a.isRecycled()) {
            C88643g.m110544b().mo72091a((Object) null);
            Log.m105920e("MicroMsg.AppBrand.JsApiSaveRuntimeSnapshot", "save failed, appId=" + eVar.getAppId());
            eVar.mo109647a(i, kVar.mo115109j("fail"));
        }
        return a;
    }
}
