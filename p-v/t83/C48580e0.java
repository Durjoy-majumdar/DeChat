package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.e0 */
public class C48580e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129961d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129962e;

    public C48580e0(C48590l lVar, String str) {
        this.f129962e = lVar;
        this.f129961d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f129962e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129961d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onCurrentLocationReady fail, ex = %s", e.getMessage());
        }
    }
}
