package com.tencent.p014mm.network;

import a70.C112760b;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.network.p0 */
public class C81043p0 {

    /* renamed from: a */
    public static final String f238066a = (C112760b.m154230f0() + "/tencent/noop.dat");

    /* renamed from: b */
    public static long f238067b;

    /* renamed from: c */
    public static long f238068c;

    static {
        f238067b = 0;
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("noop_prefs", 0);
        int i = sharedPreferences.getInt("noop_strategy", 1);
        long j = 270;
        if (1 == i) {
            f238068c = 270;
        } else if (3 == i) {
            long j2 = sharedPreferences.getLong("noop_min_interval", 270);
            if (j2 < 180 || j2 > 3600) {
                f238068c = 270;
            } else {
                f238068c = j2;
                j = j2;
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis - f238067b > 3600) {
                long j3 = m99016a()[0];
                if (j3 < 180 || j3 > 3600) {
                    f238068c = 270;
                } else {
                    f238068c = j3;
                }
                f238067b = currentTimeMillis;
            }
            j = f238068c;
        }
        f238068c = (j * 1000) / 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a0 A[SYNTHETIC, Splitter:B:48:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a6 A[SYNTHETIC, Splitter:B:53:0x00a6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long[] m99016a() {
        /*
            r0 = 2
            long[] r0 = new long[r0]
            r0 = {0, 0} // fill-array
            java.lang.String r1 = f238066a
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r2 = r1.getPath()
            r3 = 0
            if (r2 == 0) goto L_0x002d
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r3, r3)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x002d
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r2)
            android.net.Uri r1 = r1.build()
        L_0x002d:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r4 = 0
            com.tencent.mm.vfs.f0$h r2 = r2.mo177799l(r1, r4)
            boolean r5 = r2.mo177810a()
            if (r5 != 0) goto L_0x003c
            r5 = 0
            goto L_0x0044
        L_0x003c:
            com.tencent.mm.vfs.FileSystem$c r5 = r2.f348991a
            java.lang.String r6 = r2.f348992b
            boolean r5 = r5.mo119948x(r6)
        L_0x0044:
            if (r5 != 0) goto L_0x0047
            return r0
        L_0x0047:
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ Exception -> 0x009a }
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x009a }
            com.tencent.mm.vfs.f0$h r2 = r6.mo177799l(r1, r2)     // Catch:{ Exception -> 0x009a }
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106421C(r1, r2)     // Catch:{ Exception -> 0x009a }
            r5.<init>(r1)     // Catch:{ Exception -> 0x009a }
            int r1 = r5.readInt()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r6 = 180(0xb4, double:8.9E-322)
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x008b
            r6 = 3600(0xe10, double:1.7786E-320)
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0068
            goto L_0x008b
        L_0x0068:
            r0[r3] = r1     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            int r1 = r5.readInt()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r6
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0081
            r5.close()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r5.close()     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            return r0
        L_0x0081:
            r3 = 1
            r0[r3] = r1     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r5.close()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r5.close()     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            return r0
        L_0x008b:
            r5.close()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r5.close()     // Catch:{ Exception -> 0x0091 }
        L_0x0091:
            return r0
        L_0x0092:
            r0 = move-exception
            r4 = r5
            goto L_0x00a4
        L_0x0095:
            r1 = move-exception
            r4 = r5
            goto L_0x009b
        L_0x0098:
            r0 = move-exception
            goto L_0x00a4
        L_0x009a:
            r1 = move-exception
        L_0x009b:
            r1.getStackTrace()     // Catch:{ all -> 0x0098 }
            if (r4 == 0) goto L_0x00a3
            r4.close()     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            return r0
        L_0x00a4:
            if (r4 == 0) goto L_0x00a9
            r4.close()     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C81043p0.m99016a():long[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0044 A[SYNTHETIC, Splitter:B:27:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m99017b(long r3, long r5) {
        /*
            r0 = 0
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0038 }
            java.lang.String r2 = f238066a     // Catch:{ Exception -> 0x0038 }
            r1.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x0038 }
            boolean r2 = r1.mo119967g()     // Catch:{ Exception -> 0x0038 }
            if (r2 != 0) goto L_0x0015
            boolean r2 = r1.mo119964e()     // Catch:{ Exception -> 0x0038 }
            if (r2 != 0) goto L_0x0015
            return
        L_0x0015:
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0038 }
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106426H(r1)     // Catch:{ Exception -> 0x0038 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0038 }
            int r4 = (int) r3
            r2.writeInt(r4)     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            int r3 = (int) r5     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            r2.writeInt(r3)     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            r2.flush()     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            r2.close()     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            r2.close()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            return
        L_0x0030:
            r3 = move-exception
            r0 = r2
            goto L_0x0042
        L_0x0033:
            r3 = move-exception
            r0 = r2
            goto L_0x0039
        L_0x0036:
            r3 = move-exception
            goto L_0x0042
        L_0x0038:
            r3 = move-exception
        L_0x0039:
            r3.getStackTrace()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0.close()     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C81043p0.m99017b(long, long):void");
    }
}
