package dx2;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kr0.C33983a1;
import kr0.C33987b1;
import kr0.C88262c1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import te3.C51530ud3;

/* renamed from: dx2.d */
public final class C31343d {

    /* renamed from: a */
    public static final C31343d f83890a = new C31343d();

    /* renamed from: b */
    public static final C13601g f83891b = C36568h.m40985a(C7529a.f25789d);

    /* renamed from: c */
    public static final C13601g f83892c = C36568h.m40985a(C7531c.f25791d);

    /* renamed from: d */
    public static final C13601g f83893d = C36568h.m40985a(C7530b.f25790d);

    /* renamed from: e */
    public static final C13601g f83894e = C36568h.m40985a(C7532d.f25792d);

    /* renamed from: f */
    public static final ConcurrentHashMap<String, String> f83895f;

    /* renamed from: dx2.d$a */
    public static final class C7529a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C7529a f25789d = new C7529a();

        public C7529a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("SurfacePackageDownloadStorage");
        }
    }

    /* renamed from: dx2.d$b */
    public static final class C7530b extends C87413o implements C32224a<LinkedList<String>> {

        /* renamed from: d */
        public static final C7530b f25790d = new C7530b();

        public C7530b() {
            super(0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A[Catch:{ Exception -> 0x003a }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[Catch:{ Exception -> 0x003a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r7 = this;
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                dx2.d r1 = dx2.C31343d.f83890a
                monitor-enter(r1)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r1.mo58077b()     // Catch:{ all -> 0x0071 }
                java.lang.String r3 = "mmkv"
                gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x0071 }
                java.lang.String r3 = "KPkgDownloadBizAppIds"
                boolean r4 = r2.containsKey(r3)     // Catch:{ all -> 0x0071 }
                r5 = 0
                if (r4 == 0) goto L_0x0044
                byte[] r2 = r2.decodeBytes(r3)     // Catch:{ all -> 0x0071 }
                if (r2 == 0) goto L_0x0044
                int r3 = r2.length     // Catch:{ all -> 0x0071 }
                r4 = 0
                r6 = 1
                if (r3 != 0) goto L_0x0027
                r3 = 1
                goto L_0x0028
            L_0x0027:
                r3 = 0
            L_0x0028:
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x0044
                java.lang.Class<te3.ud3> r3 = te3.C51530ud3.class
                java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x003a }
                r6 = r3
                pe3.a r6 = (pe3.C47465a) r6     // Catch:{ Exception -> 0x003a }
                r6.parseFrom(r2)     // Catch:{ Exception -> 0x003a }
                pe3.a r3 = (pe3.C47465a) r3     // Catch:{ Exception -> 0x003a }
                goto L_0x0045
            L_0x003a:
                r2 = move-exception
                java.lang.String r3 = "MultiProcessMMKV.decodeProtoBuffer"
                java.lang.String r6 = "decode ProtoBuffer"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0071 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r6, r4)     // Catch:{ all -> 0x0071 }
            L_0x0044:
                r3 = r5
            L_0x0045:
                te3.ud3 r3 = (te3.C51530ud3) r3     // Catch:{ all -> 0x0071 }
                if (r3 == 0) goto L_0x004b
                java.util.LinkedList<java.lang.String> r5 = r3.f142789d     // Catch:{ all -> 0x0071 }
            L_0x004b:
                if (r5 != 0) goto L_0x0052
                java.util.LinkedList r5 = new java.util.LinkedList     // Catch:{ all -> 0x0071 }
                r5.<init>()     // Catch:{ all -> 0x0071 }
            L_0x0052:
                java.lang.String r2 = "MicroMsg.SurfaceApp.PackageDownloadManager"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r3.<init>()     // Catch:{ all -> 0x0071 }
                java.lang.String r4 = "getBizAppIds size "
                r3.append(r4)     // Catch:{ all -> 0x0071 }
                int r4 = r5.size()     // Catch:{ all -> 0x0071 }
                r3.append(r4)     // Catch:{ all -> 0x0071 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0071 }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)     // Catch:{ all -> 0x0071 }
                monitor-exit(r1)
                r0.addAll(r5)
                return r0
            L_0x0071:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dx2.C31343d.C7530b.invoke():java.lang.Object");
        }
    }

    /* renamed from: dx2.d$c */
    public static final class C7531c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7531c f25791d = new C7531c();

        public C7531c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C31343d.f83890a.mo58077b().decodeInt("PkgPreviewMode", 0));
        }
    }

    /* renamed from: dx2.d$d */
    public static final class C7532d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C7532d f25792d = new C7532d();

        public C7532d() {
            super(0);
        }

        public Object invoke() {
            Long valueOf = Long.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_trigger_download_surface_pkg_interval, 3600000));
            long longValue = valueOf.longValue();
            Log.m105924i("MicroMsg.SurfaceApp.PackageDownloadManager", "download pkg interval " + longValue);
            return valueOf;
        }
    }

    static {
        Map g = C90364q0.m113148g(new C13604l("wx9e221f7828fa7482", "gh_54c3d560a72d@app"), new C13604l("wxe208ce76dfa39515", "gh_6d296c4d857f@app"));
        C7533g gVar = C7533g.f25793a;
        if (((Boolean) ((C36570n) C7533g.f25794b).getValue()).booleanValue()) {
            g.put("wx4edd479d258d7f25", "gh_071444f0c9bf@app");
            g.put("wx2f3fb5db9f226462", "gh_70a4987220a2@app");
        }
        f83895f = new ConcurrentHashMap<>(g);
    }

    /* renamed from: a */
    public final void mo58076a(String str) {
        C87412m.m108594g(str, "appId");
        MultiProcessMMKV b = mo58077b();
        long j = b.getLong("lastDownLoadTime_" + str, 0);
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(currentTimeMillis - j);
        if ((mo58081f() != 0 || abs >= ((Number) ((C36570n) f83894e).getValue()).longValue()) && (mo58081f() == 0 || abs >= 10000)) {
            Log.m105924i("MicroMsg.SurfaceApp.PackageDownloadManager", "checkPreDownload " + str);
            MultiProcessMMKV b2 = mo58077b();
            b2.encode("lastDownLoadTime_" + str, currentTimeMillis);
            if (mo58081f() == 1) {
                ((C33983a1) C86312j.m106911c(C33983a1.class)).mo56533yv(str, 2, new C31341a(str), new C7528b(str));
            } else {
                ((C88262c1) C86312j.m106911c(C88262c1.class)).e60((String) null, str, 12);
                synchronized (this) {
                    if (!mo58078c().contains(str)) {
                        mo58078c().add(str);
                        C33987b1 b1Var = (C33987b1) C86312j.m106911c(C33987b1.class);
                        if (b1Var != null) {
                            b1Var.mo59394hF(str, 0);
                        }
                        mo58082g();
                    }
                }
            }
            C86411e.f251188h.mo58083a(0);
            return;
        }
        Log.m105918d("MicroMsg.SurfaceApp.PackageDownloadManager", "checkPreDownload return " + mo58081f() + " delta:" + abs);
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo58077b() {
        return (MultiProcessMMKV) ((C36570n) f83891b).getValue();
    }

    /* renamed from: c */
    public final LinkedList<String> mo58078c() {
        return (LinkedList) ((C36570n) f83893d).getValue();
    }

    /* renamed from: d */
    public final C29315z2 mo58079d(String str, int i) {
        C87412m.m108594g(str, "appId");
        try {
            C29315z2 Yh = ((C33987b1) C86312j.m106911c(C33987b1.class)).mo59392Yh(str, i, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("getPkgInfo appId=");
            sb.append(str);
            sb.append(", pkgType=");
            sb.append(i);
            sb.append(", md5=");
            sb.append(Yh != null ? Yh.field_versionMd5 : null);
            sb.append(" download version= ");
            sb.append(Yh != null ? Integer.valueOf(Yh.field_version) : null);
            sb.append(" path=");
            sb.append(Yh != null ? Yh.field_pkgPath : null);
            Log.m105924i("MicroMsg.SurfaceApp.PackageDownloadManager", sb.toString());
            return Yh;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.SurfaceApp.PackageDownloadManager", "getPreviewPkgPath ex " + e.getMessage());
            return null;
        }
    }

    /* renamed from: e */
    public final String mo58080e(String str) {
        C87412m.m108594g(str, "appId");
        boolean z = true;
        if (mo58081f() != 1) {
            z = false;
        }
        if (z) {
            C29315z2 d = mo58079d(str, 2);
            if (d != null) {
                return d.field_pkgPath;
            }
            return null;
        } else if (Util.isNullOrNil(str)) {
            return null;
        } else {
            C29315z2 d2 = mo58079d(str, 0);
            if (d2 == null) {
                Log.m105924i("MicroMsg.SurfaceApp.PackageDownloadManager", "geReleasePkgPath pkgInfo is null");
                return null;
            } else if (!C86013q1.m106450k(d2.field_pkgPath)) {
                Log.m105924i("MicroMsg.SurfaceApp.PackageDownloadManager", "geReleasePkgPath pkgInfo " + d2.field_pkgPath + " not exist");
                return null;
            } else {
                MultiProcessMMKV b = mo58077b();
                b.encode("surfaceLastUseVersion_" + str, d2.field_version);
                return d2.field_pkgPath;
            }
        }
    }

    /* renamed from: f */
    public final int mo58081f() {
        return ((Number) ((C36570n) f83892c).getValue()).intValue();
    }

    /* renamed from: g */
    public final synchronized void mo58082g() {
        try {
            MultiProcessMMKV b = mo58077b();
            C51530ud3 ud32 = new C51530ud3();
            ud32.f142789d = f83890a.mo58078c();
            C13598b0 b0Var = C13598b0.f38549a;
            b.encode("KPkgDownloadBizAppIds", ud32.toByteArray());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SurfaceApp.PackageDownloadManager", "saveBizAppIds ex " + e.getMessage());
        }
        return;
    }
}
