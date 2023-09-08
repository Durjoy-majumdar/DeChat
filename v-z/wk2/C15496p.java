package wk2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import ke3.C88144b;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;
import z04.C112551y;

/* renamed from: wk2.p */
public final class C15496p extends C15805b {

    /* renamed from: f */
    public static final C15496p f42030f = new C15496p();

    /* renamed from: g */
    public static final String f42031g = "openWebView";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("open_url");
        if (str == null) {
            str = "";
        }
        String str2 = (String) h1Var.f38983a.get("a8keyScene");
        if (str2 == null) {
            str2 = "";
        }
        int safeDecodeInt = Util.safeDecodeInt(str2);
        Log.m105924i("MicroMsg.JsApiOpenWebView", "ScanJsApi-Call doOpenWebView open_url: " + str + "  a8keyScene:" + safeDecodeInt);
        if (C112551y.m153811k(str)) {
            Log.m105920e("MicroMsg.JsApiOpenWebView", "ScanJsApi-Call doOpenWebView param is empty");
            HashMap hashMap = new HashMap();
            hashMap.put("ret", "1");
            C13849g gVar = jVar.f39001d;
            String str3 = h1Var.f38990c;
            gVar.mo10774a(str3, h1Var.f38996i + ":param invalid", hashMap);
        } else {
            boolean z = false;
            try {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                if (safeDecodeInt > 0) {
                    intent.putExtra("geta8key_scene", safeDecodeInt);
                }
                C88144b.m109791i(jVar.f38998a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                z = true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenWebView", e, "", new Object[0]);
            }
            if (z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ret", "0");
                C13849g gVar2 = jVar.f39001d;
                String str4 = h1Var.f38990c;
                gVar2.mo10774a(str4, h1Var.f38996i + ":ok", hashMap2);
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("ret", "1");
                C13849g gVar3 = jVar.f39001d;
                String str5 = h1Var.f38990c;
                gVar3.mo10774a(str5, h1Var.f38996i + ":fail", hashMap3);
            }
        }
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42031g;
    }
}
