package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130047d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130048e;

    public l$$h(C48590l lVar, String str) {
        this.f130048e = lVar;
        this.f130047d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130048e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130047d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onVoicePlayEnd fail, ex = %s", e.getMessage());
        }
    }
}
