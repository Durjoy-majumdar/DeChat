package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.p0 */
public class C48600p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130109d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130110e;

    public C48600p0(C48590l lVar, String str) {
        this.f130110e = lVar;
        this.f130109d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130110e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130109d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, ex = %s", e.getMessage());
        }
    }
}
