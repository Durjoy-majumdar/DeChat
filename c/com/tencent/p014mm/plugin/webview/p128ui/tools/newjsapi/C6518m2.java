package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.m2 */
public final class C6518m2 extends C15053a implements MMActivity.C6739d {

    /* renamed from: d */
    public static final C6518m2 f23655d = new C6518m2();

    /* renamed from: e */
    public static final String f23656e = "MicroMsg.JsApiRequestVertifyPwd";

    /* renamed from: f */
    public static final int f23657f = 208;

    /* renamed from: g */
    public static final int f23658g = 398;

    /* renamed from: h */
    public static final String f23659h = "verifiyWXPassword";

    /* renamed from: i */
    public static C13855j f23660i;

    /* renamed from: j */
    public static C13851h1 f23661j;

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i(f23656e, "JsApiRequestVerifyPwd");
        f23660i = jVar;
        f23661j = h1Var;
        Context context = jVar.f38998a;
        if (context instanceof MMActivity) {
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).mmSetOnActivityResultCallback(this);
        }
        Intent intent = new Intent();
        intent.setClassName(jVar.f38998a, "com.tencent.mm.plugin.account.ui.VerifyPwdUI");
        intent.putExtra("key_scenen", 0);
        Context context2 = jVar.f38998a;
        if (!(context2 instanceof MMActivity)) {
            return true;
        }
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) context2).startActivityForResult(intent, f23657f);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23658g;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23659h;
    }

    /* renamed from: e */
    public final void mo7504e(C13855j jVar, C13851h1 h1Var, int i, Map<String, ? extends Object> map) {
        if (jVar != null && h1Var != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("err_code", Integer.valueOf(i));
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            String str = i == 0 ? "ok" : "unknown error";
            C13849g gVar = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar.mo10774a(str2, h1Var.f38996i + XVFSFile.PATH_SEPARATOR_CHAR + str, linkedHashMap);
        }
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        String str = f23656e;
        StringBuilder sb = new StringBuilder();
        sb.append("JsApiRequestVerifyPwd onActivityResult requestCode: ");
        sb.append(i);
        sb.append(", resultCode: ");
        sb.append(i2);
        sb.append(", data: ");
        sb.append(intent == null);
        Log.m105918d(str, sb.toString());
        if (i2 == -1 && intent != null && i == f23657f) {
            String stringExtra = intent.getStringExtra("key_ticket");
            HashMap hashMap = new HashMap();
            if (stringExtra == null) {
                stringExtra = "";
            }
            hashMap.put("ticket", stringExtra);
            hashMap.put("sucessful", "true");
            mo7504e(f23660i, f23661j, 0, hashMap);
            return;
        }
        mo7504e(f23660i, f23661j, -1, (Map<String, ? extends Object>) null);
    }
}
