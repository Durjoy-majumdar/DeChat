package com.tencent.p014mm.plugin.webview.stub;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;

/* renamed from: com.tencent.mm.plugin.webview.stub.h */
public class C43790h implements l0$$e {
    public C43790h(WebViewStubService webViewStubService) {
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.WebViewStubService", "ServiceClick CGI return, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            return 0;
        }
        Log.m105921e("MicroMsg.WebViewStubService", "ServiceClick CGI fail, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        return 0;
    }
}
