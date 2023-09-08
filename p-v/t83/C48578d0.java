package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.d0 */
public class C48578d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129956d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129957e;

    public C48578d0(C48590l lVar, String str) {
        this.f129957e = lVar;
        this.f129956d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f129957e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129956d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onCurrentLocationReady fail, ex = %s", e.getMessage());
        }
    }
}
