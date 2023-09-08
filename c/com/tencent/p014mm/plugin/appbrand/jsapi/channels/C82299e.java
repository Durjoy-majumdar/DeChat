package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.EmptyResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import wq0.C91062d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.e */
public final class C82299e extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 985;
    private static final String NAME = "openChannelsCreateContact";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.e$a */
    public static final class C82300a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public static final C82300a<R> f241224a = new C82300a<>();

        public /* bridge */ /* synthetic */ void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            EmptyResult emptyResult = (EmptyResult) processResult;
        }
    }

    public C82299e() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsCreateContact", "invoke, env is null");
            return;
        }
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsCreateContact", "invoke, context is null");
            fVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        C81956c.m100675c(context, new OpenChannelsCreateContactRequest(str), C82300a.f241224a, (Intent) null);
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
