package com.tencent.p014mm.plugin.performance.diagnostic;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.backtrace.C114410f;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.performance.diagnostic.c */
public class C115656c implements C114410f {

    /* renamed from: a */
    public static final ArrayList<IDKey> f346919a = new ArrayList<>();

    /* renamed from: b */
    public static boolean f346920b = false;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo175880a(com.tencent.matrix.backtrace.C114410f.C114411a r23, java.lang.Object... r24) {
        /*
            r22 = this;
            r0 = r24
            int r1 = r23.ordinal()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0166
            if (r1 == r4) goto L_0x0167
            if (r1 == r2) goto L_0x0164
            r5 = 4
            r6 = 600000(0x927c0, double:2.964394E-318)
            r8 = 300000(0x493e0, double:1.482197E-318)
            r10 = 120000(0x1d4c0, double:5.9288E-319)
            r12 = 60000(0xea60, double:2.9644E-319)
            r14 = 30000(0x7530, double:1.4822E-319)
            r16 = 10000(0x2710, double:4.9407E-320)
            r18 = 0
            r20 = -1
            if (r1 == r5) goto L_0x010e
            r5 = 5
            if (r1 == r5) goto L_0x00b2
            r5 = 6
            if (r1 == r5) goto L_0x002e
            goto L_0x00af
        L_0x002e:
            if (r0 == 0) goto L_0x0040
            int r1 = r0.length
            if (r1 != r2) goto L_0x0040
            r1 = r0[r3]
            boolean r5 = r1 instanceof java.lang.Long
            if (r5 == 0) goto L_0x0040
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            goto L_0x0042
        L_0x0040:
            r5 = r20
        L_0x0042:
            if (r0 == 0) goto L_0x0053
            int r1 = r0.length
            if (r1 != r2) goto L_0x0053
            r0 = r0[r4]
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x0053
            java.lang.Long r0 = (java.lang.Long) r0
            long r20 = r0.longValue()
        L_0x0053:
            java.lang.String r0 = "MicroMsg.BacktraceReporter"
            java.lang.String r1 = "WeChat backtrace disk usage: file count(%s), file size(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x00af
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x00af
            r1 = 524288(0x80000, double:2.590327E-318)
            if (r0 < 0) goto L_0x006f
            int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006f
            r2 = 61
            goto L_0x0167
        L_0x006f:
            r5 = 2097152(0x200000, double:1.0361308E-317)
            int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
            int r0 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            r2 = 62
            goto L_0x0167
        L_0x007e:
            r0 = 10485760(0xa00000, double:5.180654E-317)
            int r2 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x008d
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x008d
            r2 = 63
            goto L_0x0167
        L_0x008d:
            r5 = 52428800(0x3200000, double:2.5903269E-316)
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x009c
            int r0 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r2 = 64
            goto L_0x0167
        L_0x009c:
            int r0 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00ab
            r0 = 209715200(0xc800000, double:1.036130757E-315)
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ab
            r2 = 65
            goto L_0x0167
        L_0x00ab:
            r2 = 66
            goto L_0x0167
        L_0x00af:
            r2 = -1
            goto L_0x0167
        L_0x00b2:
            if (r0 == 0) goto L_0x00c3
            int r1 = r0.length
            if (r1 != r4) goto L_0x00c3
            r0 = r0[r3]
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x00c3
            java.lang.Long r0 = (java.lang.Long) r0
            long r20 = r0.longValue()
        L_0x00c3:
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x00cf
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cf
            r2 = 21
            goto L_0x0167
        L_0x00cf:
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x00db
            int r0 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x00db
            r2 = 22
            goto L_0x0167
        L_0x00db:
            int r0 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x00e7
            int r0 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e7
            r2 = 23
            goto L_0x0167
        L_0x00e7:
            int r0 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00f3
            int r0 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f3
            r2 = 24
            goto L_0x0167
        L_0x00f3:
            int r0 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00ff
            int r0 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ff
            r2 = 25
            goto L_0x0167
        L_0x00ff:
            int r0 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x010b
            int r0 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x010b
            r2 = 26
            goto L_0x0167
        L_0x010b:
            r2 = 27
            goto L_0x0167
        L_0x010e:
            if (r0 == 0) goto L_0x011f
            int r1 = r0.length
            if (r1 != r4) goto L_0x011f
            r0 = r0[r3]
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x011f
            java.lang.Long r0 = (java.lang.Long) r0
            long r20 = r0.longValue()
        L_0x011f:
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x012a
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x012a
            r2 = 11
            goto L_0x0167
        L_0x012a:
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0135
            int r0 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0135
            r2 = 12
            goto L_0x0167
        L_0x0135:
            int r0 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0140
            int r0 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0140
            r2 = 13
            goto L_0x0167
        L_0x0140:
            int r0 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x014b
            int r0 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x014b
            r2 = 14
            goto L_0x0167
        L_0x014b:
            int r0 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0156
            int r0 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0156
            r2 = 15
            goto L_0x0167
        L_0x0156:
            int r0 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0161
            int r0 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0161
            r2 = 16
            goto L_0x0167
        L_0x0161:
            r2 = 17
            goto L_0x0167
        L_0x0164:
            r2 = 0
            goto L_0x0167
        L_0x0166:
            r2 = 1
        L_0x0167:
            if (r2 < 0) goto L_0x01bd
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 10
            r5 = 20
            r6 = 1593(0x639, float:2.232E-42)
            if (r2 < r1) goto L_0x0181
            if (r2 >= r5) goto L_0x0181
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r5.<init>((int) r6, (int) r1, (int) r4)
            r0.add(r5)
            goto L_0x01a0
        L_0x0181:
            if (r2 < r5) goto L_0x0190
            r1 = 30
            if (r2 >= r1) goto L_0x0190
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>((int) r6, (int) r5, (int) r4)
            r0.add(r1)
            goto L_0x01a0
        L_0x0190:
            r1 = 60
            if (r2 < r1) goto L_0x01a0
            r5 = 70
            if (r2 >= r5) goto L_0x01a0
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r5.<init>((int) r6, (int) r1, (int) r4)
            r0.add(r5)
        L_0x01a0:
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>((int) r6, (int) r2, (int) r4)
            r0.add(r1)
            java.util.ArrayList<com.tencent.mars.smc.IDKey> r1 = f346919a
            monitor-enter(r1)
            boolean r2 = f346920b     // Catch:{ all -> 0x01ba }
            if (r2 == 0) goto L_0x01b5
            kj2.d r2 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x01ba }
            r2.mo160124a(r0, r3)     // Catch:{ all -> 0x01ba }
            goto L_0x01b8
        L_0x01b5:
            r1.addAll(r0)     // Catch:{ all -> 0x01ba }
        L_0x01b8:
            monitor-exit(r1)     // Catch:{ all -> 0x01ba }
            goto L_0x01bd
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ba }
            throw r0
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.diagnostic.C115656c.mo175880a(com.tencent.matrix.backtrace.f$a, java.lang.Object[]):void");
    }
}
