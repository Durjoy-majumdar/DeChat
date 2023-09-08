package com.tencent.p014mm.plugin.report.service;

import android.util.SparseArray;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;

/* renamed from: com.tencent.mm.plugin.report.service.m */
public class C85405m {

    /* renamed from: a */
    public static SparseArray<Long> f248864a = new SparseArray<>();

    /* renamed from: b */
    public static boolean f248865b = true;

    /* renamed from: c */
    public static long f248866c = 0;

    /* renamed from: d */
    public static long f248867d = 0;

    /* renamed from: e */
    public static long f248868e = 0;

    /* renamed from: com.tencent.mm.plugin.report.service.m$a */
    public static final class C85406a {

        /* renamed from: e */
        public static C85406a f248869e;

        /* renamed from: a */
        public volatile boolean f248870a;

        /* renamed from: b */
        public long[] f248871b;

        /* renamed from: c */
        public int f248872c;

        /* renamed from: d */
        public long f248873d;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.tencent.mm.vfs.t1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.io.BufferedReader} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.BufferedReader} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.io.BufferedReader} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.io.BufferedReader} */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.io.BufferedReader] */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v4 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0073 A[SYNTHETIC, Splitter:B:34:0x0073] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x007f A[SYNTHETIC, Splitter:B:39:0x007f] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0095 A[SYNTHETIC, Splitter:B:48:0x0095] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00a1 A[SYNTHETIC, Splitter:B:53:0x00a1] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0113 A[SYNTHETIC, Splitter:B:63:0x0113] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x011f A[SYNTHETIC, Splitter:B:68:0x011f] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x006c=Splitter:B:31:0x006c, B:45:0x008e=Splitter:B:45:0x008e} */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m105416a() {
            /*
                java.lang.String r0 = ""
                java.lang.String r1 = "MicroMsg.ReportLogInfo"
                com.tencent.mm.plugin.report.service.m$a r2 = f248869e
                r3 = 1
                r4 = 0
                com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x001a }
                java.lang.String r6 = "/sys/devices/system/cpu/"
                r5.<init>((java.lang.String) r6)     // Catch:{ Exception -> 0x001a }
                com.tencent.mm.plugin.report.service.l r6 = new com.tencent.mm.plugin.report.service.l     // Catch:{ Exception -> 0x001a }
                r6.<init>()     // Catch:{ Exception -> 0x001a }
                com.tencent.mm.vfs.m1[] r5 = r5.mo119985v(r6)     // Catch:{ Exception -> 0x001a }
                int r5 = r5.length     // Catch:{ Exception -> 0x001a }
                goto L_0x0021
            L_0x001a:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
                r5 = 1
            L_0x0021:
                r2.f248872c = r5
                com.tencent.mm.plugin.report.service.m$a r2 = f248869e
                r5 = 0
                com.tencent.mm.vfs.t1 r6 = new com.tencent.mm.vfs.t1     // Catch:{ FileNotFoundException -> 0x008a, IOException -> 0x0068, all -> 0x0064 }
                java.lang.String r7 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
                r6.<init>((java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x008a, IOException -> 0x0068, all -> 0x0064 }
                java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x005f, IOException -> 0x005a, all -> 0x0057 }
                r7.<init>(r6)     // Catch:{ FileNotFoundException -> 0x005f, IOException -> 0x005a, all -> 0x0057 }
                java.lang.String r5 = r7.readLine()     // Catch:{ FileNotFoundException -> 0x0055, IOException -> 0x0053 }
                r5.trim()     // Catch:{ FileNotFoundException -> 0x0055, IOException -> 0x0053 }
                r7.close()     // Catch:{ FileNotFoundException -> 0x0055, IOException -> 0x0053 }
                r6.close()     // Catch:{ IOException -> 0x0040 }
                goto L_0x0046
            L_0x0040:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
            L_0x0046:
                r7.close()     // Catch:{ IOException -> 0x004b }
                goto L_0x00ab
            L_0x004b:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
                goto L_0x00ab
            L_0x0053:
                r5 = move-exception
                goto L_0x006c
            L_0x0055:
                r5 = move-exception
                goto L_0x008e
            L_0x0057:
                r2 = move-exception
                goto L_0x010f
            L_0x005a:
                r7 = move-exception
                r9 = r7
                r7 = r5
                r5 = r9
                goto L_0x006c
            L_0x005f:
                r7 = move-exception
                r9 = r7
                r7 = r5
                r5 = r9
                goto L_0x008e
            L_0x0064:
                r2 = move-exception
                r3 = r5
                goto L_0x0111
            L_0x0068:
                r6 = move-exception
                r7 = r5
                r5 = r6
                r6 = r7
            L_0x006c:
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x010d }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r8)     // Catch:{ all -> 0x010d }
                if (r6 == 0) goto L_0x007d
                r6.close()     // Catch:{ IOException -> 0x0077 }
                goto L_0x007d
            L_0x0077:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
            L_0x007d:
                if (r7 == 0) goto L_0x00ab
                r7.close()     // Catch:{ IOException -> 0x0083 }
                goto L_0x00ab
            L_0x0083:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
                goto L_0x00ab
            L_0x008a:
                r6 = move-exception
                r7 = r5
                r5 = r6
                r6 = r7
            L_0x008e:
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x010d }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r8)     // Catch:{ all -> 0x010d }
                if (r6 == 0) goto L_0x009f
                r6.close()     // Catch:{ IOException -> 0x0099 }
                goto L_0x009f
            L_0x0099:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
            L_0x009f:
                if (r7 == 0) goto L_0x00ab
                r7.close()     // Catch:{ IOException -> 0x00a5 }
                goto L_0x00ab
            L_0x00a5:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
            L_0x00ab:
                r2.getClass()
                com.tencent.mm.plugin.report.service.m$a r0 = f248869e
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r2 = "activity"
                java.lang.Object r1 = r1.getSystemService(r2)
                android.app.ActivityManager r1 = (android.app.ActivityManager) r1
                android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo
                r2.<init>()
                r1.getMemoryInfo(r2)
                long r1 = r2.availMem
                r5 = 10
                long r1 = r1 >> r5
                r0.f248873d = r1
                com.tencent.mm.plugin.report.service.m$a r0 = f248869e
                r1 = 2
                long[] r1 = new long[r1]
                android.os.StatFs r2 = new android.os.StatFs
                java.io.File r5 = p206nj.C88956h.m111060a()
                java.lang.String r5 = r5.getPath()
                r2.<init>(r5)
                int r5 = r2.getBlockSize()
                long r5 = (long) r5
                int r2 = r2.getBlockCount()
                long r7 = (long) r2
                long r7 = r7 * r5
                r1[r4] = r7
                android.os.StatFs r2 = new android.os.StatFs
                java.io.File r4 = p206nj.C88956h.m111060a()
                java.lang.String r4 = r4.getPath()
                r2.<init>(r4)
                int r4 = r2.getBlockSize()
                long r4 = (long) r4
                int r2 = r2.getAvailableBlocks()
                long r6 = (long) r2
                long r4 = r4 * r6
                r1[r3] = r4
                r0.f248871b = r1
                com.tencent.mm.plugin.report.service.m$a r0 = f248869e
                r0.f248870a = r3
                return
            L_0x010d:
                r2 = move-exception
                r5 = r7
            L_0x010f:
                r3 = r5
                r5 = r6
            L_0x0111:
                if (r5 == 0) goto L_0x011d
                r5.close()     // Catch:{ IOException -> 0x0117 }
                goto L_0x011d
            L_0x0117:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
            L_0x011d:
                if (r3 == 0) goto L_0x0129
                r3.close()     // Catch:{ IOException -> 0x0123 }
                goto L_0x0129
            L_0x0123:
                r3 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r0, r4)
            L_0x0129:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.report.service.C85405m.C85406a.m105416a():void");
        }
    }

    static {
        new SparseArray();
    }

    /* renamed from: a */
    public static void m105411a(int i) {
        if (f248865b) {
            f248864a.put(i, Long.valueOf(Util.nowMilliSecond()));
            Log.m105919d("MicroMsg.ReportLogInfo", "ReportLogInfo operationBegin eventID:%d  time:%d", Integer.valueOf(i), Long.valueOf(Util.nowMilliSecond()));
        }
    }

    /* renamed from: b */
    public static void m105412b(int i) {
        Long l;
        if (f248865b && (l = f248864a.get(i)) != null && l.longValue() != -1) {
            f248864a.put(i, -1L);
            long nowMilliSecond = Util.nowMilliSecond() - l.longValue();
            if (nowMilliSecond > 0) {
                switch (i) {
                    case 8:
                        if (!MMApplicationContext.isVersionChange()) {
                            m105413c(1, nowMilliSecond);
                            m105414d(WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC, nowMilliSecond);
                            C115669n.INSTANCE.mo160138m(23, 1, 2, (int) nowMilliSecond, false);
                            break;
                        } else {
                            C115669n.INSTANCE.mo160138m(23, 4, 5, (int) nowMilliSecond, false);
                            break;
                        }
                    case 9:
                        m105413c(3, nowMilliSecond);
                        m105414d(229, nowMilliSecond);
                        C115669n.INSTANCE.mo160138m(27, 1, 2, (int) nowMilliSecond, false);
                        break;
                    case 10:
                        m105413c(2, nowMilliSecond);
                        m105414d(228, nowMilliSecond);
                        C115669n.INSTANCE.mo160138m(28, 1, 2, (int) nowMilliSecond, false);
                        break;
                    case 12:
                        m105413c(6, nowMilliSecond);
                        break;
                    case 13:
                        m105413c(7, nowMilliSecond);
                        break;
                    case 14:
                        m105413c(8, nowMilliSecond);
                        break;
                    case 18:
                        m105413c(10, nowMilliSecond);
                        break;
                    case 19:
                        m105413c(9, nowMilliSecond);
                        break;
                    case 20:
                        m105413c(12, nowMilliSecond);
                        break;
                    case 21:
                        m105413c(11, nowMilliSecond);
                        break;
                    case 22:
                        m105413c(13, nowMilliSecond);
                        break;
                    case 23:
                        m105413c(16, nowMilliSecond);
                        break;
                    case 24:
                        m105413c(15, nowMilliSecond);
                        break;
                    case 25:
                        m105413c(14, nowMilliSecond);
                        break;
                }
                Log.m105925i("MicroMsg.ReportLogInfo", "ReportLogInfo operationEnd eventID:%d  time:%d", Integer.valueOf(i), Long.valueOf(nowMilliSecond));
            }
        }
    }

    /* renamed from: c */
    public static void m105413c(int i, long j) {
        C85406a aVar;
        if (i == 6) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= f248866c + 60000) {
                f248866c = currentTimeMillis;
            } else {
                return;
            }
        } else if (i == 7) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 >= f248867d + 60000) {
                f248867d = currentTimeMillis2;
            } else {
                return;
            }
        } else if (i == 8) {
            long currentTimeMillis3 = System.currentTimeMillis();
            if (currentTimeMillis3 >= f248868e + 60000) {
                f248868e = currentTimeMillis3;
            } else {
                return;
            }
        }
        synchronized (C85406a.class) {
            if (C85406a.f248869e == null) {
                C85406a.f248869e = new C85406a();
                C85406a.m105416a();
            }
            aVar = C85406a.f248869e;
        }
        if (aVar.f248870a) {
            C115669n.INSTANCE.mo160140o(11335, true, false, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(aVar.f248872c), Long.valueOf(aVar.f248871b[0]), Long.valueOf(aVar.f248871b[1]), Long.valueOf(aVar.f248873d));
            return;
        }
        C115669n.INSTANCE.mo160140o(11335, true, false, Integer.valueOf(i), Long.valueOf(j));
    }

    /* renamed from: d */
    public static void m105414d(int i, long j) {
        if (j > 0) {
            if (j < 1000) {
                C115669n.INSTANCE.mo175910t(i, 0, 1, false);
            } else if (j < 2000) {
                C115669n.INSTANCE.mo175910t(i, 0, 3, false);
            } else if (j < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                C115669n.INSTANCE.mo175910t(i, 0, 5, false);
            } else if (j < 10000) {
                C115669n.INSTANCE.mo175910t(i, 0, 7, false);
            } else {
                C115669n.INSTANCE.mo175910t(i, 0, 9, false);
            }
        }
    }

    /* renamed from: e */
    public static void m105415e(int i) {
        if (f248865b) {
            Log.m105919d("MicroMsg.ReportLogInfo", "ReportLogInfo stopOperation stop eventID:%d", Integer.valueOf(i));
            f248864a.put(i, -1L);
        }
    }
}
