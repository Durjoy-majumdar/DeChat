package zu0;

import java.util.LinkedList;
import lu3.C88656g;

public class k$$d implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f67650d;

    /* renamed from: e */
    public final /* synthetic */ boolean f67651e;

    /* renamed from: f */
    public final /* synthetic */ long f67652f;

    /* renamed from: g */
    public final /* synthetic */ C23584k f67653g;

    public k$$d(C23584k kVar, LinkedList linkedList, boolean z, long j) {
        this.f67653g = kVar;
        this.f67650d = linkedList;
        this.f67651e = z;
        this.f67652f = j;
    }

    public String getKey() {
        return "backupPackThread";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0215, code lost:
        r0.close();
        r30 = r41 + com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0222, code lost:
        if (r2.size() != 0) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0224, code lost:
        r7.f67621j.f177666g.add(r6);
        r0 = r7.f67621j;
        r0.f177668i += r6.f177678f;
        r0.f177667h += r6.f177677e;
        r36 = r36 - com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond();
        r7.mo37045c(new zu0.k$$b(r25, r9));
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.BackupPackAndSend", "backupPackSessionMsg finish Cursor Session[%d], convName[%s], msgCnt[%d], time[%d], [%d,%d,%d]", java.lang.Integer.valueOf(r9.f67135d), r9.f67132a, java.lang.Integer.valueOf(r1), java.lang.Long.valueOf(com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r26)), java.lang.Long.valueOf(r30), java.lang.Long.valueOf(r23), java.lang.Long.valueOf(r36 + com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0292, code lost:
        r5 = r25;
        r17 = r9;
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02ba A[LOOP:1: B:20:0x00e8->B:61:0x02ba, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r51 = this;
            r1 = r51
            java.util.LinkedList r0 = r1.f67650d
            r2 = 0
            java.lang.String r3 = "MicroMsg.BackupPackAndSend"
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "backupChatRunnable backupSessionList is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            zu0.k r0 = r1.f67653g
            yu0.c r0 = r0.f67614c
            if (r0 == 0) goto L_0x002b
            r0.mo17707a(r2)
            zu0.k r0 = r1.f67653g
            yu0.f r0 = r0.f67615d
            yu0.g r0 = r0.mo142622e()
            r2 = -21
            r0.mo142628f(r2)
            zu0.k r0 = r1.f67653g
            yu0.c r0 = r0.f67614c
            r0.mo17705K(r2)
        L_0x002b:
            return
        L_0x002c:
            gv0.C20842c.m22873A1()
            zu0.k r0 = r1.f67653g
            zu0.t r0 = r0.f67620i
            if (r0 == 0) goto L_0x003a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f67688d
            r0.set(r2)
        L_0x003a:
            zu0.j r0 = zu0.C23584k.f67611q
            r0.f67606g = r2
            r0.mo37042b()
            boolean r4 = r0.f67607h
            if (r4 != 0) goto L_0x0051
            zt3.t r4 = zt3.C119157j.f356862d
            zu0.h r5 = new zu0.h
            r5.<init>(r0)
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183884o(r5)
        L_0x0051:
            zu0.k r0 = r1.f67653g
            java.util.LinkedList r4 = r1.f67650d
            r0.getClass()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            if (r4 != 0) goto L_0x0061
            r4 = 0
            goto L_0x007c
        L_0x0061:
            java.util.Iterator r4 = r4.iterator()
        L_0x0065:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0077
            java.lang.Object r5 = r4.next()
            yu0.h r5 = (yu0.C23367h) r5
            java.lang.String r5 = r5.f67132a
            r0.add(r5)
            goto L_0x0065
        L_0x0077:
            int r0 = r0.size()
            r4 = r0
        L_0x007c:
            zu0.k r0 = r1.f67653g
            yu0.f r0 = r0.f67615d
            yu0.g r0 = r0.mo142622e()
            r5 = 14
            r6 = 1
            r0.mo142626d(r5, r6, r4)
            zu0.k r0 = r1.f67653g
            yu0.c r0 = r0.f67614c
            r0.mo17705K(r5)
            hv0.e r0 = hv0.C98544e.m128035f()
            hv0.c r0 = r0.mo137901e()
            com.tencent.mm.storage.v1 r0 = r0.mo137894b()
            r5 = 2
            r7 = 0
            java.lang.Object r0 = r0.mo119684e(r5, r7)
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            zu0.k r0 = r1.f67653g
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f67623l = r8
            zu0.k r0 = r1.f67653g
            com.tencent.mm.pointers.PLong r8 = r0.f67624m
            r13 = 0
            r8.value = r13
            zu0.t r8 = new zu0.t
            r8.<init>(r0)
            r0.f67620i = r8
            com.tencent.mm.pointers.PLong r12 = new com.tencent.mm.pointers.PLong
            r12.<init>()
            zu0.k r0 = r1.f67653g
            java.util.concurrent.atomic.AtomicLong r0 = r0.f67617f
            r0.set(r13)
            zu0.k r0 = r1.f67653g
            pv0.a r8 = new pv0.a
            r8.<init>()
            r0.f67621j = r8
            zu0.k r0 = r1.f67653g
            pv0.a r0 = r0.f67621j
            java.lang.String r8 = p156gj.C87200o.f252871d
            r0.f177663d = r8
            java.util.LinkedList r8 = r1.f67650d
            int r8 = r8.size()
            r0.f177665f = r8
            java.util.LinkedList r0 = r1.f67650d
            java.util.Iterator r16 = r0.iterator()
        L_0x00e8:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x048e
            java.lang.Object r0 = r16.next()
            r9 = r0
            yu0.h r9 = (yu0.C23367h) r9
            zu0.k r8 = r1.f67653g
            zu0.t r7 = r8.f67620i
            boolean r11 = r1.f67651e
            com.tencent.mm.pointers.PLong r10 = r8.f67624m
            hv0.e r0 = hv0.C98544e.m128035f()
            hv0.c r0 = r0.mo137901e()
            com.tencent.mm.storage.v3 r0 = r0.mo137895c()
            java.lang.String r13 = r9.f67132a
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            com.tencent.mm.storage.h2 r0 = r0.mo69771j(r13)
            if (r0 == 0) goto L_0x0118
            int r0 = r0.mo108786G2()
            goto L_0x0119
        L_0x0118:
            r0 = 0
        L_0x0119:
            r14 = 6
            java.lang.Object[] r13 = new java.lang.Object[r14]
            int r14 = r9.f67135d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r2] = r14
            java.lang.String r14 = r9.f67132a
            r13[r6] = r14
            r25 = r7
            long r6 = r9.f67133b
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r13[r5] = r6
            long r6 = r9.f67134c
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 3
            r13[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 4
            r13[r7] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            r7 = 5
            r13[r7] = r6
            java.lang.String r6 = "backupPackSessionMsg index[%d], sessionName[%s], startTime[%d], endTime[%d], unReadCount[%d], isOnlyText[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r13)
            long r26 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            pv0.c r6 = new pv0.c
            r6.<init>()
            java.lang.String r13 = r9.f67132a
            r6.f177676d = r13
            r7 = r8
            r13 = 0
            r22 = 0
            r23 = 0
            r36 = 0
        L_0x0164:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            long r28 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r13 = r13 - r28
            hv0.e r28 = hv0.C98544e.m128035f()
            hv0.c r28 = r28.mo137901e()
            g62.l r28 = r28.mo137897e()
            java.lang.String r5 = r9.f67132a
            r39 = r0
            long r0 = r9.f67133b
            r40 = r12
            r41 = r13
            long r12 = r9.f67134c
            r34 = 50
            com.tencent.mm.storage.g4 r28 = (com.tencent.p014mm.storage.C72972g4) r28
            r29 = r5
            r30 = r0
            r32 = r12
            r35 = r22
            android.database.Cursor r0 = r28.fq0(r29, r30, r32, r34, r35)
            r1 = r22
        L_0x0199:
            boolean r5 = r0.moveToNext()
            r28 = 1
            if (r5 == 0) goto L_0x0215
            long r12 = r10.value
            long r12 = r12 + r28
            r10.value = r12
            int r1 = r1 + 1
            boolean r5 = r7.f67613b
            if (r5 == 0) goto L_0x01b9
            java.lang.String r1 = "backupPackSessionMsg add msgInfoLinkedList is CANCELED!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            r0.close()
            r12 = 3
            r13 = 4
            goto L_0x028f
        L_0x01b9:
            com.tencent.mm.storage.f4 r5 = new com.tencent.mm.storage.f4
            r5.<init>()
            r5.convertFrom(r0)
            if (r11 == 0) goto L_0x01e8
            int r12 = r5.getType()
            r13 = 1
            if (r12 == r13) goto L_0x01e8
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]
            long r28 = r5.mo108774y2()
            java.lang.Long r12 = java.lang.Long.valueOf(r28)
            r22 = 0
            r14[r22] = r12
            int r12 = r5.getType()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14[r13] = r12
            java.lang.String r12 = "not text msgSvrId:%d, type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r14)
        L_0x01e8:
            int r12 = r5.getType()
            r13 = 922746929(0x37000031, float:7.629439E-6)
            if (r12 != r13) goto L_0x020a
            java.lang.Class<vd2.d> r12 = vd2.C78384d.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            vd2.d r12 = (vd2.C78384d) r12
            long r13 = r5.getMsgId()
            java.util.List r12 = r12.mo108123RC(r13)
            if (r12 == 0) goto L_0x020a
            int r13 = r12.size()
            if (r13 <= 0) goto L_0x020a
            goto L_0x020b
        L_0x020a:
            r12 = 0
        L_0x020b:
            if (r12 != 0) goto L_0x0211
            r2.add(r5)
            goto L_0x0199
        L_0x0211:
            r2.addAll(r12)
            goto L_0x0199
        L_0x0215:
            r0.close()
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r30 = r41 + r12
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0292
            pv0.a r0 = r7.f67621j
            java.util.LinkedList<pv0.c> r0 = r0.f177666g
            r0.add(r6)
            pv0.a r0 = r7.f67621j
            int r2 = r0.f177668i
            int r5 = r6.f177678f
            int r2 = r2 + r5
            r0.f177668i = r2
            long r10 = r0.f177667h
            long r5 = r6.f177677e
            long r10 = r10 + r5
            r0.f177667h = r10
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r36 = r36 - r5
            zu0.k$$b r0 = new zu0.k$$b
            r5 = r25
            r0.<init>(r5, r9)
            r7.mo37045c(r0)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r36 = r36 + r5
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r2 = r9.f67135d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r0[r5] = r2
            java.lang.String r2 = r9.f67132a
            r5 = 1
            r0[r5] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r26)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r12 = 3
            r0[r12] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r30)
            r13 = 4
            r0[r13] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r23)
            r25 = 5
            r0[r25] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r36)
            r14 = 6
            r0[r14] = r1
            java.lang.String r1 = "backupPackSessionMsg finish Cursor Session[%d], convName[%s], msgCnt[%d], time[%d], [%d,%d,%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
        L_0x028f:
            r1 = r51
            goto L_0x02ac
        L_0x0292:
            r5 = r25
            r12 = 3
            r13 = 4
            r14 = 6
            r25 = 5
            r17 = r9
            r9 = 0
        L_0x029c:
            int r0 = r2.size()
            if (r9 >= r0) goto L_0x0456
            boolean r0 = r7.f67613b
            if (r0 == 0) goto L_0x02c2
            java.lang.String r0 = "backupPackSessionMsg packMsg is CANCELED!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x028f
        L_0x02ac:
            zu0.k r0 = r1.f67653g
            boolean r0 = r0.f67613b
            r12 = r40
            if (r0 == 0) goto L_0x02ba
            r8 = 4
            r11 = 0
            r47 = 0
            goto L_0x0492
        L_0x02ba:
            r2 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            r13 = 0
            goto L_0x00e8
        L_0x02c2:
            r32 = r1
            r1 = r51
            long r21 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Object r0 = r2.get(r9)
            r33 = r0
            com.tencent.mm.storage.f4 r33 = (com.tencent.p014mm.storage.C72963f4) r33
            r18 = r9
            com.tencent.mm.pointers.PLong r9 = new com.tencent.mm.pointers.PLong
            r9.<init>()
            java.util.LinkedList r34 = new java.util.LinkedList
            r34.<init>()
            r0 = 0
            if (r39 <= 0) goto L_0x02e4
            r35 = 1
            goto L_0x02e6
        L_0x02e4:
            r35 = 0
        L_0x02e6:
            r38 = r8
            r8 = r33
            r41 = r2
            r43 = r9
            r2 = r17
            r42 = r18
            r9 = r0
            r44 = r10
            r10 = r15
            r45 = r11
            r11 = r43
            r46 = r40
            r12 = r34
            r47 = 0
            r13 = r35
            r35 = 6
            r14 = r45
            te3.f9 r8 = dv0.C75459j.m90495a(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x031b }
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x0319 }
            long r9 = r9 - r21
            long r23 = r23 + r9
            r21 = r8
            r10 = r23
            r9 = 3
            r12 = 1
            goto L_0x0346
        L_0x0319:
            r0 = move-exception
            goto L_0x031d
        L_0x031b:
            r0 = move-exception
            r8 = 0
        L_0x031d:
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]
            long r11 = r33.mo108774y2()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = 0
            r10[r12] = r11
            int r11 = r33.getType()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 1
            r10[r12] = r11
            java.lang.String r11 = r33.mo108768t()
            r13 = 2
            r10[r13] = r11
            java.lang.String r11 = "backupPackSessionMsg packedMsg msgSvrId:%d, type:%d, talker:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r11, r10)
            r21 = r8
            r10 = r23
        L_0x0346:
            if (r21 != 0) goto L_0x035d
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r8 = r2.f67132a
            r12 = 0
            r0[r12] = r8
            java.lang.String r8 = "bakItem is sessionName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r0)
            r49 = r10
            r9 = r38
            r12 = r46
            r8 = 4
            goto L_0x043f
        L_0x035d:
            r8 = 4
            r12 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            long r13 = r33.mo108774y2()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r0[r12] = r13
            int r12 = r33.getType()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 1
            r0[r13] = r12
            java.lang.String r12 = r33.mo108768t()
            r13 = 2
            r0[r13] = r12
            long r12 = r33.getCreateTime()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r0[r9] = r12
            java.lang.String r12 = "backupPackSessionMsg packedMsg msgSvrId:%d, type:%d, talker:%s, createTime:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r12, r0)
            int r39 = r39 + -1
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r36 = r36 - r12
            java.util.concurrent.atomic.AtomicLong r0 = r7.f67617f
            r7 = r43
            long r12 = r7.value
            r0.addAndGet(r12)
            r12 = r46
            long r13 = r12.value
            r49 = r10
            long r9 = r7.value
            long r13 = r13 + r9
            r12.value = r13
            long r9 = r6.f177677e
            long r9 = r9 + r28
            r6.f177677e = r9
            int r0 = r6.f177678f
            int r9 = r34.size()
            int r0 = r0 + r9
            r6.f177678f = r0
            java.util.Iterator r0 = r34.iterator()
        L_0x03bb:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x03db
            java.lang.Object r9 = r0.next()
            pv0.x r9 = (pv0.C100968x) r9
            pv0.b r10 = new pv0.b
            r10.<init>()
            int r9 = r9.f295677h
            r10.f177674d = r9
            long r13 = r7.value
            int r9 = (int) r13
            r10.f177675e = r9
            java.util.LinkedList<pv0.b> r9 = r6.f177680h
            r9.add(r10)
            goto L_0x03bb
        L_0x03db:
            zu0.k$$a r0 = new zu0.k$$a
            r17 = r0
            r18 = r38
            r19 = r5
            r20 = r2
            r22 = r7
            r23 = r33
            r24 = r34
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r9 = r38
            r9.mo37045c(r0)
        L_0x03f3:
            java.util.concurrent.atomic.AtomicLong r0 = r9.f67617f
            long r10 = r0.get()
            int r0 = r9.f67612a
            long r13 = (long) r0
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0438
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.util.concurrent.atomic.AtomicLong r7 = r9.f67617f
            long r10 = r7.get()
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r10 = 0
            r0[r10] = r7
            zu0.j r7 = zu0.C23584k.f67611q
            java.util.concurrent.atomic.AtomicLong r10 = r7.f67601b
            long r10 = r10.get()
            java.util.concurrent.atomic.AtomicLong r7 = r7.f67602c
            long r13 = r7.get()
            long r10 = r10 - r13
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r10 = 1
            r0[r10] = r7
            java.lang.String r7 = "cache block wait cacheSize:%d, waitCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r0)
            com.tencent.mm.sdk.platformtools.MMConditionVariable r0 = r9.f67618g
            r0.close()
            com.tencent.mm.sdk.platformtools.MMConditionVariable r0 = r9.f67618g
            r10 = 1000(0x3e8, double:4.94E-321)
            r0.block(r10)
            goto L_0x03f3
        L_0x0438:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r36 = r36 + r10
            r7 = r9
        L_0x043f:
            int r0 = r42 + 1
            r17 = r2
            r8 = r9
            r40 = r12
            r1 = r32
            r2 = r41
            r10 = r44
            r11 = r45
            r23 = r49
            r12 = 3
            r13 = 4
            r14 = 6
            r9 = r0
            goto L_0x029c
        L_0x0456:
            r32 = r1
            r9 = r8
            r44 = r10
            r45 = r11
            r2 = r17
            r12 = r40
            r8 = 4
            r10 = 1
            r35 = 6
            r47 = 0
            r1 = r51
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.util.concurrent.atomic.AtomicLong r10 = r7.f67617f
            long r10 = r10.get()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 0
            r0[r11] = r10
            java.lang.String r10 = "DBSize cacheSize:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r0)
            r25 = r5
            r8 = r9
            r13 = r30
            r22 = r32
            r0 = r39
            r10 = r44
            r11 = r45
            r5 = 2
            r9 = r2
            goto L_0x0164
        L_0x048e:
            r47 = r13
            r8 = 4
            r11 = 0
        L_0x0492:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.util.LinkedList r2 = r1.f67650d
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r11] = r2
            zu0.k r2 = r1.f67653g
            long r5 = r2.f67623l
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r5)
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r5 = 1
            r0[r5] = r2
            zu0.k r2 = r1.f67653g
            com.tencent.mm.pointers.PLong r2 = r2.f67624m
            long r5 = r2.value
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r5 = 2
            r0[r5] = r2
            long r5 = r12.value
            zu0.k r2 = r1.f67653g
            com.tencent.mm.pointers.PLong r2 = r2.f67625n
            long r7 = r2.value
            long r5 = r5 + r7
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r5 = 3
            r0[r5] = r2
            java.lang.String r2 = "backupChatRunnable finish, Session[%d], loopTime[%d], msgCount:[%d] totalSize:[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            zu0.k r5 = r1.f67653g
            zu0.t r5 = r5.f67620i
            boolean r5 = r5.mo37066a()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "backupChatRunnable finish:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
        L_0x04e8:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            zu0.k r5 = r1.f67653g
            java.util.concurrent.atomic.AtomicLong r5 = r5.f67617f
            long r7 = r5.get()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r0[r6] = r5
            java.lang.String r5 = " wait cacheSize:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
            zu0.k r0 = r1.f67653g
            java.util.concurrent.atomic.AtomicLong r0 = r0.f67617f
            long r7 = r0.get()
            int r0 = (r7 > r47 ? 1 : (r7 == r47 ? 0 : -1))
            if (r0 != 0) goto L_0x0516
            zu0.k r0 = r1.f67653g
            long r2 = r1.f67652f
            zu0.k$$d$$a r5 = new zu0.k$$d$$a
            r5.<init>(r1, r2, r4)
            r0.mo37045c(r5)
            return
        L_0x0516:
            zu0.k r0 = r1.f67653g
            com.tencent.mm.sdk.platformtools.MMConditionVariable r0 = r0.f67618g
            r0.close()
            zu0.k r0 = r1.f67653g
            com.tencent.mm.sdk.platformtools.MMConditionVariable r0 = r0.f67618g
            r7 = 500(0x1f4, double:2.47E-321)
            r0.block(r7)
            goto L_0x04e8
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.k$$d.run():void");
    }
}
