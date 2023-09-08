package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C50575np1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.j */
public final class C82301j extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 1001;
    private static final String NAME = "openChannelsRewardedVideoAd";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.j$a */
    public static final class C82302a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241225a;

        /* renamed from: b */
        public final /* synthetic */ int f241226b;

        /* renamed from: c */
        public final /* synthetic */ C82301j f241227c;

        public C82302a(C82381f fVar, int i, C82301j jVar) {
            this.f241225a = fVar;
            this.f241226b = i;
            this.f241227c = jVar;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            OpenChannelsRewardedVideoAdResult openChannelsRewardedVideoAdResult = (OpenChannelsRewardedVideoAdResult) processResult;
            if (openChannelsRewardedVideoAdResult == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, result is null");
                return;
            }
            int i = openChannelsRewardedVideoAdResult.f241206d;
            C50575np1 np12 = openChannelsRewardedVideoAdResult.f241207e;
            Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, errCode: " + i);
            if (i != 0) {
                this.f241225a.mo109647a(this.f241226b, this.f241227c.mo115109j("fail:internal error"));
                return;
            }
            JSONArray jSONArray = null;
            if ((np12 != null ? np12.f138713e : null) == null) {
                Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, feedbackInfo is null");
                this.f241225a.mo109647a(this.f241226b, this.f241227c.mo115109j("ok"));
                return;
            }
            try {
                jSONArray = new JSONArray(np12.f138713e);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, parse feedbackInfo fail since " + e);
            }
            if (jSONArray == null) {
                this.f241225a.mo109647a(this.f241226b, this.f241227c.mo115109j("ok"));
            } else {
                this.f241225a.mo109647a(this.f241226b, this.f241227c.mo115112m("ok", C90364q0.m113146e(new C13604l("rewardedDuration", Integer.valueOf(np12.f138712d)), new C13604l("feedbackInfo", jSONArray))));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, env is null");
        } else if (fVar.getContext() == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, context is null");
            fVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("action", NAME);
                jSONObject2.put("extInfo", jSONObject);
                String jSONObject3 = jSONObject2.toString();
                C87412m.m108593f(jSONObject3, "openChannelsParamsJsonObj.toString()");
                C81956c.m100675c(fVar.getContext(), new OpenChannelsRewardedVideoAdRequest(jSONObject3), new C82302a(fVar, i, this), (Intent) null);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, put fail since " + e);
                fVar.mo109647a(i, mo115109j("fail:internal error"));
            }
        }
    }
}
