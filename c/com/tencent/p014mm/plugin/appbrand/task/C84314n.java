package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService4MM;
import com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService4MM;
import com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService4MM;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI4MM;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI4MM;

/* renamed from: com.tencent.mm.plugin.appbrand.task.n */
public final class C84314n extends C84310k {
    public C84314n() {
        super(AppBrandUI4MM.class, AppBrandPluginUI4MM.class, AppBrandKeepAliveService4MM.class, AppBrandForegroundNotificationService4MM.class, AppBrandProcessTriggerService4MM.class, AppBrandPreLoadingUI.class);
        mo111373s((LuggageServiceType) null);
    }
}
