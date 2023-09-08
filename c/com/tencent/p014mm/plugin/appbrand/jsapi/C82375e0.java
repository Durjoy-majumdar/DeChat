package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p773yy.C66708h;
import qy2.C63349b0;
import qy2.C77444c0;
import uz2.C65489g0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e0 */
public final class C82375e0 extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e0$a */
    public static final class C82376a implements C63349b0 {

        /* renamed from: a */
        public final /* synthetic */ C82375e0 f241428a;

        public C82376a(C82375e0 e0Var) {
            this.f241428a = e0Var;
        }

        public void onFinishAction(int i, String str, C65489g0 g0Var) {
            C82375e0 e0Var = this.f241428a;
            PublishTextStatusResult publishTextStatusResult = new PublishTextStatusResult();
            publishTextStatusResult.f240481d = i;
            publishTextStatusResult.f240482e = str;
            publishTextStatusResult.f240483f = g0Var != null ? g0Var.toByteArray() : null;
            e0Var.finishProcess(publishTextStatusResult);
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof DoPublishTextStatusRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "handleRequest, request is not DoSetTextStatusRequest");
            return;
        }
        Log.m105924i("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "handleRequest, publishTextStatus");
        C77444c0 c0Var = new C77444c0((C77444c0.C77445a) null);
        DoPublishTextStatusRequest doPublishTextStatusRequest = (DoPublishTextStatusRequest) processRequest;
        c0Var.f229426n = doPublishTextStatusRequest.f240380d.f240480e;
        c0Var.f229425j = doPublishTextStatusRequest.f240380d.f240479d + "@weapp";
        ((C66708h) C86312j.m106911c(C66708h.class)).mo90745uq(getActivityContext(), c0Var, new C82376a(this));
    }
}
