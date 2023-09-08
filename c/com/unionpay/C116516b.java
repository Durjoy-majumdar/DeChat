package com.unionpay;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unionpay.b */
public class C116516b implements Serializable {

    /* renamed from: d */
    public WebView f349479d;

    /* renamed from: e */
    public Activity f349480e;

    /* renamed from: f */
    public C116515a0 f349481f;

    /* renamed from: g */
    public Map f349482g;

    /* renamed from: h */
    public Map f349483h;

    /* renamed from: i */
    public boolean f349484i = false;

    public C116516b(Activity activity, WebView webView, C116515a0 a0Var) {
        this.f349480e = activity;
        this.f349479d = webView;
        this.f349481f = a0Var;
        this.f349482g = new HashMap();
        this.f349483h = new HashMap();
        WebSettings settings = this.f349479d.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        try {
            this.f349479d.removeJavascriptInterface("accessibility");
            this.f349479d.removeJavascriptInterface("accessibilityTraversal");
            this.f349479d.removeJavascriptInterface("searchBoxJavaBridge_");
        } catch (Throwable unused) {
        }
        this.f349479d.addJavascriptInterface(this, "_WebViewJavascriptBridge");
        this.f349479d.setWebViewClient(new C45136z(this, (byte) 0));
        this.f349479d.setWebChromeClient(new C45135w(this, (byte) 0));
    }

    @JavascriptInterface
    public void _handleMessageFromJs(String str, String str2, String str3, String str4, String str5) {
        C116515a0 a0Var;
        if (str2 != null) {
            ((C116517b0) ((HashMap) this.f349483h).get(str2)).mo180515a(str3);
            ((HashMap) this.f349483h).remove(str2);
            return;
        }
        C116536y yVar = null;
        if (str4 != null) {
            yVar = new C116536y(this, str4);
        }
        if (str5 != null) {
            a0Var = (C116515a0) ((HashMap) this.f349482g).get(str5);
            if (a0Var == null) {
                return;
            }
        } else {
            a0Var = this.f349481f;
        }
        try {
            this.f349480e.runOnUiThread(new C116534v(this, a0Var, str, yVar));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: a */
    public void mo180514a(String str, C116515a0 a0Var) {
        ((HashMap) this.f349482g).put(str, a0Var);
    }
}
