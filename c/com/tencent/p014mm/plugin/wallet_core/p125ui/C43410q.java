package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.q */
public class C43410q extends WebViewClient {

    /* renamed from: a */
    public Context f117369a;

    public C43410q(Context context) {
        this.f117369a = context;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        Log.m105919d("MicroMsg.ProtoColWebViewClient", "raw url: %s", intent.getStringExtra("rawUrl"));
        C88144b.m109791i(this.f117369a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return true;
    }
}
