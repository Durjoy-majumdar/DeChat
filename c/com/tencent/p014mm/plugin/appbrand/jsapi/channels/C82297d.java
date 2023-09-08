package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import wq0.C91062d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.d */
public abstract class C82297d extends C82296c {

    /* renamed from: g */
    public final boolean f241220g = true;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.d$a */
    public static final class C82298a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241221a;

        /* renamed from: b */
        public final /* synthetic */ int f241222b;

        /* renamed from: c */
        public final /* synthetic */ C82297d f241223c;

        public C82298a(C82381f fVar, int i, C82297d dVar) {
            this.f241221a = fVar;
            this.f241222b = i;
            this.f241223c = dVar;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            String str;
            EnterFinderResult enterFinderResult = (EnterFinderResult) processResult;
            if (enterFinderResult == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "onReceiveResult#IProcessResultReceiver, result is null");
                return;
            }
            int i = enterFinderResult.f241196d;
            Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "onReceiveResult#IProcessResultReceiver, errCode: " + i);
            C82381f fVar = this.f241221a;
            int i2 = this.f241222b;
            if (i == 0) {
                C82297d dVar = this.f241223c;
                str = dVar.mo115113n("ok", dVar.mo77019C(enterFinderResult.f241197e));
            } else {
                C82297d dVar2 = this.f241223c;
                str = dVar2.mo115109j(dVar2.mo77014B("fail:internal error", i));
            }
            fVar.mo109647a(i2, str);
        }
    }

    public C82297d() {
        C91062d.m114234a(mo114779e());
    }

    /* renamed from: A */
    public boolean mo77018A() {
        return false;
    }

    /* renamed from: B */
    public String mo77014B(String str, int i) {
        C87412m.m108594g(str, "originErrMsg");
        return str;
    }

    /* renamed from: C */
    public JSONObject mo77019C(JSONObject jSONObject) {
        return jSONObject;
    }

    /* renamed from: D */
    public abstract boolean mo77015D(JSONObject jSONObject);

    /* renamed from: E */
    public Intent mo77016E(Context context) {
        C87412m.m108594g(context, "context");
        return null;
    }

    /* renamed from: w */
    public void mo114706w(C82381f fVar, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        String str;
        if (fVar != null) {
            Context context = fVar.getContext();
            if (context == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, context is null");
                fVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, data: " + jSONObject);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("action", mo77017y());
                String appId = fVar.getAppId();
                if (jSONObject2 == null || (str = jSONObject2.optString("appId", appId)) == null) {
                    str = appId;
                }
                Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, privateData: " + jSONObject2 + ", envAppId: " + appId + ", appId: " + str);
                jSONObject.put("sourceId", str);
                if (mo77020z()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("appid", fVar.getAppId());
                    if (jSONObject.has("reportExtraInfo")) {
                        jSONObject3.put("passthrough", jSONObject.opt("reportExtraInfo"));
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("weapp_info", jSONObject3);
                    Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, reportExtInfo: " + jSONObject4);
                    jSONObject.put("reportExtraInfo", jSONObject4);
                }
                if (!mo77015D(jSONObject)) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, preProcessExtInfo fail");
                    fVar.mo109647a(i, mo115109j("fail:internal error"));
                    return;
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("extInfo", jSONObject);
                    mo114705x(fVar, i, context, jSONObject5);
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, put extInfo fail since " + e);
                    fVar.mo109647a(i, mo115109j("fail:internal error"));
                }
            } catch (Exception e2) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, put fail since " + e2);
                fVar.mo109647a(i, mo115109j("fail:internal error"));
            }
        }
    }

    /* renamed from: x */
    public void mo114705x(C82381f fVar, int i, Context context, JSONObject jSONObject) {
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jSONObject, "extInfoWrapperJsonObj");
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "extInfoWrapperJsonObj.toString()");
        C81956c.m100675c(context, new EnterFinderRequest(jSONObject2, mo77018A()), new C82298a(fVar, i, this), mo77016E(context));
    }

    /* renamed from: y */
    public abstract String mo77017y();

    /* renamed from: z */
    public boolean mo77020z() {
        return this.f241220g;
    }
}
