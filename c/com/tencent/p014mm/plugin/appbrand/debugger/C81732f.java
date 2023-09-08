package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appcache.C29199d3;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.f */
public final class C81732f implements C29199d3.C29201d, DebuggerShell.C81694b {
    /* renamed from: a */
    public void mo56728a(Intent intent) {
        String stringExtra = intent.getStringExtra("appId");
        if (!TextUtils.isEmpty(stringExtra)) {
            int intExtra = intent.getIntExtra("versionType", 0);
            AppBrandProcessesManager I = AppBrandProcessesManager.m103869I();
            Objects.requireNonNull(stringExtra);
            I.mo111407t(stringExtra, intExtra);
        }
    }

    /* renamed from: b */
    public void mo56511b(String str, Map<String, String> map) {
        if (DebuggerShell.f239772d) {
            String str2 = map.get(".sysmsg.AppBrandForceKill.AppId");
            int i = Util.getInt(map.get(".sysmsg.AppBrandForceKill.VersionType"), 0);
            if (!Util.isNullOrNil(str2)) {
                AppBrandProcessesManager.m103869I().mo111407t(str2, i);
            }
        }
    }

    public String name() {
        return "ForceKillAppNotify";
    }
}
