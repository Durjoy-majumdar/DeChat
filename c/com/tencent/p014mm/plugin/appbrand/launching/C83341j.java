package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.j */
public class C83341j implements Runnable {

    /* renamed from: d */
    public final AppBrandLaunchReferrer f243536d;

    /* renamed from: e */
    public final C83342a f243537e;

    /* renamed from: f */
    public final int f243538f;

    /* renamed from: g */
    public final int f243539g;

    /* renamed from: h */
    public volatile String f243540h;

    /* renamed from: i */
    public volatile String f243541i;

    /* renamed from: j */
    public final String f243542j;

    /* renamed from: n */
    public AppBrandStatObject f243543n;

    /* renamed from: o */
    public final ActivityStarterIpcDelegate f243544o;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.j$a */
    public interface C83342a<T extends AppBrandInitConfigLU> {
        /* renamed from: a */
        void mo115495a(T t, AppBrandStatObject appBrandStatObject, int i);
    }

    public C83341j(LaunchParcel launchParcel, C83342a aVar) {
        this.f243537e = aVar;
        this.f243538f = launchParcel.f243733g;
        this.f243540h = launchParcel.f243731e;
        this.f243541i = launchParcel.f243730d;
        this.f243539g = launchParcel.f243732f;
        this.f243543n = launchParcel.f243738o;
        this.f243542j = launchParcel.f243735i;
        this.f243544o = launchParcel.f243745v;
        this.f243536d = launchParcel.f243739p;
    }
}
