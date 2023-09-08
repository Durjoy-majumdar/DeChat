package t83;

import android.webkit.ValueCallback;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import g93.C32355a;

/* renamed from: t83.d1 */
public class C48579d1 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ long f129958a;

    /* renamed from: b */
    public final /* synthetic */ boolean f129959b;

    /* renamed from: c */
    public final /* synthetic */ C48583f1 f129960c;

    public C48579d1(C48583f1 f1Var, long j, boolean z) {
        this.f129960c = f1Var;
        this.f129958a = j;
        this.f129959b = z;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        long currentTimeMillis = System.currentTimeMillis() - this.f129958a;
        C32355a.m39692d(80, currentTimeMillis);
        if (str != null && str.contains("succ")) {
            C32355a.m39691c(83);
        }
        if (currentTimeMillis > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            Log.m105929w("MicroMsg.JsLoader", "loadJavaScript is too slow, cost %d, isXWeb %b", Long.valueOf(currentTimeMillis), Boolean.valueOf(this.f129959b));
            C32355a.m39691c(this.f129959b ? 95 : 96);
        }
        C48590l lVar = this.f129960c.f129969b;
        if (lVar != null) {
            lVar.f130013r = false;
        }
        Log.m105925i("MicroMsg.JsLoader", "loadJavaScript, evaluateJavascript cb, ret: %s, cost: %dms", str, Long.valueOf(currentTimeMillis));
    }
}
