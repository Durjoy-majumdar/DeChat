package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130053d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130054e;

    public l$$i0(C48590l lVar, String str) {
        this.f130054e = lVar;
        this.f130053d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130054e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130053d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, ex = %s", e.getMessage());
        }
    }
}
