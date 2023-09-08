package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130049d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130050e;

    public l$$h0(C48590l lVar, String str) {
        this.f130050e = lVar;
        this.f130049d = str;
    }

    public void run() {
        try {
            this.f130050e.f129996a.evaluateJavascript(this.f130049d, (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, ex = %s", e.getMessage());
        }
    }
}
