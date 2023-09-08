package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o2 */
public final class C6535o2 extends C15053a {

    /* renamed from: d */
    public static final C6535o2 f23696d = new C6535o2();

    /* renamed from: e */
    public static final int f23697e = 218;

    /* renamed from: f */
    public static final String f23698f = "setBounceBackground";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String d = C44625c2.m49071d((String) ((HashMap) h1Var.f38983a).get("wxbackgroundColor"));
        if (Util.isNullOrNil(d)) {
            d = (String) ((HashMap) h1Var.f38983a).get("backgroundColor");
        }
        try {
            int c = C6600v.m6908c(d, jVar.f38998a.getResources().getColor(C0966R.color.akq));
            Context context = jVar.f38998a;
            if (context instanceof WebViewUI) {
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                ((WebViewUI) context).f118531h2.mo68762g(c);
            }
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, f23698f + ":ok", (Map<String, Object>) null);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiSetBounceBackground", e, "setBounceBackground exception", new Object[0]);
            C13849g gVar2 = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar2.mo10774a(str2, f23698f + ":fail", (Map<String, Object>) null);
            return true;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23697e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23698f;
    }
}
