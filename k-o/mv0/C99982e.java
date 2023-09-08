package mv0;

import lu3.C88656g;

/* renamed from: mv0.e */
public class C99982e implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ C99984g f292939d;

    public C99982e(C99984g gVar) {
        this.f292939d = gVar;
    }

    public String getKey() {
        return "BakPCServer_startBak";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:18|19|20|(2:22|23)|24|25|(2:29|30)|35|(2:131|37)(1:40)) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cc, code lost:
        r6.close();
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r13 = new com.tencent.p014mm.storage.C72963f4();
        r13.convertFrom(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        if (r2 <= 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e3, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0 = lv0.C99659k.m130075a(r13, false, r23, r7, r25, (java.util.HashMap<java.lang.Long, lv0.C99659k.C99660a>) null, r19, false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f3, code lost:
        r13 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0208, code lost:
        r0 = th;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00a8 */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2 A[SYNTHETIC, Splitter:B:40:0x00d2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r26 = this;
            r1 = r26
            mv0.g r9 = r1.f292939d
            r10 = 0
            r9.f292950p = r10
            mv0.f r0 = new mv0.f
            r0.<init>(r9)
            r9.f292948n = r0
            r2 = 5
            gv0.C20842c.m22879k1(r2, r0)
            ov0.d r0 = ov0.C100546d.m131563g()
            ov0.g r0 = r0.mo139995h()
            int r2 = r0.f294625o
            if (r2 == 0) goto L_0x028f
            com.tencent.mm.storage.v1 r0 = r0.f294611a
            r11 = 2
            r12 = 0
            java.lang.Object r0 = r0.mo119684e(r11, r12)
            r23 = r0
            java.lang.String r23 = (java.lang.String) r23
            java.util.List<java.lang.String> r0 = r9.f292945h
            java.util.Iterator r24 = r0.iterator()
        L_0x0030:
            boolean r0 = r24.hasNext()
            r8 = 1
            if (r0 == 0) goto L_0x0280
            java.lang.Object r0 = r24.next()
            java.lang.String r0 = (java.lang.String) r0
            ov0.d r2 = ov0.C100546d.m131563g()
            ov0.g r2 = r2.mo139995h()
            com.tencent.mm.storage.v3 r2 = r2.mo140005e()
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            com.tencent.mm.storage.h2 r2 = r2.mo69771j(r0)
            if (r2 == 0) goto L_0x0056
            int r2 = r2.mo108786G2()
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            java.lang.String r3 = "MicroMsg.BakPCServer"
            java.lang.String r4 = "backupImp convName:%s, unReadCount:%d"
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r5[r10] = r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            com.tencent.mm.pointers.PLong r7 = new com.tencent.mm.pointers.PLong
            r7.<init>()
            ov0.d r3 = ov0.C100546d.m131563g()
            ov0.g r3 = r3.mo139995h()
            g62.l r3 = r3.mo140008h()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            android.database.Cursor r6 = r3.ko0(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r25 = new java.util.LinkedList
            r25.<init>()
            boolean r3 = r6.moveToFirst()     // Catch:{ all -> 0x0279 }
            if (r3 == 0) goto L_0x0213
            r3 = r0
        L_0x0090:
            boolean r0 = r6.isAfterLast()     // Catch:{ all -> 0x0279 }
            if (r0 != 0) goto L_0x020a
            java.lang.Object r13 = r9.f292941d     // Catch:{ all -> 0x0279 }
            monitor-enter(r13)     // Catch:{ all -> 0x0279 }
            java.util.HashSet<java.lang.String> r0 = r9.f292946i     // Catch:{ all -> 0x0203 }
            int r0 = r0.size()     // Catch:{ all -> 0x0203 }
            r14 = 10
            if (r0 <= r14) goto L_0x00a8
            java.lang.Object r0 = r9.f292941d     // Catch:{ InterruptedException -> 0x00a8 }
            r0.wait()     // Catch:{ InterruptedException -> 0x00a8 }
        L_0x00a8:
            boolean r0 = r9.f292943f     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r9.f292944g     // Catch:{ all -> 0x0203 }
            if (r0 != 0) goto L_0x00c0
            java.lang.Object r0 = r9.f292941d     // Catch:{ InterruptedException -> 0x00b6 }
            r0.wait()     // Catch:{ InterruptedException -> 0x00b6 }
            goto L_0x00c0
        L_0x00b6:
            r0 = move-exception
            java.lang.String r14 = "MicroMsg.BakPCServer"
            java.lang.String r15 = ""
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ all -> 0x0203 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r15, r4)     // Catch:{ all -> 0x0203 }
        L_0x00c0:
            boolean r0 = r9.f292944g     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = "MicroMsg.BakPCServer"
            java.lang.String r2 = "backupImp cancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0203 }
            monitor-exit(r13)     // Catch:{ all -> 0x0203 }
            r6.close()
            r8 = 0
            goto L_0x0269
        L_0x00d2:
            monitor-exit(r13)     // Catch:{ all -> 0x0203 }
            com.tencent.mm.storage.f4 r13 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x0279 }
            r13.<init>()     // Catch:{ all -> 0x0279 }
            r13.convertFrom(r6)     // Catch:{ all -> 0x0279 }
            r14 = 0
            r18 = 0
            if (r2 <= 0) goto L_0x00e3
            r19 = 1
            goto L_0x00e5
        L_0x00e3:
            r19 = 0
        L_0x00e5:
            r20 = 0
            r21 = 0
            r15 = r23
            r16 = r7
            r17 = r25
            te3.f9 r0 = lv0.C99659k.m130075a(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x00f7 }
            int r2 = r2 + -1
            r13 = r2
            goto L_0x011a
        L_0x00f7:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "MicroMsg.BakPCServer"
            java.lang.String r5 = ""
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ all -> 0x0279 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r4, r5, r13)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = "MicroMsg.BakPCServer"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r5.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r13 = "backupChatMsg %s"
            r5.append(r13)     // Catch:{ all -> 0x0279 }
            r5.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0279 }
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r0, r4)     // Catch:{ all -> 0x0279 }
            r13 = r2
            r0 = r12
        L_0x011a:
            if (r0 == 0) goto L_0x011f
            r3.add(r0)     // Catch:{ all -> 0x0279 }
        L_0x011f:
            java.util.Iterator r0 = r25.iterator()     // Catch:{ all -> 0x0279 }
        L_0x0123:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0279 }
            if (r2 == 0) goto L_0x0183
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0279 }
            r14 = r2
            pv0.x r14 = (pv0.C100968x) r14     // Catch:{ all -> 0x0279 }
            nv0.c r15 = new nv0.c     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = r14.f295675f     // Catch:{ all -> 0x0279 }
            r5 = 2
            r16 = 0
            java.lang.String r2 = r14.f295676g     // Catch:{ all -> 0x0279 }
            mv0.a r8 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x0279 }
            byte[] r8 = r8.f303746f     // Catch:{ all -> 0x0279 }
            r18 = r2
            r2 = r15
            r19 = r3
            r3 = r4
            r11 = 0
            r4 = r5
            r5 = r16
            r16 = r6
            r6 = r18
            r11 = r7
            r7 = r9
            r12 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0277 }
            java.lang.Object r2 = r9.f292941d     // Catch:{ all -> 0x0277 }
            monitor-enter(r2)     // Catch:{ all -> 0x0277 }
            r15.mo32547o1()     // Catch:{ all -> 0x0180 }
            java.util.HashSet<java.lang.String> r3 = r9.f292946i     // Catch:{ all -> 0x0180 }
            java.lang.String r4 = r14.f295675f     // Catch:{ all -> 0x0180 }
            r3.add(r4)     // Catch:{ all -> 0x0180 }
            java.lang.String r3 = "MicroMsg.BakPCServer"
            java.lang.String r4 = "backupChatMsg now: size:%d"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x0180 }
            java.util.HashSet<java.lang.String> r6 = r9.f292946i     // Catch:{ all -> 0x0180 }
            int r6 = r6.size()     // Catch:{ all -> 0x0180 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0180 }
            r5[r10] = r6     // Catch:{ all -> 0x0180 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ all -> 0x0180 }
            monitor-exit(r2)     // Catch:{ all -> 0x0180 }
            r7 = r11
            r6 = r16
            r3 = r19
            r8 = 1
            r11 = 2
            r12 = 0
            goto L_0x0123
        L_0x0180:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0180 }
            throw r0     // Catch:{ all -> 0x0277 }
        L_0x0183:
            r19 = r3
            r16 = r6
            r11 = r7
            r12 = 1
            r25.clear()     // Catch:{ all -> 0x0277 }
            long r2 = r11.value     // Catch:{ all -> 0x0277 }
            r4 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f5
            java.lang.String r0 = "MicroMsg.BakPCServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0277 }
            r2.<init>()     // Catch:{ all -> 0x0277 }
            java.lang.String r3 = "limitSize "
            r2.append(r3)     // Catch:{ all -> 0x0277 }
            long r3 = r11.value     // Catch:{ all -> 0x0277 }
            r2.append(r3)     // Catch:{ all -> 0x0277 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0277 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)     // Catch:{ all -> 0x0277 }
            java.util.Random r0 = r9.f292942e     // Catch:{ all -> 0x0277 }
            java.lang.String r0 = mv0.C99984g.m130652c(r0)     // Catch:{ all -> 0x0277 }
            nv0.c r14 = new nv0.c     // Catch:{ all -> 0x0277 }
            r4 = 1
            java.lang.String r6 = ""
            mv0.a r2 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x0277 }
            byte[] r8 = r2.f303746f     // Catch:{ all -> 0x0277 }
            r2 = r14
            r3 = r0
            r5 = r19
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0277 }
            java.lang.Object r2 = r9.f292941d     // Catch:{ all -> 0x0277 }
            monitor-enter(r2)     // Catch:{ all -> 0x0277 }
            r14.mo32547o1()     // Catch:{ all -> 0x01f2 }
            java.util.HashSet<java.lang.String> r3 = r9.f292946i     // Catch:{ all -> 0x01f2 }
            r3.add(r0)     // Catch:{ all -> 0x01f2 }
            java.lang.String r0 = "MicroMsg.BakPCServer"
            java.lang.String r3 = "backupChatMsg now: size:%d"
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ all -> 0x01f2 }
            java.util.HashSet<java.lang.String> r5 = r9.f292946i     // Catch:{ all -> 0x01f2 }
            int r5 = r5.size()     // Catch:{ all -> 0x01f2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01f2 }
            r4[r10] = r5     // Catch:{ all -> 0x01f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)     // Catch:{ all -> 0x01f2 }
            monitor-exit(r2)     // Catch:{ all -> 0x01f2 }
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch:{ all -> 0x0277 }
            r3.<init>()     // Catch:{ all -> 0x0277 }
            r4 = 0
            r11.value = r4     // Catch:{ all -> 0x0277 }
            goto L_0x01f7
        L_0x01f2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01f2 }
            throw r0     // Catch:{ all -> 0x0277 }
        L_0x01f5:
            r3 = r19
        L_0x01f7:
            r16.moveToNext()     // Catch:{ all -> 0x0277 }
            r7 = r11
            r2 = r13
            r6 = r16
            r8 = 1
            r11 = 2
            r12 = 0
            goto L_0x0090
        L_0x0203:
            r0 = move-exception
            r16 = r6
        L_0x0206:
            monitor-exit(r13)     // Catch:{ all -> 0x0208 }
            throw r0     // Catch:{ all -> 0x0277 }
        L_0x0208:
            r0 = move-exception
            goto L_0x0206
        L_0x020a:
            r19 = r3
            r16 = r6
            r11 = r7
            r12 = 1
            r5 = r19
            goto L_0x0218
        L_0x0213:
            r16 = r6
            r11 = r7
            r12 = 1
            r5 = r0
        L_0x0218:
            long r2 = r11.value     // Catch:{ all -> 0x0277 }
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0265
            java.util.Random r0 = r9.f292942e     // Catch:{ all -> 0x0277 }
            java.lang.String r0 = mv0.C99984g.m130652c(r0)     // Catch:{ all -> 0x0277 }
            nv0.c r13 = new nv0.c     // Catch:{ all -> 0x0277 }
            r4 = 1
            java.lang.String r6 = ""
            mv0.a r2 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x0277 }
            byte[] r8 = r2.f303746f     // Catch:{ all -> 0x0277 }
            r2 = r13
            r3 = r0
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0277 }
            java.lang.Object r2 = r9.f292941d     // Catch:{ all -> 0x0277 }
            monitor-enter(r2)     // Catch:{ all -> 0x0277 }
            r13.mo32547o1()     // Catch:{ all -> 0x0262 }
            java.util.HashSet<java.lang.String> r3 = r9.f292946i     // Catch:{ all -> 0x0262 }
            r3.add(r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "MicroMsg.BakPCServer"
            java.lang.String r3 = "backupChatMsg now: size:%d"
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ all -> 0x0262 }
            java.util.HashSet<java.lang.String> r5 = r9.f292946i     // Catch:{ all -> 0x0262 }
            int r5 = r5.size()     // Catch:{ all -> 0x0262 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0262 }
            r4[r10] = r5     // Catch:{ all -> 0x0262 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)     // Catch:{ all -> 0x0262 }
            monitor-exit(r2)     // Catch:{ all -> 0x0262 }
            r2 = 0
            r11.value = r2     // Catch:{ all -> 0x0277 }
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x0277 }
            r0.<init>()     // Catch:{ all -> 0x0277 }
            goto L_0x0265
        L_0x0262:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0262 }
            throw r0     // Catch:{ all -> 0x0277 }
        L_0x0265:
            r16.close()
            r8 = 1
        L_0x0269:
            if (r8 != 0) goto L_0x0273
            java.lang.String r0 = "MicroMsg.BakPCServer"
            java.lang.String r2 = "backupImp.backupChatMsg canceled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x028e
        L_0x0273:
            r11 = 2
            r12 = 0
            goto L_0x0030
        L_0x0277:
            r0 = move-exception
            goto L_0x027c
        L_0x0279:
            r0 = move-exception
            r16 = r6
        L_0x027c:
            r16.close()
            throw r0
        L_0x0280:
            r12 = 1
            r9.f292949o = r12
            java.lang.String r0 = "MicroMsg.BakPCServer"
            java.lang.String r2 = "send conplete waiting to send finishCmd"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r9.mo139326b()
        L_0x028e:
            return
        L_0x028f:
            eb0.b r0 = new eb0.b
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mv0.C99982e.run():void");
    }
}
