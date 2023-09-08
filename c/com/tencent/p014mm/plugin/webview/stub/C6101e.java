package com.tencent.p014mm.plugin.webview.stub;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;
import j83.C9286a;

/* renamed from: com.tencent.mm.plugin.webview.stub.e */
public class C6101e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f22465d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f22466e;

    /* renamed from: f */
    public final /* synthetic */ WebViewStubService.C43781a f22467f;

    public C6101e(WebViewStubService.C43781a aVar, Bundle bundle, Bundle bundle2) {
        this.f22467f = aVar;
        this.f22465d = bundle;
        this.f22466e = bundle2;
    }

    public void run() {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.putExtras(this.f22465d);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("_stat_obj", this.f22466e);
        ((C67654r1) C9286a.f29044a).mo93182o(intent, WebViewStubService.this);
    }
}
