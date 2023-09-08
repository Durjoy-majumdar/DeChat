package com.unionpay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.unionpay.z */
public final class C45136z extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C116516b f122409a;

    public C45136z(C116516b bVar, byte b) {
        this.f122409a = bVar;
    }

    public final void onPageFinished(WebView webView, String str) {
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f122409a.f349484i && !TextUtils.isEmpty(str) && !str.startsWith("http")) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                Activity activity = this.f122409a.f349480e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/unionpay/x", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/unionpay/x", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } catch (Exception unused) {
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
