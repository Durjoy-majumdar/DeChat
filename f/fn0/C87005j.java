package fn0;

import an0.C79592a;
import com.tencent.xweb.file.XVFSFile;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: fn0.j */
public class C87005j implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        C87002g.m108023q(3, "SSLUtil", "checkClientTrusted", (Throwable) null);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (C79592a.m96648a().f233399b) {
            int i = 0;
            while (i < x509CertificateArr.length) {
                X509Certificate x509Certificate = x509CertificateArr[i];
                StringBuilder sb = new StringBuilder();
                sb.append(" Server certificate ");
                i++;
                sb.append(i);
                sb.append(XVFSFile.PATH_SEPARATOR);
                C87002g.m108023q(3, "SSLUtil", sb.toString(), (Throwable) null);
                C87002g.m108023q(3, "SSLUtil", "  Subject DN: " + x509Certificate.getSubjectX500Principal(), (Throwable) null);
                C87002g.m108023q(3, "SSLUtil", "  Issuer DN: " + x509Certificate.getIssuerX500Principal(), (Throwable) null);
                C87002g.m108023q(3, "SSLUtil", "  Signature Algorithm: " + x509Certificate.getSigAlgName(), (Throwable) null);
                C87002g.m108023q(3, "SSLUtil", "  Valid from: " + x509Certificate.getNotBefore(), (Throwable) null);
                C87002g.m108023q(3, "SSLUtil", "  Valid until: " + x509Certificate.getNotAfter(), (Throwable) null);
                C87002g.m108023q(3, "SSLUtil", "  Serial #: " + x509Certificate.getSerialNumber().toString(16), (Throwable) null);
            }
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
