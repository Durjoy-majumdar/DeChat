package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.ipcinvoker.C80936x;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$k */
public class AppBrandRuntime$$k implements C80936x {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntime f238183a;

    public AppBrandRuntime$$k(AppBrandRuntime appBrandRuntime) {
        this.f238183a = appBrandRuntime;
    }

    /* renamed from: a */
    public void mo112721a() {
        this.f238183a.f238103A.set(true);
        this.f238183a.getClass();
        Log.m105925i("MicroMsg.AppBrandRuntime", "onDisconnect: appId=[%s]", this.f238183a.f238147j);
    }
}
