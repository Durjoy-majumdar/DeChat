package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C55465d;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.g */
public final class C55481g extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 1044;
    private static final String NAME = "openChannelsLiveCollection";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.g$a */
    public static final class C55482a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f158068a;

        /* renamed from: b */
        public final /* synthetic */ int f158069b;

        /* renamed from: c */
        public final /* synthetic */ C55481g f158070c;

        public C55482a(C82381f fVar, int i, C55481g gVar) {
            this.f158068a = fVar;
            this.f158069b = i;
            this.f158070c = gVar;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            OpenChannelsLiveCollectionResult openChannelsLiveCollectionResult = (OpenChannelsLiveCollectionResult) processResult;
            if (openChannelsLiveCollectionResult == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "onReceiveResult#IProcessResultReceiver, result is null");
                return;
            }
            int i = openChannelsLiveCollectionResult.f158065d;
            Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "onReceiveResult#IProcessResultReceiver, errCode: " + i);
            this.f158068a.mo109647a(this.f158069b, i == 0 ? this.f158070c.mo115109j("ok") : this.f158070c.mo115109j("fail:internal error"));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "invoke, env is null");
            return;
        }
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "invoke, context is null");
            fVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "invoke, data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("action", "openFinderMultiMoreLive");
                jSONObject2.put("extInfo", jSONObject);
                String jSONObject3 = jSONObject2.toString();
                C87412m.m108593f(jSONObject3, "openChannelsParamsJsonObj.toString()");
                C81956c.m100675c(context, new OpenChannelsLiveCollectionRequest(jSONObject3), new C55482a(fVar, i, this), C55465d.m63113a(context));
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "invoke, put fail since " + e);
                fVar.mo109647a(i, mo115109j("fail:internal error"));
            }
        }
    }
}
