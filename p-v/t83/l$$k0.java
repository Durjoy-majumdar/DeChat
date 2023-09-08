package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130061d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130062e;

    public l$$k0(C48590l lVar, String str) {
        this.f130062e = lVar;
        this.f130061d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130062e.f129996a;
            if (mMWebView != null) {
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130061d + ")", (ValueCallback<String>) null);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "eval onMiniProgramData, ex = %s", e);
        }
    }
}
