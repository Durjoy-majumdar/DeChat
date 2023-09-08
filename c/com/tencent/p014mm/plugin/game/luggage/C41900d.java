package com.tencent.p014mm.plugin.game.luggage;

import android.util.DisplayMetrics;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88020k;

/* renamed from: com.tencent.mm.plugin.game.luggage.d */
public class C41900d implements ValueCallback<String> {
    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!"undefined".equals(str)) {
            float f = Util.getFloat(str, -1.0f);
            if (f > 0.0f) {
                Log.m105925i("MicroMsg.GameWebUtil", "update density with window.devicePixelRatio = %s", str);
                if (f > 0.0f) {
                    C88020k.f254630b = Float.valueOf(f);
                    return;
                } else {
                    DisplayMetrics displayMetrics = C88020k.f254629a;
                    return;
                }
            }
        }
        Log.m105929w("MicroMsg.GameWebUtil", "invalid window.devicePixelRatio %s", str);
    }
}
