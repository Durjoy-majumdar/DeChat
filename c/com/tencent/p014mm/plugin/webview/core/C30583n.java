package com.tencent.p014mm.plugin.webview.core;

import android.net.Uri;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.core.n */
public final class C30583n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f82368d;

    /* renamed from: e */
    public final /* synthetic */ int f82369e;

    /* renamed from: f */
    public final /* synthetic */ C30579m f82370f;

    /* renamed from: g */
    public final /* synthetic */ String f82371g;

    /* renamed from: h */
    public final /* synthetic */ String f82372h;

    /* renamed from: i */
    public final /* synthetic */ int f82373i;

    /* renamed from: j */
    public final /* synthetic */ int f82374j;

    public C30583n(String str, int i, C30579m mVar, String str2, String str3, int i2, int i3) {
        this.f82368d = str;
        this.f82369e = i;
        this.f82370f = mVar;
        this.f82371g = str2;
        this.f82372h = str3;
        this.f82373i = i2;
        this.f82374j = i3;
    }

    public final void run() {
        Uri uri;
        String str;
        try {
            uri = Uri.parse(this.f82368d);
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.WebPageErrorMonitor", "onReceivedError, parse uri error:" + this.f82368d);
            uri = null;
        }
        if (uri == null || (str = uri.getHost()) == null) {
            str = "";
        }
        C115669n.INSTANCE.mo160131h(22086, 4, Integer.valueOf(this.f82369e), str, C30579m.m39133a(this.f82370f, this.f82368d), C30579m.m39133a(this.f82370f, this.f82371g), 1, this.f82372h, Integer.valueOf(this.f82373i), Integer.valueOf(this.f82374j));
    }
}
