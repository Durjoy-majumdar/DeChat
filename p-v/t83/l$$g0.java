package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130045d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130046e;

    public l$$g0(C48590l lVar, String str) {
        this.f130046e = lVar;
        this.f130045d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130046e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130045d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onMusicStatusChanged fail, ex = %s", e.getMessage());
        }
    }
}
