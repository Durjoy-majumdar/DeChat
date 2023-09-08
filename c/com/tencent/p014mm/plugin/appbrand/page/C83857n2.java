package com.tencent.p014mm.plugin.appbrand.page;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.WebResourceResponse;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import js0.C9514m;
import p225rc.C89912a;
import sp0.C90272a;
import sp0.C90309m;
import sp0.C90325r;

/* renamed from: com.tencent.mm.plugin.appbrand.page.n2 */
public class C83857n2 {

    /* renamed from: a */
    public C83780d1 f244839a;

    /* renamed from: b */
    public C90325r f244840b;

    /* renamed from: c */
    public volatile String f244841c;

    public C83857n2(C83780d1 d1Var) {
        this.f244839a = d1Var;
    }

    /* renamed from: a */
    public WebResourceResponse mo116415a(String str) {
        WebResourceResponse webResourceResponse = null;
        if (str == null || !this.f244839a.isRunning()) {
            return null;
        }
        String str2 = this.f244841c;
        if (TextUtils.isEmpty(str2)) {
            Log.m105921e("Luggage.AppBrandWebViewClient", "getAppResourceResponse with reqURL[%s], hostURL isEmpty", str);
            return null;
        }
        if (str.startsWith(str2)) {
            String replaceFirst = str.replaceFirst(str2, "");
            WebResourceResponse webResourceResponse2 = (WebResourceResponse) C81247g3.m99555k(this.f244839a.getRuntime(), false).mo113503f(replaceFirst, WebResourceResponse.class);
            if (webResourceResponse2 != null) {
                webResourceResponse2.setStatusCodeAndReasonPhrase(200, "OK");
                webResourceResponse = webResourceResponse2;
            } else {
                if (replaceFirst.contains("%")) {
                    webResourceResponse = (WebResourceResponse) C81247g3.m99555k(this.f244839a.getRuntime(), false).mo113503f(Uri.decode(replaceFirst), WebResourceResponse.class);
                    if (webResourceResponse != null) {
                        webResourceResponse.setStatusCodeAndReasonPhrase(200, "OK");
                    }
                }
                Log.m105921e("Luggage.AppBrandWebViewClient", "getAppResourceResponse %s not found", str);
                webResourceResponse = new WebResourceResponse("image/*", "utf-8", new ByteArrayInputStream(new byte[0]));
                webResourceResponse.setStatusCodeAndReasonPhrase(404, "NotFound");
            }
        } else {
            if (!URLUtil.isAboutUrl(str) && !URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str) && !URLUtil.isDataUrl(str)) {
                C9514m mVar = new C9514m();
                this.f244839a.getRuntime().mo113034V().readFile(str, mVar);
                if (mVar.f29691a != null) {
                    webResourceResponse = new WebResourceResponse("", "", new C89912a((ByteBuffer) mVar.f29691a));
                    webResourceResponse.setStatusCodeAndReasonPhrase(200, "OK");
                }
            }
            return webResourceResponse;
        }
        Log.m105925i("Luggage.AppBrandWebViewClient", "tryInterceptWebViewRequest, reqURL = %s", str);
        return webResourceResponse;
    }

    /* renamed from: b */
    public boolean mo116416b(SslCertificate sslCertificate) {
        if (this.f244839a.getRuntime() == null) {
            return false;
        }
        if (this.f244840b == null) {
            this.f244840b = C90309m.m113082q((C90272a) this.f244839a.getRuntime().mo113018M(C90272a.class));
        }
        if (this.f244840b == null) {
            return false;
        }
        String dName = sslCertificate.getIssuedTo().getDName();
        Log.m105918d("Luggage.AppBrandWebViewClient", "subjectDN: " + dName);
        try {
            Field declaredField = sslCertificate.getClass().getDeclaredField("mX509Certificate");
            declaredField.setAccessible(true);
            try {
                this.f244840b.checkServerTrusted(new X509Certificate[]{(X509Certificate) declaredField.get(sslCertificate)}, "generic");
                return true;
            } catch (Exception e) {
                Log.m105920e("Luggage.AppBrandWebViewClient", "Certificate check failed: " + e);
                return false;
            }
        } catch (Exception e2) {
            Log.m105921e("Luggage.AppBrandWebViewClient", "Certificate check failed: ", e2);
            return false;
        }
    }

    /* renamed from: c */
    public void mo116417c(String str) {
    }
}
