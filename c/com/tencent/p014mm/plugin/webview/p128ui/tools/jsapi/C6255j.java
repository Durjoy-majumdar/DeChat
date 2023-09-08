package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.wxmm.v2helper;
import gy3.C87412m;
import java.util.Map;
import ke3.C88144b;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.j */
public final class C6255j extends C15053a {

    /* renamed from: d */
    public static final C6255j f23041d = new C6255j();

    /* renamed from: e */
    public static final int f23042e = v2helper.EMethodOutputVolumeScaleEnable;

    /* renamed from: f */
    public static final String f23043f = "openStoreEmoticonDetailPage";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Object obj = h1Var.f38983a.get("productId");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            C13849g gVar = jVar.f39001d;
            String str2 = h1Var.f38990c;
            StringBuilder sb = new StringBuilder();
            C6250i.f23029d.getClass();
            sb.append(C6250i.f23031f);
            sb.append(":fail empty productId");
            gVar.mo10774a(str2, sb.toString(), (Map<String, Object>) null);
        } else {
            Intent intent = new Intent();
            intent.putExtra("extra_id", str);
            intent.putExtra("preceding_scence", 12);
            intent.putExtra("download_entrance_scene", 12);
            C88144b.m109791i(jVar.f38998a, "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
            C13849g gVar2 = jVar.f39001d;
            String str3 = h1Var.f38990c;
            gVar2.mo10774a(str3, f23043f + ":ok", (Map<String, Object>) null);
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23042e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23043f;
    }
}
