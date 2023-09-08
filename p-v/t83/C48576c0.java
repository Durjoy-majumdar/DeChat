package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.c0 */
public class C48576c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129950d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129951e;

    public C48576c0(C48590l lVar, String str) {
        this.f129951e = lVar;
        this.f129950d = str;
    }

    public void run() {
        try {
            Log.m105919d("MicroMsg.JsApiHandler", "onSearchHistoryReady %s", this.f129950d);
            MMWebView mMWebView = this.f129951e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129950d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchHistoryReady fail, ex = %s", e.getMessage());
        }
    }
}
