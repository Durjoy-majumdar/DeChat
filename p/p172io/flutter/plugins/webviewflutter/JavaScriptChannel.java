package p172io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

/* renamed from: io.flutter.plugins.webviewflutter.JavaScriptChannel */
public class JavaScriptChannel implements Releasable {
    private JavaScriptChannelFlutterApiImpl flutterApi;
    public final String javaScriptChannelName;
    private final Handler platformThreadHandler;

    public JavaScriptChannel(JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, String str, Handler handler) {
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.javaScriptChannelName = str;
        this.platformThreadHandler = handler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$postMessage$0(Void voidR) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$postMessage$1(String str) {
        JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl = this.flutterApi;
        if (javaScriptChannelFlutterApiImpl != null) {
            javaScriptChannelFlutterApiImpl.postMessage(this, str, new JavaScriptChannel$$a());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$release$2(Void voidR) {
    }

    @JavascriptInterface
    public void postMessage(String str) {
        JavaScriptChannel$$c javaScriptChannel$$c = new JavaScriptChannel$$c(this, str);
        if (this.platformThreadHandler.getLooper() == Looper.myLooper()) {
            javaScriptChannel$$c.run();
        } else {
            this.platformThreadHandler.post(javaScriptChannel$$c);
        }
    }

    public void release() {
        JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl = this.flutterApi;
        if (javaScriptChannelFlutterApiImpl != null) {
            javaScriptChannelFlutterApiImpl.dispose(this, new JavaScriptChannel$$b());
        }
        this.flutterApi = null;
    }
}
