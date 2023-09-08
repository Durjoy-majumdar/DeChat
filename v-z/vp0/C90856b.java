package vp0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import yp0.C91539c;

/* renamed from: vp0.b */
public final class C90856b implements X509TrustManager {

    /* renamed from: b */
    public static final C90858b f260830b = new C90858b((C8480h) null);

    /* renamed from: c */
    public static final C13601g<X509TrustManager> f260831c = C36568h.m40985a(C90857a.f260833d);

    /* renamed from: a */
    public final X509TrustManager f260832a;

    /* renamed from: vp0.b$a */
    public static final class C90857a extends C87413o implements C32224a<X509TrustManager> {

        /* renamed from: d */
        public static final C90857a f260833d = new C90857a();

        public C90857a() {
            super(0);
        }

        public Object invoke() {
            try {
                return C90858b.m113941a(C90856b.f260830b);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FixedX509TrustManager", e, "provideDefaultX509TrustManager fail", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: vp0.b$b */
    public static final class C90858b {
        public C90858b(C8480h hVar) {
        }

        /* renamed from: a */
        public static final X509TrustManager m113941a(C90858b bVar) {
            bVar.getClass();
            String defaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
            C87412m.m108593f(defaultAlgorithm, "getDefaultAlgorithm()");
            TrustManagerFactory instance = TrustManagerFactory.getInstance(defaultAlgorithm);
            C87412m.m108593f(instance, "getInstance(algorithm)");
            instance.init((KeyStore) null);
            try {
                TrustManager[] trustManagers = instance.getTrustManagers();
                C87412m.m108593f(trustManagers, "trustManagers");
                int i = 0;
                int length = trustManagers.length;
                while (i < length) {
                    TrustManager trustManager = trustManagers[i];
                    if (trustManager instanceof X509TrustManager) {
                        try {
                            return (X509TrustManager) trustManager;
                        } catch (IllegalArgumentException e) {
                            String name = trustManager.getClass().getName();
                            Log.m105920e("MicroMsg.FixedX509TrustManager", "Error creating trust manager (" + name + "): " + e);
                        }
                    } else {
                        i++;
                    }
                }
                Log.m105920e("MicroMsg.FixedX509TrustManager", "Could not find suitable trust manager");
                return null;
            } catch (RuntimeException e2) {
                Log.m105920e("MicroMsg.FixedX509TrustManager", "TrustManagerFactory.getTrustManagers() unexpectedly threw: " + e2);
                throw new KeyStoreException(e2);
            }
        }

        /* renamed from: b */
        public static C90856b m113942b(C90858b bVar, X509TrustManager x509TrustManager, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar.getClass();
                x509TrustManager = (X509TrustManager) ((C36570n) C90856b.f260831c).getValue();
            }
            bVar.getClass();
            Log.m105924i("MicroMsg.FixedX509TrustManager", "create, realX509TrustManager: " + x509TrustManager);
            if (x509TrustManager == null) {
                return null;
            }
            return new C90856b(x509TrustManager, (C8480h) null);
        }
    }

    public C90856b(X509TrustManager x509TrustManager, C8480h hVar) {
        this.f260832a = x509TrustManager;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f260832a.checkClientTrusted(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        C90854a aVar = C90854a.f260826a;
        C91539c cVar = (C91539c) ((C36570n) C90854a.f260828c).getValue();
        X509TrustManager x509TrustManager = this.f260832a;
        cVar.getClass();
        C87412m.m108594g(x509TrustManager, "trustManager");
        try {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            if (C91539c.f262363b) {
                Log.m105918d("MicroMsg.Verify.CertVerifyProcess", "doVerify, verify fail since " + e);
            }
            if (x509CertificateArr != null) {
                boolean z = false;
                try {
                    z = cVar.mo125444b(x509TrustManager, C110823p.m151003c0(x509CertificateArr), str);
                } catch (Exception e2) {
                    if (C91539c.f262363b) {
                        Log.printErrStackTrace("MicroMsg.Verify.CertVerifyProcess", e2, "tryVerifyWithAIAFetching, verify fail", new Object[0]);
                    }
                }
                if (!z) {
                    throw e;
                }
                return;
            }
            throw e;
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.f260832a.getAcceptedIssuers();
    }
}
