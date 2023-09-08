package us3;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.p013qq.taf.RequestPacket;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ft3.C116891b;
import ft3.C116892c;
import ft3.C116895f;
import ft3.C116898j;
import ft3.C87080a;
import j20.C117292a;
import p156gj.C87203t;
import vs3.C118695a;
import vs3.C118696b;
import vs3.C118697c;
import ws3.C118784a;

/* renamed from: us3.b */
public class C118608b {

    /* renamed from: a */
    public Context f354931a;

    /* renamed from: b */
    public int f354932b = -1;

    /* renamed from: c */
    public int f354933c = -1;

    /* renamed from: d */
    public String f354934d;

    /* renamed from: e */
    public String f354935e;

    /* renamed from: f */
    public String f354936f;

    /* renamed from: g */
    public C118697c f354937g;

    /* renamed from: h */
    public C118695a f354938h;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0053, code lost:
        r5 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C118608b(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.f354932b = r0
            r4.f354933c = r0
            r0 = 0
            r4.f354934d = r0
            r4.f354935e = r0
            r4.f354936f = r0
            r4.f354937g = r0
            r4.f354938h = r0
            r4.f354931a = r5
            java.lang.String r1 = r5.getPackageName()
            ts3.a r2 = new ts3.a
            r2.<init>()
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x006d }
            r3 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r3)     // Catch:{ all -> 0x006d }
            r2.f354676d = r1     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r5.versionName     // Catch:{ all -> 0x006d }
            r2.f354678f = r1     // Catch:{ all -> 0x006d }
            int r1 = r5.versionCode     // Catch:{ all -> 0x006d }
            r2.f354679g = r1     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch:{ all -> 0x006d }
            android.content.pm.Signature[] r5 = r5.signatures     // Catch:{ all -> 0x006d }
            r3 = 0
            r5 = r5[r3]     // Catch:{ all -> 0x006d }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x006d }
            byte[] r5 = r5.toByteArray()     // Catch:{ all -> 0x006d }
            r3.<init>(r5)     // Catch:{ all -> 0x006d }
            java.security.cert.Certificate r5 = r1.generateCertificate(r3)     // Catch:{ all -> 0x0050 }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ all -> 0x0050 }
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0054
        L_0x0050:
            r3.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            r5 = r0
        L_0x0054:
            if (r5 == 0) goto L_0x006d
            byte[] r5 = r5.getEncoded()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ Exception | NoSuchAlgorithmException -> 0x0067 }
            r1.update(r5)     // Catch:{ Exception | NoSuchAlgorithmException -> 0x0067 }
            byte[] r0 = r1.digest()     // Catch:{ Exception | NoSuchAlgorithmException -> 0x0067 }
        L_0x0067:
            java.lang.String r5 = ft3.C45807d.m51084a(r0)     // Catch:{ all -> 0x006d }
            r2.f354677e = r5     // Catch:{ all -> 0x006d }
        L_0x006d:
            java.lang.String r5 = r2.f354678f
            r4.f354934d = r5
            int r5 = r2.f354679g
            r4.f354933c = r5
            r5 = 82
            r4.f354932b = r5
            java.lang.String r5 = "105901"
            r4.f354935e = r5
            java.lang.String r5 = "7AD75E27CD5842F6"
            r4.f354936f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: us3.C118608b.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public byte[] mo183351a(C118784a aVar) {
        try {
            C116898j jVar = new C116898j(true);
            RequestPacket requestPacket = jVar.f350318b;
            requestPacket.iRequestId = 3;
            requestPacket.sServantName = "viruscheck";
            requestPacket.sFuncName = "RiskCheck";
            jVar.f350317a = "UTF-8";
            if (this.f354938h == null) {
                C118695a aVar2 = new C118695a();
                this.f354938h = aVar2;
                aVar2.f355168d = 2;
                aVar2.f355169e = 201;
            }
            jVar.mo180862b("phonetype", this.f354938h);
            jVar.mo180862b("userinfo", mo183352b());
            jVar.mo180862b("req", aVar);
            byte[] a = C87080a.m108102a(jVar.mo180861a());
            if (a != null) {
                return C116891b.m164878b(a, C116891b.m164880d());
            }
            throw new RuntimeException("compress data fail");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C118697c mo183352b() {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        String str4 = "";
        int i4 = 2;
        if (this.f354937g == null) {
            C118697c cVar = new C118697c();
            this.f354937g = cVar;
            cVar.f355189o = this.f354932b;
            cVar.f355196v = this.f354933c;
            cVar.f355186i = this.f354935e;
            cVar.f355185h = this.f354936f;
            try {
                String[] split = this.f354934d.trim().split("[\\.]");
                if (split == null || split.length < 3) {
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                } else {
                    i2 = Integer.parseInt(split[0]);
                    i = Integer.parseInt(split[1]);
                    i3 = Integer.parseInt(split[2]);
                }
                this.f354937g.f355190p = new C118696b();
                C118696b bVar = this.f354937g.f355190p;
                bVar.f355170d = i2;
                bVar.f355171e = i;
                bVar.f355172f = i3;
            } catch (Exception unused) {
            }
            C118697c cVar2 = this.f354937g;
            cVar2.f355193s = 0;
            cVar2.f355195u = C116892c.m164885e();
            C118697c cVar3 = this.f354937g;
            try {
                Log.m105919d("DeviceUtil", "READ_PHONE_STATE.getDeviceId, %s", Util.getStack());
                str = (String) C117292a.m165363i((TelephonyManager) this.f354931a.getSystemService("phone"), "com/tencent/riskscanner/utils/DeviceUtil", "getIMEI", "(Landroid/content/Context;)Ljava/lang/String;", "android/telephony/TelephonyManager", "getDeviceId", "()Ljava/lang/String;");
            } catch (Throwable th) {
                C116895f.m164892d("DeviceUtil", "getIMEI: " + th);
                str = str4;
            }
            if (str == null) {
                str = str4;
            }
            cVar3.f355181d = str;
            C118697c cVar4 = this.f354937g;
            try {
                Log.m105919d("DeviceUtil", "READ_PHONE_STATE.getSubscriberId, %s", Util.getStack());
                str2 = (String) C117292a.m165363i((TelephonyManager) this.f354931a.getSystemService("phone"), "com/tencent/riskscanner/utils/DeviceUtil", "getIMSI", "(Landroid/content/Context;)Ljava/lang/String;", "android/telephony/TelephonyManager", "getSubscriberId", "()Ljava/lang/String;");
            } catch (Throwable th4) {
                C116895f.m164892d("DeviceUtil", "getIMSI: " + th4);
                str2 = str4;
            }
            if (str2 == null) {
                str2 = str4;
            }
            cVar4.f355192r = str2;
            C118697c cVar5 = this.f354937g;
            String k = C87203t.m108275k();
            if (k == null) {
                k = str4;
            }
            cVar5.f355187j = k;
            C118697c cVar6 = this.f354937g;
            try {
                str3 = C87203t.m108266b();
            } catch (Throwable th5) {
                C116895f.m164892d("DeviceUtil", "getAndroidId: " + th5);
                str3 = str4;
            }
            if (str3 == null) {
                str3 = str4;
            }
            cVar6.f355178E = str3;
            C118697c cVar7 = this.f354937g;
            String d = C116892c.m164884d(true);
            if (d == null) {
                d = str4;
            }
            cVar7.f355179F = d;
            C118697c cVar8 = this.f354937g;
            String d2 = C116892c.m164884d(false);
            if (d2 != null) {
                str4 = d2;
            }
            cVar8.f355180G = str4;
            C118697c cVar9 = this.f354937g;
            cVar9.f355191q = null;
            cVar9.f355194t = 0;
        }
        C118697c cVar10 = this.f354937g;
        if (C116892c.m164883c(this.f354931a) != C116892c.C116893a.CONN_WIFI) {
            i4 = 1;
        }
        cVar10.f355188n = i4;
        return this.f354937g;
    }
}
