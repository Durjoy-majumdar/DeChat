package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130063d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130064e;

    public l$$l(C48590l lVar, String str) {
        this.f130064e = lVar;
        this.f130063d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130064e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130063d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onVoiceUploadProgress fail, ex = %s", e.getMessage());
        }
    }
}
