package com.tencent.p014mm.plugin.webview.stub;

import android.content.Intent;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.stub.g */
public class C6103g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f22470d;

    /* renamed from: e */
    public final /* synthetic */ WebViewStubService f22471e;

    public C6103g(WebViewStubService webViewStubService, Intent intent) {
        this.f22471e = webViewStubService;
        this.f22470d = intent;
    }

    public void run() {
        WebViewStubService webViewStubService = this.f22471e;
        Intent intent = this.f22470d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(webViewStubService, aVar.mo10232b(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        webViewStubService.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(webViewStubService, "com/tencent/mm/plugin/webview/stub/WebViewStubService$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
