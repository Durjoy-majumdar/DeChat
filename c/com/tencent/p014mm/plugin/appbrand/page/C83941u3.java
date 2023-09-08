package com.tencent.p014mm.plugin.appbrand.page;

import android.util.DisplayMetrics;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.page.C83930t3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88020k;

/* renamed from: com.tencent.mm.plugin.appbrand.page.u3 */
public class C83941u3 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ C83930t3.C83934c f245077a;

    public C83941u3(C83930t3.C83934c cVar) {
        this.f245077a = cVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (C83930t3.this.mo116067n0()) {
            if (!"undefined".equals(str)) {
                float f = Util.getFloat(str, -1.0f);
                if (f > 0.0f) {
                    Log.m105925i("Luggage.MPPageViewRenderer", "[%s] update density with window.devicePixelRatio = %s", this.f245077a.mo116550a(), str);
                    float pixelRatio = C83930t3.this.f244463s.getPixelRatio();
                    if (f != pixelRatio) {
                        Log.m105929w("Luggage.MPPageViewRenderer", "[%s] mismatch devicePixelRatio!!! interface[%f], WebView[%f]", this.f245077a.mo116550a(), Float.valueOf(pixelRatio), Float.valueOf(f));
                    }
                    if (f > 0.0f) {
                        C88020k.f254630b = Float.valueOf(f);
                        return;
                    } else {
                        DisplayMetrics displayMetrics = C88020k.f254629a;
                        return;
                    }
                }
            }
            Log.m105929w("Luggage.MPPageViewRenderer", "[%s] invalid window.devicePixelRatio %s", this.f245077a.mo116550a(), str);
        }
    }
}
