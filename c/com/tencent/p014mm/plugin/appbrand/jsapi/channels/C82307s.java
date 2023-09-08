package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import org.json.JSONObject;
import te3.C50575np1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.s */
public final class C82307s extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.s$a */
    public static final class C82308a<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C82307s f241231a;

        public C82308a(C82307s sVar) {
            this.f241231a = sVar;
        }

        /* renamed from: a */
        public final void mo6382a(Object obj) {
            C50575np1 np12 = obj instanceof C50575np1 ? (C50575np1) obj : null;
            int i = np12 != null ? 0 : -1;
            Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "succCallback#handleRequest#OpenChannelsRewardedVideoAdTask, errCode: " + i);
            this.f241231a.finishProcess(new OpenChannelsRewardedVideoAdResult(i, np12));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.s$b */
    public static final class C82309b<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C82307s f241232a;

        public C82309b(C82307s sVar) {
            this.f241232a = sVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "failedCallback#handleRequest#OpenChannelsRewardedVideoAdTask, errCode: " + num);
            C82307s sVar = this.f241232a;
            C87412m.m108593f(num, "errCode");
            sVar.finishProcess(new OpenChannelsRewardedVideoAdResult(num.intValue(), (C50575np1) null));
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof OpenChannelsRewardedVideoAdRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "handleRequest#OpenChannelsRewardedVideoAdTask, request is not OpenChannelsRewardedVideoAdRequest");
            return;
        }
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            t1Var.mo76896xh(activityContext, ((OpenChannelsRewardedVideoAdRequest) processRequest).f241205d, new C82308a(this), new C82309b(this), (C60216z4.C8821a<JSONObject>) null);
        }
    }
}
