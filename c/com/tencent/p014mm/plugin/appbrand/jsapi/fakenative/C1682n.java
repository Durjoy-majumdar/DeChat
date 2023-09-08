package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.n */
public final class C1682n<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C88267e f11361d;

    /* renamed from: e */
    public final /* synthetic */ int f11362e;

    /* renamed from: f */
    public final /* synthetic */ C82399k f11363f;

    /* renamed from: g */
    public final /* synthetic */ String f11364g;

    public C1682n(C88267e eVar, int i, C82399k kVar, String str) {
        this.f11361d = eVar;
        this.f11362e = i;
        this.f11363f = kVar;
        this.f11364g = str;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        this.f11361d.mo109647a(this.f11362e, this.f11363f.mo115109j("ok"));
        Log.m105924i("MicroMsg.AppBrand.JsApiSaveRuntimeSnapshot", "invokeMM ok, appId=" + this.f11361d.getAppId() + ", path=" + this.f11364g);
    }
}
