package com.tencent.p014mm.plugin.appbrand.task;

import android.app.Activity;
import android.app.Service;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.task.f0 */
public final class C84288f0 {

    /* renamed from: a */
    public final Class<? extends Activity> f246158a;

    /* renamed from: b */
    public final Class<? extends Activity> f246159b;

    /* renamed from: c */
    public final Class<? extends Service> f246160c;

    /* renamed from: d */
    public final Class<? extends Service> f246161d;

    /* renamed from: e */
    public final Class<? extends Service> f246162e;

    /* renamed from: f */
    public final Class<? extends Activity> f246163f;

    public C84288f0(Class<? extends Activity> cls, Class<? extends Activity> cls2, Class<? extends Service> cls3, Class<? extends Service> cls4, Class<? extends Service> cls5, Class<? extends Activity> cls6) {
        C87412m.m108594g(cls, "uiClass");
        C87412m.m108594g(cls2, "pluginUIClass");
        C87412m.m108594g(cls3, "keepAliveServiceClass");
        C87412m.m108594g(cls4, "foregroundServiceClass");
        C87412m.m108594g(cls5, "processTriggerServiceClass");
        C87412m.m108594g(cls6, "preLoadingUIClass");
        this.f246158a = cls;
        this.f246159b = cls2;
        this.f246160c = cls3;
        this.f246161d = cls4;
        this.f246162e = cls5;
        this.f246163f = cls6;
    }
}
