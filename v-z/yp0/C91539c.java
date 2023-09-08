package yp0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import rx3.C13601g;
import rx3.C36568h;
import xp0.C38798c;

/* renamed from: yp0.c */
public final class C91539c {

    /* renamed from: b */
    public static final boolean f262363b = (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED);

    /* renamed from: c */
    public static final C13601g<CertificateFactory> f262364c = C36568h.m40985a(C91540a.f262366d);

    /* renamed from: a */
    public final C38798c f262365a;

    /* renamed from: yp0.c$a */
    public static final class C91540a extends C87413o implements C32224a<CertificateFactory> {

        /* renamed from: d */
        public static final C91540a f262366d = new C91540a();

        public C91540a() {
            super(0);
        }

        public Object invoke() {
            try {
                return CertificateFactory.getInstance("X.509");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Verify.CertVerifyProcess", e, "initialize certificateFactory fail", new Object[0]);
                return null;
            }
        }
    }

    public C91539c(C38798c cVar) {
        C87412m.m108594g(cVar, "certNetFetcher");
        this.f262365a = cVar;
    }

    /* renamed from: a */
    public final X509Certificate mo125443a(List<X509Certificate> list, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2;
        HashSet hashSet = new HashSet();
        while (true) {
            hashSet.add(x509Certificate);
            Iterator<X509Certificate> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    x509Certificate2 = null;
                    break;
                }
                x509Certificate2 = it.next();
                X500Principal subjectX500Principal = x509Certificate2.getSubjectX500Principal();
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                boolean z = f262363b;
                if (z) {
                    Log.m105918d("MicroMsg.Verify.CertVerifyProcess", "findLastCertWithUnknownIssuer, certSubject: " + subjectX500Principal + ", lastCertIssuer: " + issuerX500Principal);
                }
                if (C87412m.m108589b(subjectX500Principal, issuerX500Principal)) {
                    if (z) {
                        Log.m105918d("MicroMsg.Verify.CertVerifyProcess", "findLastCertWithUnknownIssuer, certSubject is the same as lastCertIssuer");
                    }
                }
            }
            if (x509Certificate2 == null) {
                return x509Certificate;
            }
            X500Principal subjectX500Principal2 = x509Certificate2.getSubjectX500Principal();
            X500Principal issuerX500Principal2 = x509Certificate2.getIssuerX500Principal();
            boolean z2 = f262363b;
            if (z2) {
                Log.m105918d("MicroMsg.Verify.CertVerifyProcess", "findLastCertWithUnknownIssuer, lastIssuerCertSubject: " + subjectX500Principal2 + ", lastIssuerCertIssuer: " + issuerX500Principal2);
            }
            if (C87412m.m108589b(subjectX500Principal2, issuerX500Principal2)) {
                if (z2) {
                    Log.m105918d("MicroMsg.Verify.CertVerifyProcess", "findLastCertWithUnknownIssuer, lastIssuerCertSubject is the same as lastIssuerCertIssuer");
                }
                return null;
            } else if (hashSet.contains(x509Certificate2)) {
                return null;
            } else {
                x509Certificate = x509Certificate2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x022c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0146 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x007d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0162 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2 A[Catch:{ Exception -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo125444b(javax.net.ssl.X509TrustManager r17, java.util.List<java.security.cert.X509Certificate> r18, java.lang.String r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            boolean r0 = f262363b
            java.lang.String r3 = "MicroMsg.Verify.CertVerifyProcess"
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "tryVerifyWithAIAFetching"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
        L_0x0010:
            boolean r0 = r18.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "tryVerifyWithAIAFetching, chain is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r4
        L_0x001e:
            java.lang.Object r0 = r2.get(r4)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.security.cert.X509Certificate r0 = r1.mo125443a(r2, r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "tryVerifyWithAIAFetching, lastCertWithUnknownIssuer is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r4
        L_0x0031:
            r5 = r0
            r6 = 0
        L_0x0033:
            java.lang.String r0 = "1.3.6.1.5.5.7.1.1"
            byte[] r0 = r5.getExtensionValue(r0)
            java.lang.String r7 = "MicroMsg.Verify.AuthorityInfoAccess"
            r9 = 1
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "parseAIA, aiaExtVal is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0143
        L_0x0046:
            wp0.c r10 = new wp0.c     // Catch:{ Exception -> 0x012d }
            int r11 = r0.length     // Catch:{ Exception -> 0x012d }
            wp0.a$a r12 = wp0.C91053a.f261213d     // Catch:{ Exception -> 0x012d }
            wp0.a r0 = r12.mo125115a(r0, r4, r11)     // Catch:{ Exception -> 0x012d }
            r10.<init>(r0)     // Catch:{ Exception -> 0x012d }
            r0 = 4
            wp0.a r0 = r10.mo125121f(r0)     // Catch:{ Exception -> 0x012d }
            wp0.c r10 = new wp0.c
            r10.<init>(r0)
            wp0.c r0 = r10.mo125120e()     // Catch:{ Exception -> 0x0115 }
            r0.mo125116a()
            int r10 = r0.f261220c
            wp0.a r11 = r0.f261218a
            int r11 = r11.f261216c
            if (r10 != r11) goto L_0x006d
            r10 = 1
            goto L_0x006e
        L_0x006d:
            r10 = 0
        L_0x006e:
            if (r10 == 0) goto L_0x0078
            java.lang.String r0 = "parseAIA, seqParser data is exhausted"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0143
        L_0x0078:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x00fe }
            r10.<init>()     // Catch:{ Exception -> 0x00fe }
        L_0x007d:
            r0.mo125116a()     // Catch:{ Exception -> 0x00fe }
            int r11 = r0.f261220c     // Catch:{ Exception -> 0x00fe }
            wp0.a r12 = r0.f261218a     // Catch:{ Exception -> 0x00fe }
            int r12 = r12.f261216c     // Catch:{ Exception -> 0x00fe }
            if (r11 != r12) goto L_0x008a
            r11 = 1
            goto L_0x008b
        L_0x008a:
            r11 = 0
        L_0x008b:
            if (r11 != 0) goto L_0x00f8
            wp0.c r11 = r0.mo125120e()     // Catch:{ Exception -> 0x00fe }
            r12 = 6
            wp0.a r12 = r11.mo125121f(r12)     // Catch:{ Exception -> 0x00fe }
            r11.mo125116a()     // Catch:{ Exception -> 0x00fe }
            rx3.l r13 = r11.mo125118c()     // Catch:{ Exception -> 0x00fe }
            r11.mo125117b(r4)     // Catch:{ Exception -> 0x00fe }
            A r11 = r13.f38555d     // Catch:{ Exception -> 0x00fe }
            java.lang.Number r11 = (java.lang.Number) r11     // Catch:{ Exception -> 0x00fe }
            int r11 = r11.intValue()     // Catch:{ Exception -> 0x00fe }
            B r13 = r13.f38556e     // Catch:{ Exception -> 0x00fe }
            wp0.a r13 = (wp0.C91053a) r13     // Catch:{ Exception -> 0x00fe }
            r14 = -2147483642(0xffffffff80000006, float:-8.4E-45)
            if (r11 != r14) goto L_0x007d
            byte[] r11 = yp0.C91538b.f262362a     // Catch:{ Exception -> 0x00fe }
            r12.getClass()     // Catch:{ Exception -> 0x00fe }
            int r14 = r12.f261216c     // Catch:{ Exception -> 0x00fe }
            r15 = 8
            if (r14 == r15) goto L_0x00bd
            goto L_0x00c8
        L_0x00bd:
            r14 = 0
        L_0x00be:
            if (r14 >= r15) goto L_0x00cf
            byte r8 = r12.mo125113a(r14)     // Catch:{ Exception -> 0x00fe }
            byte r15 = r11[r14]     // Catch:{ Exception -> 0x00fe }
            if (r8 == r15) goto L_0x00ca
        L_0x00c8:
            r8 = 0
            goto L_0x00d0
        L_0x00ca:
            int r14 = r14 + 1
            r15 = 8
            goto L_0x00be
        L_0x00cf:
            r8 = 1
        L_0x00d0:
            if (r8 == 0) goto L_0x007d
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x00fe }
            byte[] r11 = r13.f261214a     // Catch:{ Exception -> 0x00fe }
            int r12 = r13.f261215b     // Catch:{ Exception -> 0x00fe }
            int r13 = r13.f261216c     // Catch:{ Exception -> 0x00fe }
            java.nio.charset.Charset r14 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00fe }
            r8.<init>(r11, r12, r13, r14)     // Catch:{ Exception -> 0x00fe }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fe }
            r11.<init>()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r12 = "parseAIA, caIssuersUri: "
            r11.append(r12)     // Catch:{ Exception -> 0x00fe }
            r11.append(r8)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00fe }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)     // Catch:{ Exception -> 0x00fe }
            r10.add(r8)     // Catch:{ Exception -> 0x00fe }
            goto L_0x007d
        L_0x00f8:
            yp0.a r0 = new yp0.a     // Catch:{ Exception -> 0x00fe }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00fe }
            goto L_0x0144
        L_0x00fe:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "parseAIA, parse fail since "
            r8.append(r10)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0143
        L_0x0115:
            r0 = move-exception
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "parseAIA, readSequence fail since "
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0143
        L_0x012d:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "parseAIA, readTag(OCTET_STRING) fail since "
            r8.append(r10)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x0143:
            r0 = 0
        L_0x0144:
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = "tryVerifyWithAIAFetching, aiaInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r4
        L_0x014d:
            java.util.List<java.lang.String> r7 = r0.f262361a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x015c
            java.lang.String r0 = "tryVerifyWithAIAFetching, caIssuersUris is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r4
        L_0x015c:
            java.util.List<java.lang.String> r0 = r0.f262361a
            java.util.Iterator r7 = r0.iterator()
        L_0x0162:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0233
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            int r6 = r6 + 1
            r8 = 5
            if (r8 >= r6) goto L_0x017a
            java.lang.String r0 = "tryVerifyWithAIAFetching, reach max fetch num"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r4
        L_0x017a:
            boolean r8 = f262363b
            if (r8 == 0) goto L_0x0193
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "performAIAFetch, caIssuerUri: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r10)
        L_0x0193:
            rx3.g<java.security.cert.CertificateFactory> r10 = f262364c
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            java.security.cert.CertificateFactory r10 = (java.security.cert.CertificateFactory) r10
            if (r10 != 0) goto L_0x01a8
            if (r8 == 0) goto L_0x01e8
            java.lang.String r0 = "performAIAFetch, certificateFactory is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            goto L_0x01e8
        L_0x01a8:
            xp0.c r8 = r1.f262365a
            r11 = 15000(0x3a98, float:2.102E-41)
            r12 = 65536(0x10000, float:9.18355E-41)
            xp0.c$a r0 = r8.mo61764a(r0, r11, r12)
            byte[] r0 = r0.mo61765a()     // Catch:{ Exception -> 0x01d1 }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x01c7 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x01c7 }
            java.security.cert.Certificate r0 = r10.generateCertificate(r8)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r8 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            gy3.C87412m.m108592e(r0, r8)     // Catch:{ Exception -> 0x01c7 }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ Exception -> 0x01c7 }
            goto L_0x01e9
        L_0x01c7:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r10 = "performAIAFetch, generate certificate fail"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r10, r8)
            goto L_0x01e8
        L_0x01d1:
            r0 = move-exception
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "performAIAFetch, fetch fail since "
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
        L_0x01e8:
            r0 = 0
        L_0x01e9:
            if (r0 != 0) goto L_0x01f1
            r8 = r17
            r10 = r19
            goto L_0x0162
        L_0x01f1:
            r2.add(r0)
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r4]     // Catch:{ Exception -> 0x020c }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ Exception -> 0x020c }
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r0, r8)     // Catch:{ Exception -> 0x020c }
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0     // Catch:{ Exception -> 0x020c }
            r8 = r17
            r10 = r19
            r8.checkServerTrusted(r0, r10)     // Catch:{ Exception -> 0x020a }
            r0 = 1
            goto L_0x022a
        L_0x020a:
            r0 = move-exception
            goto L_0x0211
        L_0x020c:
            r0 = move-exception
            r8 = r17
            r10 = r19
        L_0x0211:
            boolean r11 = f262363b
            if (r11 == 0) goto L_0x0229
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "attemptVerifyAfterAIAFetch, verify fail since "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
        L_0x0229:
            r0 = 0
        L_0x022a:
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = "tryVerifyWithAIAFetching, verify success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r9
        L_0x0233:
            r8 = r17
            r10 = r19
            java.security.cert.X509Certificate r0 = r1.mo125443a(r2, r5)
            if (r0 == 0) goto L_0x0247
            boolean r5 = gy3.C87412m.m108589b(r0, r5)
            if (r5 == 0) goto L_0x0244
            goto L_0x0247
        L_0x0244:
            r5 = r0
            goto L_0x0033
        L_0x0247:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yp0.C91539c.mo125444b(javax.net.ssl.X509TrustManager, java.util.List, java.lang.String):boolean");
    }
}
