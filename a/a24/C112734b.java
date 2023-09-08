package a24;

import android.content.Context;
import b24.C113090e;
import c24.C16848d;
import c24.C79920c;
import java.security.SecureRandom;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: a24.b */
public class C112734b {

    /* renamed from: h */
    public static /* synthetic */ int[] f337549h;

    /* renamed from: a */
    public C112739f f337550a;

    /* renamed from: b */
    public C112740g f337551b;

    /* renamed from: c */
    public C112738e f337552c;

    /* renamed from: d */
    public C112737d f337553d = null;

    /* renamed from: e */
    public Context f337554e;

    /* renamed from: f */
    public int f337555f = 66560;

    /* renamed from: g */
    public int f337556g = 1404;

    /* renamed from: a24.b$a */
    public enum C112735a {
        USER_WITH_MD5,
        USER_WITH_A1
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r6 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r1 = new byte[0];
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x011a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0152 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0180 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x01bd */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0176 A[Catch:{ all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0177 A[Catch:{ all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C112734b(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r4.<init>()
            a24.f r0 = new a24.f
            r1 = 0
            r0.<init>(r1)
            r4.f337550a = r0
            a24.g r2 = new a24.g
            r2.<init>(r0)
            r4.f337551b = r2
            a24.e r2 = new a24.e
            r2.<init>(r0)
            r4.f337552c = r2
            r4.f337553d = r1
            r2 = 66560(0x10400, float:9.327E-41)
            r4.f337555f = r2
            r2 = 1404(0x57c, float:1.967E-42)
            r4.f337556g = r2
            r4.f337554e = r5
            r0.f337580j = r5
            r0.f337579i = r6
            a24.c r6 = new a24.c
            r6.<init>(r5)
            r0.f337596z = r6
            r5 = 16
            byte[] r6 = new byte[r5]
            java.security.SecureRandom r2 = r0.f337571a
            r2.nextBytes(r6)
            byte[] r0 = r0.f337573c
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r0, r2, r5)
            monitor-enter(r4)
            android.content.Context r5 = r4.f337554e     // Catch:{ all -> 0x01ea }
            byte[] r5 = oicq.wlogin_sdk.tools.C117790util.m166192n(r5)     // Catch:{ all -> 0x01ea }
            int r6 = r5.length     // Catch:{ all -> 0x01ea }
            r0 = 1
            if (r6 > 0) goto L_0x0077
            android.content.Context r5 = r4.f337554e     // Catch:{ all -> 0x01ea }
            byte[] r5 = oicq.wlogin_sdk.tools.C117790util.m166187i(r5)     // Catch:{ all -> 0x01ea }
            if (r5 == 0) goto L_0x005c
            int r6 = r5.length     // Catch:{ all -> 0x01ea }
            if (r6 > 0) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            a24.f r6 = r4.f337550a     // Catch:{ all -> 0x01ea }
            r6.f337590t = r0     // Catch:{ all -> 0x01ea }
            goto L_0x006b
        L_0x005c:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x01ea }
            java.lang.String r6 = "%4;7t>;28<fc.5*6"
            r5.<init>(r6)     // Catch:{ all -> 0x01ea }
            byte[] r5 = r5.getBytes()     // Catch:{ all -> 0x01ea }
            a24.f r6 = r4.f337550a     // Catch:{ all -> 0x01ea }
            r6.f337590t = r2     // Catch:{ all -> 0x01ea }
        L_0x006b:
            android.content.Context r6 = r4.f337554e     // Catch:{ all -> 0x01ea }
            oicq.wlogin_sdk.tools.C117790util.m166198t(r6, r5)     // Catch:{ all -> 0x01ea }
            a24.f r6 = r4.f337550a     // Catch:{ all -> 0x01ea }
            r6.f337589s = r0     // Catch:{ all -> 0x01ea }
            r6.f337591u = r0     // Catch:{ all -> 0x01ea }
            goto L_0x007f
        L_0x0077:
            a24.f r6 = r4.f337550a     // Catch:{ all -> 0x01ea }
            r6.f337590t = r0     // Catch:{ all -> 0x01ea }
            r6.f337589s = r2     // Catch:{ all -> 0x01ea }
            r6.f337591u = r2     // Catch:{ all -> 0x01ea }
        L_0x007f:
            r4.mo164485g(r5)     // Catch:{ all -> 0x01ea }
            a24.f r5 = r4.f337550a     // Catch:{ all -> 0x01ea }
            byte[] r5 = r5.f337581k     // Catch:{ all -> 0x01ea }
            java.lang.Object r5 = r5.clone()     // Catch:{ all -> 0x01ea }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x01ea }
            a24.C112739f.f337570A = r5     // Catch:{ all -> 0x01ea }
            a24.f r5 = r4.f337550a     // Catch:{ all -> 0x01ea }
            android.content.Context r6 = r4.f337554e     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = "phone"
            java.lang.Object r6 = r6.getSystemService(r0)     // Catch:{ all -> 0x00ad }
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ all -> 0x00ad }
            int r0 = r6.getSimState()     // Catch:{ all -> 0x00ad }
            r3 = 5
            if (r0 != r3) goto L_0x00aa
            java.lang.String r6 = r6.getSimOperatorName()     // Catch:{ all -> 0x00ad }
            byte[] r6 = r6.getBytes()     // Catch:{ all -> 0x00ad }
            goto L_0x00af
        L_0x00aa:
            byte[] r6 = new byte[r2]     // Catch:{ all -> 0x00ad }
            goto L_0x00af
        L_0x00ad:
            byte[] r6 = new byte[r2]     // Catch:{ all -> 0x01ea }
        L_0x00af:
            r5.f337582l = r6     // Catch:{ all -> 0x01ea }
            android.content.Context r5 = r4.f337554e     // Catch:{ all -> 0x01ea }
            java.lang.String r6 = "WLOGIN_SERVER_INFO"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r2)     // Catch:{ all -> 0x01ea }
            java.lang.String r6 = "network_type"
            int r5 = r5.getInt(r6, r2)     // Catch:{ all -> 0x01ea }
            a24.f r6 = r4.f337550a     // Catch:{ all -> 0x01ea }
            android.content.Context r0 = r4.f337554e     // Catch:{ all -> 0x01ea }
            int r0 = oicq.wlogin_sdk.tools.C117790util.m166190l(r0)     // Catch:{ all -> 0x01ea }
            r6.f337583m = r0     // Catch:{ all -> 0x01ea }
            a24.f r6 = r4.f337550a     // Catch:{ all -> 0x01ea }
            int r6 = r6.f337583m     // Catch:{ all -> 0x01ea }
            if (r5 == r6) goto L_0x00fb
            android.content.Context r5 = r4.f337554e     // Catch:{ all -> 0x01ea }
            java.lang.String r6 = "WLOGIN_NET_RETRY_TYPE"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r2)     // Catch:{ all -> 0x01ea }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x01ea }
            java.lang.String r6 = "type"
            r5.putInt(r6, r2)     // Catch:{ all -> 0x01ea }
            r5.commit()     // Catch:{ all -> 0x01ea }
            android.content.Context r5 = r4.f337554e     // Catch:{ all -> 0x01ea }
            a24.f r6 = r4.f337550a     // Catch:{ all -> 0x01ea }
            int r6 = r6.f337583m     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = "WLOGIN_SERVER_INFO"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r0, r2)     // Catch:{ all -> 0x01ea }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = "network_type"
            r5.putInt(r0, r6)     // Catch:{ all -> 0x01ea }
            r5.commit()     // Catch:{ all -> 0x01ea }
        L_0x00fb:
            a24.f r5 = r4.f337550a     // Catch:{ all -> 0x01ea }
            android.content.Context r6 = r4.f337554e     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = "wifi"
            java.lang.String r3 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r3)     // Catch:{ Exception -> 0x011a }
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6     // Catch:{ Exception -> 0x011a }
            android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()     // Catch:{ Exception -> 0x011a }
            int r3 = r6.getType()     // Catch:{ Exception -> 0x011a }
            if (r3 != 0) goto L_0x011a
            java.lang.String r6 = r6.getExtraInfo()     // Catch:{ Exception -> 0x011a }
            if (r6 == 0) goto L_0x011a
            r0 = r6
        L_0x011a:
            byte[] r6 = r0.getBytes()     // Catch:{ all -> 0x01ea }
            r5.f337585o = r6     // Catch:{ all -> 0x01ea }
            a24.f r5 = r4.f337550a     // Catch:{ all -> 0x01ea }
            android.content.Context r6 = r4.f337554e     // Catch:{ all -> 0x01ea }
            byte[] r6 = oicq.wlogin_sdk.tools.C117790util.m166189k(r6)     // Catch:{ all -> 0x01ea }
            r5.f337592v = r6     // Catch:{ all -> 0x01ea }
            a24.f r5 = r4.f337550a     // Catch:{ all -> 0x01ea }
            android.content.Context r6 = r4.f337554e     // Catch:{ all -> 0x01ea }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x01ea }
            byte[] r6 = r6.getBytes()     // Catch:{ all -> 0x01ea }
            r5.f337584n = r6     // Catch:{ all -> 0x01ea }
            a24.f r5 = r4.f337550a     // Catch:{ all -> 0x01ea }
            android.content.Context r6 = r4.f337554e     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x01ea }
            byte[] r3 = r5.f337584n     // Catch:{ all -> 0x01ea }
            r0.<init>(r3)     // Catch:{ all -> 0x01ea }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ Exception -> 0x0152 }
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r0, r2)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r6 = r6.versionName     // Catch:{ Exception -> 0x0152 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x0152 }
            goto L_0x0154
        L_0x0152:
            byte[] r6 = new byte[r2]     // Catch:{ all -> 0x01ea }
        L_0x0154:
            r5.f337586p = r6     // Catch:{ all -> 0x01ea }
            a24.f r5 = r4.f337550a     // Catch:{ all -> 0x01ea }
            android.content.Context r6 = r4.f337554e     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x01ea }
            byte[] r3 = r5.f337584n     // Catch:{ all -> 0x01ea }
            r0.<init>(r3)     // Catch:{ all -> 0x01ea }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x0180 }
            r3 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r0, r3)     // Catch:{ all -> 0x0180 }
            android.content.pm.Signature[] r6 = r6.signatures     // Catch:{ all -> 0x0180 }
            if (r6 == 0) goto L_0x0182
            int r0 = r6.length     // Catch:{ all -> 0x0180 }
            if (r0 <= 0) goto L_0x0182
            r6 = r6[r2]     // Catch:{ all -> 0x0180 }
            if (r6 != 0) goto L_0x0177
            goto L_0x0182
        L_0x0177:
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x0180 }
            byte[] r1 = c24.C79920c.m97091l(r6)     // Catch:{ all -> 0x0180 }
            goto L_0x0182
        L_0x0180:
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x01ea }
        L_0x0182:
            r5.f337587q = r1     // Catch:{ all -> 0x01ea }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x01ea }
            if (r5 != 0) goto L_0x018f
            a24.f r5 = r4.f337550a     // Catch:{ all -> 0x01ea }
            byte[] r6 = new byte[r2]     // Catch:{ all -> 0x01ea }
            r5.f337588r = r6     // Catch:{ all -> 0x01ea }
            goto L_0x0197
        L_0x018f:
            a24.f r6 = r4.f337550a     // Catch:{ all -> 0x01ea }
            byte[] r5 = r5.getBytes()     // Catch:{ all -> 0x01ea }
            r6.f337588r = r5     // Catch:{ all -> 0x01ea }
        L_0x0197:
            java.lang.String r5 = "/system/bin/su"
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01a3 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x01a3 }
            boolean r5 = r6.exists()     // Catch:{ Exception -> 0x01a3 }
            goto L_0x01a4
        L_0x01a3:
            r5 = 0
        L_0x01a4:
            if (r5 != 0) goto L_0x01bd
            java.lang.String r5 = "/system/xbin/su"
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01b1 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x01b1 }
            boolean r2 = r6.exists()     // Catch:{ Exception -> 0x01b1 }
        L_0x01b1:
            if (r2 != 0) goto L_0x01bd
            java.lang.String r5 = "/sbin/su"
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01bd }
            r6.<init>(r5)     // Catch:{ Exception -> 0x01bd }
            r6.exists()     // Catch:{ Exception -> 0x01bd }
        L_0x01bd:
            a24.f r5 = r4.f337550a     // Catch:{ all -> 0x01ea }
            r5.getClass()     // Catch:{ all -> 0x01ea }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x01ea }
            if (r5 != 0) goto L_0x01c8
            java.lang.String r5 = ""
        L_0x01c8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = "WtloginHelper init ok: android version:"
            r6.<init>(r0)     // Catch:{ all -> 0x01ea }
            r6.append(r5)     // Catch:{ all -> 0x01ea }
            java.lang.String r5 = " release time:"
            r6.append(r5)     // Catch:{ all -> 0x01ea }
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = "2014/02/28 14:20"
            r5.<init>(r0)     // Catch:{ all -> 0x01ea }
            r6.append(r5)     // Catch:{ all -> 0x01ea }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x01ea }
            oicq.wlogin_sdk.tools.C117790util.m166181c(r5)     // Catch:{ all -> 0x01ea }
            monitor-exit(r4)     // Catch:{ all -> 0x01ea }
            return
        L_0x01ea:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ea }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a24.C112734b.<init>(android.content.Context, int):void");
    }

    /* renamed from: a */
    public byte[] mo164479a(long j, byte[] bArr) {
        byte[] g;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        C117790util.m166181c("user:" + j + " CheckPicture ...");
        synchronized (this) {
            C112738e eVar = this.f337552c;
            this.f337553d = eVar;
            g = eVar.mo164496g(bArr);
        }
        C117790util.m166181c("user:" + j + " CheckPicture end");
        return g;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public void mo164480b(long r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "user:"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " ClearUserSigInfo"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            oicq.wlogin_sdk.tools.C117790util.m166181c(r0)
            a24.f r0 = r3.f337550a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            monitor-enter(r0)
            a24.c r5 = r0.f337596z     // Catch:{ all -> 0x004c }
            monitor-enter(r5)     // Catch:{ all -> 0x004c }
            java.util.TreeMap<java.lang.Long, oicq.wlogin_sdk.request.WloginAllSigInfo> r1 = r5.f337561b     // Catch:{ all -> 0x0042 }
            r1.remove(r4)     // Catch:{ all -> 0x0042 }
            android.content.Context r1 = r5.f337560a     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r2 = "tk_file"
            java.util.TreeMap r1 = a24.C112736c.m154165c(r1, r2)     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0033
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0048
        L_0x0033:
            r1.remove(r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "tk_file"
            monitor-enter(r5)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "tk_file"
            if (r4 != r2) goto L_0x0040
            r5.mo164489e(r1, r4)     // Catch:{ all -> 0x0044 }
        L_0x0040:
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            goto L_0x0047
        L_0x0042:
            r4 = move-exception
            goto L_0x004a
        L_0x0044:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            throw r4     // Catch:{ all -> 0x0042 }
        L_0x0047:
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
        L_0x0048:
            monitor-exit(r0)
            return
        L_0x004a:
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            throw r4     // Catch:{ all -> 0x004c }
        L_0x004c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a24.C112734b.mo164480b(long):void");
    }

    /* renamed from: c */
    public byte[] mo164481c(long j, long j2) {
        byte[] bArr;
        WloginSigInfo a = this.f337550a.mo164497a(j, j2);
        if (a == null || (bArr = a._en_A1) == null || bArr.length <= 0) {
            C117790util.m166181c("userAccount:" + j + " appid:" + j2 + " GetA1ByAccount return: null");
            return null;
        }
        C117790util.m166181c("userAccount:" + j + " appid:" + j2 + " GetA1ByAccount return: not null");
        return (byte[]) a._en_A1.clone();
    }

    /* renamed from: d */
    public byte[] mo164482d(long j) {
        int i;
        byte[] bArr;
        synchronized (this) {
            C113090e eVar = this.f337550a.f337575e;
            i = eVar.f338487f;
            bArr = new byte[i];
            if (i > 0) {
                System.arraycopy(eVar.f338497d, eVar.f338489h, bArr, 0, i);
            }
        }
        C117790util.m166181c("user:" + j + " GetPicture data len:" + i);
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|11|12|13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r2 = r2.getBytes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0176, code lost:
        oicq.wlogin_sdk.tools.C117790util.m166181c("wtlogin login with GetStWithPasswd:user:" + r28 + " appid:" + r30 + " dwSigMap:" + r0 + " end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a0, code lost:
        return r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x00e3 */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo164483e(long r28, long r30, int r32, a24.C112734b.C112735a r33, java.lang.String r34) {
        /*
            r27 = this;
            r1 = r27
            r14 = r28
            r12 = r30
            r0 = r32
            r2 = r34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "wtlogin login with GetStWithPasswd:user:"
            r3.<init>(r4)
            r3.append(r14)
            java.lang.String r4 = " appid:"
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = " dwSigMap:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " ..."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            oicq.wlogin_sdk.tools.C117790util.m166181c(r3)
            r3 = 0
            r4 = 16
            if (r2 == 0) goto L_0x003f
            int r5 = r34.length()
            if (r5 <= r4) goto L_0x003f
            java.lang.String r2 = r2.substring(r3, r4)
        L_0x003f:
            monitor-enter(r27)
            int[] r5 = f337549h     // Catch:{ all -> 0x01a8 }
            r6 = 2
            r7 = 3
            r8 = 1
            if (r5 == 0) goto L_0x0048
            goto L_0x0057
        L_0x0048:
            a24.b$a[] r5 = a24.C112734b.C112735a.values()     // Catch:{ all -> 0x01a8 }
            int r5 = r5.length     // Catch:{ all -> 0x01a8 }
            int[] r5 = new int[r5]     // Catch:{ all -> 0x01a8 }
            r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0051 }
        L_0x0051:
            r5[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            r5[r3] = r8     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            f337549h = r5     // Catch:{ all -> 0x01a8 }
        L_0x0057:
            int r9 = r33.ordinal()     // Catch:{ all -> 0x01a8 }
            r5 = r5[r9]     // Catch:{ all -> 0x01a8 }
            r9 = 0
            if (r5 == r8) goto L_0x0099
            if (r5 == r6) goto L_0x007a
            if (r5 == r7) goto L_0x0066
            monitor-exit(r27)     // Catch:{ all -> 0x01a8 }
            return r9
        L_0x0066:
            byte[] r2 = r27.mo164481c(r28, r30)     // Catch:{ all -> 0x01a8 }
            if (r2 == 0) goto L_0x0073
            int r5 = r2.length     // Catch:{ all -> 0x01a8 }
            if (r5 >= r4) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r16 = r2
            goto L_0x00ba
        L_0x0073:
            java.lang.String r0 = "USER_WITH_A1 tmp_pwd null"
            oicq.wlogin_sdk.tools.C117790util.m166181c(r0)     // Catch:{ all -> 0x01a8 }
            monitor-exit(r27)     // Catch:{ all -> 0x01a8 }
            return r9
        L_0x007a:
            if (r2 == 0) goto L_0x0092
            int r4 = r2.length()     // Catch:{ all -> 0x01a8 }
            if (r4 != 0) goto L_0x0083
            goto L_0x0092
        L_0x0083:
            java.lang.String r4 = "ISO-8859-1"
            byte[] r2 = r2.getBytes(r4)     // Catch:{ Exception -> 0x0090 }
            java.lang.Object r2 = r2.clone()     // Catch:{ Exception -> 0x0090 }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x0090 }
            goto L_0x00b7
        L_0x0090:
            monitor-exit(r27)     // Catch:{ all -> 0x01a8 }
            return r9
        L_0x0092:
            java.lang.String r0 = "USER_WITH_MD5 userPasswd null"
            oicq.wlogin_sdk.tools.C117790util.m166181c(r0)     // Catch:{ all -> 0x01a8 }
            monitor-exit(r27)     // Catch:{ all -> 0x01a8 }
            return r9
        L_0x0099:
            if (r2 == 0) goto L_0x01a1
            int r4 = r2.length()     // Catch:{ all -> 0x01a8 }
            if (r4 != 0) goto L_0x00a3
            goto L_0x01a1
        L_0x00a3:
            java.lang.String r4 = "ISO8859_1"
            byte[] r2 = r2.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            byte[] r2 = r2.getBytes()     // Catch:{ all -> 0x01a8 }
        L_0x00ae:
            c24.c r4 = new c24.c     // Catch:{ all -> 0x01a8 }
            r4.<init>()     // Catch:{ all -> 0x01a8 }
            byte[] r2 = r4.mo110088f(r2)     // Catch:{ all -> 0x01a8 }
        L_0x00b7:
            r16 = r2
            r8 = 0
        L_0x00ba:
            a24.f r2 = r1.f337550a     // Catch:{ all -> 0x01a8 }
            android.content.Context r4 = r1.f337554e     // Catch:{ all -> 0x01a8 }
            int r4 = oicq.wlogin_sdk.tools.C117790util.m166190l(r4)     // Catch:{ all -> 0x01a8 }
            r2.f337583m = r4     // Catch:{ all -> 0x01a8 }
            a24.f r2 = r1.f337550a     // Catch:{ all -> 0x01a8 }
            android.content.Context r4 = r1.f337554e     // Catch:{ all -> 0x01a8 }
            java.lang.String r5 = "wifi"
            java.lang.String r6 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r6)     // Catch:{ Exception -> 0x00e3 }
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch:{ Exception -> 0x00e3 }
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch:{ Exception -> 0x00e3 }
            int r6 = r4.getType()     // Catch:{ Exception -> 0x00e3 }
            if (r6 != 0) goto L_0x00e3
            java.lang.String r4 = r4.getExtraInfo()     // Catch:{ Exception -> 0x00e3 }
            if (r4 == 0) goto L_0x00e3
            r5 = r4
        L_0x00e3:
            byte[] r4 = r5.getBytes()     // Catch:{ all -> 0x01a8 }
            r2.f337585o = r4     // Catch:{ all -> 0x01a8 }
            a24.f r2 = r1.f337550a     // Catch:{ all -> 0x01a8 }
            r2.f337576f = r14     // Catch:{ all -> 0x01a8 }
            r2.f337577g = r12     // Catch:{ all -> 0x01a8 }
            r2.getClass()     // Catch:{ all -> 0x01a8 }
            b24.d r4 = new b24.d     // Catch:{ all -> 0x01a8 }
            r4.<init>()     // Catch:{ all -> 0x01a8 }
            r2.f337574d = r4     // Catch:{ all -> 0x01a8 }
            a24.g r2 = r1.f337551b     // Catch:{ all -> 0x01a8 }
            r1.f337553d = r2     // Catch:{ all -> 0x01a8 }
            if (r8 == 0) goto L_0x013d
            r5 = 1
            r8 = 0
            a24.f r3 = r1.f337550a     // Catch:{ all -> 0x01a8 }
            byte[] r9 = r3.f337595y     // Catch:{ all -> 0x01a8 }
            int r11 = r1.f337556g     // Catch:{ all -> 0x01a8 }
            int r10 = r1.f337555f     // Catch:{ all -> 0x01a8 }
            r17 = 0
            r18 = 1
            r20 = 1
            r21 = 0
            r22 = 1
            r23 = 102400(0x19000, float:1.43493E-40)
            r24 = 1
            byte[] r6 = r3.f337592v     // Catch:{ all -> 0x01a8 }
            r3 = r30
            r25 = r6
            r6 = r28
            r26 = r10
            r10 = r16
            r12 = r26
            r13 = r17
            r14 = r32
            r15 = r18
            r17 = r20
            r18 = r21
            r19 = r22
            r20 = r23
            r21 = r24
            r22 = r25
            byte[] r2 = r2.mo164498g(r3, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01a8 }
            goto L_0x0175
        L_0x013d:
            r2 = 4
            byte[] r10 = new byte[r2]     // Catch:{ all -> 0x01a8 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a8 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            oicq.wlogin_sdk.tools.C117790util.m166196r(r10, r3, r4)     // Catch:{ all -> 0x01a8 }
            a24.g r2 = r1.f337551b     // Catch:{ all -> 0x01a8 }
            r5 = 1
            r8 = 0
            a24.f r3 = r1.f337550a     // Catch:{ all -> 0x01a8 }
            byte[] r9 = r3.f337595y     // Catch:{ all -> 0x01a8 }
            r11 = 0
            int r13 = r1.f337556g     // Catch:{ all -> 0x01a8 }
            int r14 = r1.f337555f     // Catch:{ all -> 0x01a8 }
            r15 = 0
            r17 = 1
            r19 = 1
            r20 = 0
            r21 = 1
            r22 = 102400(0x19000, float:1.43493E-40)
            r23 = 1
            byte[] r12 = r3.f337592v     // Catch:{ all -> 0x01a8 }
            r3 = r30
            r6 = r28
            r24 = r12
            r12 = r16
            r16 = r32
            byte[] r2 = r2.mo164499h(r3, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x01a8 }
        L_0x0175:
            monitor-exit(r27)     // Catch:{ all -> 0x01a8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "wtlogin login with GetStWithPasswd:user:"
            r3.<init>(r4)
            r4 = r28
            r3.append(r4)
            java.lang.String r4 = " appid:"
            r3.append(r4)
            r4 = r30
            r3.append(r4)
            java.lang.String r4 = " dwSigMap:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " end"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            oicq.wlogin_sdk.tools.C117790util.m166181c(r0)
            return r2
        L_0x01a1:
            java.lang.String r0 = "USER_WITH_PWD userPasswd null"
            oicq.wlogin_sdk.tools.C117790util.m166181c(r0)     // Catch:{ all -> 0x01a8 }
            monitor-exit(r27)     // Catch:{ all -> 0x01a8 }
            return r9
        L_0x01a8:
            r0 = move-exception
            monitor-exit(r27)     // Catch:{ all -> 0x01a8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a24.C112734b.mo164483e(long, long, int, a24.b$a, java.lang.String):byte[]");
    }

    /* renamed from: f */
    public int mo164484f(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length == 0 || this.f337553d == null) {
            return -1017;
        }
        C117790util.m166181c("user:" + this.f337550a.f337576f + " ResolveSvrData ...");
        C112737d dVar = this.f337553d;
        int length = bArr.length;
        if (length <= 17) {
            dVar.getClass();
            i = -1009;
        } else {
            dVar.f337565c = (length - 15) - 2;
            if (length > dVar.f337563a) {
                int i2 = length + 128;
                dVar.f337563a = i2;
                dVar.f337566d = new byte[i2];
            }
            dVar.f337564b = length;
            System.arraycopy(bArr, 0, dVar.f337566d, 0, length);
            byte[] a = C16848d.m16500a(dVar.f337566d, 16, dVar.f337565c, dVar.f337569g.f337573c);
            if (a == null) {
                i = -1002;
            } else {
                dVar.f337565c = a.length;
                if (a.length + 15 + 2 > dVar.f337563a) {
                    int length2 = a.length + 15 + 2;
                    dVar.f337563a = length2;
                    byte[] bArr2 = new byte[length2];
                    System.arraycopy(dVar.f337566d, 0, bArr2, 0, dVar.f337564b);
                    dVar.f337566d = bArr2;
                }
                dVar.f337564b = 0;
                System.arraycopy(a, 0, dVar.f337566d, 16, a.length);
                dVar.f337564b += a.length + 17;
                i = 0;
            }
            if (i >= 0) {
                i = dVar.mo164494e(dVar.f337566d, 16, dVar.f337565c);
            }
        }
        if (i == 1) {
            mo164480b(this.f337550a.f337576f);
        }
        C117790util.m166181c("user:" + this.f337550a.f337576f + " ResolveSvrData ret=" + i);
        return i;
    }

    /* renamed from: g */
    public final void mo164485g(byte[] bArr) {
        C112739f fVar = this.f337550a;
        byte[] bArr2 = new byte[bArr.length];
        fVar.f337581k = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int length = bArr.length + 1;
        byte[] bArr3 = new byte[length];
        bArr3[0] = 35;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        C112739f fVar2 = this.f337550a;
        SecureRandom secureRandom = fVar2.f337571a;
        byte[] seed = SecureRandom.getSeed(16);
        byte[] bArr4 = new byte[(seed.length + length)];
        System.arraycopy(seed, 0, bArr4, 0, seed.length);
        System.arraycopy(bArr3, 0, bArr4, seed.length, length);
        fVar2.f337572b = C79920c.m97091l(bArr4);
    }
}
