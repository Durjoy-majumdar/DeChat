package l24;

import d24.C116554w;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* renamed from: l24.c */
public class C117438c extends C117443g {
    /* renamed from: n */
    public static C117438c m165627n() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C117438c();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public void mo182142e(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    /* renamed from: f */
    public void mo182126f(SSLSocket sSLSocket, String str, List<C116554w> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ((ArrayList) C117443g.m165641b(list)).toArray(new String[0]));
        }
    }

    /* renamed from: h */
    public SSLContext mo182131h() {
        try {
            return SSLContext.getInstance("TLSv1.3", mo182143o());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", mo182143o());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* renamed from: i */
    public String mo182127i(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* renamed from: o */
    public final Provider mo182143o() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }
}
