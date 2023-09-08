package p659qe;

import android.os.Handler;
import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import gy3.C87412m;
import p723vf.C90778c;

/* renamed from: qe.c */
public final class C89607c {

    /* renamed from: a */
    public final Runnable f257796a = new C89608a(this);

    /* renamed from: b */
    public final Handler f257797b = C90778c.m113843a();

    /* renamed from: c */
    public final long f257798c;

    /* renamed from: d */
    public final IBackgroundStatefulOwner f257799d;

    /* renamed from: e */
    public final C89612g[] f257800e;

    /* renamed from: qe.c$a */
    public static final class C89608a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89607c f257801d;

        public C89608a(C89607c cVar) {
            this.f257801d = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1 A[LOOP:1: B:25:0x00af->B:26:0x00b1, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00e5 A[Catch:{ all -> 0x0192 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0108 A[Catch:{ all -> 0x0192 }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0166 A[Catch:{ all -> 0x0192 }, LOOP:4: B:55:0x0160->B:57:0x0166, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0200  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x00ac A[EDGE_INSN: B:96:0x00ac->B:24:0x00ac ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r27 = this;
                r1 = r27
                qe.c r2 = r1.f257801d
                r2.getClass()
                com.tencent.matrix.util.MemInfo$b r0 = com.tencent.matrix.util.MemInfo.f235669p
                com.tencent.matrix.util.MemInfo[] r10 = r0.mo112156a()
                com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor r0 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235421k
                android.app.Application r3 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235413c
                r4 = 0
                r11 = 0
                if (r3 != 0) goto L_0x0021
                java.lang.String r0 = r0.mo111975b()
                java.lang.Object[] r3 = new java.lang.Object[r11]
                java.lang.String r5 = "Supervisor NOT initialized yet or Supervisor is disabled!!!"
                p723vf.C118672d.m167352b(r0, r5, r3)
                goto L_0x0032
            L_0x0021:
                boolean r3 = r0.mo111977d()
                if (r3 != 0) goto L_0x0034
                java.lang.String r0 = r0.mo111975b()
                java.lang.Object[] r3 = new java.lang.Object[r11]
                java.lang.String r5 = "Only support for supervisor process"
                p723vf.C118672d.m167352b(r0, r5, r3)
            L_0x0032:
                r0 = r4
                goto L_0x0058
            L_0x0034:
                com.tencent.matrix.lifecycle.supervisor.h r0 = com.tencent.matrix.lifecycle.supervisor.C80481h.f235480f
                com.tencent.matrix.lifecycle.supervisor.h$a r0 = r0.mo112018c()
                r0.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.concurrent.ConcurrentHashMap r5 = r0.mo112021c()
                com.tencent.matrix.lifecycle.supervisor.i r6 = new com.tencent.matrix.lifecycle.supervisor.i
                r6.<init>(r3)
                r0.mo112020b(r5, r6)
                com.tencent.matrix.util.MemInfo[] r0 = new com.tencent.matrix.util.MemInfo[r11]
                java.lang.Object[] r0 = r3.toArray(r0)
                if (r0 == 0) goto L_0x036f
                com.tencent.matrix.util.MemInfo[] r0 = (com.tencent.matrix.util.MemInfo[]) r0
            L_0x0058:
                if (r0 == 0) goto L_0x005b
                goto L_0x005d
            L_0x005b:
                com.tencent.matrix.util.MemInfo[] r0 = new com.tencent.matrix.util.MemInfo[r11]
            L_0x005d:
                r12 = r0
                int r0 = r10.length
                r3 = 0
            L_0x0060:
                java.lang.String r13 = " KB"
                java.lang.String r14 = "Matrix.monitor.AppBgSumPssMonitor"
                r15 = 45
                if (r3 >= r0) goto L_0x00ac
                r5 = r10[r3]
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                com.tencent.matrix.util.ProcessInfo r7 = r5.f235671e
                if (r7 == 0) goto L_0x007a
                int r7 = r7.f235682d
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                goto L_0x007b
            L_0x007a:
                r7 = r4
            L_0x007b:
                r6.append(r7)
                r6.append(r15)
                com.tencent.matrix.util.ProcessInfo r7 = r5.f235671e
                if (r7 == 0) goto L_0x0088
                java.lang.String r7 = r7.f235683e
                goto L_0x0089
            L_0x0088:
                r7 = r4
            L_0x0089:
                r6.append(r7)
                java.lang.String r7 = ": "
                r6.append(r7)
                com.tencent.matrix.util.PssInfo r5 = r5.f235676j
                gy3.C87412m.m108591d(r5)
                int r5 = r5.f235688d
                r6.append(r5)
                r6.append(r13)
                java.lang.String r5 = r6.toString()
                java.lang.Object[] r6 = new java.lang.Object[r11]
                p723vf.C118672d.m167353c(r14, r5, r6)
                rx3.b0 r5 = rx3.C13598b0.f38549a
                int r3 = r3 + 1
                goto L_0x0060
            L_0x00ac:
                int r0 = r10.length
                r3 = 0
                r9 = 0
            L_0x00af:
                if (r3 >= r0) goto L_0x00be
                r5 = r10[r3]
                com.tencent.matrix.util.PssInfo r5 = r5.f235676j
                gy3.C87412m.m108591d(r5)
                int r5 = r5.f235688d
                int r9 = r9 + r5
                int r3 = r3 + 1
                goto L_0x00af
            L_0x00be:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "sumPss = "
                r0.append(r3)
                r0.append(r9)
                r0.append(r13)
                java.lang.String r0 = r0.toString()
                java.lang.Object[] r3 = new java.lang.Object[r11]
                p723vf.C118672d.m167353c(r14, r0, r3)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                r16 = 1
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0192 }
                r0.<init>()     // Catch:{ all -> 0x0192 }
                int r3 = r12.length     // Catch:{ all -> 0x0192 }
                r5 = 0
            L_0x00e3:
                if (r5 >= r3) goto L_0x00fe
                r6 = r12[r5]     // Catch:{ all -> 0x0192 }
                com.tencent.matrix.util.ProcessInfo r7 = r6.f235671e     // Catch:{ all -> 0x0192 }
                if (r7 == 0) goto L_0x00f5
                com.tencent.matrix.util.PssInfo r7 = r6.f235677n     // Catch:{ all -> 0x0192 }
                if (r7 == 0) goto L_0x00f5
                com.tencent.matrix.util.PssInfo r7 = r6.f235676j     // Catch:{ all -> 0x0192 }
                if (r7 == 0) goto L_0x00f5
                r7 = 1
                goto L_0x00f6
            L_0x00f5:
                r7 = 0
            L_0x00f6:
                if (r7 == 0) goto L_0x00fb
                r0.add(r6)     // Catch:{ all -> 0x0192 }
            L_0x00fb:
                int r5 = r5 + 1
                goto L_0x00e3
            L_0x00fe:
                java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0192 }
            L_0x0102:
                boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0192 }
                if (r5 == 0) goto L_0x015b
                java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0192 }
                com.tencent.matrix.util.MemInfo r5 = (com.tencent.matrix.util.MemInfo) r5     // Catch:{ all -> 0x0192 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
                r6.<init>()     // Catch:{ all -> 0x0192 }
                com.tencent.matrix.util.ProcessInfo r7 = r5.f235671e     // Catch:{ all -> 0x0192 }
                if (r7 == 0) goto L_0x011e
                int r7 = r7.f235682d     // Catch:{ all -> 0x0192 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0192 }
                goto L_0x011f
            L_0x011e:
                r7 = r4
            L_0x011f:
                r6.append(r7)     // Catch:{ all -> 0x0192 }
                r6.append(r15)     // Catch:{ all -> 0x0192 }
                com.tencent.matrix.util.ProcessInfo r7 = r5.f235671e     // Catch:{ all -> 0x0192 }
                if (r7 == 0) goto L_0x012c
                java.lang.String r7 = r7.f235683e     // Catch:{ all -> 0x0192 }
                goto L_0x012d
            L_0x012c:
                r7 = r4
            L_0x012d:
                r6.append(r7)     // Catch:{ all -> 0x0192 }
                java.lang.String r7 = ": dbgPss = "
                r6.append(r7)     // Catch:{ all -> 0x0192 }
                com.tencent.matrix.util.PssInfo r7 = r5.f235677n     // Catch:{ all -> 0x0192 }
                gy3.C87412m.m108591d(r7)     // Catch:{ all -> 0x0192 }
                int r7 = r7.f235688d     // Catch:{ all -> 0x0192 }
                r6.append(r7)     // Catch:{ all -> 0x0192 }
                java.lang.String r7 = " KB, amsPss = "
                r6.append(r7)     // Catch:{ all -> 0x0192 }
                com.tencent.matrix.util.PssInfo r5 = r5.f235676j     // Catch:{ all -> 0x0192 }
                gy3.C87412m.m108591d(r5)     // Catch:{ all -> 0x0192 }
                int r5 = r5.f235688d     // Catch:{ all -> 0x0192 }
                r6.append(r5)     // Catch:{ all -> 0x0192 }
                r6.append(r13)     // Catch:{ all -> 0x0192 }
                java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0192 }
                java.lang.Object[] r6 = new java.lang.Object[r11]     // Catch:{ all -> 0x0192 }
                p723vf.C118672d.m167353c(r14, r5, r6)     // Catch:{ all -> 0x0192 }
                goto L_0x0102
            L_0x015b:
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0192 }
                r3 = 0
            L_0x0160:
                boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0192 }
                if (r4 == 0) goto L_0x0175
                java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0192 }
                com.tencent.matrix.util.MemInfo r4 = (com.tencent.matrix.util.MemInfo) r4     // Catch:{ all -> 0x0192 }
                com.tencent.matrix.util.PssInfo r4 = r4.f235677n     // Catch:{ all -> 0x0192 }
                gy3.C87412m.m108591d(r4)     // Catch:{ all -> 0x0192 }
                int r4 = r4.f235688d     // Catch:{ all -> 0x0192 }
                int r3 = r3 + r4
                goto L_0x0160
            L_0x0175:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
                r0.<init>()     // Catch:{ all -> 0x0192 }
                java.lang.String r4 = "ipc sumDbgPss = "
                r0.append(r4)     // Catch:{ all -> 0x0192 }
                r0.append(r3)     // Catch:{ all -> 0x0192 }
                r0.append(r13)     // Catch:{ all -> 0x0192 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0192 }
                java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x0192 }
                p723vf.C118672d.m167353c(r14, r0, r4)     // Catch:{ all -> 0x0192 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0192 }
                r0 = r3
                goto L_0x019b
            L_0x0192:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r11]
                java.lang.String r4 = ""
                p723vf.C118672d.m167354d(r14, r0, r4, r3)
                r0 = 0
            L_0x019b:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "check with interval ["
                r3.append(r4)
                long r5 = r2.f257798c
                r3.append(r5)
                java.lang.String r5 = "] amsPssSum = "
                r3.append(r5)
                r3.append(r9)
                java.lang.String r5 = " KB, "
                r3.append(r5)
                java.lang.String r6 = java.util.Arrays.toString(r10)
                java.lang.String r7 = "java.util.Arrays.toString(this)"
                gy3.C87412m.m108593f(r6, r7)
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                java.lang.Object[] r6 = new java.lang.Object[r11]
                p723vf.C118672d.m167353c(r14, r3, r6)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                r17 = r12
                long r11 = r2.f257798c
                r3.append(r11)
                java.lang.String r4 = "] debugPssSum = "
                r3.append(r4)
                r3.append(r0)
                r3.append(r5)
                java.lang.String r4 = java.util.Arrays.toString(r17)
                gy3.C87412m.m108593f(r4, r7)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r4 = 0
                java.lang.Object[] r5 = new java.lang.Object[r4]
                p723vf.C118672d.m167353c(r14, r3, r5)
                qe.g[] r2 = r2.f257800e
                int r11 = r2.length
                r12 = 0
            L_0x01fe:
                if (r12 >= r11) goto L_0x036e
                r8 = r2[r12]
                gy3.a0 r7 = new gy3.a0
                r7.<init>()
                r7.f27482d = r4
                fy3.a<com.tencent.matrix.util.MemInfo[]> r3 = r8.f257811g
                java.lang.Object r3 = r3.invoke()
                r6 = r3
                com.tencent.matrix.util.MemInfo[] r6 = (com.tencent.matrix.util.MemInfo[]) r6
                int r3 = r6.length
                r4 = 0
            L_0x0214:
                if (r4 >= r3) goto L_0x025b
                r5 = r6[r4]
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                com.tencent.matrix.util.ProcessInfo r1 = r5.f235671e
                gy3.C87412m.m108591d(r1)
                int r1 = r1.f235682d
                r15.append(r1)
                r1 = 45
                r15.append(r1)
                com.tencent.matrix.util.ProcessInfo r1 = r5.f235671e
                gy3.C87412m.m108591d(r1)
                java.lang.String r1 = r1.f235683e
                r15.append(r1)
                java.lang.String r1 = ": extra total pss = "
                r15.append(r1)
                com.tencent.matrix.util.PssInfo r1 = r5.f235676j
                gy3.C87412m.m108591d(r1)
                int r1 = r1.f235688d
                r15.append(r1)
                r15.append(r13)
                java.lang.String r1 = r15.toString()
                r5 = 0
                java.lang.Object[] r15 = new java.lang.Object[r5]
                p723vf.C118672d.m167353c(r14, r1, r15)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                int r4 = r4 + 1
                r1 = r27
                r15 = 45
                goto L_0x0214
            L_0x025b:
                int r1 = r6.length
                r3 = 0
                r15 = 0
            L_0x025e:
                if (r3 >= r1) goto L_0x026d
                r4 = r6[r3]
                com.tencent.matrix.util.PssInfo r4 = r4.f235676j
                gy3.C87412m.m108591d(r4)
                int r4 = r4.f235688d
                int r15 = r15 + r4
                int r3 = r3 + 1
                goto L_0x025e
            L_0x026d:
                int r1 = r6.length
                if (r1 != 0) goto L_0x0272
                r1 = 1
                goto L_0x0273
            L_0x0272:
                r1 = 0
            L_0x0273:
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0291
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "extra sum pss = "
                r1.append(r3)
                r1.append(r15)
                r1.append(r13)
                java.lang.String r1 = r1.toString()
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]
                p723vf.C118672d.m167353c(r14, r1, r4)
            L_0x0291:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                r1 = 2
                rx3.l[] r5 = new rx3.C13604l[r1]
                qe.o r4 = r8.f257805a
                int r3 = r9 + r15
                r18 = r2
                long r1 = (long) r3
                r19 = r11
                qe.a r11 = new qe.a
                r20 = r3
                r3 = r11
                r21 = r13
                r13 = r4
                r4 = r15
                r22 = r5
                r5 = r7
                r23 = r12
                r12 = r6
                r6 = r9
                r24 = r7
                r7 = r0
                r25 = r12
                r12 = r8
                r8 = r10
                r26 = r9
                r9 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9)
                boolean r1 = r13.mo60436a(r1, r11)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                rx3.l r2 = new rx3.l
                java.lang.String r3 = "amsPss"
                r2.<init>(r3, r1)
                r1 = 0
                r22[r1] = r2
                qe.o r1 = r12.f257806b
                int r2 = r0 + r15
                long r8 = (long) r2
                qe.b r11 = new qe.b
                r3 = r11
                r5 = r24
                r6 = r26
                r15 = r12
                r12 = r8
                r8 = r10
                r9 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9)
                boolean r1 = r1.mo60436a(r12, r11)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                rx3.l r3 = new rx3.l
                java.lang.String r4 = "debugPss"
                r3.<init>(r4, r1)
                r22[r16] = r3
                r1 = 2
                r4 = 0
            L_0x02f6:
                if (r4 >= r1) goto L_0x0317
                r1 = r22[r4]
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "is over threshold? "
                r3.append(r5)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r3 = 0
                java.lang.Object[] r5 = new java.lang.Object[r3]
                p723vf.C118672d.m167353c(r14, r1, r5)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                int r4 = r4 + 1
                r1 = 2
                goto L_0x02f6
            L_0x0317:
                r4 = 0
            L_0x0318:
                if (r4 >= r1) goto L_0x032b
                r3 = r22[r4]
                B r3 = r3.f38556e
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x0328
                r4 = 1
                goto L_0x032c
            L_0x0328:
                int r4 = r4 + 1
                goto L_0x0318
            L_0x032b:
                r4 = 0
            L_0x032c:
                if (r4 == 0) goto L_0x0358
                r1 = r24
                boolean r1 = r1.f27482d
                if (r1 == 0) goto L_0x0358
                r1 = 0
                java.lang.Object[] r3 = new java.lang.Object[r1]
                java.lang.String r4 = "report over threshold"
                p723vf.C118672d.m167353c(r14, r4, r3)
                r3 = r15
                fy3.r<java.lang.Integer, java.lang.Integer, com.tencent.matrix.util.MemInfo[], com.tencent.matrix.util.MemInfo[], rx3.b0> r3 = r3.f257810f
                java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5 = r25
                java.lang.Object[] r6 = sx3.C110821n.m150972s(r10, r5)
                r7 = r17
                java.lang.Object[] r5 = sx3.C110821n.m150972s(r7, r5)
                r3.mo162I(r4, r2, r6, r5)
                goto L_0x035b
            L_0x0358:
                r7 = r17
                r1 = 0
            L_0x035b:
                int r12 = r23 + 1
                r1 = r27
                r17 = r7
                r2 = r18
                r11 = r19
                r13 = r21
                r9 = r26
                r4 = 0
                r15 = 45
                goto L_0x01fe
            L_0x036e:
                return
            L_0x036f:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p659qe.C89607c.C89608a.run():void");
        }
    }

    public C89607c(long j, IBackgroundStatefulOwner iBackgroundStatefulOwner, C89612g[] gVarArr) {
        C87412m.m108594g(iBackgroundStatefulOwner, "bgStatefulOwner");
        C87412m.m108594g(gVarArr, "configs");
        this.f257798c = j;
        this.f257799d = iBackgroundStatefulOwner;
        this.f257800e = gVarArr;
    }
}
