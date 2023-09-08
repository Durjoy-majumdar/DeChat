package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.k0 */
public class C48589k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129979d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129980e;

    public C48589k0(C48590l lVar, String str) {
        this.f129980e = lVar;
        this.f129979d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f129980e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129979d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onFocusSearchInput fail, ex = %s", e.getMessage());
        }
    }
}
