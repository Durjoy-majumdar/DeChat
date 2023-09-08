package d24;

import com.tencent.xweb.file.XVFSFile;
import e24.C20509c;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import n24.C117598c;
import o24.C21769k;

/* renamed from: d24.g */
public final class C116552g {

    /* renamed from: c */
    public static final C116552g f349551c = new C116552g(new LinkedHashSet(new ArrayList()), (C117598c) null);

    /* renamed from: a */
    public final Set<C7166a> f349552a;

    /* renamed from: b */
    public final C117598c f349553b;

    /* renamed from: d24.g$a */
    public static final class C7166a {
        public boolean equals(Object obj) {
            if (!(obj instanceof C7166a)) {
                return false;
            }
            ((C7166a) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public C116552g(Set<C7166a> set, C117598c cVar) {
        this.f349552a = set;
        this.f349553b = cVar;
    }

    /* renamed from: b */
    public static String m164391b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + C21769k.m24902j(((X509Certificate) certificate).getPublicKey().getEncoded()).mo34083e("SHA-256").mo34082a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    public void mo180529a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<C7166a> it = this.f349552a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        } else if (!emptyList.isEmpty()) {
            C117598c cVar = this.f349553b;
            if (cVar != null) {
                list = cVar.mo182137a(list, str);
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                if (emptyList.size() <= 0) {
                    i++;
                } else {
                    ((C7166a) emptyList.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(m164391b(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(XVFSFile.PATH_SEPARATOR);
            int size3 = emptyList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sb.append("\n    ");
                sb.append((C7166a) emptyList.get(i3));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C116552g) {
            C116552g gVar = (C116552g) obj;
            return C20509c.m22203i(this.f349553b, gVar.f349553b) && this.f349552a.equals(gVar.f349552a);
        }
    }

    public int hashCode() {
        C117598c cVar = this.f349553b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f349552a.hashCode();
    }
}
