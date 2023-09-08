package us3;

import android.content.Context;
import android.os.Build;
import ft3.C116892c;
import p156gj.C87203t;
import ws3.C118787d;
import xs3.C118900e;

/* renamed from: us3.a */
public class C118607a {

    /* renamed from: a */
    public Context f354929a;

    /* renamed from: b */
    public C118608b f354930b;

    public C118607a(Context context) {
        this.f354929a = context;
        this.f354930b = new C118608b(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0057 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ws3.C118785b m167294a(android.content.Context r8, ts3.C118506a r9, int r10) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            ws3.b r1 = new ws3.b
            r1.<init>()
            r1.f355380d = r10
            r1.f355381e = r0
            java.lang.String r10 = r9.f354676d
            r1.f355382f = r10
            java.lang.String r10 = r9.f354677e
            byte[] r10 = ft3.C45807d.m51085b(r10)
            r1.f355383g = r10
            java.lang.String r10 = r9.f354676d
            r2 = 5
            java.lang.String r3 = "AppUtil"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x008c }
            r5 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r10, r5)     // Catch:{ all -> 0x008c }
            if (r8 == 0) goto L_0x00a1
            android.content.pm.Signature[] r8 = r8.signatures     // Catch:{ all -> 0x008c }
            if (r8 == 0) goto L_0x00a1
            int r10 = r8.length     // Catch:{ all -> 0x008c }
            if (r10 <= 0) goto L_0x00a1
            r10 = 0
        L_0x0037:
            int r5 = r8.length     // Catch:{ all -> 0x008c }
            if (r10 >= r5) goto L_0x00a1
            if (r10 >= r2) goto L_0x00a1
            java.lang.String r5 = "X.509"
            java.security.cert.CertificateFactory r5 = java.security.cert.CertificateFactory.getInstance(r5)     // Catch:{ all -> 0x008c }
            r6 = r8[r10]     // Catch:{ all -> 0x008c }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x008c }
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x008c }
            r7.<init>(r6)     // Catch:{ all -> 0x008c }
            java.security.cert.Certificate r5 = r5.generateCertificate(r7)     // Catch:{ all -> 0x0057 }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ all -> 0x0057 }
            r7.close()     // Catch:{ IOException -> 0x005b }
            goto L_0x005b
        L_0x0057:
            r7.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r5 = r0
        L_0x005b:
            if (r5 == 0) goto L_0x0089
            byte[] r5 = r5.getEncoded()     // Catch:{ CertificateEncodingException -> 0x0074 }
            java.lang.String r6 = "MD5"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch:{ Exception | NoSuchAlgorithmException -> 0x006f }
            r6.update(r5)     // Catch:{ Exception | NoSuchAlgorithmException -> 0x006f }
            byte[] r5 = r6.digest()     // Catch:{ Exception | NoSuchAlgorithmException -> 0x006f }
            goto L_0x0070
        L_0x006f:
            r5 = r0
        L_0x0070:
            r4.add(r5)     // Catch:{ CertificateEncodingException -> 0x0074 }
            goto L_0x0089
        L_0x0074:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r6.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r7 = "extractPkgCertMd5s(), CertificateEncodingException: "
            r6.append(r7)     // Catch:{ all -> 0x008c }
            r6.append(r5)     // Catch:{ all -> 0x008c }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x008c }
            ft3.C116895f.m164889a(r3, r5)     // Catch:{ all -> 0x008c }
        L_0x0089:
            int r10 = r10 + 1
            goto L_0x0037
        L_0x008c:
            r8 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "extractPkgCertMd5s(), Exception: "
            r10.append(r2)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            ft3.C116895f.m164889a(r3, r8)
        L_0x00a1:
            int r8 = r4.size()
            r10 = 1
            if (r8 <= r10) goto L_0x00c5
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.f355398y = r8
            java.util.Iterator r8 = r4.iterator()
        L_0x00b3:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00c5
            java.lang.Object r10 = r8.next()
            byte[] r10 = (byte[]) r10
            java.util.ArrayList<byte[]> r2 = r1.f355398y
            r2.add(r10)
            goto L_0x00b3
        L_0x00c5:
            r2 = 0
            r1.f355384h = r2
            r1.f355385i = r0
            int r8 = r9.f354679g
            r1.f355386j = r8
            java.lang.String r8 = r9.f354678f
            r1.f355387n = r8
            r8 = 2
            r1.f355388o = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: us3.C118607a.m167294a(android.content.Context, ts3.a, int):ws3.b");
    }

    /* renamed from: b */
    public final C118787d mo183350b() {
        C118787d dVar = new C118787d();
        try {
            dVar.f355413d = Build.FINGERPRINT;
            dVar.f355414e = C116892c.m164882b(false);
            dVar.f355415f = Build.BRAND;
            dVar.f355416g = C87203t.m108275k();
            dVar.f355417h = Build.VERSION.SDK_INT;
            dVar.f355418i = Build.CPU_ABI;
            dVar.f355419j = C116892c.m164881a("ro.board.platform");
            dVar.f355420n = C118900e.m167646a();
        } catch (Exception unused) {
        }
        return dVar;
    }
}
