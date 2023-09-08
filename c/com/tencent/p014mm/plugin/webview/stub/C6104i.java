package com.tencent.p014mm.plugin.webview.stub;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.tencent.mm.plugin.webview.stub.i */
public class C6104i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ResultReceiver f22472d;

    /* renamed from: e */
    public final /* synthetic */ WebViewStubTempUI f22473e;

    public C6104i(WebViewStubTempUI webViewStubTempUI, ResultReceiver resultReceiver) {
        this.f22473e = webViewStubTempUI;
        this.f22472d = resultReceiver;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f22472d.send(0, (Bundle) null);
        this.f22473e.finish();
    }
}
