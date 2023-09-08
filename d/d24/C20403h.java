package d24;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: d24.h */
public final class C20403h {

    /* renamed from: b */
    public static final Comparator<String> f57209b = new C20404a();

    /* renamed from: c */
    public static final Map<String, C20403h> f57210c = new LinkedHashMap();

    /* renamed from: d */
    public static final C20403h f57211d = m21960b("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e */
    public static final C20403h f57212e = m21960b("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f */
    public static final C20403h f57213f = m21960b("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g */
    public static final C20403h f57214g = m21960b("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h */
    public static final C20403h f57215h = m21960b("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i */
    public static final C20403h f57216i = m21960b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j */
    public static final C20403h f57217j = m21960b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k */
    public static final C20403h f57218k = m21960b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l */
    public static final C20403h f57219l = m21960b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m */
    public static final C20403h f57220m = m21960b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n */
    public static final C20403h f57221n = m21960b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: o */
    public static final C20403h f57222o = m21960b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: p */
    public static final C20403h f57223p = m21960b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: q */
    public static final C20403h f57224q = m21960b("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: r */
    public static final C20403h f57225r = m21960b("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: s */
    public static final C20403h f57226s = m21960b("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: t */
    public static final C20403h f57227t = m21960b("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: u */
    public static final C20403h f57228u = m21960b("TLS_AES_256_CCM_8_SHA256", 4869);

    /* renamed from: a */
    public final String f57229a;

    /* renamed from: d24.h$a */
    public class C20404a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (true) {
                if (i < min) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt == charAt2) {
                        i++;
                    } else if (charAt < charAt2) {
                        return -1;
                    }
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length < length2) {
                        return -1;
                    }
                }
            }
            return 1;
        }
    }

    static {
        m21960b("SSL_RSA_WITH_NULL_MD5", 1);
        m21960b("SSL_RSA_WITH_NULL_SHA", 2);
        m21960b("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m21960b("SSL_RSA_WITH_RC4_128_MD5", 4);
        m21960b("SSL_RSA_WITH_RC4_128_SHA", 5);
        m21960b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m21960b("SSL_RSA_WITH_DES_CBC_SHA", 9);
        m21960b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m21960b("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m21960b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m21960b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m21960b("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m21960b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m21960b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m21960b("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m21960b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m21960b("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m21960b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m21960b("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m21960b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m21960b("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m21960b("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m21960b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m21960b("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m21960b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m21960b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m21960b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m21960b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        m21960b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m21960b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m21960b("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        m21960b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m21960b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m21960b("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m21960b("TLS_RSA_WITH_NULL_SHA256", 59);
        m21960b("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m21960b("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m21960b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m21960b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m21960b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m21960b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m21960b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m21960b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m21960b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m21960b("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m21960b("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m21960b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m21960b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m21960b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m21960b("TLS_PSK_WITH_RC4_128_SHA", 138);
        m21960b("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m21960b("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m21960b("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m21960b("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        m21960b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m21960b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m21960b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m21960b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m21960b("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m21960b("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m21960b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m21960b("TLS_FALLBACK_SCSV", 22016);
        m21960b("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m21960b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m21960b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m21960b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m21960b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m21960b("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m21960b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m21960b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m21960b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m21960b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m21960b("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m21960b("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m21960b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m21960b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m21960b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m21960b("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m21960b("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m21960b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        m21960b("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m21960b("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m21960b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m21960b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m21960b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m21960b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m21960b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m21960b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m21960b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m21960b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m21960b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m21960b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m21960b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        m21960b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m21960b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m21960b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m21960b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m21960b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m21960b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        m21960b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m21960b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
    }

    public C20403h(String str) {
        str.getClass();
        this.f57229a = str;
    }

    /* renamed from: a */
    public static synchronized C20403h m21959a(String str) {
        C20403h hVar;
        synchronized (C20403h.class) {
            Map<String, C20403h> map = f57210c;
            hVar = (C20403h) ((LinkedHashMap) map).get(str);
            if (hVar == null) {
                hVar = (C20403h) ((LinkedHashMap) map).get(m21961c(str));
                if (hVar == null) {
                    hVar = new C20403h(str);
                }
                map.put(str, hVar);
            }
        }
        return hVar;
    }

    /* renamed from: b */
    public static C20403h m21960b(String str, int i) {
        C20403h hVar = new C20403h(str);
        f57210c.put(str, hVar);
        return hVar;
    }

    /* renamed from: c */
    public static String m21961c(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            return "TLS_" + str.substring(4);
        }
    }

    public String toString() {
        return this.f57229a;
    }
}
