package com.tencent.p014mm.plugin.webview.stub;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.webview.stub.k */
public class C6106k implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewStubTempUI f22476d;

    public C6106k(WebViewStubTempUI webViewStubTempUI) {
        this.f22476d = webViewStubTempUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f22476d.finish();
    }
}
