package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.g */
public class C1799g implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ Activity f11591d;

    /* renamed from: e */
    public final /* synthetic */ C88267e f11592e;

    /* renamed from: f */
    public final /* synthetic */ int f11593f;

    /* renamed from: g */
    public final /* synthetic */ C1803i f11594g;

    public C1799g(C1803i iVar, Activity activity, C88267e eVar, int i) {
        this.f11594g = iVar;
        this.f11591d = activity;
        this.f11592e = eVar;
        this.f11593f = i;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "mmOnActivityResult, resultCode = " + i2);
        if (i2 == -1) {
            if (intent != null && intent.hasExtra("url")) {
                Intent intent2 = new Intent();
                if (intent.hasExtra("view_port_code")) {
                    intent2.putExtra("view_port_code", intent.getStringExtra("view_port_code"));
                }
                try {
                    intent2.putExtra("rawUrl", intent.getStringExtra("url"));
                    C88144b.m109791i(this.f11591d, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "loadUrl ex: %s", e.getMessage());
                }
            }
            this.f11592e.mo109647a(this.f11593f, this.f11594g.mo115109j("ok"));
            return;
        }
        this.f11592e.mo109647a(this.f11593f, this.f11594g.mo115109j("cancel"));
    }
}
