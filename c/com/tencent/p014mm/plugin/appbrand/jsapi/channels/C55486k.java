package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.EmptyResult;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.k */
public class C55486k<CONTEXT extends C82381f> extends C82268c<CONTEXT> {
    private static final int CTRL_INDEX = 1065;
    private static final String NAME = "openChannelsTopic";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.k$a */
    public static final class C55487a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ CONTEXT f158073a;

        /* renamed from: b */
        public final /* synthetic */ int f158074b;

        /* renamed from: c */
        public final /* synthetic */ C55486k<CONTEXT> f158075c;

        public C55487a(CONTEXT context, int i, C55486k<CONTEXT> kVar) {
            this.f158073a = context;
            this.f158074b = i;
            this.f158075c = kVar;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            EmptyResult emptyResult = (EmptyResult) processResult;
            Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "onReceiveResult#IProcessResultReceiver");
            CONTEXT context = this.f158073a;
            int i = this.f158074b;
            C55486k<CONTEXT> kVar = this.f158075c;
            kVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            context.mo109647a(i, kVar.mo115115p("ok", jSONObject));
        }
    }

    /* renamed from: u */
    public void mo1505u(CONTEXT context, JSONObject jSONObject, int i) {
        C87412m.m108594g(context, "env");
        Context context2 = context.getContext();
        if (context2 == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "invoke, context is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            context.mo109647a(i, mo115115p("fail:internal error", jSONObject2));
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("entryScene", 15);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("appid", context.getAppId());
            jSONObject4.put("appname", mo77021w(context));
            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, jSONObject4);
        } catch (Exception e2) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "invoke, put report info fail since " + e2);
        }
        jSONObject3.put("extInfo", jSONObject);
        String jSONObject5 = jSONObject3.toString();
        C87412m.m108593f(jSONObject5, "openChannelsParamsJsonObj.toString()");
        Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "invoke, openChannelsParams: " + jSONObject5);
        C81956c.m100675c(context2, new OpenChannelsTopicRequest(jSONObject5), new C55487a(context, i, this), (Intent) null);
    }

    /* renamed from: w */
    public String mo77021w(C82381f fVar) {
        C87412m.m108594g(fVar, "env");
        return "";
    }
}
