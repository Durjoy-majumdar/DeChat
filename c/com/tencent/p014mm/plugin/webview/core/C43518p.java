package com.tencent.p014mm.plugin.webview.core;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.core.p */
public final class C43518p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SslError f117660d;

    /* renamed from: e */
    public final /* synthetic */ C30579m f117661e;

    /* renamed from: f */
    public final /* synthetic */ String f117662f;

    /* renamed from: g */
    public final /* synthetic */ int f117663g;

    /* renamed from: h */
    public final /* synthetic */ int f117664h;

    public C43518p(SslError sslError, C30579m mVar, String str, int i, int i2) {
        this.f117660d = sslError;
        this.f117661e = mVar;
        this.f117662f = str;
        this.f117663g = i;
        this.f117664h = i2;
    }

    public final void run() {
        Uri uri;
        String host;
        String url = this.f117660d.getUrl();
        String str = "";
        if (url == null) {
            url = str;
        }
        String str2 = null;
        try {
            uri = Uri.parse(url);
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.WebPageErrorMonitor", "onReceivedError, parse uri error:" + url);
            uri = null;
        }
        if (!(uri == null || (host = uri.getHost()) == null)) {
            str = host;
        }
        int primaryError = this.f117660d.getPrimaryError();
        C30579m mVar = this.f117661e;
        SslCertificate certificate = this.f117660d.getCertificate();
        if (certificate != null) {
            str2 = certificate.toString();
        }
        String a = C30579m.m39133a(mVar, str2);
        C115669n.INSTANCE.mo160131h(22086, 3, Integer.valueOf(primaryError), str, C30579m.m39133a(this.f117661e, url), a, 1, this.f117662f, Integer.valueOf(this.f117663g), Integer.valueOf(this.f117664h));
    }
}
