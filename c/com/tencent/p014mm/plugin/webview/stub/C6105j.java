package com.tencent.p014mm.plugin.webview.stub;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.tencent.mm.plugin.webview.stub.j */
public class C6105j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ResultReceiver f22474d;

    /* renamed from: e */
    public final /* synthetic */ WebViewStubTempUI f22475e;

    public C6105j(WebViewStubTempUI webViewStubTempUI, ResultReceiver resultReceiver) {
        this.f22475e = webViewStubTempUI;
        this.f22474d = resultReceiver;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f22474d.send(1, (Bundle) null);
        this.f22475e.finish();
    }
}
