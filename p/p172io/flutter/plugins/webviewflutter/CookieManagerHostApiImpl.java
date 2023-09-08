package p172io.flutter.plugins.webviewflutter;

import android.webkit.CookieManager;
import java.util.Objects;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl */
class CookieManagerHostApiImpl implements GeneratedAndroidWebView.CookieManagerHostApi {
    public void clearCookies(GeneratedAndroidWebView.Result<Boolean> result) {
        CookieManager instance = CookieManager.getInstance();
        Objects.requireNonNull(result);
        instance.removeAllCookies(new CookieManagerHostApiImpl$$a(result));
    }

    public void setCookie(String str, String str2) {
        CookieManager.getInstance().setCookie(str, str2);
    }
}
