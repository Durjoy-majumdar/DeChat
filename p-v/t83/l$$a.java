package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public final /* synthetic */ class l$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48590l f130022d;

    /* renamed from: e */
    public final /* synthetic */ String f130023e;

    public /* synthetic */ l$$a(C48590l lVar, String str) {
        this.f130022d = lVar;
        this.f130023e = str;
    }

    public final void run() {
        C48590l lVar = this.f130022d;
        String str = this.f130023e;
        lVar.getClass();
        try {
            MMWebView mMWebView = lVar.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onFinderViewEvent fail, ex = %s", e.getMessage());
        }
    }
}
