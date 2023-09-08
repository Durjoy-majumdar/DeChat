package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.c6 */
public final class C55474c6<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

    /* renamed from: a */
    public final /* synthetic */ C32224a<C13598b0> f158062a;

    public C55474c6(C32224a<C13598b0> aVar) {
        this.f158062a = aVar;
    }

    public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        EmptyResult emptyResult = (EmptyResult) processResult;
        Log.m105924i("MicroMsg.AppBrand.JsApiSetTextStatus", "onReceiveResult, setTextStatus done");
        this.f158062a.invoke();
    }
}
