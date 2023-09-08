package com.tencent.p014mm.plugin.appbrand.task;

import android.app.Activity;
import android.app.Service;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.task.l */
public final class C84312l extends C84310k {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84312l(Class<? extends Activity> cls, Class<? extends Activity> cls2, Class<? extends Service> cls3, Class<? extends Service> cls4, Class<? extends Service> cls5, Class<? extends Activity> cls6) {
        super(cls, cls2, cls3, cls4, cls5, cls6);
        C87412m.m108594g(cls, "uiClass");
        C87412m.m108594g(cls2, "pluginUIClass");
        C87412m.m108594g(cls3, "keepAliveServiceClass");
        C87412m.m108594g(cls4, "foregroundServiceClass");
        C87412m.m108594g(cls5, "processTriggerServiceClass");
        C87412m.m108594g(cls6, "appBrandPreLoadingUIClass");
        mo111373s(LuggageServiceType.WASERVICE);
    }
}
