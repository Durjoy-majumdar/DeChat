package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130026d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130027e;

    public l$$b0(C48590l lVar, String str) {
        this.f130027e = lVar;
        this.f130026d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130027e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130026d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onEmoticonIsChosen fail, ex = %s", e.getMessage());
        }
    }
}
