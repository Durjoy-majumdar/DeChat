package mi2;

import android.os.Vibrator;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: mi2.c */
public final class C10895c extends C15053a {

    /* renamed from: d */
    public static final C10895c f32517d = new C10895c();

    /* renamed from: e */
    public static final String f32518e = "MicroMsg.JsApiSelectTextSnake";

    /* renamed from: f */
    public static final String f32519f = "shake";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105918d(f32518e, "ScanJsApi-Call:shake");
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

    /* renamed from: b */
    public int mo7287b() {
        return 10004;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f32519f;
    }
}
