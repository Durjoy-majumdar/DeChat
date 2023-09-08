package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.a */
public final class C82015a extends AppBrandProxyUIProcessTask {
    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof AddTagWhenFavRequest)) {
            Log.m105928w("MicroMsg.AppBrand.AddToFavoritesCommons", "handleRequest#AddTagWhenFavTask, request is not AddTagWhenFavRequest");
            return;
        }
        FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        aVar.f264835a = 35;
        aVar.f264842h = getActivityContext();
        favoriteOperationEvent.publish();
        finishProcess(new EmptyResult());
    }
}
