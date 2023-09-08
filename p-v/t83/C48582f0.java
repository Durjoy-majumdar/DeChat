package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.f0 */
public class C48582f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129963d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129964e;

    public C48582f0(C48590l lVar, String str) {
        this.f129964e = lVar;
        this.f129963d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f129964e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129963d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onNavBarShadowManuallyHidden fail, ex = %s", e.getMessage());
        }
    }
}
