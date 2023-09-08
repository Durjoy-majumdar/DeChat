package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.t */
public class C48607t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130122d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130123e;

    public C48607t(C48590l lVar, String str) {
        this.f130123e = lVar;
        this.f130122d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130123e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130122d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onArticleReadingBtnClicked fail, ex = %s", e.getMessage());
        }
    }
}
