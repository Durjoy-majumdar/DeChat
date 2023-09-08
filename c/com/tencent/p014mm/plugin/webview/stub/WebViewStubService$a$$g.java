package com.tencent.p014mm.plugin.webview.stub;

import cc0.C92411b;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p702ts.C78085c;

/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$g */
public class WebViewStubService$a$$g implements Runnable {

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$g$a */
    public class C96652a implements C92411b.C92412a {
        public C96652a(WebViewStubService$a$$g webViewStubService$a$$g) {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            Log.m105925i("MicroMsg.WebViewStubService", "onGetLocation %b %f|%f", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2));
            ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this);
            return false;
        }
    }

    public WebViewStubService$a$$g(WebViewStubService.C43781a aVar) {
    }

    public void run() {
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126407a(new C96652a(this), true);
        C5139t.m5183e(22, 10);
    }
}
