package pt3;

import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.Certificate;
import nt3.C117635a;
import ot3.C117896h;
import ot3.C117897l;
import ot3.C21881e;
import ot3.C21884f;
import ot3.C21885g;
import ot3.C21886i;

/* renamed from: pt3.a */
public class C22004a extends C22006c {
    public C22004a(String str) {
        super(str);
    }

    /* renamed from: b */
    public C21885g mo35097b() {
        C21881e.m25084c("Soter.CertSoterCore", "soter: start generate ask", new Object[0]);
        if (mo35110m()) {
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", this.f62268b);
                instance.initialize(C117635a.m165916b(C21884f.m25094a().f61885a + ".addcounter.auto_signed_when_get_pubkey_attk", 16).mo182363c("SHA-256").mo182364d("PSS").mo182362a());
                long nanoTime = System.nanoTime();
                instance.generateKeyPair();
                C21881e.m25084c("Soter.CertSoterCore", "soter: generate successfully. cost: %d ms", Long.valueOf(((System.nanoTime() - nanoTime) / 1000) / 1000));
                C21886i.m25097b();
                return new C21885g(0);
            } catch (Exception e) {
                C21881e.m25083b("Soter.CertSoterCore", "soter: generateAppGlobalSecureKey " + e.toString(), new Object[0]);
                C21881e.m25085d("Soter.CertSoterCore", e, "soter: generateAppGlobalSecureKey error");
                return new C21885g(4, e.toString());
            } catch (OutOfMemoryError e2) {
                C21881e.m25085d("Soter.CertSoterCore", e2, "soter: out of memory when generate ASK!! maybe no attk inside");
                C21886i.m25096a();
            }
        } else {
            C21881e.m25083b("Soter.CertSoterCore", "soter: not support soter", new Object[0]);
            return new C21885g(2);
        }
    }

    /* renamed from: d */
    public C117897l mo35098d() {
        C21881e.m25084c("Soter.CertSoterCore", "soter: start get app global secure key pub", new Object[0]);
        if (mo35110m()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.f62268b);
                instance.load((KeyStore.LoadStoreParameter) null);
                try {
                    Certificate[] certificateChain = instance.getCertificateChain(C21884f.m25094a().f61885a);
                    if (certificateChain != null) {
                        C21886i.m25097b();
                        return new C117897l(certificateChain);
                    }
                    C21881e.m25083b("Soter.CertSoterCore", "soter: key can not be retrieved", new Object[0]);
                    return null;
                } catch (ClassCastException e) {
                    C21881e.m25083b("Soter.CertSoterCore", "soter: cast error: " + e.toString(), new Object[0]);
                    return null;
                }
            } catch (Exception e2) {
                C21881e.m25085d("Soter.CertSoterCore", e2, "soter: error when get ask");
            } catch (OutOfMemoryError e3) {
                C21881e.m25085d("Soter.CertSoterCore", e3, "soter: out of memory when getting ask!! maybe no attk inside");
                C21886i.m25096a();
            }
        } else {
            C21881e.m25083b("Soter.CertSoterCore", "soter: not support soter", new Object[0]);
            return null;
        }
    }

    /* renamed from: u */
    public Signature mo35099u(String str) {
        C21881e.m25082a("Monday", "CertSoterCore initAuthKeySignature", new Object[0]);
        if (C117896h.m166297b(str)) {
            C21881e.m25083b("Soter.CertSoterCore", "soter: auth key name is null or nil. abort.", new Object[0]);
            return null;
        }
        Signature instance = Signature.getInstance("SHA256withRSA/PSS");
        KeyStore instance2 = KeyStore.getInstance(this.f62268b);
        instance2.load((KeyStore.LoadStoreParameter) null);
        Key key = instance2.getKey(str, (char[]) null);
        if (key != null) {
            instance.initSign((PrivateKey) key);
            return instance;
        }
        C21881e.m25083b("Soter.CertSoterCore", "soter: entry not exists", new Object[0]);
        return null;
    }
}
