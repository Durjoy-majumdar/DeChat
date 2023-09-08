package r73;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ea3.C45587d;
import f40.C86718e;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87203t;
import r73.C47930c;
import sx3.C90364q0;
import zt3.C119157j;

/* renamed from: r73.r */
public final class C47943r extends C47928a<C47945s> {

    /* renamed from: r73.r$a */
    public static final class C47944a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f128628d;

        /* renamed from: e */
        public final /* synthetic */ String f128629e;

        /* renamed from: f */
        public final /* synthetic */ Map<String, String> f128630f;

        /* renamed from: g */
        public final /* synthetic */ String f128631g;

        /* renamed from: h */
        public final /* synthetic */ C47943r f128632h;

        /* renamed from: i */
        public final /* synthetic */ String f128633i;

        public C47944a(C8479f0<String> f0Var, String str, Map<String, String> map, String str2, C47943r rVar, String str3) {
            this.f128628d = f0Var;
            this.f128629e = str;
            this.f128630f = map;
            this.f128631g = str2;
            this.f128632h = rVar;
            this.f128633i = str3;
        }

        public final void run() {
            String upperCase = ((String) this.f128628d.f27484d).toUpperCase();
            C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase()");
            C45587d.C7609a f = C87412m.m108589b(upperCase, "POST") ? C45587d.m50637f(this.f128629e, this.f128630f, this.f128631g) : C45587d.m50636e(this.f128629e, this.f128630f, this.f128631g);
            if (f != null) {
                String str = this.f128632h.f128615c;
                Object[] objArr = new Object[2];
                boolean z = false;
                objArr[0] = Integer.valueOf(f.f25879a);
                Map<String, String> map = f.f25880b;
                objArr[1] = Integer.valueOf(map != null ? ((HashMap) map).size() : 0);
                Log.m105925i(str, "request response statusCode:%d, header.size:%d", objArr);
                Log.m105927v(this.f128632h.f128615c, "request response header:%s data:%s", f.f25880b, f.f25881c);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("statusCode", f.f25879a);
                jSONObject.put("data", f.f25881c);
                Map<String, String> map2 = f.f25880b;
                if (map2 != null) {
                    if (map2 != null && (!((HashMap) map2).isEmpty())) {
                        z = true;
                    }
                    if (z) {
                        C45587d.m50638g(f.f25880b);
                        Map<String, String> map3 = f.f25880b;
                        C87412m.m108593f(map3, "response.header");
                        jSONObject.put("header", new JSONObject(C90364q0.m113154m(map3)));
                    }
                }
                Log.m105924i(this.f128632h.f128615c, "request success");
                String str2 = this.f128633i;
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "retObject.toString()");
                C47930c.C47931a.m53253a((C47930c) this.f128632h.f128614b, str2, jSONObject2, (ValueCallback) null, 4, (Object) null);
                return;
            }
            Log.m105928w(this.f128632h.f128615c, "request response is null, return");
            C47930c.C47931a.m53253a((C47930c) this.f128632h.f128614b, this.f128633i, "fail:response is null", (ValueCallback) null, 4, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47943r(C47945s sVar) {
        super("wxPrefetcherClient", sVar);
        C87412m.m108594g(sVar, "context");
    }

    @JavascriptInterface
    public final String getId() {
        return ((C47945s) this.f128614b).getId();
    }

    @JavascriptInterface
    public final int getUserHash() {
        int h = C86718e.m107549h();
        return Math.abs((h + '-' + C87203t.m108270f(true)).hashCode() % 10000);
    }

    @JavascriptInterface
    public final void request(String str, T t, String str2, String str3, String str4) {
        C87412m.m108594g(str, "requestUrl");
        C87412m.m108594g(str4, "callback");
        C8479f0 f0Var = new C8479f0();
        if (t == null) {
            t = "GET";
        }
        f0Var.f27484d = t;
        HashMap hashMap = new HashMap();
        try {
            if (!Util.isNullOrNil(str2)) {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> keys = jSONObject.keys();
                C87412m.m108593f(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    C87412m.m108592e(next, "null cannot be cast to non-null type kotlin.String");
                    String str5 = next;
                    String optString = jSONObject.optString(str5);
                    C87412m.m108593f(optString, "value");
                    hashMap.put(str5, optString);
                }
            }
        } catch (JSONException e) {
            Log.printInfoStack(this.f128615c, "", e);
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C47944a(f0Var, str, hashMap, str3, this, str4), "WxPrefetcherRequest");
    }

    @JavascriptInterface
    public final void setMinBizPkgVersion(int i) {
        ((C47945s) this.f128614b).mo63605x0(i);
    }
}
