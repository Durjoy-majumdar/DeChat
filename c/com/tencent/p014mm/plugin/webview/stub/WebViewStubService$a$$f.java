package com.tencent.p014mm.plugin.webview.stub;

import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$f */
public class WebViewStubService$a$$f extends SyncTask<Void> {

    /* renamed from: a */
    public final /* synthetic */ String f118305a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewStubService$a$$f(WebViewStubService.C43781a aVar, long j, Void voidR, String str) {
        super(j, voidR);
        this.f118305a = str;
    }

    public Object run() {
        Class cls = C75700k0.class;
        if (C86709a0.m107522a()) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(this.f118305a);
            if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                C72996z1 y3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(this.f118305a);
                if (y3 == null || ((int) y3.f108320R1) <= 0) {
                    C31519v2.m39436a().mo55988e(this.f118305a, "", (C75597w2.C31525a) null);
                } else {
                    Log.m105926v("MicroMsg.WebViewStubService", "triggerGetContact, alias already exist, no need to getcontact");
                }
            } else {
                Log.m105926v("MicroMsg.WebViewStubService", "triggerGetContact, already exist, no need to getcontact");
            }
        }
        return null;
    }
}
