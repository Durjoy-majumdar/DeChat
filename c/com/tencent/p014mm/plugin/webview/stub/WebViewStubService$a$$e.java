package com.tencent.p014mm.plugin.webview.stub;

import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$e */
public class WebViewStubService$a$$e extends SyncTask<String> {

    /* renamed from: a */
    public final /* synthetic */ String f283046a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewStubService$a$$e(WebViewStubService.C43781a aVar, long j, String str, String str2) {
        super(j, str);
        this.f283046a = str2;
    }

    public Object run() {
        if (C86709a0.m107522a()) {
            return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(this.f283046a);
        }
        return null;
    }
}
