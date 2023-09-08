package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.EmptyResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.p */
public final class C55489p extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.p$a */
    public static final class C55490a<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C55489p f158076a;

        public C55490a(C55489p pVar) {
            this.f158076a = pVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            this.f158076a.finishProcess(new EmptyResult());
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof OpenChannelsCreateContactRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsCreateContact", "handleRequest#OpenChannelsCreateContactTask, request is not OpenChannelsCreateContactRequest");
            return;
        }
        try {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76761Ha(context, (Intent) null, ((OpenChannelsCreateContactRequest) processRequest).f158063d, new C55490a(this));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.JsApiOpenChannelsCreateContact", e, "OpenFinderCreateAccountTask exception", new Object[0]);
            finishProcess(new EmptyResult());
        }
    }
}
