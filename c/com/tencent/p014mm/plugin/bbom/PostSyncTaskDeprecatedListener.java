package com.tencent.p014mm.plugin.bbom;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.bbom.PostSyncTaskDeprecatedListener */
public class PostSyncTaskDeprecatedListener extends IListener<PostSyncTaskEvent> {
    public PostSyncTaskDeprecatedListener() {
        super(C40008f.f107254d);
        this.__eventId = -790196534;
    }

    public boolean callback(IEvent iEvent) {
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        mo175080e();
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v39, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v40 */
    /* JADX WARNING: type inference failed for: r4v41 */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x067b  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0b5d  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0b63  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0bf8  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0bfb  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175080e() {
        /*
            r63 = this;
            boolean r0 = eb0.C97625j3.m125811a()
            r1 = 1
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x001c
            boolean r0 = f40.C86718e.m107551r()
            if (r0 != 0) goto L_0x001c
            int r0 = eb0.C75592q0.m90785o()
            r0 = r0 & 16
            if (r0 != 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r4 = 1800000(0x1b7740, double:8.89318E-318)
            r6 = 43
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = 0
            r10 = 3
            r11 = 0
            if (r0 == 0) goto L_0x011a
            r13 = 66817(0x10501, float:9.363E-41)
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x003f }
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()     // Catch:{ Exception -> 0x003f }
            java.lang.Object r0 = r0.mo119684e(r13, r9)     // Catch:{ Exception -> 0x003f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x003f }
            com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r0, (long) r11)     // Catch:{ Exception -> 0x003f }
            goto L_0x0049
        L_0x003f:
            r0 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.String r15 = "MicroMsg.PostTaskMediaNoteStat"
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r2, r14)
        L_0x0049:
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r11)
            long r14 = r14 * r7
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x011a
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r2 = 67073(0x10601, float:9.3989E-41)
            java.lang.Object r14 = r0.mo119684e(r2, r9)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r14)
            r15 = 67074(0x10602, float:9.399E-41)
            java.lang.Object r16 = r0.mo119684e(r15, r9)
            java.lang.Integer r16 = (java.lang.Integer) r16
            int r16 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r16)
            r4 = 67075(0x10603, float:9.3992E-41)
            java.lang.Object r5 = r0.mo119684e(r4, r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r5)
            r7 = 67076(0x10604, float:9.3993E-41)
            java.lang.Object r8 = r0.mo119684e(r7, r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r8)
            eb0.c r17 = eb0.C97625j3.m125812b()
            g62.l r17 = r17.mo105911z()
            r9 = r17
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            java.lang.String r11 = "medianote"
            int r12 = r9.Wx0(r11, r1)
            int r17 = r9.Wx0(r11, r10)
            r13 = 34
            int r19 = r9.Wx0(r11, r13)
            int r9 = r9.Wx0(r11, r6)
            int r11 = r12 - r14
            if (r11 <= 0) goto L_0x00c8
            te3.jv2 r14 = new te3.jv2
            r14.<init>()
            r14.f136353d = r11
            r14.f136354e = r1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r0.mo119676J(r2, r11)
        L_0x00c8:
            int r2 = r17 - r16
            if (r2 <= 0) goto L_0x00dc
            te3.jv2 r11 = new te3.jv2
            r11.<init>()
            r11.f136353d = r2
            r11.f136354e = r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r0.mo119676J(r15, r2)
        L_0x00dc:
            int r2 = r19 - r5
            if (r2 <= 0) goto L_0x00f0
            te3.jv2 r5 = new te3.jv2
            r5.<init>()
            r5.f136353d = r2
            r5.f136354e = r13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r0.mo119676J(r4, r2)
        L_0x00f0:
            int r2 = r9 - r8
            if (r2 <= 0) goto L_0x0104
            te3.jv2 r4 = new te3.jv2
            r4.<init>()
            r4.f136353d = r2
            r4.f136354e = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r0.mo119676J(r7, r2)
        L_0x0104:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 66817(0x10501, float:9.363E-41)
            r0.mo119676J(r4, r2)
        L_0x011a:
            int[] r0 = com.tencent.p014mm.vfs.C116322r0.f349081a
            java.lang.String r0 = "VFSStatistic"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r2 = "VFSReportTime"
            r4 = 0
            long r7 = r0.getLong(r2, r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r7 = r4 - r7
            r15 = 9
            r18 = 86400000(0x5265c00, double:4.2687272E-316)
            r9 = 5
            int r20 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x013e
            r21 = r3
            goto L_0x0692
        L_0x013e:
            java.lang.Object r7 = com.tencent.p014mm.vfs.C116314o.f349036g
            monitor-enter(r7)
            boolean r8 = com.tencent.p014mm.vfs.C116314o.f349039j     // Catch:{ all -> 0x0c38 }
            if (r8 != 0) goto L_0x014c
            monitor-exit(r7)     // Catch:{ all -> 0x0c38 }
            r21 = r3
            r37 = r4
            goto L_0x038f
        L_0x014c:
            java.util.Map<java.lang.String, com.tencent.mm.vfs.o$b> r8 = com.tencent.p014mm.vfs.C116314o.f349037h     // Catch:{ all -> 0x0c38 }
            java.util.Collection r8 = r8.values()     // Catch:{ all -> 0x0c38 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0c38 }
            r21 = r3
            r2 = 0
            r11 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
        L_0x0168:
            boolean r13 = r8.hasNext()     // Catch:{ all -> 0x0c34 }
            if (r13 == 0) goto L_0x01c1
            java.lang.Object r13 = r8.next()     // Catch:{ all -> 0x0c34 }
            com.tencent.mm.vfs.o$b r13 = (com.tencent.p014mm.vfs.C116314o.C116316b) r13     // Catch:{ all -> 0x0c34 }
            r34 = r7
            long r6 = r13.f349059e     // Catch:{ all -> 0x0c32 }
            long r11 = r11 + r6
            int r14 = r13.f349056b     // Catch:{ all -> 0x0c32 }
            if (r14 == r1) goto L_0x0194
            if (r14 == r15) goto L_0x0192
            if (r14 == r10) goto L_0x018f
            r15 = 4
            if (r14 == r15) goto L_0x018c
            if (r14 == r9) goto L_0x0192
            r15 = 6
            if (r14 == r15) goto L_0x0192
            long r22 = r22 + r6
            goto L_0x0198
        L_0x018c:
            long r28 = r28 + r6
            goto L_0x0198
        L_0x018f:
            long r26 = r26 + r6
            goto L_0x0198
        L_0x0192:
            long r2 = r2 + r6
            goto L_0x0198
        L_0x0194:
            r14 = r24
            long r24 = r14 + r6
        L_0x0198:
            java.lang.String r14 = r13.f349058d     // Catch:{ all -> 0x0c32 }
            java.lang.String r15 = "${sdToCache}"
            boolean r14 = r14.startsWith(r15)     // Catch:{ all -> 0x0c32 }
            if (r14 != 0) goto L_0x01ba
            java.lang.String r14 = r13.f349058d     // Catch:{ all -> 0x0c32 }
            java.lang.String r15 = "${dataCache}"
            boolean r14 = r14.startsWith(r15)     // Catch:{ all -> 0x0c32 }
            if (r14 == 0) goto L_0x01ad
            goto L_0x01ba
        L_0x01ad:
            java.lang.String r13 = r13.f349058d     // Catch:{ all -> 0x0c32 }
            java.lang.String r14 = "${sdFrom}"
            boolean r13 = r13.startsWith(r14)     // Catch:{ all -> 0x0c32 }
            if (r13 == 0) goto L_0x01bc
            long r32 = r32 + r6
            goto L_0x01bc
        L_0x01ba:
            long r30 = r30 + r6
        L_0x01bc:
            r7 = r34
            r15 = 9
            goto L_0x0168
        L_0x01c1:
            r34 = r7
            r14 = r24
            monitor-exit(r34)     // Catch:{ all -> 0x0c32 }
            r6 = r22
            double r9 = (double) r6
            r23 = r2
            double r1 = (double) r11
            double r9 = r9 / r1
            r35 = r9
            double r8 = (double) r14
            double r9 = r8 / r1
            r37 = r4
            r3 = r23
            r23 = r9
            double r8 = (double) r3
            double r1 = r8 / r1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.tencent.mars.smc.IDKey r9 = new com.tencent.mars.smc.IDKey
            r10 = 1556(0x614, float:2.18E-42)
            r5 = 1
            r13 = 0
            r9.<init>((int) r10, (int) r13, (int) r5)
            r8.add(r9)
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r46 = 1556(0x614, double:7.69E-321)
            r42 = 1
            r48 = 1048576(0x100000, double:5.180654E-318)
            long r13 = r14 / r48
            r40 = 1556(0x614, double:7.69E-321)
            r39 = r5
            r44 = r13
            r39.<init>((long) r40, (long) r42, (long) r44)
            r8.add(r5)
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r57 = 1556(0x614, double:7.69E-321)
            r53 = 2
            long r26 = r26 / r48
            r59 = 1556(0x614, double:7.69E-321)
            r61 = 1556(0x614, double:7.69E-321)
            r51 = 1556(0x614, double:7.69E-321)
            r50 = r5
            r55 = r26
            r50.<init>((long) r51, (long) r53, (long) r55)
            r8.add(r5)
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r42 = 3
            long r28 = r28 / r48
            r39 = r5
            r40 = r46
            r44 = r28
            r39.<init>((long) r40, (long) r42, (long) r44)
            r8.add(r5)
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r53 = 4
            long r46 = r6 / r48
            r50 = r5
            r55 = r46
            r50.<init>((long) r51, (long) r53, (long) r55)
            r8.add(r5)
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r40 = 1556(0x614, double:7.69E-321)
            r42 = 5
            long r30 = r30 / r48
            r39 = r5
            r44 = r30
            r39.<init>((long) r40, (long) r42, (long) r44)
            r8.add(r5)
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r42 = 6
            long r32 = r32 / r48
            r39 = r5
            r40 = r61
            r44 = r32
            r39.<init>((long) r40, (long) r42, (long) r44)
            r8.add(r5)
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r42 = 7
            long r3 = r3 / r48
            r39 = r5
            r40 = r57
            r44 = r3
            r39.<init>((long) r40, (long) r42, (long) r44)
            r8.add(r5)
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r42 = 9
            long r11 = r11 / r48
            r39 = r5
            r40 = r59
            r44 = r11
            r39.<init>((long) r40, (long) r42, (long) r44)
            r8.add(r5)
            r39 = 536870912(0x20000000, double:2.652494739E-315)
            int r5 = (r6 > r39 ? 1 : (r6 == r39 ? 0 : -1))
            if (r5 >= 0) goto L_0x028f
            r6 = 41
            goto L_0x02b3
        L_0x028f:
            r39 = 1073741824(0x40000000, double:5.304989477E-315)
            int r5 = (r6 > r39 ? 1 : (r6 == r39 ? 0 : -1))
            if (r5 >= 0) goto L_0x0299
            r6 = 42
            goto L_0x02b3
        L_0x0299:
            r39 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r5 = (r6 > r39 ? 1 : (r6 == r39 ? 0 : -1))
            if (r5 >= 0) goto L_0x02a5
            r6 = 43
            goto L_0x02b3
        L_0x02a5:
            r39 = 4294967296(0x100000000, double:2.121995791E-314)
            int r5 = (r6 > r39 ? 1 : (r6 == r39 ? 0 : -1))
            if (r5 >= 0) goto L_0x02b1
            r6 = 44
            goto L_0x02b3
        L_0x02b1:
            r6 = 45
        L_0x02b3:
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r7 = 1
            r5.<init>((int) r10, (int) r6, (int) r7)
            r8.add(r5)
            r5 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r39 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            r41 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = (r35 > r5 ? 1 : (r35 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x02cf
            r7 = 51
            goto L_0x02df
        L_0x02cf:
            int r7 = (r35 > r41 ? 1 : (r35 == r41 ? 0 : -1))
            if (r7 >= 0) goto L_0x02d6
            r7 = 52
            goto L_0x02df
        L_0x02d6:
            int r7 = (r35 > r39 ? 1 : (r35 == r39 ? 0 : -1))
            if (r7 >= 0) goto L_0x02dd
            r7 = 53
            goto L_0x02df
        L_0x02dd:
            r7 = 54
        L_0x02df:
            com.tencent.mars.smc.IDKey r9 = new com.tencent.mars.smc.IDKey
            r15 = 1
            r9.<init>((int) r10, (int) r7, (int) r15)
            r8.add(r9)
            int r7 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x02ef
            r7 = 61
            goto L_0x02ff
        L_0x02ef:
            int r7 = (r23 > r41 ? 1 : (r23 == r41 ? 0 : -1))
            if (r7 >= 0) goto L_0x02f6
            r7 = 62
            goto L_0x02ff
        L_0x02f6:
            int r7 = (r23 > r39 ? 1 : (r23 == r39 ? 0 : -1))
            if (r7 >= 0) goto L_0x02fd
            r7 = 63
            goto L_0x02ff
        L_0x02fd:
            r7 = 64
        L_0x02ff:
            com.tencent.mars.smc.IDKey r9 = new com.tencent.mars.smc.IDKey
            r15 = 1
            r9.<init>((int) r10, (int) r7, (int) r15)
            r8.add(r9)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x030f
            r5 = 71
            goto L_0x031f
        L_0x030f:
            int r5 = (r1 > r41 ? 1 : (r1 == r41 ? 0 : -1))
            if (r5 >= 0) goto L_0x0316
            r5 = 72
            goto L_0x031f
        L_0x0316:
            int r5 = (r1 > r39 ? 1 : (r1 == r39 ? 0 : -1))
            if (r5 >= 0) goto L_0x031d
            r5 = 73
            goto L_0x031f
        L_0x031d:
            r5 = 74
        L_0x031f:
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey
            r7 = 1
            r6.<init>((int) r10, (int) r5, (int) r7)
            r8.add(r6)
            kj2.d r5 = kj2.C117407d.INSTANCE
            r5.mo160124a(r8, r7)
            java.lang.String r5 = "VFS.DiskFileStatistics"
            java.lang.String r6 = "IDKEY > persist: %dM, expire: %dM, lru: %dM, nonVfs: %dM, cache: %dM, tencent: %dM, other: %dM, all: %dM, nonVfsRatio: %.2f%%, persistRatio: %.2f%%, otherRatio: %.2f%%"
            r8 = 11
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r10 = 0
            r9[r10] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r26)
            r9[r7] = r8
            java.lang.Long r7 = java.lang.Long.valueOf(r28)
            r8 = 2
            r9[r8] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r46)
            r8 = 3
            r9[r8] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r30)
            r10 = 4
            r9[r10] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r32)
            r10 = 5
            r9[r10] = r7
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 6
            r9[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r4 = 7
            r9[r4] = r3
            r3 = 8
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r14 = r35 * r10
            java.lang.Double r4 = java.lang.Double.valueOf(r14)
            r9[r3] = r4
            double r3 = r23 * r10
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r4 = 9
            r9[r4] = r3
            double r1 = r1 * r10
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 10
            r9[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r9)
        L_0x038f:
            java.lang.String r1 = "VFSReportTime"
            r2 = r37
            r0.encode((java.lang.String) r1, (long) r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r3 = 1387(0x56b, float:1.944E-42)
            r4 = 1
            r5 = 0
            r2.<init>((int) r3, (int) r5, (int) r4)
            r1.add(r2)
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r5 = 2
            r2.<init>((int) r3, (int) r5, (int) r4)
            r1.add(r2)
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r5 = 3
            r2.<init>((int) r3, (int) r5, (int) r4)
            r1.add(r2)
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r5 = 4
            r2.<init>((int) r3, (int) r5, (int) r4)
            r1.add(r2)
            java.lang.String r2 = a70.C112760b.m154223c()
            boolean r2 = com.tencent.p014mm.sdcard_migrate.C85730f.m105911a(r2)
            if (r2 == 0) goto L_0x03d6
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r5 = 100
            r2.<init>((int) r3, (int) r5, (int) r4)
            r1.add(r2)
        L_0x03d6:
            java.lang.String r2 = "VFSAsyncFinished"
            r5 = 0
            boolean r2 = r0.getBoolean(r2, r5)
            java.lang.String r6 = "VFSAsyncFinished3"
            boolean r6 = r0.getBoolean(r6, r5)
            java.lang.String r7 = "MicroMsg.PostTaskVFSStat"
            java.lang.String r9 = "VFS_ASYNC_KEY_FINISH is %s"
            java.lang.Object[] r10 = new java.lang.Object[r4]
            int[] r11 = com.tencent.p014mm.vfs.C116322r0.f349081a
            if (r2 == 0) goto L_0x03f0
            r12 = r11[r4]
            goto L_0x03f2
        L_0x03f0:
            r12 = r11[r5]
        L_0x03f2:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10[r5] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r10)
            java.lang.String r7 = "MicroMsg.PostTaskVFSStat"
            java.lang.String r9 = "VFS_ASYNC_KEY_FINISH_3 is %s"
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r12 = 150(0x96, float:2.1E-43)
            r14 = 149(0x95, float:2.09E-43)
            if (r6 == 0) goto L_0x040a
            r15 = 150(0x96, float:2.1E-43)
            goto L_0x040c
        L_0x040a:
            r15 = 149(0x95, float:2.09E-43)
        L_0x040c:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r10[r5] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r10)
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey
            if (r2 == 0) goto L_0x041c
            r2 = r11[r4]
            goto L_0x041e
        L_0x041c:
            r2 = r11[r5]
        L_0x041e:
            r7.<init>((int) r3, (int) r2, (int) r4)
            r1.add(r7)
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            if (r6 == 0) goto L_0x0429
            goto L_0x042b
        L_0x0429:
            r12 = 149(0x95, float:2.09E-43)
        L_0x042b:
            r2.<init>((int) r3, (int) r12, (int) r4)
            r1.add(r2)
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.u0 r4 = r2.mo177788a()
            com.tencent.mm.vfs.x0 r4 = (com.tencent.p014mm.vfs.C116340x0) r4
            java.util.Map r4 = r4.mo177848c()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r7 = 1
        L_0x0447:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0511
            java.lang.Object r9 = r4.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            com.tencent.mm.vfs.FileSystem r9 = (com.tencent.p014mm.vfs.FileSystem) r9
            com.tencent.mm.vfs.u0 r11 = r2.mo177788a()
            com.tencent.mm.vfs.x0 r11 = (com.tencent.p014mm.vfs.C116340x0) r11
            com.tencent.mm.vfs.FileSystem$c r11 = r11.mo177847b(r10)
            java.util.Map<java.lang.String, java.lang.Integer> r12 = com.tencent.p014mm.vfs.C116322r0.f349091k
            boolean r12 = r12.containsKey(r10)
            if (r12 == 0) goto L_0x050e
            boolean r12 = r11 instanceof com.tencent.p014mm.vfs.C116309m
            if (r12 == 0) goto L_0x04fc
            boolean r9 = r9 instanceof com.tencent.p014mm.vfs.MigrationFileSystem
            if (r9 == 0) goto L_0x0480
            com.tencent.mm.vfs.m r11 = (com.tencent.p014mm.vfs.C116309m) r11
            boolean r9 = com.tencent.p014mm.vfs.C116322r0.m163934a(r11)
            goto L_0x04b2
        L_0x0480:
            com.tencent.mm.vfs.m r11 = (com.tencent.p014mm.vfs.C116309m) r11
            java.util.List r9 = r11.mo119926G()
            if (r9 != 0) goto L_0x0489
            goto L_0x04b1
        L_0x0489:
            java.util.Iterator r9 = r9.iterator()
        L_0x048d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x04b1
            java.lang.Object r11 = r9.next()
            com.tencent.mm.vfs.FileSystem$c r11 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r11
            if (r11 == 0) goto L_0x048d
            com.tencent.mm.vfs.FileSystem r12 = r11.mo119930u()
            boolean r12 = r12 instanceof com.tencent.p014mm.vfs.MigrationFileSystem
            if (r12 == 0) goto L_0x048d
            boolean r12 = r11 instanceof com.tencent.p014mm.vfs.C116309m
            if (r12 == 0) goto L_0x048d
            com.tencent.mm.vfs.m r11 = (com.tencent.p014mm.vfs.C116309m) r11
            boolean r11 = com.tencent.p014mm.vfs.C116322r0.m163934a(r11)
            if (r11 != 0) goto L_0x048d
            r9 = 0
            goto L_0x04b2
        L_0x04b1:
            r9 = 1
        L_0x04b2:
            if (r7 == 0) goto L_0x04b8
            if (r9 == 0) goto L_0x04b8
            r7 = 1
            goto L_0x04b9
        L_0x04b8:
            r7 = 0
        L_0x04b9:
            if (r6 != 0) goto L_0x050e
            java.util.Map<java.lang.String, java.lang.Integer> r11 = com.tencent.p014mm.vfs.C116322r0.f349091k
            java.lang.Object r11 = r11.get(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r9 == 0) goto L_0x04cf
            r12 = -65536(0xffffffffffff0000, float:NaN)
            r11 = r11 & r12
            int r11 = r11 >> 16
            goto L_0x04d3
        L_0x04cf:
            r12 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r12
        L_0x04d3:
            com.tencent.mars.smc.IDKey r12 = new com.tencent.mars.smc.IDKey
            r14 = 1
            r12.<init>((int) r3, (int) r11, (int) r14)
            r1.add(r12)
            java.lang.String r11 = "MicroMsg.PostTaskVFSStat"
            java.lang.String r12 = "FileSystem %s, isMigrationFinished is %s"
            r15 = 2
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r15 = 0
            r8[r15] = r10
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r9)
            r8[r14] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r8)
            java.lang.String r8 = "image"
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x050e
            if (r9 != 0) goto L_0x050e
            r5 = 1
            goto L_0x0447
        L_0x04fc:
            java.lang.String r8 = "MicroMsg.PostTaskVFSStat"
            java.lang.String r11 = "FileSystem %s type error %s"
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r12 = 0
            r14[r12] = r10
            r10 = 1
            r14[r10] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r11, r14)
            goto L_0x0447
        L_0x050e:
            r10 = 1
            goto L_0x0447
        L_0x0511:
            r10 = 1
            if (r5 == 0) goto L_0x05ae
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r4 = 90
            r2.<init>((int) r3, (int) r4, (int) r10)
            r1.add(r2)
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.u0 r2 = r2.mo177788a()
            com.tencent.mm.vfs.x0 r2 = (com.tencent.p014mm.vfs.C116340x0) r2
            java.lang.String r4 = "image"
            com.tencent.mm.vfs.FileSystem$c r2 = r2.mo177847b(r4)
            boolean r4 = r2 instanceof com.tencent.p014mm.vfs.C116309m
            java.lang.String r5 = "MicroMsg.PostTaskVFSStat"
            if (r4 != 0) goto L_0x053a
            java.lang.String r2 = "state is not DelegateFileSystemState"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            goto L_0x05ae
        L_0x053a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r2)
        L_0x0542:
            int r2 = r4.size()
            r8 = 1
            int r2 = r2 - r8
            java.lang.Object r2 = r4.remove(r2)
            com.tencent.mm.vfs.FileSystem$c r2 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r2
            if (r2 != 0) goto L_0x0551
            goto L_0x05a8
        L_0x0551:
            boolean r9 = r2 instanceof com.tencent.p014mm.vfs.C116309m
            if (r9 != 0) goto L_0x058c
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r8 = 0
            r10[r8] = r2
            java.lang.String r8 = "List image directory of %s:"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r10)
            java.lang.String r8 = ""
            java.lang.Iterable r8 = r2.list(r8)
            if (r8 == 0) goto L_0x058c
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
        L_0x056c:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x058c
            java.lang.Object r11 = r8.next()
            com.tencent.mm.vfs.b0 r11 = (com.tencent.p014mm.vfs.C86001b0) r11
            r12 = 1
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0588
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.String r11 = r11.f250471a
            r12 = 0
            r14[r12] = r11
            java.lang.String r11 = "--> %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r14)
        L_0x0588:
            r11 = 50
            if (r10 <= r11) goto L_0x056c
        L_0x058c:
            if (r9 == 0) goto L_0x05a8
            com.tencent.mm.vfs.m r2 = (com.tencent.p014mm.vfs.C116309m) r2
            java.util.List r2 = r2.mo119926G()
            int r8 = r2.size()
            r9 = 1
            int r8 = r8 - r9
        L_0x059a:
            if (r8 < 0) goto L_0x05a8
            java.lang.Object r9 = r2.get(r8)
            com.tencent.mm.vfs.FileSystem$c r9 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r9
            r4.add(r9)
            int r8 = r8 + -1
            goto L_0x059a
        L_0x05a8:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0542
        L_0x05ae:
            java.lang.String r2 = "MicroMsg.PostTaskVFSStat"
            java.lang.String r4 = "VFSP_REPORT_ASYNC_FINISHED is %s, isMigrationFinished is %s"
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r9 = 0
            r8[r9] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r9 = 1
            r8[r9] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r8)
            if (r6 == 0) goto L_0x05d3
            if (r7 != 0) goto L_0x05d3
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r4 = 5
            r2.<init>((int) r3, (int) r4, (int) r9)
            r1.add(r2)
        L_0x05d3:
            if (r6 == 0) goto L_0x05dd
            java.lang.String r2 = "VFSAsyncFinish"
            r4 = 0
            int r2 = r0.getInt(r2, r4)
            goto L_0x05e5
        L_0x05dd:
            r4 = 0
            java.lang.String r2 = "VFSAsyncStart"
            int r2 = r0.getInt(r2, r4)
            int r2 = r2 + r9
        L_0x05e5:
            if (r2 > r9) goto L_0x05f3
            int[] r5 = com.tencent.p014mm.vfs.C116322r0.f349082b
            if (r6 == 0) goto L_0x05ef
            r5 = r5[r9]
            goto L_0x065d
        L_0x05ef:
            r5 = r5[r4]
            goto L_0x065d
        L_0x05f3:
            r5 = 2
            if (r2 > r5) goto L_0x0602
            int[] r5 = com.tencent.p014mm.vfs.C116322r0.f349083c
            if (r6 == 0) goto L_0x05fe
            r5 = r5[r9]
            goto L_0x065d
        L_0x05fe:
            r5 = r5[r4]
            goto L_0x065d
        L_0x0602:
            r5 = 3
            if (r2 > r5) goto L_0x060f
            int[] r5 = com.tencent.p014mm.vfs.C116322r0.f349084d
            if (r6 == 0) goto L_0x060c
            r5 = r5[r9]
            goto L_0x065d
        L_0x060c:
            r5 = r5[r4]
            goto L_0x065d
        L_0x060f:
            r5 = 5
            if (r2 > r5) goto L_0x061c
            int[] r5 = com.tencent.p014mm.vfs.C116322r0.f349085e
            if (r6 == 0) goto L_0x0619
            r5 = r5[r9]
            goto L_0x065d
        L_0x0619:
            r5 = r5[r4]
            goto L_0x065d
        L_0x061c:
            r5 = 10
            if (r2 > r5) goto L_0x062a
            int[] r5 = com.tencent.p014mm.vfs.C116322r0.f349086f
            if (r6 == 0) goto L_0x0627
            r5 = r5[r9]
            goto L_0x065d
        L_0x0627:
            r5 = r5[r4]
            goto L_0x065d
        L_0x062a:
            r5 = 15
            if (r2 > r5) goto L_0x0638
            int[] r5 = com.tencent.p014mm.vfs.C116322r0.f349087g
            if (r6 == 0) goto L_0x0635
            r5 = r5[r9]
            goto L_0x065d
        L_0x0635:
            r5 = r5[r4]
            goto L_0x065d
        L_0x0638:
            r5 = 20
            if (r2 > r5) goto L_0x0646
            int[] r5 = com.tencent.p014mm.vfs.C116322r0.f349088h
            if (r6 == 0) goto L_0x0643
            r5 = r5[r9]
            goto L_0x065d
        L_0x0643:
            r5 = r5[r4]
            goto L_0x065d
        L_0x0646:
            r5 = 30
            if (r2 > r5) goto L_0x0654
            int[] r5 = com.tencent.p014mm.vfs.C116322r0.f349089i
            if (r6 == 0) goto L_0x0651
            r5 = r5[r9]
            goto L_0x065d
        L_0x0651:
            r5 = r5[r4]
            goto L_0x065d
        L_0x0654:
            int[] r5 = com.tencent.p014mm.vfs.C116322r0.f349090j
            if (r6 == 0) goto L_0x065b
            r5 = r5[r9]
            goto L_0x065d
        L_0x065b:
            r5 = r5[r4]
        L_0x065d:
            java.lang.String r10 = "MicroMsg.PostTaskVFSStat"
            java.lang.String r11 = "DaysKey %s"
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            r12[r4] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r10.<init>((int) r3, (int) r5, (int) r9)
            r1.add(r10)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r3.mo160124a(r1, r4)
            if (r6 != 0) goto L_0x0692
            if (r7 == 0) goto L_0x068d
            java.lang.String r1 = "VFSAsyncFinished"
            r0.encode((java.lang.String) r1, (boolean) r9)
            java.lang.String r1 = "VFSAsyncFinished3"
            r0.encode((java.lang.String) r1, (boolean) r9)
            java.lang.String r1 = "VFSAsyncFinish"
            r0.encode((java.lang.String) r1, (int) r2)
            goto L_0x0692
        L_0x068d:
            java.lang.String r1 = "VFSAsyncStart"
            r0.encode((java.lang.String) r1, (int) r2)
        L_0x0692:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = le3.C10499a.f31735a
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 66819(0x10503, float:9.3633E-41)
            r2 = 0
            java.lang.Object r0 = r0.mo119684e(r1, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1 = 0
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r0, (long) r1)
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r3)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r2 = 1800000(0x1b7740, double:8.89318E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x06bd
            r0 = 1
            goto L_0x06be
        L_0x06bd:
            r0 = 0
        L_0x06be:
            if (r0 == 0) goto L_0x06c5
            java.lang.String r0 = ""
            le3.C10499a.m10434c(r0)
        L_0x06c5:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 67841(0x10901, float:9.5065E-41)
            r2 = 0
            java.lang.Object r0 = r0.mo119684e(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r2 = 1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Boolean) r0, (boolean) r2)
            zl.l r2 = hg0.C76186t.m91534b()
            zl.l r3 = p286zl.C79396l.SUCC
            if (r2 == r3) goto L_0x06ee
            zl.l r2 = hg0.C76186t.m91534b()
            zl.l r3 = p286zl.C79396l.SUCC_UNLOAD
            if (r2 != r3) goto L_0x06ed
            goto L_0x06ee
        L_0x06ed:
            r0 = 0
        L_0x06ee:
            java.lang.String r2 = "MicroMsg.PostTaskUpdateCtRemark"
            if (r0 == 0) goto L_0x0801
            java.lang.String r0 = "collect addr userName"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            hg0.b r0 = dg0.C75398e.vx0()
            r0.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "select  *  from addr_upload2 where ( addr_upload2.username IS NOT NULL AND addr_upload2.username!=\""
            r3.append(r4)
            java.lang.String r4 = ""
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r4)
            r3.append(r5)
            java.lang.String r5 = "\" )"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "sql : "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "MicroMsg.AddrUploadStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r3)
            java.lang.String r6 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r6)
            zh3.f r0 = r0.f223157c
            r6 = 0
            r7 = 2
            android.database.Cursor r0 = r0.rawQuery(r3, r6, r7)
        L_0x0751:
            boolean r3 = r0.moveToNext()
            if (r3 == 0) goto L_0x0763
            hg0.a r3 = new hg0.a
            r3.<init>()
            r3.mo106383b(r0)
            r5.add(r3)
            goto L_0x0751
        L_0x0763:
            r0.close()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "list "
            r0.append(r3)
            int r3 = r5.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            r0 = 0
        L_0x077f:
            int r3 = r5.size()
            if (r0 >= r3) goto L_0x07f4
            java.lang.Object r3 = r5.get(r0)
            hg0.a r3 = (hg0.C76166a) r3
            java.lang.String r3 = r3.mo106389i()
            java.lang.Object r6 = r5.get(r0)
            hg0.a r6 = (hg0.C76166a) r6
            java.lang.String r6 = r6.mo106388h()
            java.lang.String r6 = r6.trim()
            if (r3 == 0) goto L_0x07f1
            boolean r7 = r3.equals(r4)
            if (r7 != 0) goto L_0x07f1
            if (r6 == 0) goto L_0x07f1
            boolean r7 = r6.equals(r4)
            if (r7 == 0) goto L_0x07ae
            goto L_0x07f1
        L_0x07ae:
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r7 = r7.mo105907v()
            com.tencent.mm.storage.z1 r7 = r7.get(r3)
            boolean r9 = r7.mo62927s3()
            if (r9 != 0) goto L_0x07c1
            goto L_0x07f1
        L_0x07c1:
            java.lang.String r9 = r7.mo73969n2()
            if (r9 == 0) goto L_0x07d1
            java.lang.String r9 = r7.mo73969n2()
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x07f1
        L_0x07d1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "userName "
            r9.append(r10)
            r9.append(r3)
            java.lang.String r3 = "conRemark"
            r9.append(r3)
            r9.append(r6)
            java.lang.String r3 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
            eb0.C45628s0.m50781j0(r7, r6)
        L_0x07f1:
            int r0 = r0 + 1
            goto L_0x077f
        L_0x07f4:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.mo119676J(r1, r3)
        L_0x0801:
            java.lang.String r0 = "update ct remark done"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            eb0.s5 r0 = eb0.C116756s5.m164691d()
            r0.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.f350057a
            long r1 = r1 - r3
            r3 = 60000(0xea60, double:2.9644E-319)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x081e
        L_0x081c:
            r1 = 0
            goto L_0x086d
        L_0x081e:
            long r1 = java.lang.System.currentTimeMillis()
            r0.f350057a = r1
            eb0.u4 r1 = r0.mo180728e()     // Catch:{ Exception -> 0x085b }
            java.util.LinkedList<eb0.t4> r2 = r1.f167586d     // Catch:{ Exception -> 0x085b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x085b }
            r3 = 0
        L_0x082f:
            boolean r4 = r2.hasNext()     // Catch:{ Exception -> 0x085b }
            if (r4 == 0) goto L_0x0855
            java.lang.Object r4 = r2.next()     // Catch:{ Exception -> 0x085b }
            eb0.t4 r4 = (eb0.C58543t4) r4     // Catch:{ Exception -> 0x085b }
            java.util.Map<java.lang.Integer, eb0.s5$a> r5 = r0.f350058b     // Catch:{ Exception -> 0x085b }
            int r6 = r4.f167583d     // Catch:{ Exception -> 0x085b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x085b }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ Exception -> 0x085b }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x085b }
            eb0.s5$a r5 = (eb0.C116756s5.C116757a) r5     // Catch:{ Exception -> 0x085b }
            if (r5 == 0) goto L_0x082f
            boolean r4 = r5.mo180719a(r4)     // Catch:{ Exception -> 0x085b }
            if (r4 == 0) goto L_0x082f
            r3 = 1
            goto L_0x082f
        L_0x0855:
            if (r3 == 0) goto L_0x081c
            r0.mo180729f(r1)     // Catch:{ Exception -> 0x085b }
            goto L_0x081c
        L_0x085b:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "MicroMsg.StatisticsKVReportLogic"
            java.lang.String r3 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r2)
        L_0x086d:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.tencent.mm.storage.u1 r2 = eb0.C97625j3.m125818h()
            r3 = 19
            java.lang.Object r2 = r2.mo119660a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r2, (int) r1)
            r1 = 0
        L_0x0883:
            r4 = 31
            if (r1 >= r2) goto L_0x0898
            te3.ul2 r5 = new te3.ul2
            r5.<init>()
            r5.f185759d = r4
            java.lang.String r4 = "0"
            r5.f185760e = r4
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0883
        L_0x0898:
            com.tencent.mm.storage.u1 r1 = eb0.C97625j3.m125818h()
            r2 = 20
            java.lang.Object r1 = r1.mo119660a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r1, (int) r2)
            r2 = 0
        L_0x08aa:
            if (r2 >= r1) goto L_0x08bd
            te3.ul2 r5 = new te3.ul2
            r5.<init>()
            r5.f185759d = r4
            java.lang.String r6 = "1"
            r5.f185760e = r6
            r0.add(r5)
            int r2 = r2 + 1
            goto L_0x08aa
        L_0x08bd:
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x08d9
            eb0.C116756s5.m164690c(r0)
            com.tencent.mm.storage.u1 r0 = eb0.C97625j3.m125818h()
            r1 = r21
            r0.mo119664f(r3, r1)
            com.tencent.mm.storage.u1 r0 = eb0.C97625j3.m125818h()
            r2 = 20
            r0.mo119664f(r2, r1)
            goto L_0x08db
        L_0x08d9:
            r1 = r21
        L_0x08db:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r2 = 81944(0x14018, float:1.14828E-40)
            r3 = 0
            java.lang.Object r0 = r0.mo119684e(r2, r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            long r2 = r0.longValue()
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0907
            r0 = 1
            goto L_0x0908
        L_0x0907:
            r0 = 0
        L_0x0908:
            if (r0 == 0) goto L_0x0961
            bd0.e r0 = bd0.C39755e.f106664h
            if (r0 != 0) goto L_0x0915
            bd0.e r0 = new bd0.e
            r0.<init>()
            bd0.C39755e.f106664h = r0
        L_0x0915:
            bd0.e r0 = bd0.C39755e.f106664h
            r0.getClass()
            f40.C86709a0.m107528h()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r3 = 16646145(0xfe0001, float:2.3326217E-38)
            r2.mo119676J(r3, r1)
            boolean r1 = r0.f106665d
            if (r1 != 0) goto L_0x0961
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            boolean r1 = r1.mo121147n()
            if (r1 == 0) goto L_0x0961
            r1 = 0
            r0.f106665d = r1
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r2 = 159(0x9f, float:2.23E-43)
            r1.mo123470p(r2, r0)
            r1 = 1
            r0.f106665d = r1
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r2 = 159(0x9f, float:2.23E-43)
            r1.mo123455a(r2, r0)
            java.lang.Class<op.f> r0 = p216op.C47389f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            op.f r0 = (p216op.C47389f) r0
            r1 = 9
            r0.M80(r1)
        L_0x0961:
            com.tencent.p014mm.booter.C67849p.m80214a()
            le3.C88489b.m110345b()
            boolean r0 = eb0.C97625j3.m125811a()
            java.lang.String r1 = "MicroMsg.PostTaskReportDataFlow"
            if (r0 != 0) goto L_0x0976
            java.lang.String r0 = "Account is not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0b39
        L_0x0976:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r2 = 74
            r3 = 0
            java.lang.Object r0 = r0.mo119684e(r2, r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r0)
            r0 = 10010(0x271a, float:1.4027E-41)
            int r4 = sf0.C90188n0.f258950r
            if (r0 != r4) goto L_0x09b6
            int r0 = sf0.C90188n0.f258951s
            if (r0 <= 0) goto L_0x09b6
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r0 = sf0.C90188n0.f258951s
            long r4 = (long) r0
            long r2 = r2 - r4
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r5[r4] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6 = 1
            r5[r6] = r0
            java.lang.String r0 = "GET DK_TEST_LAST_REPORT_DATAFLOW val:%d old:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r0, r5)
            sf0.C90188n0.f258951s = r4
            goto L_0x09b7
        L_0x09b6:
            r4 = 0
        L_0x09b7:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r7 = 3
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r0[r4] = r7
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r7 = 1
            r0[r7] = r4
            long r2 = r5 - r2
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r7 = 2
            r0[r7] = r4
            java.lang.String r4 = " now:%d old:%d diff:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r0)
            r9 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r9
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x09e3
            goto L_0x0b39
        L_0x09e3:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r3 = 74
            r0.mo119676J(r3, r2)
            com.tencent.mm.modelstat.r r0 = com.tencent.p014mm.modelstat.C29048w.wx0()
            if (r0 != 0) goto L_0x0a01
            java.lang.String r0 = "ERR: SubCoreStat.getNetStatStg() is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0b39
        L_0x0a01:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r2 = r2 / r18
            r4 = 1
            long r2 = r2 - r4
            com.tencent.mm.modelstat.r r0 = com.tencent.p014mm.modelstat.C29048w.wx0()
            int r4 = (int) r2
            com.tencent.mm.modelstat.n r0 = r0.mo174390Lo(r4)
            if (r0 == 0) goto L_0x0b3b
            int r5 = r0.f344026c
            if (r5 == r4) goto L_0x0a1b
            goto L_0x0b3b
        L_0x0a1b:
            com.tencent.mm.modelstat.j r4 = com.tencent.p014mm.modelstat.C29048w.vx0()
            if (r4 != 0) goto L_0x0a28
            java.lang.String r0 = "ERR: SubCoreStat.getMobileInfoStg() is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0b39
        L_0x0a28:
            com.tencent.mm.modelstat.j r4 = com.tencent.p014mm.modelstat.C29048w.vx0()
            com.tencent.mm.modelstat.j$a r4 = r4.mo112913a()
            if (r4 != 0) goto L_0x0a3c
            java.lang.String r4 = "SubCoreStat.getMobileInfoStg().checkInfo null , give default."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
            com.tencent.mm.modelstat.j$a r4 = new com.tencent.mm.modelstat.j$a
            r4.<init>()
        L_0x0a3c:
            r5 = 14
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r7 = 0
            r5[r7] = r6
            int r6 = r0.f344026c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r5[r7] = r6
            long r6 = r0.f344038o
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 2
            r5[r7] = r6
            long r6 = r0.f344019A
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 3
            r5[r7] = r6
            long r6 = r0.f344037n
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 4
            r5[r7] = r6
            long r6 = r0.f344049z
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 5
            r5[r7] = r6
            long r6 = r0.f344036m
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 6
            r5[r7] = r6
            long r6 = r0.f344048y
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 7
            r5[r7] = r6
            long r6 = r0.f344035l
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 8
            r5[r7] = r6
            long r9 = r0.f344047x
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r9 = 9
            r5[r9] = r6
            int r6 = r4.f238014a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 10
            r5[r9] = r6
            int r6 = r4.f238016c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 11
            r5[r9] = r6
            java.lang.String r6 = r4.f238015b
            r9 = 12
            r5[r9] = r6
            java.lang.String r6 = r4.f238017d
            r10 = 13
            r5[r10] = r6
            java.lang.String r6 = "last:%d peroid:%d [%d,%d][%d,%d][%d,%d][%d,%d] ispCode:%d subType:%d ispname:%s extra:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r5)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 10900(0x2a94, float:1.5274E-41)
            java.lang.Object[] r6 = new java.lang.Object[r10]
            long r2 = r2 * r18
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r6[r3] = r2
            long r2 = r0.f344038o
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r6[r3] = r2
            long r2 = r0.f344019A
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r6[r3] = r2
            long r2 = r0.f344037n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 3
            r6[r3] = r2
            long r2 = r0.f344049z
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 4
            r6[r3] = r2
            long r2 = r0.f344036m
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 5
            r6[r3] = r2
            long r2 = r0.f344048y
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 6
            r6[r3] = r2
            long r2 = r0.f344035l
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 7
            r6[r3] = r2
            long r2 = r0.f344047x
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6[r7] = r0
            int r0 = r4.f238014a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 9
            r6[r2] = r0
            int r0 = r4.f238016c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 10
            r6[r2] = r0
            java.lang.String r0 = r4.f238015b
            r2 = 11
            r6[r2] = r0
            java.lang.String r0 = r4.f238017d
            r6[r9] = r0
            r1.mo160131h(r5, r6)
        L_0x0b39:
            r5 = 0
            goto L_0x0b57
        L_0x0b3b:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            if (r0 != 0) goto L_0x0b42
            r0 = -1
            goto L_0x0b44
        L_0x0b42:
            int r0 = r0.f344026c
        L_0x0b44:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r4[r5] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 1
            r4[r2] = r0
            java.lang.String r0 = "ERR: NetStatInfo:%d lastDate:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)
        L_0x0b57:
            boolean r0 = com.tencent.p014mm.modelsimple.C55391p0.f157759b
            java.lang.String r1 = "MicroMsg.PostTaskUploadHDHeadImg"
            if (r0 == 0) goto L_0x0b63
            java.lang.String r0 = "is uploading hdHeadImg now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x0bae
        L_0x0b63:
            long r2 = com.tencent.p014mm.modelsimple.C55391p0.f157761d
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0b76
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            r6 = 180000(0x2bf20, double:8.8932E-319)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b7f
        L_0x0b76:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.p014mm.modelsimple.C55391p0.f157761d = r2
            r2 = 3
            com.tencent.p014mm.modelsimple.C55391p0.f157760c = r2
        L_0x0b7f:
            int r0 = com.tencent.p014mm.modelsimple.C55391p0.f157760c
            if (r0 > 0) goto L_0x0b89
            java.lang.String r0 = "frequency limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x0bae
        L_0x0b89:
            r2 = 1
            int r0 = r0 - r2
            com.tencent.p014mm.modelsimple.C55391p0.f157760c = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = a70.C112760b.m154235i()
            r0.append(r2)
            java.lang.String r2 = "temp.avatar.hd"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r2 != 0) goto L_0x0bb1
            java.lang.String r0 = "has uploaded HDHeadImg and delete it"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
        L_0x0bae:
            r2 = 0
            r3 = 1
            goto L_0x0bd7
        L_0x0bb1:
            ob0.n r1 = com.tencent.p014mm.modelsimple.C55391p0.f157758a
            if (r1 != 0) goto L_0x0bbc
            com.tencent.mm.modelsimple.o0 r1 = new com.tencent.mm.modelsimple.o0
            r1.<init>(r0)
            com.tencent.p014mm.modelsimple.C55391p0.f157758a = r1
        L_0x0bbc:
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r2 = 157(0x9d, float:2.2E-43)
            ob0.n r3 = com.tencent.p014mm.modelsimple.C55391p0.f157758a
            r1.mo123455a(r2, r3)
            com.tencent.mm.modelavatar.r r1 = new com.tencent.mm.modelavatar.r
            r2 = 0
            r3 = 1
            r1.<init>(r3, r0, r2, r3)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r1)
            com.tencent.p014mm.modelsimple.C55391p0.f157759b = r3
        L_0x0bd7:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 282881(0x45101, float:3.96401E-40)
            java.lang.Object r0 = r0.mo119684e(r1, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r0)
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r6)
            r8 = 172800000(0xa4cb800, double:8.53745436E-316)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0bf8
            goto L_0x0bf9
        L_0x0bf8:
            r3 = 0
        L_0x0bf9:
            if (r3 == 0) goto L_0x0c16
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo119676J(r1, r2)
            com.tencent.mm.autogen.events.ResetCardRetryCounterEvent r0 = new com.tencent.mm.autogen.events.ResetCardRetryCounterEvent
            r0.<init>()
            r0.publish()
        L_0x0c16:
            com.tencent.p014mm.booter.C1173n.m1323a()
            com.tencent.p014mm.booter.C1174o.m1324a()
            com.tencent.p014mm.booter.PostTaskStartRangeForIBeacon.m43223a()
            com.tencent.p014mm.booter.C28880v.m38414a()
            com.tencent.p014mm.booter.C28879u.m38413a()
            com.tencent.p014mm.booter.C28878t.m38412a()
            com.tencent.p014mm.booter.C80830r.m98680a()
            com.tencent.p014mm.booter.C28877s.m38411a()
            com.tencent.p014mm.booter.C28876q.m38410a()
            return
        L_0x0c32:
            r0 = move-exception
            goto L_0x0c3b
        L_0x0c34:
            r0 = move-exception
            r34 = r7
            goto L_0x0c3d
        L_0x0c38:
            r0 = move-exception
            r34 = r7
        L_0x0c3b:
            r7 = r34
        L_0x0c3d:
            monitor-exit(r7)     // Catch:{ all -> 0x0c3f }
            throw r0
        L_0x0c3f:
            r0 = move-exception
            goto L_0x0c3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.bbom.PostSyncTaskDeprecatedListener.mo175080e():void");
    }
}
