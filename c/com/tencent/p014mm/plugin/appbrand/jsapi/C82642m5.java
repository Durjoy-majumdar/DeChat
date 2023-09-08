package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import rx3.C13598b0;
import uz2.C65489g0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.m5 */
public final class C82642m5<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

    /* renamed from: a */
    public final /* synthetic */ C32228q<Integer, String, C65489g0, C13598b0> f241803a;

    public C82642m5(C32228q<? super Integer, ? super String, ? super C65489g0, C13598b0> qVar) {
        this.f241803a = qVar;
    }

    public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        C65489g0 g0Var;
        PublishTextStatusResult publishTextStatusResult = (PublishTextStatusResult) processResult;
        if (publishTextStatusResult.f240483f != null) {
            g0Var = new C65489g0();
            g0Var.parseFrom(publishTextStatusResult.f240483f);
        } else {
            g0Var = null;
        }
        Log.m105924i("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "onReceiveResult, publishTextStatus done," + publishTextStatusResult.f240481d + ' ' + publishTextStatusResult.f240482e + ' ' + g0Var);
        this.f241803a.invoke(Integer.valueOf(publishTextStatusResult.f240481d), publishTextStatusResult.f240482e, g0Var);
    }
}
