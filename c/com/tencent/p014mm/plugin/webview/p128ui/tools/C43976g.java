package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebView;
import di3.C86312j;
import h81.C32735h;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.g */
public class C43976g implements C43856f {

    /* renamed from: a */
    public Context f119123a;

    /* renamed from: b */
    public WebView f119124b;

    /* renamed from: c */
    public Map<String, List<SslErrorHandler>> f119125c;

    /* renamed from: d */
    public Map<String, Boolean> f119126d;

    /* renamed from: e */
    public List<String> f119127e = null;

    /* renamed from: f */
    public KeyStore f119128f = null;

    public C43976g(Context context, WebView webView) {
        new SimpleDateFormat("yyyy-MM-dd HH:mmZ", Locale.getDefault());
        this.f119123a = context;
        this.f119124b = webView;
        this.f119125c = new HashMap();
        this.f119126d = new HashMap();
    }

    /* renamed from: a */
    public boolean mo68565a(SslCertificate sslCertificate) {
        if (sslCertificate == null) {
            Log.m105924i("MicroMsg.WebView.MMSslErrorHandler", "isUserCertificates sslCertificate is null");
            return false;
        }
        Log.m105925i("MicroMsg.WebView.MMSslErrorHandler", "isUserCertificates dnName = %s", sslCertificate.getIssuedBy().getDName());
        try {
            Field declaredField = sslCertificate.getClass().getDeclaredField("mX509Certificate");
            declaredField.setAccessible(true);
            X509Certificate x509Certificate = (X509Certificate) declaredField.get(sslCertificate);
            if (this.f119128f == null) {
                KeyStore instance = KeyStore.getInstance("AndroidCAStore");
                this.f119128f = instance;
                instance.load((InputStream) null, (char[]) null);
            }
            if (this.f119127e == null) {
                this.f119127e = new ArrayList();
                Enumeration<String> aliases = this.f119128f.aliases();
                while (aliases.hasMoreElements()) {
                    String nextElement = aliases.nextElement();
                    if (nextElement != null && nextElement.startsWith("user:")) {
                        this.f119127e.add(nextElement);
                    }
                }
            }
            for (String certificate : this.f119127e) {
                try {
                    x509Certificate.verify(((X509Certificate) this.f119128f.getCertificate(certificate)).getPublicKey());
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebView.MMSslErrorHandler", "isUserCertificates ex %s", e.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public void mo68566b(String str, SslErrorHandler sslErrorHandler, SslError sslError) {
        Log.m105921e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError, currentUrl = %s", str);
        if (this.f119124b == null) {
            Log.m105920e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError fail, has been detached");
        } else if (Util.isNullOrNil(str)) {
            sslErrorHandler.cancel();
        } else {
            Boolean bool = (Boolean) ((HashMap) this.f119126d).get(str);
            if (bool != null) {
                Log.m105927v("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError, already selected = %b", bool);
                if (bool.booleanValue()) {
                    sslErrorHandler.proceed();
                } else {
                    sslErrorHandler.cancel();
                }
            } else {
                try {
                    int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_skip_user_cert, 1);
                    Log.m105925i("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError skipUserCert = %d", Integer.valueOf(Qe));
                    if (Qe == 1 && mo68565a(sslError.getCertificate())) {
                        Log.m105924i("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError use user certificatess");
                        ((HashMap) this.f119126d).put(str, Boolean.TRUE);
                        sslErrorHandler.proceed();
                        return;
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError : " + e.getLocalizedMessage());
                }
                try {
                    URL url = new URL(str);
                    Log.m105918d("MicroMsg.WebView.MMSslErrorHandler", "host = " + url.getHost() + ", but it not end with '.qq.com'");
                    sslErrorHandler.cancel();
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.WebView.MMSslErrorHandler", "create url fail : " + e2.getLocalizedMessage());
                }
            }
        }
    }
}
