package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import org.xwalk.core.XWalkEnvironment;
import p1044ub.C90630c;

/* renamed from: com.tencent.mm.plugin.appbrand.page.s */
public class C83908s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90630c f244972d;

    public C83908s(C83897r rVar, C90630c cVar) {
        this.f244972d = cVar;
    }

    public void run() {
        String str = this.f244972d.getRuntime().mo113036W().f234839s;
        if (!Util.isNullOrNil(str)) {
            Intent putExtra = new Intent(this.f244972d.getContext(), AppBrandAuthorizeUI.class).putExtra("key_username", str);
            putExtra.putExtra("key_app_authorize_profile", true);
            C88144b.m109791i(this.f244972d.getContext(), XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandAuthorizeUI", putExtra, (Bundle) null);
            C84240s.m103840f(this.f244972d.getAppId(), this.f244972d.mo116162Q0(), 34, "", Util.nowSecond(), 1, 0);
        }
    }
}
