package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130036d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130037e;

    public l$$e(C48590l lVar, String str) {
        this.f130037e = lVar;
        this.f130036d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130037e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130036d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "onExdeviceStateChange, %s", e.getMessage());
        }
    }
}
