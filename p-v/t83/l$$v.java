package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130084d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130085e;

    /* renamed from: t83.l$$v$a */
    public class C48591a implements ValueCallback<String> {
        public C48591a(l$$v l__v) {
        }

        public void onReceiveValue(Object obj) {
            Log.m105925i("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish back %s", (String) obj);
        }
    }

    public l$$v(C48590l lVar, String str) {
        this.f130085e = lVar;
        this.f130084d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130085e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130084d + ")", new C48591a(this));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish fail, ex = %s", e.getMessage());
        }
    }
}
