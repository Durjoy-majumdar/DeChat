package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import kr0.C76630x0;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.k */
public final class C40438k implements DebuggerShell.C81694b {
    /* renamed from: a */
    public void mo56728a(Intent intent) {
        String stringExtra = intent.getStringExtra("username");
        String stringExtra2 = intent.getStringExtra("appId");
        String stringExtra3 = intent.getStringExtra("path");
        int i = Util.getInt(intent.getStringExtra("versionType"), 0);
        int i2 = Util.getInt(intent.getStringExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 1030);
        String stringExtra4 = intent.getStringExtra("sceneNote");
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = i2;
        appBrandStatObject.f245534g = stringExtra4;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(MMApplicationContext.getContext(), stringExtra, stringExtra2, i, 0, stringExtra3, appBrandStatObject);
    }

    public String name() {
        return "LaunchApp";
    }
}
