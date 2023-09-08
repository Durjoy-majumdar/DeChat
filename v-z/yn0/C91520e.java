package yn0;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C36570n;

/* renamed from: yn0.e */
public final class C91520e {

    /* renamed from: a */
    public final C91521g f262329a;

    public C91520e(C91521g gVar) {
        C87412m.m108594g(gVar, "view");
        this.f262329a = gVar;
    }

    /* renamed from: a */
    public static void m114829a(C91520e eVar, String str, ValueCallback valueCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            valueCallback = null;
        }
        eVar.getClass();
        if (!(str == null || str.length() == 0)) {
            C2039g2.m1988b(new C91519d(eVar, str, valueCallback));
        }
    }

    @JavascriptInterface
    public final String invokeHandler(String str, String str2, int i) {
        String str3 = "";
        if (str == null) {
            return str3;
        }
        C91527j jsBridgeComponentDelegate = this.f262329a.getJsBridgeComponentDelegate();
        jsBridgeComponentDelegate.getClass();
        C82870p pVar = jsBridgeComponentDelegate.f262352i.get(str);
        if (pVar == null) {
            str3 = C53545a.f150510a;
        } else {
            boolean z = false;
            JSONObject jSONObject = null;
            if (pVar instanceof C82268c) {
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (JSONException unused) {
                    }
                }
                if (jSONObject == null) {
                    return C53545a.f150511b;
                }
                C82268c cVar = (C82268c) pVar;
                if (cVar.mo1769t()) {
                    cVar.mo1505u(jsBridgeComponentDelegate, jSONObject, i);
                } else {
                    ((MMHandler) ((C36570n) jsBridgeComponentDelegate.f262349f).getValue()).post(new C91526i(pVar, jsBridgeComponentDelegate, jSONObject, i));
                }
            } else if (pVar instanceof C82016a0) {
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (JSONException unused2) {
                    }
                }
                if (jSONObject == null) {
                    return C53545a.f150511b;
                }
                str3 = ((C82016a0) pVar).mo1731t(jsBridgeComponentDelegate, jSONObject);
            } else {
                str3 = C53545a.f150512c;
            }
        }
        return str3;
    }
}
