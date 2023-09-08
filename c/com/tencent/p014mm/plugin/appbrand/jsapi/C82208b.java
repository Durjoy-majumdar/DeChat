package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b */
public final class C82208b {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b$a */
    public static final class C82209a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public static final C82209a<R> f241083a = new C82209a<>();

        public /* bridge */ /* synthetic */ void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            EmptyResult emptyResult = (EmptyResult) processResult;
        }
    }

    /* renamed from: a */
    public static final void m100935a(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C81956c.m100675c(activity, new AddTagWhenFavRequest(), C82209a.f241083a, (Intent) null);
    }
}
