package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x4 */
public final class C83972x4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83699y f245158d;

    /* renamed from: e */
    public final /* synthetic */ String f245159e;

    public C83972x4(C83699y yVar, String str) {
        this.f245158d = yVar;
        this.f245159e = str;
    }

    public final void run() {
        C83699y yVar = this.f245158d;
        String str = this.f245159e;
        if (yVar != null) {
            yVar.f244320d.mo120964k("share_to_user", str);
        } else {
            Log.m105928w("MicroMsg.AppBrand.WxaMenuHelper", "safeSetString, menuInfo is null, key: share_to_user");
        }
    }
}
