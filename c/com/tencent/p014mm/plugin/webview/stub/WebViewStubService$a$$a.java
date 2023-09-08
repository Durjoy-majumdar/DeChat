package com.tencent.p014mm.plugin.webview.stub;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$a */
public final /* synthetic */ class WebViewStubService$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f22453d;

    public /* synthetic */ WebViewStubService$a$$a(Intent intent) {
        this.f22453d = intent;
    }

    public final void run() {
        Intent intent = this.f22453d;
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "lambda$reqDealQBarResult$0", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "lambda$reqDealQBarResult$0", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
