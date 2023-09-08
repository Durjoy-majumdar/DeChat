package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.o0 */
public class C48598o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130105d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130106e;

    public C48598o0(C48590l lVar, String str) {
        this.f130106e = lVar;
        this.f130105d = str;
    }

    public void run() {
        try {
            this.f130106e.f129996a.evaluateJavascript(this.f130105d, (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, ex = %s", e.getMessage());
        }
    }
}
