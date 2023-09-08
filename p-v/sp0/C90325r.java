package sp0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: sp0.r */
public class C90325r implements X509TrustManager {

    /* renamed from: a */
    public LinkedList<X509TrustManager> f259301a = new LinkedList<>();

    /* renamed from: b */
    public LinkedList<X509TrustManager> f259302b = new LinkedList<>();

    /* renamed from: c */
    public KeyStore f259303c;

    /* renamed from: d */
    public final boolean f259304d;

    /* renamed from: e */
    public List<String> f259305e = null;

    /* renamed from: f */
    public KeyStore f259306f = null;

    /* renamed from: g */
    public X509Certificate[] f259307g;

    public C90325r(boolean z) {
        this.f259304d = z;
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            this.f259303c = instance;
            instance.load((InputStream) null, (char[]) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandX509TrustManager", e, "Exception: Local KeyStore init failed", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo124554a() {
        long nowMilliSecond = Util.nowMilliSecond();
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            int i = 0;
            while (trustManagers != null && i < trustManagers.length) {
                this.f259301a.add((X509TrustManager) trustManagers[i]);
                i++;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandX509TrustManager", e, "Exception: init SystemTrustManager", new Object[0]);
        }
        if (this.f259303c != null) {
            try {
                TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance2.init(this.f259303c);
                TrustManager[] trustManagers2 = instance2.getTrustManagers();
                int i2 = 0;
                while (trustManagers2 != null && i2 < trustManagers2.length) {
                    this.f259302b.add((X509TrustManager) trustManagers2[i2]);
                    i2++;
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppBrandX509TrustManager", e2, "Exception: init LocalTrustManager", new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<X509TrustManager> it = this.f259301a.iterator();
        while (it.hasNext()) {
            X509Certificate[] acceptedIssuers = it.next().getAcceptedIssuers();
            if (acceptedIssuers != null) {
                arrayList.addAll(Arrays.asList(acceptedIssuers));
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Iterator<X509TrustManager> it4 = this.f259302b.iterator();
        while (it4.hasNext()) {
            X509Certificate[] acceptedIssuers2 = it4.next().getAcceptedIssuers();
            if (acceptedIssuers2 != null) {
                arrayList.addAll(Arrays.asList(acceptedIssuers2));
            }
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        X509Certificate[] x509CertificateArr = new X509Certificate[arrayList.size()];
        this.f259307g = x509CertificateArr;
        this.f259307g = (X509Certificate[]) arrayList.toArray(x509CertificateArr);
        Log.m105925i("MicroMsg.AppBrandX509TrustManager", "initAcceptedIssuers: %d, %d, %d", Long.valueOf(currentTimeMillis2 - currentTimeMillis), Long.valueOf(currentTimeMillis3 - currentTimeMillis2), Long.valueOf(System.currentTimeMillis() - currentTimeMillis3));
        Log.m105919d("MicroMsg.AppBrandX509TrustManager", "init() cost[%dms]", Long.valueOf(Util.nowMilliSecond() - nowMilliSecond));
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client Certification not supported");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0260  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void checkServerTrusted(java.security.cert.X509Certificate[] r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "checkServerTrusted self check success"
            java.lang.String r5 = "checkServerTrusted self check fail"
            java.lang.Class<hr0.a> r6 = hr0.C87583a.class
            r7 = 1
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r8 = r0
            hr0.a r8 = (hr0.C87583a) r8
            r9 = 1011(0x3f3, double:4.995E-321)
            r11 = 0
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "trust manager size:"
            r0.append(r8)
            java.util.LinkedList<javax.net.ssl.X509TrustManager> r8 = r1.f259301a
            int r8 = r8.size()
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "MicroMsg.AppBrandX509TrustManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.util.LinkedList<javax.net.ssl.X509TrustManager> r0 = r1.f259301a
            java.util.Iterator r9 = r0.iterator()
        L_0x0041:
            boolean r0 = r9.hasNext()
            r10 = 0
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r9.next()
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ CertificateException -> 0x0085 }
            r11.<init>()     // Catch:{ CertificateException -> 0x0085 }
            java.lang.String r12 = "try system trust:"
            r11.append(r12)     // Catch:{ CertificateException -> 0x0085 }
            java.lang.String r12 = r0.toString()     // Catch:{ CertificateException -> 0x0085 }
            r11.append(r12)     // Catch:{ CertificateException -> 0x0085 }
            java.lang.String r11 = r11.toString()     // Catch:{ CertificateException -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)     // Catch:{ CertificateException -> 0x0085 }
            r0.checkServerTrusted(r2, r3)     // Catch:{ CertificateException -> 0x0085 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "system trust:"
            r9.append(r11)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r0 = 1
            goto L_0x008f
        L_0x0085:
            r0 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = "CertificateException: SystemTrustManagers checkServerTrusted"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r11, r10)
            goto L_0x0041
        L_0x008e:
            r0 = 0
        L_0x008f:
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "checkServerTrusted systemTrusted true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 1
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            return
        L_0x00a8:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.util.LinkedList<javax.net.ssl.X509TrustManager> r9 = r1.f259302b
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r10] = r9
            java.lang.String r9 = "try local trust size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r0)
            java.util.LinkedList<javax.net.ssl.X509TrustManager> r0 = r1.f259302b
            java.util.Iterator r9 = r0.iterator()
        L_0x00c2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r9.next()
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            r0.checkServerTrusted(r2, r3)     // Catch:{ CertificateException -> 0x00eb }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "local trust:"
            r3.append(r9)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r0 = 1
            goto L_0x00f6
        L_0x00eb:
            r0 = move-exception
            r11 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r12 = "CertificateException: LocalTrustManagers checkServerTrusted"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r11, r12, r0)
            goto L_0x00c2
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = "checkServerTrusted localTrusted true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 2
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            return
        L_0x010f:
            boolean r0 = r1.f259304d
            if (r0 == 0) goto L_0x02ee
            java.lang.String r0 = "checkServerTrusted debug type"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.security.KeyStore r0 = r1.f259306f     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = "AndroidCAStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            r1.f259306f = r0     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            r3 = 0
            r0.load(r3, r3)     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
        L_0x0128:
            java.util.List<java.lang.String> r0 = r1.f259305e     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            if (r0 != 0) goto L_0x0156
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            r0.<init>()     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            r1.f259305e = r0     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            java.security.KeyStore r0 = r1.f259306f     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            java.util.Enumeration r0 = r0.aliases()     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
        L_0x0139:
            boolean r3 = r0.hasMoreElements()     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            if (r3 == 0) goto L_0x0156
            java.lang.Object r3 = r0.nextElement()     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            if (r3 == 0) goto L_0x0139
            java.lang.String r9 = "user:"
            boolean r9 = r3.startsWith(r9)     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            if (r9 == 0) goto L_0x0139
            java.util.List<java.lang.String> r9 = r1.f259305e     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            r9.add(r3)     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            goto L_0x0139
        L_0x0156:
            java.util.List<java.lang.String> r0 = r1.f259305e     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            int r0 = r0.size()     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            if (r0 <= 0) goto L_0x01a0
            java.util.List<java.lang.String> r0 = r1.f259305e     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            r9 = 0
        L_0x0165:
            boolean r0 = r3.hasNext()     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x0194
            java.lang.Object r0 = r3.next()     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            java.security.KeyStore r11 = r1.f259306f     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            java.security.cert.Certificate r0 = r11.getCertificate(r0)     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            r11 = r0
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            int r12 = r2.length     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            r13 = 0
        L_0x017c:
            if (r13 >= r12) goto L_0x0165
            r0 = r2[r13]     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            java.security.PublicKey r14 = r11.getPublicKey()     // Catch:{ Exception -> 0x0189 }
            r0.verify(r14)     // Catch:{ Exception -> 0x0189 }
            r9 = 1
            goto L_0x0165
        L_0x0189:
            r0 = move-exception
            java.lang.String r14 = "Exception: check user verify certificate"
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r14, r15)     // Catch:{ KeyStoreException -> 0x019d, NoSuchAlgorithmException -> 0x019a, IOException -> 0x0198, Exception -> 0x0196 }
            int r13 = r13 + 1
            goto L_0x017c
        L_0x0194:
            r10 = r9
            goto L_0x01b7
        L_0x0196:
            r0 = move-exception
            goto L_0x01d8
        L_0x0198:
            r0 = move-exception
            goto L_0x020f
        L_0x019a:
            r0 = move-exception
            goto L_0x0245
        L_0x019d:
            r0 = move-exception
            goto L_0x027b
        L_0x01a0:
            java.lang.String r0 = "checkServerTrusted self check aliasList null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            r11 = r0
            hr0.a r11 = (hr0.C87583a) r11     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
            r12 = 1011(0x3f3, double:4.995E-321)
            r14 = 9
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)     // Catch:{ KeyStoreException -> 0x0279, NoSuchAlgorithmException -> 0x0243, IOException -> 0x020d, Exception -> 0x01d6, all -> 0x01d3 }
        L_0x01b7:
            if (r10 == 0) goto L_0x01ce
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 3
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            return
        L_0x01ce:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x02ae
        L_0x01d3:
            r0 = move-exception
            goto L_0x02c2
        L_0x01d6:
            r0 = move-exception
            r9 = 0
        L_0x01d8:
            java.lang.String r2 = "Exception: check user certificate"
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ all -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r2, r3)     // Catch:{ all -> 0x02c0 }
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)     // Catch:{ all -> 0x02c0 }
            r10 = r0
            hr0.a r10 = (hr0.C87583a) r10     // Catch:{ all -> 0x02c0 }
            r11 = 1011(0x3f3, double:4.995E-321)
            r13 = 8
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ all -> 0x02c0 }
            if (r9 == 0) goto L_0x0208
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 3
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            return
        L_0x0208:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x02ae
        L_0x020d:
            r0 = move-exception
            r9 = 0
        L_0x020f:
            java.lang.String r2 = "IOException: check user certificate"
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ all -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r2, r3)     // Catch:{ all -> 0x02c0 }
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)     // Catch:{ all -> 0x02c0 }
            r10 = r0
            hr0.a r10 = (hr0.C87583a) r10     // Catch:{ all -> 0x02c0 }
            r11 = 1011(0x3f3, double:4.995E-321)
            r13 = 7
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ all -> 0x02c0 }
            if (r9 == 0) goto L_0x023f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 3
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            return
        L_0x023f:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x02ae
        L_0x0243:
            r0 = move-exception
            r9 = 0
        L_0x0245:
            java.lang.String r2 = "NoSuchAlgorithmException: check user certificate"
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ all -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r2, r3)     // Catch:{ all -> 0x02c0 }
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)     // Catch:{ all -> 0x02c0 }
            r10 = r0
            hr0.a r10 = (hr0.C87583a) r10     // Catch:{ all -> 0x02c0 }
            r11 = 1011(0x3f3, double:4.995E-321)
            r13 = 6
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ all -> 0x02c0 }
            if (r9 == 0) goto L_0x0275
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 3
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            return
        L_0x0275:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x02ae
        L_0x0279:
            r0 = move-exception
            r9 = 0
        L_0x027b:
            java.lang.String r2 = "KeyStoreException: check user certificate"
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ all -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r2, r3)     // Catch:{ all -> 0x02c0 }
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)     // Catch:{ all -> 0x02c0 }
            r10 = r0
            hr0.a r10 = (hr0.C87583a) r10     // Catch:{ all -> 0x02c0 }
            r11 = 1011(0x3f3, double:4.995E-321)
            r13 = 5
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ all -> 0x02c0 }
            if (r9 == 0) goto L_0x02ab
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 3
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            return
        L_0x02ab:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
        L_0x02ae:
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 10
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            goto L_0x02ff
        L_0x02c0:
            r0 = move-exception
            r10 = r9
        L_0x02c2:
            if (r10 == 0) goto L_0x02d9
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 3
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            return
        L_0x02d9:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            ra.d r2 = p224ra.C89909e.m112439d(r6, r7)
            r3 = r2
            hr0.a r3 = (hr0.C87583a) r3
            r4 = 1011(0x3f3, double:4.995E-321)
            r6 = 10
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            throw r0
        L_0x02ee:
            ra.d r0 = p224ra.C89909e.m112439d(r6, r7)
            r2 = r0
            hr0.a r2 = (hr0.C87583a) r2
            r3 = 1011(0x3f3, double:4.995E-321)
            r5 = 4
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
        L_0x02ff:
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            java.lang.String r2 = "Server Certificate not trusted"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sp0.C90325r.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.f259307g;
    }
}
