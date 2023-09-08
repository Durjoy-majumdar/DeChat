package wk2;

import android.os.Vibrator;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;

/* renamed from: wk2.u */
public final class C15501u extends C15805b {

    /* renamed from: f */
    public static final C15501u f42039f = new C15501u();

    /* renamed from: g */
    public static final String f42040g = "shake";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105918d("MicroMsg.JsApiShake", "ScanJsApi-Call:shake");
        Object systemService = jVar.f38998a.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(10);
        }
        C13849g gVar = jVar.f39001d;
        String str = h1Var.f38990c;
        gVar.mo10774a(str, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42040g;
    }
}
