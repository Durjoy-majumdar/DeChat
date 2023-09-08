package d24;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import e24.C20509c;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: d24.q */
public final class C20418q {

    /* renamed from: a */
    public final C20402f0 f57258a;

    /* renamed from: b */
    public final C20403h f57259b;

    /* renamed from: c */
    public final List<Certificate> f57260c;

    /* renamed from: d */
    public final List<Certificate> f57261d;

    public C20418q(C20402f0 f0Var, C20403h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f57258a = f0Var;
        this.f57259b = hVar;
        this.f57260c = list;
        this.f57261d = list2;
    }

    /* renamed from: a */
    public static C20418q m21970a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C20403h a = C20403h.m21959a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C20402f0 a2 = C20402f0.m21958a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List m = certificateArr != null ? C20509c.m22207m(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new C20418q(a2, a, m, localCertificates != null ? C20509c.m22207m(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C20418q)) {
            return false;
        }
        C20418q qVar = (C20418q) obj;
        return this.f57258a.equals(qVar.f57258a) && this.f57259b.equals(qVar.f57259b) && this.f57260c.equals(qVar.f57260c) && this.f57261d.equals(qVar.f57261d);
    }

    public int hashCode() {
        return ((((((C1883v2.CTRL_INDEX + this.f57258a.hashCode()) * 31) + this.f57259b.hashCode()) * 31) + this.f57260c.hashCode()) * 31) + this.f57261d.hashCode();
    }
}
