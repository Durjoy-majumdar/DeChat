package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import p008bq.C0362f1;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.p */
public final class C6536p extends C15053a {

    /* renamed from: d */
    public static final C6536p f23699d = new C6536p();

    /* renamed from: e */
    public static final String f23700e = "MicroMsg.JsApiEmoticonAPICollection";

    /* renamed from: f */
    public static final int f23701f = 470;

    /* renamed from: g */
    public static final String f23702g = "emoticonAPICollection";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Object obj = h1Var.f38983a.get("md5");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = h1Var.f38983a.get("opType");
        Object obj3 = h1Var.f38983a.get("imageDataString");
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = h1Var.f38983a.get("emojiInfoBuf");
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        String str4 = f23700e;
        Log.m105924i(str4, "handleMsg: md5:" + str + ", opType:" + obj2 + ", imageDataString:" + str2 + ", emojiInfoBuf:" + str3);
        if (str == null || obj2 == null || str2 == null) {
            C13849g gVar = jVar.f39001d;
            String str5 = h1Var.f38990c;
            gVar.mo10774a(str5, h1Var.f38996i + ":fail_missing arguments", (Map<String, Object>) null);
            return true;
        }
        C0362f1 f1Var = (C0362f1) C86312j.m106911c(C0362f1.class);
        if (!f1Var.mo400uO(str, str2)) {
            Log.m105924i(str4, "handleMsg: saveToFile failed");
            C13849g gVar2 = jVar.f39001d;
            String str6 = h1Var.f38990c;
            gVar2.mo10774a(str6, h1Var.f38996i + ":fail_missing arguments", (Map<String, Object>) null);
            return true;
        }
        if (C87412m.m108589b(obj2, "0")) {
            f1Var.mo398Kk(jVar.f38998a, str, str3);
            C13849g gVar3 = jVar.f39001d;
            String str7 = h1Var.f38990c;
            gVar3.mo10774a(str7, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        } else if (C87412m.m108589b(obj2, "1")) {
            f1Var.mo399Zx(jVar.f38998a, str, str3);
            C13849g gVar4 = jVar.f39001d;
            String str8 = h1Var.f38990c;
            gVar4.mo10774a(str8, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        } else {
            C13849g gVar5 = jVar.f39001d;
            String str9 = h1Var.f38990c;
            gVar5.mo10774a(str9, h1Var.f38996i + ":fail_missing arguments", (Map<String, Object>) null);
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23701f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23702g;
    }
}
