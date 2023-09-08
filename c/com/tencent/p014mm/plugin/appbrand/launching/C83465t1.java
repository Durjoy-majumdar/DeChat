package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.t1 */
public class C83465t1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f243896d;

    /* renamed from: e */
    public final /* synthetic */ ILaunchWxaAppInfoNotify.PluginIpcWrapper f243897e;

    public C83465t1(AppBrandRuntimeWC appBrandRuntimeWC, ILaunchWxaAppInfoNotify.PluginIpcWrapper pluginIpcWrapper) {
        this.f243896d = appBrandRuntimeWC;
        this.f243897e = pluginIpcWrapper;
    }

    public void run() {
        this.f243896d.f251968f1.mo125136k(this.f243897e.f243346f);
    }
}
