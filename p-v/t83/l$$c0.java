package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130030d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130031e;

    public l$$c0(C48590l lVar, String str) {
        this.f130031e = lVar;
        this.f130030d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130031e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130030d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onTeachSearchDataReady fail, ex = %s", e.getMessage());
        }
    }
}
