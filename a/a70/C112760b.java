package a70;

import android.content.Context;
import android.os.Environment;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.File;

/* renamed from: a70.b */
public class C112760b {

    /* renamed from: a */
    public static final String[] f337646a = {null};

    /* renamed from: b */
    public static final String[] f337647b = {null};

    /* renamed from: c */
    public static final String[] f337648c = {null};

    /* renamed from: d */
    public static final String[] f337649d = {null};

    /* renamed from: e */
    public static final String[] f337650e = {null};

    /* renamed from: f */
    public static final C86009m1[] f337651f = {null};

    /* renamed from: A */
    public static synchronized String m154193A() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "MixAudio/";
        }
        return str;
    }

    /* renamed from: B */
    public static synchronized String m154194B() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "newyear/";
        }
        return str;
    }

    /* renamed from: C */
    public static synchronized String m154195C() {
        String str;
        synchronized (C112760b.class) {
            str = m154230f0() + m154218Z();
        }
        return str;
    }

    /* renamed from: D */
    public static synchronized String m154196D() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "preloadedRes/";
        }
        return str;
    }

    /* renamed from: E */
    public static synchronized String m154197E() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "recovery/";
        }
        return str;
    }

    /* renamed from: F */
    public static synchronized String m154198F() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "share/";
        }
        return str;
    }

    /* renamed from: G */
    public static synchronized String m154199G() {
        String str;
        synchronized (C112760b.class) {
            str = m154198F() + "upload_cache/";
        }
        return str;
    }

    /* renamed from: H */
    public static synchronized String m154200H() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "sns_ad_landingpages/";
        }
        return str;
    }

    /* renamed from: I */
    public static synchronized String m154201I() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "SQLTrace/";
        }
        return str;
    }

    /* renamed from: J */
    public static synchronized String m154202J() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "temp_video_cache";
        }
        return str;
    }

    /* renamed from: K */
    public static synchronized String m154203K() {
        String str;
        synchronized (C112760b.class) {
            str = m154224c0() + "/image/";
        }
        return str;
    }

    /* renamed from: L */
    public static synchronized String m154204L() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "tracedog/";
        }
        return str;
    }

    /* renamed from: M */
    public static synchronized String m154205M() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "vproxy/";
        }
        return str;
    }

    /* renamed from: N */
    public static synchronized String m154206N() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "vusericon/";
        }
        return str;
    }

    /* renamed from: O */
    public static synchronized String m154207O() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "wagamefiles/";
        }
        return str;
    }

    /* renamed from: P */
    public static synchronized String m154208P() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "wallet/";
        }
        return str;
    }

    /* renamed from: Q */
    public static synchronized String m154209Q() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "WebviewCache/";
        }
        return str;
    }

    /* renamed from: R */
    public static synchronized String m154210R() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "wepkg/";
        }
        return str;
    }

    /* renamed from: S */
    public static synchronized String m154211S() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "wxacache/";
        }
        return str;
    }

    /* renamed from: T */
    public static synchronized String m154212T() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "wxafiles/";
        }
        return str;
    }

    /* renamed from: U */
    public static synchronized String m154213U() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "wxanewfiles/";
        }
        return str;
    }

    /* renamed from: V */
    public static synchronized String m154214V() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "wxvideocache/";
        }
        return str;
    }

    /* renamed from: W */
    public static synchronized String m154215W() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "wxvideotmp/";
        }
        return str;
    }

    /* renamed from: X */
    public static synchronized String m154216X() {
        String str;
        synchronized (C112760b.class) {
            String[] strArr = f337647b;
            if (strArr[0] == null) {
                Context context = MMApplicationContext.getContext();
                if (context != null) {
                    strArr[0] = context.getFilesDir().getParentFile().getAbsolutePath() + "/";
                } else {
                    throw new RuntimeException("MMApplicationContext not initialized.");
                }
            }
            str = strArr[0];
        }
        return str;
    }

    /* renamed from: Y */
    public static synchronized String m154217Y() {
        String str;
        synchronized (C112760b.class) {
            String[] strArr = f337649d;
            if (strArr[0] == null) {
                strArr[0] = MMApplicationContext.isToolsIsolatedProcess() ? "/sdcard" : Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            str = strArr[0];
        }
        return str;
    }

    /* renamed from: Z */
    public static synchronized String m154218Z() {
        String str;
        synchronized (C112760b.class) {
            String[] strArr = f337646a;
            if (strArr[0] == null) {
                strArr[0] = "/MicroMsg/";
            }
            str = strArr[0];
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized String m154219a() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "crash/";
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1 = r2.getAbsolutePath() + "/";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0068 */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m154220a0() {
        /*
            java.lang.Class<a70.b> r0 = a70.C112760b.class
            monitor-enter(r0)
            java.lang.String r1 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ all -> 0x007f }
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r1)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x001e
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x007f }
            java.lang.String r3 = m154226d0()     // Catch:{ all -> 0x007f }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x007f }
            boolean r1 = r2.isDirectory()     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x0051
            r2.mkdirs()     // Catch:{ all -> 0x007f }
            goto L_0x0051
        L_0x001e:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x007f }
            java.lang.String r1 = m154228e0()     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r3.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "Pictures/"
            r3.append(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = m154226d0()     // Catch:{ all -> 0x007f }
            r3.append(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007f }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x007f }
            boolean r1 = r2.exists()     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x0051
            boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x0051
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x007f }
            java.lang.String r1 = m154221b()     // Catch:{ all -> 0x007f }
            r2.<init>(r1)     // Catch:{ all -> 0x007f }
        L_0x0051:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r1.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = r2.getCanonicalPath()     // Catch:{ all -> 0x0068 }
            r1.append(r3)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "/"
            r1.append(r3)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)
            return r1
        L_0x0068:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r1.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x007f }
            r1.append(r2)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007f }
            monitor-exit(r0)
            return r1
        L_0x007f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a70.C112760b.m154220a0():java.lang.String");
    }

    /* renamed from: b */
    public static synchronized String m154221b() {
        String str;
        synchronized (C112760b.class) {
            str = m154217Y() + "/tencent/MicroMsg/" + m154226d0();
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = r2.getAbsolutePath() + "/";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005f */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m154222b0() {
        /*
            java.lang.Class<a70.b> r0 = a70.C112760b.class
            monitor-enter(r0)
            java.lang.String r1 = android.os.Environment.DIRECTORY_DCIM     // Catch:{ all -> 0x0076 }
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r1)     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0015
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = m154226d0()     // Catch:{ all -> 0x0076 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0076 }
            goto L_0x0048
        L_0x0015:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = m154228e0()     // Catch:{ all -> 0x0076 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r3.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = "DCIM/"
            r3.append(r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = m154226d0()     // Catch:{ all -> 0x0076 }
            r3.append(r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0076 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0076 }
            boolean r1 = r2.exists()     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x0048
            boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x0048
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = m154221b()     // Catch:{ all -> 0x0076 }
            r2.<init>(r1)     // Catch:{ all -> 0x0076 }
        L_0x0048:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = r2.getCanonicalPath()     // Catch:{ all -> 0x005f }
            r1.append(r3)     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "/"
            r1.append(r3)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005f }
            monitor-exit(r0)
            return r1
        L_0x005f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r1.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x0076 }
            r1.append(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0076 }
            monitor-exit(r0)
            return r1
        L_0x0076:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a70.C112760b.m154222b0():java.lang.String");
    }

    /* renamed from: c */
    public static synchronized String m154223c() {
        String str;
        synchronized (C112760b.class) {
            str = m154217Y() + "/tencent/MicroMsg/";
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:30|31|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1 = r2.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x006b */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m154224c0() {
        /*
            java.lang.Class<a70.b> r0 = a70.C112760b.class
            monitor-enter(r0)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0071
            r2 = 0
            java.io.File r1 = r1.getExternalCacheDir()     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d
            boolean r3 = r1.exists()     // Catch:{ all -> 0x001f }
            if (r3 != 0) goto L_0x001d
            boolean r3 = r1.mkdirs()     // Catch:{ all -> 0x001f }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            r2 = r1
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            if (r2 != 0) goto L_0x0065
            boolean r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsIsolatedProcess()     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0036
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x003d
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "/sdcard/"
            r1.<init>(r2)     // Catch:{ all -> 0x0079 }
            goto L_0x003d
        L_0x0036:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "/sdcard/"
            r1.<init>(r2)     // Catch:{ all -> 0x0079 }
        L_0x003d:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0079 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r3.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "Android/data/"
            r3.append(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getApplicationId()     // Catch:{ all -> 0x0079 }
            r3.append(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "/cache"
            r3.append(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0079 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0079 }
            boolean r1 = r2.exists()     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x0065
            r2.mkdirs()     // Catch:{ all -> 0x0079 }
        L_0x0065:
            java.lang.String r1 = r2.getCanonicalPath()     // Catch:{ all -> 0x006b }
            monitor-exit(r0)
            return r1
        L_0x006b:
            java.lang.String r1 = r2.getAbsolutePath()     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)
            return r1
        L_0x0071:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "MMApplicationContext not initialized."
            r1.<init>(r2)     // Catch:{ all -> 0x0079 }
            throw r1     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a70.C112760b.m154224c0():java.lang.String");
    }

    /* renamed from: d */
    public static synchronized String m154225d() {
        String str;
        synchronized (C112760b.class) {
            str = m154216X() + "MicroMsg/";
            try {
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    /* renamed from: d0 */
    public static synchronized String m154226d0() {
        synchronized (C112760b.class) {
            if (WeChatBrands.AppInfo.current().isUS()) {
                return "WeChat/";
            }
            String str = m154225d() + ".camdir.use." + "WeChat/";
            String str2 = m154225d() + ".camdir.use." + "WeiXin/";
            if (new File(str).exists()) {
                return "WeChat/";
            }
            if (new File(str2).exists()) {
                return "WeiXin/";
            }
            if (LocaleUtil.getApplicationLanguage().equals("zh_CN")) {
                try {
                    new File(str2).createNewFile();
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.CConstants", th, "[-] Fail to create weixin camera dir marker.", new Object[0]);
                }
                return "WeiXin/";
            }
            try {
                new File(str).createNewFile();
            } catch (Throwable th4) {
                Log.printErrStackTrace("MicroMsg.CConstants", th4, "[-] Fail to create wechat camera dir marker.", new Object[0]);
            }
            return "WeChat/";
        }
    }

    /* renamed from: e */
    public static synchronized String m154227e() {
        String str;
        synchronized (C112760b.class) {
            str = m154225d() + "appbrand/srcache/";
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = r1.getAbsolutePath();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m154228e0() {
        /*
            java.lang.Class<a70.b> r0 = a70.C112760b.class
            monitor-enter(r0)
            java.lang.String[] r1 = f337650e     // Catch:{ all -> 0x0036 }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = m154224c0()     // Catch:{ all -> 0x0036 }
            r1.<init>(r3)     // Catch:{ all -> 0x0036 }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ all -> 0x001c }
            goto L_0x0020
        L_0x001c:
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0036 }
        L_0x0020:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsIsolatedProcess()     // Catch:{ all -> 0x0036 }
            if (r3 != 0) goto L_0x002e
            java.lang.String r3 = "/sdcard/Android/"
            boolean r3 = r1.startsWith(r3)     // Catch:{ all -> 0x0036 }
            if (r3 != 0) goto L_0x0032
        L_0x002e:
            java.lang.String[] r3 = f337650e     // Catch:{ all -> 0x0036 }
            r3[r2] = r1     // Catch:{ all -> 0x0036 }
        L_0x0032:
            monitor-exit(r0)
            return r1
        L_0x0034:
            monitor-exit(r0)
            return r1
        L_0x0036:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a70.C112760b.m154228e0():java.lang.String");
    }

    /* renamed from: f */
    public static synchronized String m154229f() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "appbrand/trace/";
        }
        return str;
    }

    /* renamed from: f0 */
    public static synchronized String m154230f0() {
        String str;
        synchronized (C112760b.class) {
            String[] strArr = f337648c;
            if (strArr[0] == null) {
                strArr[0] = m154228e0();
            }
            str = strArr[0];
        }
        return str;
    }

    /* renamed from: g */
    public static synchronized String m154231g() {
        String str;
        synchronized (C112760b.class) {
            str = m154216X() + "files/public/";
        }
        return str;
    }

    /* renamed from: g0 */
    public static synchronized String m154232g0() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "watchdog/";
        }
        return str;
    }

    /* renamed from: h */
    public static synchronized String m154233h() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "appbrand/";
        }
        return str;
    }

    /* renamed from: h0 */
    public static synchronized String m154234h0() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "xlog";
        }
        return str;
    }

    /* renamed from: i */
    public static synchronized String m154235i() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "avatar/";
        }
        return str;
    }

    /* renamed from: i0 */
    public static C86009m1 m154236i0(String str) {
        C86009m1[] m1VarArr = f337651f;
        if (m1VarArr[0] == null) {
            synchronized (m1VarArr) {
                if (m1VarArr[0] == null) {
                    m1VarArr[0] = new C86009m1(C86009m1.m106378c(MMApplicationContext.getContext().getCacheDir()), "temp");
                }
            }
        }
        C86009m1 m1Var = m1VarArr[0];
        if (str != null) {
            m1Var = new C86009m1(m1Var, str);
        }
        m1Var.mo119987x();
        return m1Var;
    }

    /* renamed from: j */
    public static synchronized String m154237j() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "browser/";
        }
        return str;
    }

    /* renamed from: j0 */
    public static synchronized void m154238j0(String str, boolean z) {
        synchronized (C112760b.class) {
            Log.m105924i("MicroMsg.CConstants", "initSdCardPath start SDCARD_ROOT: " + m154230f0() + ", DEFAULT_SDCARD_ROOT: " + m154217Y());
            if (z) {
                f337648c[0] = str;
                f337646a[0] = "/MicroMsg/";
            } else {
                if (!m154230f0().equals(m154228e0())) {
                    f337648c[0] = str;
                }
                f337649d[0] = str;
            }
            Log.m105924i("MicroMsg.CConstants", "initSdCardPath end SDCARD_ROOT: " + m154230f0() + ", DEFAULT_SDCARD_ROOT: " + m154217Y());
        }
    }

    /* renamed from: k */
    public static synchronized String m154239k() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "Cache/";
        }
        return str;
    }

    /* renamed from: l */
    public static synchronized String m154240l() {
        synchronized (C112760b.class) {
            if (m154230f0().equals(m154228e0())) {
                String a0 = m154220a0();
                return a0;
            }
            String b = m154221b();
            return b;
        }
    }

    /* renamed from: m */
    public static synchronized String m154241m() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "card/";
        }
        return str;
    }

    /* renamed from: n */
    public static synchronized String m154242n() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "CDNTemp/";
        }
        return str;
    }

    /* renamed from: o */
    public static synchronized String m154243o() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "CheckResUpdate/";
        }
        return str;
    }

    /* renamed from: p */
    public static synchronized String m154244p() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "crash/";
        }
        return str;
    }

    /* renamed from: q */
    public static synchronized String m154245q() {
        synchronized (C112760b.class) {
            if (m154230f0().equals(m154228e0())) {
                String b0 = m154222b0();
                return b0;
            }
            String b = m154221b();
            return b;
        }
    }

    /* renamed from: r */
    public static synchronized String m154246r() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "diskcache/";
        }
        return str;
    }

    /* renamed from: s */
    public static synchronized String m154247s() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "Download/";
        }
        return str;
    }

    /* renamed from: t */
    public static synchronized String m154248t() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "egg_spring/";
        }
        return str;
    }

    /* renamed from: u */
    public static synchronized String m154249u() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "exdevice/";
        }
        return str;
    }

    /* renamed from: v */
    public static synchronized String m154250v() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "FailMsgFileCache/";
        }
        return str;
    }

    /* renamed from: w */
    public static synchronized String m154251w() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "favoffline/";
        }
        return str;
    }

    /* renamed from: x */
    public static synchronized String m154252x() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "fts/";
        }
        return str;
    }

    /* renamed from: y */
    public static synchronized String m154253y() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "Game/";
        }
        return str;
    }

    /* renamed from: z */
    public static synchronized String m154254z() {
        String str;
        synchronized (C112760b.class) {
            str = m154195C() + "Handler/";
        }
        return str;
    }
}
