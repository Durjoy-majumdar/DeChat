package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82543i5;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import kr0.C88262c1;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.k */
public final class C6261k extends C15053a {

    /* renamed from: d */
    public static final C6261k f23056d = new C6261k();

    /* renamed from: e */
    public static final int f23057e = JsApiPauseDownloadTask.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23058f = C82543i5.NAME;

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String f = C43471q.m46982f(h1Var.f38983a, "username");
        String f2 = C43471q.m46982f(h1Var.f38983a, "appId");
        String f3 = C43471q.m46982f(h1Var.f38983a, "path");
        int e = C43471q.m46981e(h1Var.f38983a, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        boolean z = false;
        if (f == null || f.length() == 0) {
            if (f2 == null || f2.length() == 0) {
                z = true;
            }
            if (z) {
                C13849g gVar = jVar.f39001d;
                String str = h1Var.f38990c;
                gVar.mo10774a(str, f23058f + ":fail invalid data", (Map<String, Object>) null);
                return true;
            }
        }
        ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113581Re(f, f2, f3, e);
        C13849g gVar2 = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar2.mo10774a(str2, f23058f + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23057e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23058f;
    }
}
