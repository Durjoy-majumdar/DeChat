package com.tencent.p014mm.plugin.webview.stub;

import android.content.Intent;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.stub.f */
public class C6102f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f22468d;

    /* renamed from: e */
    public final /* synthetic */ WebViewStubService f22469e;

    public C6102f(WebViewStubService webViewStubService, Intent intent) {
        this.f22469e = webViewStubService;
        this.f22468d = intent;
    }

    public void run() {
        WebViewStubService webViewStubService = this.f22469e;
        Intent intent = this.f22468d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(webViewStubService, aVar.mo10232b(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$15", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        webViewStubService.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(webViewStubService, "com/tencent/mm/plugin/webview/stub/WebViewStubService$15", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
