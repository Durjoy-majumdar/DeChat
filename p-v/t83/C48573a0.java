package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.a0 */
public class C48573a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129945d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129946e;

    public C48573a0(C48590l lVar, String str) {
        this.f129946e = lVar;
        this.f129945d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f129946e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129945d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, ex = %s", e.getMessage());
        }
    }
}
