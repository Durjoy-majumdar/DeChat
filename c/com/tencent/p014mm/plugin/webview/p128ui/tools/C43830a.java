package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.a */
public class C43830a {

    /* renamed from: a */
    public WeakReference<WebViewUI> f118700a;

    public C43830a(WebViewUI webViewUI) {
        this.f118700a = new WeakReference<>(webViewUI);
    }

    /* renamed from: a */
    public Intent mo68387a() {
        return mo68388b().getIntent();
    }

    /* renamed from: b */
    public WebViewUI mo68388b() {
        return this.f118700a.get();
    }

    /* renamed from: c */
    public boolean mo68389c() {
        return mo68388b() == null || mo68388b().isFinishing();
    }
}
