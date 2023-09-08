package p172io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$$a */
public final /* synthetic */ class WebViewHostApiImpl$$a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ GeneratedAndroidWebView.Result f59750a;

    public /* synthetic */ WebViewHostApiImpl$$a(GeneratedAndroidWebView.Result result) {
        this.f59750a = result;
    }

    public final void onReceiveValue(Object obj) {
        this.f59750a.success((String) obj);
    }
}
