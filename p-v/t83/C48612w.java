package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.w */
public class C48612w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130131d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130132e;

    public C48612w(C48590l lVar, String str) {
        this.f130132e = lVar;
        this.f130131d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130132e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130131d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onUserGoBack fail, ex = %s", e.getMessage());
        }
    }
}
