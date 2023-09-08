package com.tencent.p014mm.p136ui;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import org.json.JSONObject;
import tm0.C78044d0;

/* renamed from: com.tencent.mm.ui.o4 */
public final class C74804o4 {

    /* renamed from: a */
    public static final C74805a f219938a = new C74805a((C8480h) null);

    /* renamed from: com.tencent.mm.ui.o4$a */
    public static final class C74805a {
        public C74805a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo103976a() {
            int i;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("style", FirebaseAnalytics.C113379b.MEDIUM);
            String jSONObject2 = jSONObject.toString();
            Log.m105924i("MicroMsg.WebSearch.WebSearchUtils", "vibrateShort , type = " + jSONObject2);
            try {
                JSONObject jSONObject3 = new JSONObject(jSONObject2);
                Object systemService = MMApplicationContext.getContext().getSystemService("vibrator");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator = (Vibrator) systemService;
                Object obj = jSONObject3.get("style");
                char c = C87412m.m108589b(obj, "light") ? 1 : C87412m.m108589b(obj, FirebaseAnalytics.C113379b.MEDIUM) ? 2 : C87412m.m108589b(obj, "heavy") ? (char) 3 : 65535;
                long j = 50;
                if (65534 == c) {
                    vibrator.vibrate(50);
                    return true;
                } else if (65535 == c) {
                    vibrator.vibrate(50);
                    return true;
                } else if (Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                    vibrator.vibrate(50);
                    return true;
                } else {
                    if (c == 1) {
                        i = 128;
                        j = 15;
                    } else if (c == 2) {
                        i = 192;
                    } else if (c == 3) {
                        i = 255;
                        j = 85;
                    } else {
                        i = -1;
                    }
                    if (-1 == i) {
                        vibrator.vibrate(j);
                        return true;
                    }
                    vibrator.vibrate(VibrationEffect.createOneShot(j, i));
                    return true;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchUtils", e, C78044d0.NAME, new Object[0]);
                return false;
            }
        }
    }

    /* renamed from: a */
    public static final boolean m89546a() {
        return f219938a.mo103976a();
    }
}
