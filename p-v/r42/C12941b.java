package r42;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1766o6;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e42.C7596h;
import e42.C7597n;
import e42.C86430i;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: r42.b */
public final class C12941b extends C86430i<C7597n> {
    /* renamed from: e */
    public String mo16e() {
        return C1766o6.NAME;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString(FirebaseAnalytics.C113379b.LEVEL);
        String optString2 = hVar.optString("content");
        boolean optBoolean = hVar.optBoolean("enableVConsole", false);
        if (!Util.isNullOrNil(optString) && !Util.isNullOrNil(optString2)) {
            if (C112551y.m153809i("verbose", optString, true)) {
                Log.m105926v("MBJsApiSystemLog", optString2);
            } else if (C112551y.m153809i("debug", optString, true)) {
                Log.m105918d("MBJsApiSystemLog", optString2);
            } else if (C112551y.m153809i("info", optString, true)) {
                if (optString2.length() > 200) {
                    String substring = optString2.substring(0, 200);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.m105924i("MBJsApiSystemLog", substring);
                } else {
                    Log.m105924i("MBJsApiSystemLog", optString2);
                }
            } else if (C112551y.m153809i("warn", optString, true)) {
                Log.m105928w("MBJsApiSystemLog", optString2);
            } else {
                Log.m105920e("MBJsApiSystemLog", optString2);
            }
        }
        if (optBoolean) {
            T t = this.f251227a;
            C87412m.m108591d(t);
            C87412m.m108593f(optString2, "content");
            ((C7597n) t).mo8724h0(optString2);
        }
        mo120840p().invoke(mo120844i());
    }
}
