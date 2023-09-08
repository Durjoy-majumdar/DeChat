package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.s */
public class C83457s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WxaPkgWrappingInfo f243877d;

    public C83457s(AppBrandPrepareTask appBrandPrepareTask, WxaPkgWrappingInfo wxaPkgWrappingInfo) {
        this.f243877d = wxaPkgWrappingInfo;
    }

    public void run() {
        Log.m105925i("MicroMsg.AppBrandPrepareTask", "runInClientProcess, prepare done, appPkg [%d | %s]", Integer.valueOf(this.f243877d.pkgVersion), Util.formatUnixTime(this.f243877d.f238586e));
    }
}
