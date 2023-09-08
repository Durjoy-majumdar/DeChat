package r73;

import android.webkit.ValueCallback;
import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import r73.C47930c;
import t83.C13848e;
import t83.C13851h1;

/* renamed from: r73.k */
public final class C47936k implements C13848e {

    /* renamed from: a */
    public final /* synthetic */ C47937l f128621a;

    /* renamed from: b */
    public final /* synthetic */ String f128622b;

    public C47936k(C47937l lVar, String str) {
        this.f128621a = lVar;
        this.f128622b = str;
    }

    /* renamed from: a */
    public final void mo10774a(String str, String str2, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        C87412m.m108593f(str2, "ret");
        hashMap.put("err_msg", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        String a = C13851h1.C13852a.m13141a(str, hashMap, false, "");
        String str3 = this.f128621a.f128615c;
        Log.m105924i(str3, "invoke callback: " + str2 + ", " + this.f128622b + ", " + a);
        String str4 = this.f128622b;
        String gVar = new C104289g(a).getJSONObject("__params").toString();
        C87412m.m108593f(gVar, "JSONObject(resp).getJSON…ct(\"__params\").toString()");
        C47930c.C47931a.m53253a((C47930c) this.f128621a.f128614b, str4, gVar, (ValueCallback) null, 4, (Object) null);
    }
}
