package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130088d;

    /* renamed from: e */
    public final /* synthetic */ String f130089e;

    /* renamed from: f */
    public final /* synthetic */ C48590l f130090f;

    public l$$y(C48590l lVar, String str, String str2) {
        this.f130090f = lVar;
        this.f130088d = str;
        this.f130089e = str2;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130090f.f129996a;
            mMWebView.evaluateJavascript("javascript:typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge._handleMessageFromWeixin(" + this.f130088d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSendEventToJSBridge fail, event=%s, ex=%s", this.f130089e, e.getMessage());
        }
    }
}
