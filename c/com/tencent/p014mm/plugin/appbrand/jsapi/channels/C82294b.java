package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.b */
public class C82294b extends C82297d {
    private static final int CTRL_INDEX = 970;
    private static final String NAME = "openChannelsActivity";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.b$a */
    public static final class C82295a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241217a;

        /* renamed from: b */
        public final /* synthetic */ int f241218b;

        /* renamed from: c */
        public final /* synthetic */ C82294b f241219c;

        public C82295a(C82381f fVar, int i, C82294b bVar) {
            this.f241217a = fVar;
            this.f241218b = i;
            this.f241219c = bVar;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            String str;
            OpenFinderFeedResult openFinderFeedResult = (OpenFinderFeedResult) processResult;
            if (openFinderFeedResult == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "onReceiveResult#IProcessResultReceiver, result is null");
                return;
            }
            int ordinal = openFinderFeedResult.f241209d.ordinal();
            if (ordinal == 0) {
                int i = openFinderFeedResult.f241210e;
                Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "onReceiveResult#IProcessResultReceiver, errCode: " + i);
                C82381f fVar = this.f241217a;
                int i2 = this.f241218b;
                if (i == 0) {
                    str = this.f241219c.mo115109j("ok");
                } else {
                    C82294b bVar = this.f241219c;
                    bVar.getClass();
                    str = bVar.mo115109j("fail:internal error");
                }
                fVar.mo109647a(i2, str);
            } else if (ordinal == 1) {
                C82294b bVar2 = this.f241219c;
                JSONObject jSONObject = openFinderFeedResult.f241211f;
                bVar2.getClass();
                try {
                    jSONObject.put("feedId", jSONObject.optString("feedID"));
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "preProcessNavigateBackInfo, fail since " + e);
                }
                C82381f fVar2 = this.f241217a;
                C87412m.m108594g(fVar2, "component");
                C87412m.m108594g(jSONObject, "navigateBackInfo");
                Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "dispatch#JsEventOnNavigateBackFromChannelsActivity, navigateBackInfo: " + jSONObject);
                C82306o oVar = new C82306o();
                oVar.mo115194p(fVar2);
                oVar.f242407f = jSONObject.toString();
                oVar.mo115158h();
            }
        }
    }

    /* renamed from: D */
    public boolean mo77015D(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "extInfoJsonObj");
        try {
            jSONObject.put("feedID", jSONObject.optString("feedId"));
            jSONObject.put("nonceID", jSONObject.optString("nonceId"));
            jSONObject.put("shareScene", 18);
            return true;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "preProcessExtInfo, fail since " + e);
            return false;
        }
    }

    /* renamed from: x */
    public void mo114705x(C82381f fVar, int i, Context context, JSONObject jSONObject) {
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jSONObject, "extInfoWrapperJsonObj");
        C81956c.m100675c(context, new OpenFinderFeedRequest(jSONObject), new C82295a(fVar, i, this), (Intent) null);
    }

    /* renamed from: y */
    public String mo77017y() {
        return "openFinderFeed";
    }
}
