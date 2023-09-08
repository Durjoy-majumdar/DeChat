package n24;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: n24.b */
public final class C88898b implements C117599e {

    /* renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f256397a = new LinkedHashMap();

    public C88898b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.f256397a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f256397a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public X509Certificate mo123282a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) ((LinkedHashMap) this.f256397a).get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C88898b) && ((C88898b) obj).f256397a.equals(this.f256397a);
    }

    public int hashCode() {
        return this.f256397a.hashCode();
    }
}
