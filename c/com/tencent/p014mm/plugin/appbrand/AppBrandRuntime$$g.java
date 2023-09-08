package com.tencent.p014mm.plugin.appbrand;

import android.content.res.Configuration;
import android.os.MessageQueue;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$g */
public class AppBrandRuntime$$g implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ Configuration f238176d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntime f238177e;

    public AppBrandRuntime$$g(AppBrandRuntime appBrandRuntime, Configuration configuration) {
        this.f238177e = appBrandRuntime;
        this.f238176d = configuration;
    }

    public boolean queueIdle() {
        AppBrandRuntime.m99065f(this.f238177e, this.f238176d);
        return false;
    }
}
