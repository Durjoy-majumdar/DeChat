package t83;

import android.webkit.ValueCallback;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import g93.C32355a;

/* renamed from: t83.c1 */
public class C48577c1 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ long f129952a;

    /* renamed from: b */
    public final /* synthetic */ long f129953b;

    /* renamed from: c */
    public final /* synthetic */ boolean f129954c;

    /* renamed from: d */
    public final /* synthetic */ C48583f1 f129955d;

    public C48577c1(C48583f1 f1Var, long j, long j2, boolean z) {
        this.f129955d = f1Var;
        this.f129952a = j;
        this.f129953b = j2;
        this.f129954c = z;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f129952a;
        long j2 = currentTimeMillis - j;
        long j3 = j - this.f129953b;
        C32355a.m39692d(81, j2);
        C32355a.m39692d(79, this.f129952a - j3);
        if (str != null && str.contains("succ")) {
            C32355a.m39691c(85);
        }
        if (j2 > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            Log.m105929w("MicroMsg.JsLoader", "loadJavaScript is too slow, cost %d, isXWeb %b", Long.valueOf(j2), Boolean.valueOf(this.f129954c));
            C32355a.m39691c(this.f129954c ? 95 : 96);
        }
        C48590l lVar = this.f129955d.f129969b;
        if (lVar != null) {
            lVar.f130013r = false;
        }
        Log.m105925i("MicroMsg.JsLoader", "loadJavaScript with WebCodeCache, evaluateJavascript cb, ret: %s, ccCost: %dms, cpCost: %dms", str, Long.valueOf(j2), Long.valueOf(j3));
    }
}
