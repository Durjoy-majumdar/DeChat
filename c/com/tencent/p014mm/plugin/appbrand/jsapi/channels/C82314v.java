package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.v */
public final class C82314v extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.v$a */
    public static final class C82315a<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C82314v f241237a;

        public C82315a(C82314v vVar) {
            this.f241237a = vVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            Log.m105924i("MicroMsg.AppBrand.JsApiReserveChannelsLive", "onCallback#successCallback, state: " + num);
            C82314v vVar = this.f241237a;
            C87412m.m108593f(num, "state");
            vVar.finishProcess(new ReserveChannelsLiveResult(true, num.intValue()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.v$b */
    public static final class C82316b<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C82314v f241238a;

        public C82316b(C82314v vVar) {
            this.f241238a = vVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            Log.m105924i("MicroMsg.AppBrand.JsApiReserveChannelsLive", "onCallback#failCallback, errCode: " + num);
            C82314v vVar = this.f241238a;
            C87412m.m108593f(num, "errCode");
            vVar.finishProcess(new ReserveChannelsLiveResult(false, num.intValue()));
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof ReserveChannelsLiveRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiReserveChannelsLive", "handleRequest#ReserveChannelsLiveTask, request is not ReserveChannelsLiveRequest");
            return;
        }
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            t1Var.mo76891w7(activityContext, ((ReserveChannelsLiveRequest) processRequest).f241212d, new C82315a(this), new C82316b(this), true);
        }
    }
}
