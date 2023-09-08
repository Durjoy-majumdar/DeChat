package com.tencent.p014mm.plugin.appbrand.menu;

import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p003ay.C0235b;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.p */
public class C83686p implements C0235b.C0236a {
    public C83686p(C83688r rVar) {
    }

    /* renamed from: a */
    public void mo270a(boolean z, String str, int i) {
        if (z) {
            C115669n.INSTANCE.mo160131h(15789, Integer.valueOf(i), 0, str);
            PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", true).apply();
        }
    }
}
