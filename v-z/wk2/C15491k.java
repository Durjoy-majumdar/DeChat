package wk2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kl2.C10355a;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;

/* renamed from: wk2.k */
public final class C15491k extends C15805b {

    /* renamed from: f */
    public static final C15491k f42020f = new C15491k();

    /* renamed from: g */
    public static final String f42021g = "getImageTransData";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str2 = (String) ((HashMap) h1Var.f38983a).get("requestId");
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = (String) ((HashMap) h1Var.f38983a).get("sessionId");
        if (str4 == null) {
            str4 = str3;
        }
        ConcurrentHashMap<String, C10355a.C10356a> concurrentHashMap = C10355a.f31535a;
        C10355a.C10356a aVar = C10355a.f31535a.get(str4);
        if (!(aVar == null || (str = aVar.f31537b) == null)) {
            str3 = str;
        }
        Log.m105925i("MicroMsg.JsApiGetImageTransData", "ScanJsApi-Call:getImageTransData sessionId: %s, requestId: %s, result: %s", str4, str2, str3);
        HashMap hashMap = new HashMap();
        hashMap.put("requestId", str2);
        hashMap.put("json", str3);
        C13849g gVar = jVar.f39001d;
        String str5 = h1Var.f38990c;
        gVar.mo10774a(str5, h1Var.f38996i + ":ok", hashMap);
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42021g;
    }
}
