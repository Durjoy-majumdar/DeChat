package g24;

import d24.C20403h;
import d24.C20407j;
import d24.C20425v;
import e24.C20507a;
import e24.C20509c;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: g24.b */
public final class C20782b {

    /* renamed from: a */
    public final List<C20407j> f58691a;

    /* renamed from: b */
    public int f58692b = 0;

    /* renamed from: c */
    public boolean f58693c;

    /* renamed from: d */
    public boolean f58694d;

    public C20782b(List<C20407j> list) {
        this.f58691a = list;
    }

    /* renamed from: a */
    public C20407j mo32466a(SSLSocket sSLSocket) {
        C20407j jVar;
        boolean z;
        int i = this.f58692b;
        int size = this.f58691a.size();
        while (true) {
            if (i >= size) {
                jVar = null;
                break;
            }
            jVar = this.f58691a.get(i);
            if (jVar.mo31914a(sSLSocket)) {
                this.f58692b = i + 1;
                break;
            }
            i++;
        }
        if (jVar != null) {
            int i2 = this.f58692b;
            while (true) {
                if (i2 >= this.f58691a.size()) {
                    z = false;
                    break;
                } else if (this.f58691a.get(i2).mo31914a(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f58693c = z;
            C20507a aVar = C20507a.f57727a;
            boolean z2 = this.f58694d;
            ((C20425v.C20426a) aVar).getClass();
            String[] n = jVar.f57242c != null ? C20509c.m22208n(C20403h.f57209b, sSLSocket.getEnabledCipherSuites(), jVar.f57242c) : sSLSocket.getEnabledCipherSuites();
            String[] n2 = jVar.f57243d != null ? C20509c.m22208n(C20509c.f57734f, sSLSocket.getEnabledProtocols(), jVar.f57243d) : sSLSocket.getEnabledProtocols();
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            Comparator<String> comparator = C20403h.f57209b;
            byte[] bArr = C20509c.f57729a;
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (((C20403h.C20404a) comparator).compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i3++;
            }
            if (z2 && i3 != -1) {
                String str = supportedCipherSuites[i3];
                int length2 = n.length + 1;
                String[] strArr = new String[length2];
                System.arraycopy(n, 0, strArr, 0, n.length);
                strArr[length2 - 1] = str;
                n = strArr;
            }
            C20407j.C20408a aVar2 = new C20407j.C20408a(jVar);
            aVar2.mo31919b(n);
            aVar2.mo31921d(n2);
            C20407j jVar2 = new C20407j(aVar2);
            String[] strArr2 = jVar2.f57243d;
            if (strArr2 != null) {
                sSLSocket.setEnabledProtocols(strArr2);
            }
            String[] strArr3 = jVar2.f57242c;
            if (strArr3 != null) {
                sSLSocket.setEnabledCipherSuites(strArr3);
            }
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f58694d + ", modes=" + this.f58691a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
