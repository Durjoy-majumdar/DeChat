package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130065d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130066e;

    public l$$m(C48590l lVar, String str) {
        this.f130066e = lVar;
        this.f130065d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130066e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130065d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onVoiceDownloadProgress fail, ex = %s", e.getMessage());
        }
    }
}
