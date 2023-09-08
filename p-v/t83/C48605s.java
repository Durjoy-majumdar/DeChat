package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.s */
public class C48605s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130118d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130119e;

    public C48605s(C48590l lVar, String str) {
        this.f130119e = lVar;
        this.f130118d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130119e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130118d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange fail, ex = %s", e.getMessage());
        }
    }
}
