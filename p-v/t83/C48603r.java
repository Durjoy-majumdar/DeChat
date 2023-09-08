package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.r */
public class C48603r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130114d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130115e;

    public C48603r(C48590l lVar, String str) {
        this.f130115e = lVar;
        this.f130114d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130115e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130114d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onMediaFileUploadProgress fail, ex = %s", e.getMessage());
        }
    }
}
