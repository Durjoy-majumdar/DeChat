package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.q */
public final class C55491q extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.q$a */
    public static final class C55492a<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C55491q f158077a;

        public C55492a(C55491q qVar) {
            this.f158077a = qVar;
        }

        /* renamed from: a */
        public final void mo6382a(Object obj) {
            this.f158077a.finishProcess(new OpenChannelsLiveCollectionResult(0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.q$b */
    public static final class C55493b<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C55491q f158078a;

        public C55493b(C55491q qVar) {
            this.f158078a = qVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            C55491q qVar = this.f158078a;
            C87412m.m108593f(num, "ret");
            qVar.finishProcess(new OpenChannelsLiveCollectionResult(num.intValue()));
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof OpenChannelsLiveCollectionRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "handleRequest#EnterFinderTask, request is not EnterFinderRequest");
            return;
        }
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            t1Var.mo76896xh(activityContext, ((OpenChannelsLiveCollectionRequest) processRequest).f158064d, new C55492a(this), new C55493b(this), (C60216z4.C8821a<JSONObject>) null);
        }
    }
}
