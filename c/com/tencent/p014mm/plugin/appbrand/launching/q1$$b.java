package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.q1$$b */
public final /* synthetic */ class q1$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f243854d;

    /* renamed from: e */
    public final /* synthetic */ ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper f243855e;

    public /* synthetic */ q1$$b(AppBrandRuntimeWC appBrandRuntimeWC, ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper launchInfoIpcWrapper) {
        this.f243854d = appBrandRuntimeWC;
        this.f243855e = launchInfoIpcWrapper;
    }

    public final void run() {
        this.f243854d.mo113190U1(this.f243855e.f243343f.f234900i.f234901d);
    }
}
