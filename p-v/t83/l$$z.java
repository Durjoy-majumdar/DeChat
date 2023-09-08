package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130091d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130092e;

    public l$$z(C48590l lVar, String str) {
        this.f130092e = lVar;
        this.f130091d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130092e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130091d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady fail, ex = %s", e.getMessage());
        }
    }
}
