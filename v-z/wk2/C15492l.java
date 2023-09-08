package wk2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: wk2.l */
public final class C15492l extends C15805b {

    /* renamed from: f */
    public static final C15492l f42022f = new C15492l();

    /* renamed from: g */
    public static final String f42023g = "openDialPad";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        String str = (String) h1Var2.f38983a.get("phoneNum");
        if (str == null) {
            str = "";
        }
        String obj = C112550d0.m153799i0(str).toString();
        Log.m105924i("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doOpenDialPad phoneNum: " + obj);
        boolean z = false;
        if (obj == null || C112551y.m153811k(obj)) {
            Log.m105920e("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doOpenDialPad param is empty");
            HashMap hashMap = new HashMap();
            hashMap.put("ret", "1");
            C13849g gVar = jVar2.f39001d;
            String str2 = h1Var2.f38990c;
            gVar.mo10774a(str2, h1Var2.f38996i + ":param invalid", hashMap);
            return true;
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("tel:" + obj));
        try {
            Context context = jVar2.f38998a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiOpenDialPad", "doOpenDialPad", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiOpenDialPad", "doOpenDialPad", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            z = true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiOpenDialPad", e, "", new Object[0]);
        }
        if (z) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ret", "0");
            C13849g gVar2 = jVar2.f39001d;
            String str3 = h1Var2.f38990c;
            gVar2.mo10774a(str3, h1Var2.f38996i + ":ok", hashMap2);
            return true;
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("ret", "1");
        C13849g gVar3 = jVar2.f39001d;
        String str4 = h1Var2.f38990c;
        gVar3.mo10774a(str4, h1Var2.f38996i + ":fail", hashMap3);
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42023g;
    }
}
