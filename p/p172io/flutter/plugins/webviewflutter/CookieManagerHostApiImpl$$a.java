package p172io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl$$a */
public final /* synthetic */ class CookieManagerHostApiImpl$$a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ GeneratedAndroidWebView.Result f59723a;

    public /* synthetic */ CookieManagerHostApiImpl$$a(GeneratedAndroidWebView.Result result) {
        this.f59723a = result;
    }

    public final void onReceiveValue(Object obj) {
        this.f59723a.success((Boolean) obj);
    }
}
