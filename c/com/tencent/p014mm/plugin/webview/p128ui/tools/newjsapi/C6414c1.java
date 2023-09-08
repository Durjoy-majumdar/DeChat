package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.c1 */
public final class C6414c1 extends C15053a implements MMActivity.C6739d {

    /* renamed from: d */
    public static final C6414c1 f23400d = new C6414c1();

    /* renamed from: e */
    public static final int f23401e = 212;

    /* renamed from: f */
    public static C13855j f23402f;

    /* renamed from: g */
    public static C13851h1 f23403g;

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        f23402f = jVar;
        f23403g = h1Var;
        Log.m105925i("MicroMsg.JsApiOpenCTID", "jsapi call, params:%s", h1Var.f38983a);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
        intent.setFlags(8388608);
        Object obj = h1Var.f38983a.get("orgID");
        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("orgID", (String) obj);
        Object obj2 = h1Var.f38983a.get("appID");
        C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("appID", (String) obj2);
        Object obj3 = h1Var.f38983a.get("bizSeq");
        C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("bizSeq", (String) obj3);
        Object obj4 = h1Var.f38983a.get("type");
        C87412m.m108592e(obj4, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("type", (String) obj4);
        intent.putExtra("packageName", MMApplicationContext.getApplicationId());
        Context context = jVar.f38998a;
        if (context instanceof MMActivity) {
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).mmSetOnActivityResultCallback(this);
            Context context2 = jVar.f38998a;
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context2).startActivityForResult(intent, f23401e);
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return JsApiAddDownloadTaskStraight.CTRL_INDEX;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "openCTID";
    }

    /* renamed from: e */
    public final void mo7431e(C13851h1 h1Var, int i, Map<String, ? extends Object> map) {
        C13849g gVar;
        Log.m105924i("MicroMsg.JsApiOpenCTID", "callbackJsApi, msg:" + h1Var + ", errCode:" + i + "， retMap:" + map);
        if (f23402f != null && h1Var != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("err_code", Integer.valueOf(i));
            if (map != null) {
                linkedHashMap.put("result", map);
            }
            String str = i == 0 ? "ok" : "unknown error";
            C13855j jVar = f23402f;
            if (!(jVar == null || (gVar = jVar.f39001d) == null)) {
                String str2 = h1Var.f38990c;
                gVar.mo10774a(str2, h1Var.f38996i + XVFSFile.PATH_SEPARATOR_CHAR + str, linkedHashMap);
            }
            f23402f = null;
        }
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == f23401e) {
            StringBuilder sb = new StringBuilder();
            sb.append("JsApiOpenCTID onActivityResult requestCode: ");
            sb.append(i);
            sb.append(", resultCode: ");
            sb.append(i2);
            sb.append(", data: ");
            sb.append(intent == null);
            Log.m105924i("MicroMsg.JsApiOpenCTID", sb.toString());
            if (i2 != -1 || intent == null) {
                mo7431e(f23403g, -1, (Map<String, ? extends Object>) null);
                return;
            }
            HashMap hashMap = new HashMap();
            String stringExtra = intent.getStringExtra("resultCode");
            String str = "";
            if (stringExtra == null) {
                stringExtra = str;
            }
            hashMap.put("resultCode", stringExtra);
            String stringExtra2 = intent.getStringExtra("resultDesc");
            if (stringExtra2 == null) {
                stringExtra2 = str;
            }
            hashMap.put("resultDesc", stringExtra2);
            String stringExtra3 = intent.getStringExtra("idCardAuthData");
            if (stringExtra3 == null) {
                stringExtra3 = str;
            }
            hashMap.put("idCardAuthData", stringExtra3);
            String stringExtra4 = intent.getStringExtra("certPwdData");
            if (stringExtra4 == null) {
                stringExtra4 = str;
            }
            hashMap.put("certPwdData", stringExtra4);
            String stringExtra5 = intent.getStringExtra("resultData");
            if (stringExtra5 != null) {
                str = stringExtra5;
            }
            hashMap.put("resultData", str);
            mo7431e(f23403g, 0, hashMap);
        }
    }
}
