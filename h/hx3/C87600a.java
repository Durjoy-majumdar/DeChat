package hx3;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.text.TextUtils;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* renamed from: hx3.a */
public final class C87600a implements X509TrustManager {

    /* renamed from: a */
    public X509TrustManager f253695a;

    /* renamed from: b */
    public X509TrustManagerExtensions f253696b = null;

    /* renamed from: c */
    public String f253697c;

    public C87600a(String str) {
        this.f253697c = str;
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers.length != 0) {
            this.f253695a = (X509TrustManager) trustManagers[0];
            if (Build.VERSION.SDK_INT > 23) {
                this.f253696b = new X509TrustManagerExtensions(this.f253695a);
                return;
            }
            return;
        }
        throw new NoSuchAlgorithmException("no trust manager found");
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        X509TrustManager x509TrustManager = this.f253695a;
        if (x509TrustManager != null) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        boolean z;
        X509TrustManagerExtensions x509TrustManagerExtensions;
        if (Build.VERSION.SDK_INT <= 23 || (x509TrustManagerExtensions = this.f253696b) == null) {
            X509TrustManager x509TrustManager = this.f253695a;
            if (x509TrustManager != null) {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } else {
            x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, "");
        }
        boolean z2 = false;
        try {
            X500Principal issuerX500Principal = x509CertificateArr[0].getIssuerX500Principal();
            ArrayList arrayList = new ArrayList(0);
            arrayList.add(".*(GeoTrust|VeriSign|Symantec|GlobalSign|Entrust|Thawte|DigiCert).*");
            if (!TextUtils.isEmpty(this.f253697c)) {
                arrayList.add(this.f253697c);
            }
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    z = false;
                    break;
                } else if (Pattern.compile((String) arrayList.get(i), 2).matcher(issuerX500Principal.getName()).matches()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                X500Principal subjectX500Principal = x509CertificateArr[0].getSubjectX500Principal();
                ArrayList arrayList2 = new ArrayList(0);
                arrayList2.add(".*CN=.*(\\.95516\\.com|\\.chinaunionpay\\.com|\\.unionpay\\.com|\\.unionpaysecure\\.com|\\.95516\\.net)(,.*|$)");
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        break;
                    } else if (Pattern.compile((String) arrayList2.get(i2), 2).matcher(subjectX500Principal.getName()).matches()) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z2) {
                    throw new CertificateException();
                }
                return;
            }
            throw new CertificateException();
        } catch (Exception unused) {
            throw new CertificateException();
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.f253695a.getAcceptedIssuers();
    }
}
