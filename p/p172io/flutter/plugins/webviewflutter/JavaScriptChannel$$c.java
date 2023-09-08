package p172io.flutter.plugins.webviewflutter;

/* renamed from: io.flutter.plugins.webviewflutter.JavaScriptChannel$$c */
public final /* synthetic */ class JavaScriptChannel$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JavaScriptChannel f59748d;

    /* renamed from: e */
    public final /* synthetic */ String f59749e;

    public /* synthetic */ JavaScriptChannel$$c(JavaScriptChannel javaScriptChannel, String str) {
        this.f59748d = javaScriptChannel;
        this.f59749e = str;
    }

    public final void run() {
        this.f59748d.lambda$postMessage$1(this.f59749e);
    }
}
