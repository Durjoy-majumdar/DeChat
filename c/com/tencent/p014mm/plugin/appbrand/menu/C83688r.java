package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C83714o2;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C86491q2;
import java.util.concurrent.atomic.AtomicBoolean;
import lp0.C88619a;
import nj3.C76874e0;
import p003ay.C0235b;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.r */
public class C83688r extends C88619a<C83928t1> {

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.r$a */
    public static final class C83689a extends C86491q2 {
        /* renamed from: a */
        public String mo56580a() {
            return "MicroMsg.MenuDelegate_SendToDesktop.ConfigMigration";
        }

        /* renamed from: b */
        public boolean mo56581b(int i) {
            return true;
        }

        /* renamed from: c */
        public void mo56582c(int i) {
            if (!PluginAppBrand.getProcessSharedPrefs().contains("key_sendtodesktop_no_more_show_permission_notify_dialog")) {
                try {
                    PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", C81161g2.m99451h1().mo61553Lo("key_sendtodesktop_no_more_show_permission_notify_dialog", "0").equals("1")).apply();
                } catch (Throwable th) {
                    Log.m105921e("MicroMsg.MenuDelegate_SendToDesktop", "SendToDesktopConfigToMMKVMigration.transfer() error=%s", th);
                }
            }
        }
    }

    public C83688r() {
        super(11);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        if (((C83928t1) d1Var).getRuntime().mo121253n1().f245533f != 1023) {
            e0Var.mo107146h(this.f255896a, context.getString(C0966R.string.f7859u6), C0966R.raw.appbrand_menu_send_to_desktop, 0);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        Context context2 = context;
        C83928t1 t1Var = (C83928t1) d1Var;
        Class cls = C0235b.class;
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        AppBrandInitConfigWC M1 = t1Var.getRuntime().mo113210l1();
        String str2 = M1.f234839s;
        if (context2 == null || TextUtils.isEmpty(str2)) {
            Log.m105924i("MicroMsg.MenuDelegate_SendToDesktop", "performItemClick failed, context or username is null or nil.");
        } else if (!t1Var.isRunning() || t1Var.getRuntime().mo113064k0()) {
            Log.m105924i("MicroMsg.MenuDelegate_SendToDesktop", "performItemClick failed, pageView destroyed");
        } else {
            AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) t1Var.mo109671p(AppBrandSysConfigWC.class);
            C83714o2.C83715a aVar = new C83714o2.C83715a(M1.f234818T, appBrandSysConfigWC.f234878T0, M1.f239363e, appBrandSysConfigWC.f261062e, str2);
            boolean z = PluginAppBrand.getProcessSharedPrefs().getBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", false);
            C83714o2.C83715a aVar2 = aVar;
            Pair<Integer, Integer> CY = ((C0235b) C86312j.m106911c(cls)).mo258CY(context, str, z, true, new C83686p(this));
            C115669n.INSTANCE.mo160131h(15782, CY.second, 0, str);
            int i = S1.f261072r.f238585d;
            int intValue = ((Integer) CY.first).intValue();
            int intValue2 = ((Integer) CY.second).intValue();
            String[] strArr = aVar2.f244359b;
            if (strArr == null) {
                Log.m105920e("MicroMsg.AppBrandShortcutManager", "no such user");
            } else {
                Intent c = C83714o2.m102753c(context2, aVar2, i, C83714o2.m102755e(context2, C83714o2.m102754d(strArr), i), false);
                if (c == null) {
                    Log.m105920e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
                } else {
                    ((C0235b) C86312j.m106911c(cls)).mo257AZ(context2, c);
                    Log.m105925i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", aVar2.f244362e);
                }
            }
            MMHandlerThread.postToMainThread(new C83687q(this, new AtomicBoolean(false), context, aVar2, i, intValue, intValue2, z));
            C84240s.m103840f(str, t1Var.mo116162Q0(), 14, "", Util.nowSecond(), 1, 0);
        }
    }
}
