package com.tencent.p014mm.plugin.appbrand.launching;

import al0.C79587a;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.r1 */
public class C83452r1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f243867d;

    /* renamed from: e */
    public final /* synthetic */ ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper f243868e;

    public C83452r1(AppBrandRuntimeWC appBrandRuntimeWC, ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper launchInfoIpcWrapper) {
        this.f243867d = appBrandRuntimeWC;
        this.f243868e = launchInfoIpcWrapper;
    }

    public void run() {
        this.f243867d.f251968f1.mo125135j(this.f243868e.f243343f.f234895d);
        if (!TextUtils.isEmpty(this.f243868e.f243343f.f234897f)) {
            new C79587a().mo109702p(this.f243867d, this.f243868e.f243343f.f234897f);
        }
    }
}
