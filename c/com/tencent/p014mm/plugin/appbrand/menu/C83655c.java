package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82367d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82372d7;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82555k0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83039u;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import lp0.C88619a;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.c */
public class C83655c extends C88619a<C83928t1> {

    /* renamed from: b */
    public static final C83656a f244277b = new C83656a();

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.c$a */
    public static class C83656a implements C82555k0 {

        /* renamed from: a */
        public String f244278a = "";

        /* renamed from: b */
        public String f244279b = "";

        /* renamed from: a */
        public void mo114878a(String str) {
            Log.m105925i("MicroMsg.MenuDelegate_CopyPath", "onReturnUrl %s", str);
            C84240s.m103840f(this.f244278a, this.f244279b, 26, "", Util.nowSecond(), str.isEmpty() ? 2 : 1, 0);
            C82372d7.f241423a.mo114778c(C82367d0.PAGE_PATH, this);
        }
    }

    public C83655c() {
        super(0);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        AppBrandSysConfigWC S1 = ((C83928t1) d1Var).getRuntime().mo113213o1();
        long currentTimeMillis = System.currentTimeMillis();
        long j = S1.f234874R0;
        boolean z = false;
        Log.m105925i("MicroMsg.MenuDelegate_CopyPath", "current time = %d , expire time = %d, time interval in seconds = %d", Long.valueOf(currentTimeMillis), Long.valueOf(j), Long.valueOf((j - currentTimeMillis) / 1000));
        if (System.currentTimeMillis() > j) {
            z = true;
        }
        int ordinal = (!z ? C83700z.SHOW_CLICKABLE : C83700z.HIDDEN).ordinal();
        if (ordinal == 1) {
            e0Var.mo107144g(this.f255896a, context.getString(C0966R.string.f7643me), C0966R.raw.app_brand_menu_copy_path);
        } else if (ordinal == 2) {
            e0Var.mo107151k(this.f255896a, context.getString(C0966R.string.f7643me), C0966R.raw.app_brand_menu_copy_path, true);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C83656a aVar = f244277b;
        aVar.f244278a = str;
        aVar.f244279b = t1Var.mo116162Q0();
        C82372d7.f241423a.mo114777b(C82367d0.PAGE_PATH, 10000, aVar);
        new C83039u(false).mo115295s(t1Var.getComponentId(), t1Var.mo116160O0());
    }
}
