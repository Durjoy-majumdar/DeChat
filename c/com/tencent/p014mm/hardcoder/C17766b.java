package com.tencent.p014mm.hardcoder;

import com.tencent.p014mm.hardcoder.C17771c;
import com.tencent.p014mm.hardcoder.HardCoderJNI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tencent.mm.hardcoder.b */
public class C17766b {

    /* renamed from: a */
    public C17771c f48906a;

    /* renamed from: b */
    public Thread f48907b;

    /* renamed from: c */
    public HardCoderJNI.HCPerfManagerThread f48908c;

    /* renamed from: d */
    public LinkedBlockingQueue<Object> f48909d = new LinkedBlockingQueue<>();

    /* renamed from: com.tencent.mm.hardcoder.b$b */
    public class C17768b implements Runnable {

        /* renamed from: d */
        public boolean f48910d = false;

        public C17768b(C17767a aVar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v95, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: com.tencent.mm.hardcoder.b$c} */
        /* JADX WARNING: type inference failed for: r10v54, types: [java.io.FileReader, java.io.Reader] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:243:0x0859  */
        /* JADX WARNING: Removed duplicated region for block: B:244:0x0878  */
        /* JADX WARNING: Removed duplicated region for block: B:246:0x0885  */
        /* JADX WARNING: Removed duplicated region for block: B:253:0x08cd  */
        /* JADX WARNING: Removed duplicated region for block: B:262:0x090f  */
        /* JADX WARNING: Removed duplicated region for block: B:263:0x092e  */
        /* JADX WARNING: Removed duplicated region for block: B:265:0x0939  */
        /* JADX WARNING: Removed duplicated region for block: B:271:0x097a  */
        /* JADX WARNING: Removed duplicated region for block: B:280:0x09ba  */
        /* JADX WARNING: Removed duplicated region for block: B:281:0x09d4  */
        /* JADX WARNING: Removed duplicated region for block: B:283:0x09e3  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5 A[SYNTHETIC, Splitter:B:31:0x00f5] */
        /* JADX WARNING: Removed duplicated region for block: B:349:0x0b44  */
        /* JADX WARNING: Removed duplicated region for block: B:358:0x0b75 A[SYNTHETIC, Splitter:B:358:0x0b75] */
        /* JADX WARNING: Removed duplicated region for block: B:363:0x0b93 A[SYNTHETIC, Splitter:B:363:0x0b93] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0113 A[SYNTHETIC, Splitter:B:36:0x0113] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x017e  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r73 = this;
                r1 = r73
                r2 = 2
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                if (r3 != 0) goto L_0x000e
                r3 = -1
                goto L_0x0016
            L_0x000e:
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                long r3 = r3.getId()
            L_0x0016:
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r4 = 0
                r0[r4] = r3
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r5 = 1
                r0[r5] = r3
                java.lang.String r3 = "HCPerfManager thread run start, id:%d, name:%s"
                java.lang.String r0 = java.lang.String.format(r3, r0)
                java.lang.String r3 = "Hardcoder.HCPerfManager"
                com.tencent.p014mm.hardcoder.C17774h.m18166c(r3, r0)
                r1.f48910d = r5
                java.util.HashSet r6 = new java.util.HashSet
                r6.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.lang.String r7 = "getMyProcCpuTime bufferedReader close exception:"
                java.lang.String r8 = "getMyProcCpuTime fileReader close exception:"
                java.lang.String r9 = "Hardcoder.HardCoderUtil"
                r16 = 13
                r14 = 14
                r17 = 0
                java.io.FileReader r10 = new java.io.FileReader     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
                r0.<init>()     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
                java.lang.String r11 = "/proc/"
                r0.append(r11)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
                int r11 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
                r0.append(r11)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
                java.lang.String r11 = "/stat"
                r0.append(r11)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
                r10.<init>(r0)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
                java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00cd, all -> 0x00c8 }
                r11.<init>(r10)     // Catch:{ Exception -> 0x00cd, all -> 0x00c8 }
                java.lang.String r0 = r11.readLine()     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r12 = " "
                java.lang.String[] r0 = r0.split(r12)     // Catch:{ Exception -> 0x00c6 }
                long[] r12 = new long[r2]     // Catch:{ Exception -> 0x00c6 }
                r13 = r0[r16]     // Catch:{ Exception -> 0x00c6 }
                long r18 = java.lang.Long.parseLong(r13)     // Catch:{ Exception -> 0x00c6 }
                r12[r4] = r18     // Catch:{ Exception -> 0x00c6 }
                r0 = r0[r14]     // Catch:{ Exception -> 0x00c6 }
                long r18 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00c6 }
                r12[r5] = r18     // Catch:{ Exception -> 0x00c6 }
                r10.close()     // Catch:{ Exception -> 0x008f }
                goto L_0x00a7
            L_0x008f:
                r0 = move-exception
                r10 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                java.lang.String r8 = r10.getMessage()
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r9, r0)
            L_0x00a7:
                r11.close()     // Catch:{ Exception -> 0x00ac }
                goto L_0x0131
            L_0x00ac:
                r0 = move-exception
                r8 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = r8.getMessage()
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r9, r0)
                goto L_0x0131
            L_0x00c6:
                r0 = move-exception
                goto L_0x00db
            L_0x00c8:
                r0 = move-exception
                r15 = r1
                r1 = r0
                goto L_0x0b73
            L_0x00cd:
                r0 = move-exception
                r11 = r17
                goto L_0x00db
            L_0x00d1:
                r0 = move-exception
                r15 = r1
                r11 = r17
                goto L_0x0b6e
            L_0x00d7:
                r0 = move-exception
                r10 = r17
                r11 = r10
            L_0x00db:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b6a }
                r12.<init>()     // Catch:{ all -> 0x0b6a }
                java.lang.String r13 = "getMyProcCpuTime exception:"
                r12.append(r13)     // Catch:{ all -> 0x0b6a }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0b6a }
                r12.append(r0)     // Catch:{ all -> 0x0b6a }
                java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0b6a }
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r9, r0)     // Catch:{ all -> 0x0b6a }
                if (r10 == 0) goto L_0x0111
                r10.close()     // Catch:{ Exception -> 0x00f9 }
                goto L_0x0111
            L_0x00f9:
                r0 = move-exception
                r10 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                java.lang.String r8 = r10.getMessage()
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r9, r0)
            L_0x0111:
                if (r11 == 0) goto L_0x012f
                r11.close()     // Catch:{ Exception -> 0x0117 }
                goto L_0x012f
            L_0x0117:
                r0 = move-exception
                r8 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = r8.getMessage()
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r9, r0)
            L_0x012f:
                r12 = r17
            L_0x0131:
                java.lang.String r0 = "Hardcoder.HardCoderReporter"
                if (r12 == 0) goto L_0x0138
                int r7 = r12.length
                if (r7 >= r2) goto L_0x0142
            L_0x0138:
                long[] r12 = new long[r2]
                r12 = {0, 0} // fill-array
                java.lang.String r7 = "process jiffies info is invalid"
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r0, r7)
            L_0x0142:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "process:["
                r7.append(r8)
                r8 = r12[r4]
                r7.append(r8)
                java.lang.String r8 = ","
                r7.append(r8)
                r8 = r12[r5]
                r7.append(r8)
                java.lang.String r13 = "]"
                r7.append(r13)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r0, r7)
                java.util.HashMap r12 = new java.util.HashMap
                r12.<init>()
                java.util.HashSet r11 = new java.util.HashSet
                r11.<init>()
                r18 = 30000(0x7530, double:1.4822E-319)
                r9 = r17
                r10 = r9
                r20 = r10
                r7 = r18
            L_0x017a:
                boolean r0 = r1.f48910d
                if (r0 == 0) goto L_0x0b63
                long r21 = java.lang.System.currentTimeMillis()
                com.tencent.mm.hardcoder.b r0 = com.tencent.p014mm.hardcoder.C17766b.this
                java.util.concurrent.LinkedBlockingQueue<java.lang.Object> r0 = r0.f48909d
                int r14 = r0.size()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "startLoop queue:"
                r0.append(r2)
                r0.append(r14)
                java.lang.String r2 = " startTask:"
                r0.append(r2)
                int r2 = r15.size()
                r0.append(r2)
                java.lang.String r2 = " nextWakeInterval:"
                r0.append(r2)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r0)
                r2 = 0
            L_0x01b4:
                if (r14 != 0) goto L_0x01b8
                r0 = 1
                goto L_0x01b9
            L_0x01b8:
                r0 = r14
            L_0x01b9:
                if (r2 >= r0) goto L_0x0229
                com.tencent.mm.hardcoder.b r0 = com.tencent.p014mm.hardcoder.C17766b.this     // Catch:{ Exception -> 0x01c6 }
                java.util.concurrent.LinkedBlockingQueue<java.lang.Object> r0 = r0.f48909d     // Catch:{ Exception -> 0x01c6 }
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x01c6 }
                java.lang.Object r0 = r0.poll(r7, r5)     // Catch:{ Exception -> 0x01c6 }
                goto L_0x01e2
            L_0x01c6:
                r0 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r4 = "taskQueue poll: "
                r5.append(r4)
                java.lang.String r0 = r0.getMessage()
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r3, r0)
                r0 = r17
            L_0x01e2:
                if (r0 != 0) goto L_0x01e5
                goto L_0x0229
            L_0x01e5:
                boolean r4 = r0 instanceof com.tencent.p014mm.hardcoder.C17766b.C17769c
                if (r4 == 0) goto L_0x01fa
                com.tencent.mm.hardcoder.b$c r0 = (com.tencent.p014mm.hardcoder.C17766b.C17769c) r0
                r15.add(r0)
                int r0 = r0.hashCode()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r11.add(r0)
                goto L_0x0213
            L_0x01fa:
                boolean r4 = r0 instanceof com.tencent.p014mm.hardcoder.C17766b.C17770d
                if (r4 == 0) goto L_0x0218
                com.tencent.mm.hardcoder.b$d r0 = (com.tencent.p014mm.hardcoder.C17766b.C17770d) r0
                int r4 = r0.f48934b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                boolean r5 = r11.contains(r5)
                if (r5 == 0) goto L_0x0213
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r12.put(r4, r0)
            L_0x0213:
                int r2 = r2 + 1
                r4 = 0
                r5 = 1
                goto L_0x01b4
            L_0x0218:
                boolean r0 = com.tencent.p014mm.hardcoder.HardCoderJNI.isCheckEnv()
                if (r0 != 0) goto L_0x0222
                r2 = 0
                r1.f48910d = r2
                goto L_0x0229
            L_0x0222:
                java.lang.String r0 = "taskQueue poll invalid object"
                com.tencent.p014mm.hardcoder.C17766b.m18159b(r0)
                throw r17
            L_0x0229:
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                long r4 = java.lang.System.currentTimeMillis()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "InLoop startSize:"
                r2.append(r7)
                int r7 = r15.size()
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r2)
                r14 = r17
                r27 = r14
                r28 = r27
                r29 = r18
                r2 = 0
            L_0x0253:
                int r7 = r15.size()
                r31 = 0
                if (r2 >= r7) goto L_0x0461
                java.lang.Object r7 = r15.get(r2)
                r8 = r7
                com.tencent.mm.hardcoder.b$c r8 = (com.tencent.p014mm.hardcoder.C17766b.C17769c) r8
                r33 = r13
                r34 = r14
                long r13 = java.lang.System.currentTimeMillis()
                if (r8 != 0) goto L_0x0283
                r44 = r9
                r43 = r10
                r45 = r11
                r23 = r15
                r7 = r29
                r48 = r33
                r14 = r34
                r1 = 1
                r34 = r4
                r33 = r6
                r30 = r12
                goto L_0x044a
            L_0x0283:
                int r7 = r8.hashCode()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                boolean r7 = r12.containsKey(r7)
                if (r7 == 0) goto L_0x031d
                r8.f48923l = r13
                int r7 = r8.hashCode()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.Object r7 = r12.get(r7)
                com.tencent.mm.hardcoder.b$d r7 = (com.tencent.p014mm.hardcoder.C17766b.C17770d) r7
                r36 = r9
                r35 = r10
                long r9 = r7.f48933a
                r8.f48912a = r9
                int r7 = r8.hashCode()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r12.remove(r7)
                com.tencent.mm.hardcoder.b r7 = com.tencent.p014mm.hardcoder.C17766b.this
                r37 = -2
                r38 = -2
                r39 = -2
                r40 = 0
                r9 = r29
                r29 = r8
                r41 = r9
                r10 = r36
                r8 = r13
                r44 = r10
                r43 = r35
                r10 = r15
                r45 = r11
                r11 = r37
                r30 = r12
                r12 = r38
                r46 = r13
                r14 = r33
                r13 = r39
                r33 = r6
                r48 = r14
                r6 = r34
                r14 = r40
                com.tencent.p014mm.hardcoder.C17766b.m18158a(r7, r8, r10, r11, r12, r13, r14)
                com.tencent.mm.hardcoder.b r7 = com.tencent.p014mm.hardcoder.C17766b.this
                r7.getClass()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "reportPerformanceTask:"
                r8.append(r9)
                int r9 = r29.hashCode()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r8)
                com.tencent.mm.hardcoder.c r7 = r7.f48906a
                java.util.Queue<java.lang.Object> r8 = r7.f48935d
                if (r8 == 0) goto L_0x031a
                monitor-enter(r7)
                java.util.Queue<java.lang.Object> r8 = r7.f48935d     // Catch:{ all -> 0x0317 }
                java.util.concurrent.ConcurrentLinkedQueue r8 = (java.util.concurrent.ConcurrentLinkedQueue) r8     // Catch:{ all -> 0x0317 }
                r9 = r29
                r8.add(r9)     // Catch:{ all -> 0x0317 }
                r7.notify()     // Catch:{ all -> 0x0317 }
                monitor-exit(r7)     // Catch:{ all -> 0x0317 }
                goto L_0x0330
            L_0x0317:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0317 }
                throw r0
            L_0x031a:
                r9 = r29
                goto L_0x0330
            L_0x031d:
                r44 = r9
                r43 = r10
                r45 = r11
                r46 = r13
                r41 = r29
                r48 = r33
                r33 = r6
                r9 = r8
                r30 = r12
                r6 = r34
            L_0x0330:
                long r7 = r9.f48923l
                r10 = r46
                long r7 = r7 - r10
                java.lang.String r12 = " task:"
                java.lang.String r13 = "/"
                int r14 = (r7 > r31 ? 1 : (r7 == r31 ? 0 : -1))
                if (r14 > 0) goto L_0x0381
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "InLoop STOP:"
                r7.append(r8)
                r7.append(r2)
                r7.append(r13)
                int r8 = r15.size()
                r7.append(r8)
                r7.append(r12)
                java.lang.String r8 = r9.mo21753c(r10)
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r7)
                r15.remove(r9)
                int r7 = r9.hashCode()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r14 = r45
                r14.remove(r7)
                int r2 = r2 + -1
                r34 = r4
                r23 = r15
                r7 = r41
                r1 = 1
                r14 = r6
                goto L_0x044a
            L_0x0381:
                r23 = r15
                r14 = r41
                long r7 = java.lang.Math.min(r14, r7)
                long r14 = r9.f48921j
                long r14 = r14 - r10
                int r29 = (r14 > r31 ? 1 : (r14 == r31 ? 0 : -1))
                if (r29 <= 0) goto L_0x03c2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r34 = r4
                java.lang.String r4 = "InLoop WAIT:"
                r1.append(r4)
                r1.append(r2)
                r1.append(r13)
                int r4 = r23.size()
                r1.append(r4)
                r1.append(r12)
                java.lang.String r4 = r9.mo21753c(r10)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r1)
                long r4 = java.lang.Math.min(r7, r14)
                r7 = r4
                r14 = r6
                goto L_0x0449
            L_0x03c2:
                r34 = r4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "InLoop RUN:"
                r1.append(r4)
                r1.append(r2)
                r1.append(r13)
                int r4 = r23.size()
                r1.append(r4)
                r1.append(r12)
                java.lang.String r4 = r9.mo21753c(r10)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r1)
                int r1 = r9.f48915d
                if (r1 <= 0) goto L_0x0402
                if (r6 == 0) goto L_0x0400
                int r4 = r6.f48915d
                if (r4 > r1) goto L_0x0400
                if (r4 != r1) goto L_0x0402
                long r4 = r6.f48923l
                long r10 = r9.f48923l
                int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r1 >= 0) goto L_0x0402
            L_0x0400:
                r14 = r9
                goto L_0x0403
            L_0x0402:
                r14 = r6
            L_0x0403:
                int r1 = r9.f48916e
                r4 = r27
                if (r1 <= 0) goto L_0x041c
                if (r4 == 0) goto L_0x0419
                int r5 = r4.f48916e
                if (r5 > r1) goto L_0x0419
                if (r5 != r1) goto L_0x041c
                long r5 = r4.f48923l
                long r10 = r9.f48923l
                int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r1 >= 0) goto L_0x041c
            L_0x0419:
                r27 = r9
                goto L_0x041e
            L_0x041c:
                r27 = r4
            L_0x041e:
                int r1 = r9.f48917f
                r5 = r28
                if (r1 <= 0) goto L_0x0437
                if (r5 == 0) goto L_0x0434
                int r4 = r5.f48917f
                if (r4 > r1) goto L_0x0434
                if (r4 != r1) goto L_0x0437
                long r10 = r5.f48923l
                long r12 = r9.f48923l
                int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r1 >= 0) goto L_0x0437
            L_0x0434:
                r28 = r9
                goto L_0x0439
            L_0x0437:
                r28 = r5
            L_0x0439:
                int[] r1 = r9.f48918g
                int r4 = r1.length
                r5 = 0
            L_0x043d:
                if (r5 >= r4) goto L_0x0449
                r6 = r1[r5]
                if (r6 > 0) goto L_0x0446
                int r5 = r5 + 1
                goto L_0x043d
            L_0x0446:
                r0.add(r9)
            L_0x0449:
                r1 = 1
            L_0x044a:
                int r2 = r2 + r1
                r1 = r73
                r15 = r23
                r12 = r30
                r6 = r33
                r4 = r34
                r10 = r43
                r9 = r44
                r11 = r45
                r13 = r48
                r29 = r7
                goto L_0x0253
            L_0x0461:
                r34 = r4
                r33 = r6
                r44 = r9
                r43 = r10
                r45 = r11
                r48 = r13
                r6 = r14
                r23 = r15
                r4 = r27
                r5 = r28
                r14 = r29
                r1 = 1
                r30 = r12
                long r27 = java.lang.System.currentTimeMillis()
                r2 = 6
                java.lang.Object[] r7 = new java.lang.Object[r2]
                long r8 = r27 - r34
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r9 = 0
                r7[r9] = r8
                long r8 = r27 - r21
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r7[r1] = r8
                int r1 = r23.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r8 = 2
                r7[r8] = r1
                int r1 = r30.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r21 = 3
                r7[r21] = r1
                int r1 = r33.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r22 = 4
                r7[r22] = r1
                int r1 = r0.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r29 = 5
                r7[r29] = r1
                java.lang.String r1 = "EndLoop time:[%d,%d] list:%d stop:%d bindCore:%d -> %d"
                java.lang.String r1 = java.lang.String.format(r1, r7)
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "EndLoop CurrCpu:"
                r1.append(r7)
                java.lang.String r36 = "null"
                r13 = r44
                r11 = r34
                if (r13 != 0) goto L_0x04de
                r7 = r36
                goto L_0x04e2
            L_0x04de:
                java.lang.String r7 = r13.mo21753c(r11)
            L_0x04e2:
                r1.append(r7)
                java.lang.String r7 = " -> MaxCpu:"
                r1.append(r7)
                if (r6 != 0) goto L_0x04ef
                r7 = r36
                goto L_0x04f3
            L_0x04ef:
                java.lang.String r7 = r6.mo21753c(r11)
            L_0x04f3:
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "EndLoop CurrGpu:"
                r1.append(r7)
                r10 = r43
                if (r10 != 0) goto L_0x050e
                r7 = r36
                goto L_0x0512
            L_0x050e:
                java.lang.String r7 = r10.mo21753c(r11)
            L_0x0512:
                r1.append(r7)
                java.lang.String r7 = " -> MaxGpu:"
                r1.append(r7)
                if (r10 != 0) goto L_0x051f
                r7 = r36
                goto L_0x0523
            L_0x051f:
                java.lang.String r7 = r10.mo21753c(r11)
            L_0x0523:
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "EndLoop CurrIO:"
                r1.append(r7)
                r8 = r20
                if (r8 != 0) goto L_0x053e
                r7 = r36
                goto L_0x0542
            L_0x053e:
                java.lang.String r7 = r8.mo21753c(r11)
            L_0x0542:
                r1.append(r7)
                java.lang.String r7 = " -> MaxIO:"
                r1.append(r7)
                if (r5 != 0) goto L_0x054f
                r7 = r36
                goto L_0x0553
            L_0x054f:
                java.lang.String r7 = r5.mo21753c(r11)
            L_0x0553:
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r1)
                r1 = 2
                java.lang.Object[] r7 = new java.lang.Object[r1]
                int r1 = r33.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r9 = 0
                r7[r9] = r1
                int r1 = r0.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r9 = 1
                r7[r9] = r1
                java.lang.String r1 = "EndLoop BindCore.size cur: %d, need: %d"
                java.lang.String r1 = java.lang.String.format(r1, r7)
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r1)
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r7 = r33
                r1.addAll(r7)
                r1.removeAll(r0)
                if (r6 != r13) goto L_0x05bb
                if (r4 != r10) goto L_0x05bb
                if (r5 != r8) goto L_0x05bb
                int r9 = r7.size()
                int r2 = r0.size()
                if (r9 != r2) goto L_0x05bb
                boolean r2 = r1.isEmpty()
                if (r2 == 0) goto L_0x05bb
                java.lang.String r0 = "EndLoop Nothing Changed, Continue."
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r0)
                r24 = 2
                r25 = 1
                r26 = 0
                r6 = r7
                r20 = r8
                r9 = r13
                r37 = r14
                r33 = r45
                r2 = r48
                r15 = r73
                goto L_0x0b52
            L_0x05bb:
                java.util.Iterator r2 = r1.iterator()
                r7 = 0
            L_0x05c0:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x05d4
                java.lang.Object r9 = r2.next()
                com.tencent.mm.hardcoder.b$c r9 = (com.tencent.p014mm.hardcoder.C17766b.C17769c) r9
                int[] r9 = r9.f48918g
                if (r9 != 0) goto L_0x05d1
                goto L_0x05c0
            L_0x05d1:
                int r9 = r9.length
                int r7 = r7 + r9
                goto L_0x05c0
            L_0x05d4:
                java.lang.String r2 = "stopTime:"
                if (r7 <= 0) goto L_0x06c3
                int[] r7 = new int[r7]
                java.util.Iterator r1 = r1.iterator()
                r9 = 0
            L_0x05e0:
                boolean r33 = r1.hasNext()
                if (r33 == 0) goto L_0x0687
                java.lang.Object r33 = r1.next()
                r34 = r1
                r1 = r33
                com.tencent.mm.hardcoder.b$c r1 = (com.tencent.p014mm.hardcoder.C17766b.C17769c) r1
                r33 = r8
                r35 = r9
                long r8 = java.lang.System.currentTimeMillis()
                r43 = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r44 = r13
                java.lang.String r13 = "!cancelBindCore task:"
                r10.append(r13)
                java.lang.String r13 = r1.mo21753c(r8)
                r10.append(r13)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18166c(r3, r10)
                r41 = r14
                long r13 = r1.f48923l
                int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r10 <= 0) goto L_0x063b
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r2)
                long r13 = r1.f48923l
                long r13 = r13 - r8
                r10.append(r13)
                java.lang.String r1 = ". Error !"
                r10.append(r1)
                java.lang.String r1 = r10.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r3, r1)
                r15 = r73
                r9 = r35
                goto L_0x067b
            L_0x063b:
                boolean r8 = r1.mo21752b()
                if (r8 != 0) goto L_0x0668
                boolean r8 = com.tencent.p014mm.hardcoder.HardCoderJNI.isCheckEnv()
                if (r8 != 0) goto L_0x064d
                r8 = 0
                r15 = r73
                r15.f48910d = r8
                goto L_0x0691
            L_0x064d:
                r15 = r73
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "bindTids:"
                r0.append(r2)
                java.lang.String r1 = r1.mo21751a()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17766b.m18159b(r0)
                throw r17
            L_0x0668:
                r15 = r73
                int[] r1 = r1.f48918g
                int r8 = r1.length
                r9 = r35
                r10 = 0
            L_0x0670:
                if (r10 >= r8) goto L_0x067b
                r13 = r1[r10]
                r7[r9] = r13
                int r9 = r9 + 1
                int r10 = r10 + 1
                goto L_0x0670
            L_0x067b:
                r8 = r33
                r1 = r34
                r14 = r41
                r10 = r43
                r13 = r44
                goto L_0x05e0
            L_0x0687:
                r33 = r8
                r43 = r10
                r44 = r13
                r41 = r14
                r15 = r73
            L_0x0691:
                boolean r1 = com.tencent.p014mm.hardcoder.HardCoderJNI.isCheckEnv()
                if (r1 == 0) goto L_0x06a2
                int r1 = android.os.Process.myTid()
                long r8 = android.os.SystemClock.elapsedRealtimeNanos()
                com.tencent.p014mm.hardcoder.HardCoderJNI.cancelCpuCoreForThread(r7, r1, r8)
            L_0x06a2:
                com.tencent.mm.hardcoder.b r7 = com.tencent.p014mm.hardcoder.C17766b.this
                r1 = -2
                r13 = -2
                r14 = -2
                r34 = 0
                r10 = r33
                r8 = r11
                r50 = r10
                r49 = r43
                r10 = r23
                r51 = r11
                r11 = r1
                r12 = r13
                r1 = r44
                r13 = r14
                r37 = r41
                r33 = r45
                r14 = r34
                com.tencent.p014mm.hardcoder.C17766b.m18158a(r7, r8, r10, r11, r12, r13, r14)
                goto L_0x06d0
            L_0x06c3:
                r50 = r8
                r49 = r10
                r51 = r11
                r1 = r13
                r37 = r14
                r33 = r45
                r15 = r73
            L_0x06d0:
                java.util.Iterator r7 = r0.iterator()
                r14 = 0
            L_0x06d5:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x06e9
                java.lang.Object r8 = r7.next()
                com.tencent.mm.hardcoder.b$c r8 = (com.tencent.p014mm.hardcoder.C17766b.C17769c) r8
                int[] r8 = r8.f48918g
                if (r8 != 0) goto L_0x06e6
                goto L_0x06d5
            L_0x06e6:
                int r8 = r8.length
                int r14 = r14 + r8
                goto L_0x06d5
            L_0x06e9:
                int[] r13 = new int[r14]
                java.util.Iterator r7 = r0.iterator()
                r39 = r31
                r8 = 0
                r11 = 2147483647(0x7fffffff, float:NaN)
                r34 = 0
                r35 = 0
            L_0x06f9:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x07b0
                java.lang.Object r9 = r7.next()
                com.tencent.mm.hardcoder.b$c r9 = (com.tencent.p014mm.hardcoder.C17766b.C17769c) r9
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r12 = "requestBindCore task:"
                r10.append(r12)
                r47 = r0
                r42 = r13
                r12 = r51
                java.lang.String r0 = r9.mo21753c(r12)
                r10.append(r0)
                java.lang.String r0 = r10.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18166c(r3, r0)
                long r43 = java.lang.System.currentTimeMillis()
                r0 = r7
                r10 = r8
                long r7 = r9.f48923l
                int r45 = (r7 > r43 ? 1 : (r7 == r43 ? 0 : -1))
                if (r45 > 0) goto L_0x0753
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                long r8 = r9.f48923l
                long r8 = r8 - r43
                r7.append(r8)
                java.lang.String r8 = ". Error !"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r3, r7)
                r7 = r0
                r8 = r10
                r51 = r12
                r13 = r42
                r0 = r47
                goto L_0x06f9
            L_0x0753:
                boolean r7 = r9.mo21752b()
                if (r7 != 0) goto L_0x077c
                boolean r0 = com.tencent.p014mm.hardcoder.HardCoderJNI.isCheckEnv()
                if (r0 != 0) goto L_0x0763
                r2 = 0
                r15.f48910d = r2
                goto L_0x07b6
            L_0x0763:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "bindTids:"
                r0.append(r1)
                java.lang.String r1 = r9.mo21751a()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17766b.m18159b(r0)
                throw r17
            L_0x077c:
                int[] r7 = r9.f48918g
                int r8 = r7.length
                r34 = r10
                r10 = 0
            L_0x0782:
                if (r10 >= r8) goto L_0x078d
                r35 = r7[r10]
                r42[r34] = r35
                int r34 = r34 + 1
                int r10 = r10 + 1
                goto L_0x0782
            L_0x078d:
                int r7 = r9.f48919h
                r10 = r7
                long r7 = r9.f48920i
                r43 = r0
                int r0 = r9.f48924m
                r39 = r7
                long r7 = r9.f48923l
                long r7 = r7 - r12
                int r8 = (int) r7
                int r11 = java.lang.Math.min(r8, r11)
                r35 = r0
                r51 = r12
                r8 = r34
                r13 = r42
                r7 = r43
                r0 = r47
                r34 = r10
                goto L_0x06f9
            L_0x07b0:
                r47 = r0
                r42 = r13
                r12 = r51
            L_0x07b6:
                java.lang.String r0 = " delay:"
                java.lang.String r2 = " -> "
                if (r5 != 0) goto L_0x0813
                r7 = r50
                if (r7 == 0) goto L_0x080b
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "!cancelHighIOFreq task:"
                r8.append(r9)
                java.lang.String r9 = r7.mo21753c(r12)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18166c(r3, r8)
                boolean r8 = com.tencent.p014mm.hardcoder.HardCoderJNI.isCheckEnv()
                if (r8 == 0) goto L_0x07e7
                int r7 = r7.f48924m
                long r8 = android.os.SystemClock.elapsedRealtimeNanos()
                com.tencent.p014mm.hardcoder.HardCoderJNI.cancelHighIOFreq(r7, r8)
            L_0x07e7:
                com.tencent.mm.hardcoder.b r7 = com.tencent.p014mm.hardcoder.C17766b.this
                r43 = -2
                r44 = -2
                r45 = -1
                r46 = 0
                r8 = r12
                r10 = r23
                r64 = r11
                r11 = r43
                r65 = r12
                r13 = 2147483647(0x7fffffff, float:NaN)
                r12 = r44
                r50 = r42
                r13 = r45
                r41 = r14
                r14 = r46
                com.tencent.p014mm.hardcoder.C17766b.m18158a(r7, r8, r10, r11, r12, r13, r14)
                goto L_0x0855
            L_0x080b:
                r64 = r11
                r41 = r14
                r50 = r42
                r13 = r12
                goto L_0x0857
            L_0x0813:
                r64 = r11
                r65 = r12
                r41 = r14
                r7 = r50
                r50 = r42
                if (r7 == r5) goto L_0x0855
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "IOReq:"
                r8.append(r9)
                if (r7 != 0) goto L_0x0830
                r7 = r36
                r13 = r65
                goto L_0x0836
            L_0x0830:
                r13 = r65
                java.lang.String r7 = r7.mo21753c(r13)
            L_0x0836:
                r8.append(r7)
                r8.append(r2)
                java.lang.String r7 = r5.mo21753c(r13)
                r8.append(r7)
                r8.append(r0)
                long r9 = r5.f48921j
                long r9 = r27 - r9
                r8.append(r9)
                java.lang.String r7 = r8.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r7)
                goto L_0x0857
            L_0x0855:
                r13 = r65
            L_0x0857:
                if (r5 == 0) goto L_0x0878
                int r7 = r5.f48917f
                int r8 = r5.f48919h
                long r9 = r5.f48920i
                int r11 = r5.f48924m
                r12 = r7
                r34 = r8
                long r7 = r5.f48923l
                long r7 = r7 - r13
                int r8 = (int) r7
                r7 = r64
                int r7 = java.lang.Math.min(r8, r7)
                r42 = r9
                r39 = r11
                r35 = r34
                r34 = r12
                r12 = r7
                goto L_0x0883
            L_0x0878:
                r7 = r64
                r12 = r7
                r42 = r39
                r39 = r35
                r35 = r34
                r34 = 0
            L_0x0883:
                if (r4 != 0) goto L_0x08cd
                r7 = r49
                if (r7 == 0) goto L_0x08ca
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "!cancelGpuHighFreq task:"
                r8.append(r9)
                java.lang.String r9 = r7.mo21753c(r13)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18166c(r3, r8)
                boolean r8 = com.tencent.p014mm.hardcoder.HardCoderJNI.isCheckEnv()
                if (r8 == 0) goto L_0x08b0
                int r7 = r7.f48924m
                long r8 = android.os.SystemClock.elapsedRealtimeNanos()
                com.tencent.p014mm.hardcoder.HardCoderJNI.cancelGpuHighFreq(r7, r8)
            L_0x08b0:
                com.tencent.mm.hardcoder.b r7 = com.tencent.p014mm.hardcoder.C17766b.this
                r11 = -2
                r40 = -1
                r44 = -2
                r45 = 0
                r8 = r13
                r10 = r23
                r67 = r12
                r12 = r40
                r68 = r13
                r13 = r44
                r14 = r45
                com.tencent.p014mm.hardcoder.C17766b.m18158a(r7, r8, r10, r11, r12, r13, r14)
                goto L_0x090b
            L_0x08ca:
                r67 = r12
                goto L_0x090d
            L_0x08cd:
                r67 = r12
                r68 = r13
                r7 = r49
                if (r7 == r4) goto L_0x090b
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "GPUReq:"
                r8.append(r9)
                if (r7 != 0) goto L_0x08e6
                r7 = r36
                r13 = r68
                goto L_0x08ec
            L_0x08e6:
                r13 = r68
                java.lang.String r7 = r7.mo21753c(r13)
            L_0x08ec:
                r8.append(r7)
                r8.append(r2)
                java.lang.String r7 = r4.mo21753c(r13)
                r8.append(r7)
                r8.append(r0)
                long r9 = r4.f48921j
                long r9 = r27 - r9
                r8.append(r9)
                java.lang.String r7 = r8.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r7)
                goto L_0x090d
            L_0x090b:
                r13 = r68
            L_0x090d:
                if (r4 == 0) goto L_0x092e
                int r7 = r4.f48916e
                int r8 = r4.f48919h
                long r9 = r4.f48920i
                int r11 = r4.f48924m
                r12 = r7
                r35 = r8
                long r7 = r4.f48923l
                long r7 = r7 - r13
                int r8 = (int) r7
                r7 = r67
                int r7 = java.lang.Math.min(r8, r7)
                r42 = r9
                r40 = r11
                r39 = r35
                r35 = r12
                r12 = r7
                goto L_0x0937
            L_0x092e:
                r7 = r67
                r12 = r7
                r40 = r39
                r39 = r35
                r35 = 0
            L_0x0937:
                if (r6 != 0) goto L_0x097a
                if (r1 == 0) goto L_0x0976
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "!cancelCpuHighFreq task:"
                r0.append(r2)
                java.lang.String r2 = r1.mo21753c(r13)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18166c(r3, r0)
                boolean r0 = com.tencent.p014mm.hardcoder.HardCoderJNI.isCheckEnv()
                if (r0 == 0) goto L_0x0962
                int r0 = r1.f48924m
                long r1 = android.os.SystemClock.elapsedRealtimeNanos()
                com.tencent.p014mm.hardcoder.HardCoderJNI.cancelCpuHighFreq(r0, r1)
            L_0x0962:
                com.tencent.mm.hardcoder.b r7 = com.tencent.p014mm.hardcoder.C17766b.this
                r11 = -1
                r0 = -2
                r1 = -2
                r2 = 0
                r8 = r13
                r10 = r23
                r70 = r12
                r12 = r0
                r71 = r13
                r13 = r1
                r14 = r2
                com.tencent.p014mm.hardcoder.C17766b.m18158a(r7, r8, r10, r11, r12, r13, r14)
                goto L_0x09b6
            L_0x0976:
                r70 = r12
                r8 = r13
                goto L_0x09b8
            L_0x097a:
                r70 = r12
                r71 = r13
                if (r1 == r6) goto L_0x09b6
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "CPUReq:"
                r7.append(r8)
                if (r1 != 0) goto L_0x0991
                r1 = r36
                r8 = r71
                goto L_0x0997
            L_0x0991:
                r8 = r71
                java.lang.String r1 = r1.mo21753c(r8)
            L_0x0997:
                r7.append(r1)
                r7.append(r2)
                java.lang.String r1 = r6.mo21753c(r8)
                r7.append(r1)
                r7.append(r0)
                long r0 = r6.f48921j
                long r0 = r27 - r0
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18164a(r3, r0)
                goto L_0x09b8
            L_0x09b6:
                r8 = r71
            L_0x09b8:
                if (r6 == 0) goto L_0x09d4
                int r0 = r6.f48915d
                int r1 = r6.f48919h
                long r10 = r6.f48920i
                int r2 = r6.f48924m
                long r12 = r6.f48923l
                long r12 = r12 - r8
                int r7 = (int) r12
                r12 = r70
                int r7 = java.lang.Math.min(r7, r12)
                r61 = r2
                r12 = r10
                r11 = r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                goto L_0x09e1
            L_0x09d4:
                r12 = r70
                r7 = r12
                r1 = r39
                r61 = r40
                r12 = r42
                r0 = 2147483647(0x7fffffff, float:NaN)
                r11 = 0
            L_0x09e1:
                if (r7 >= r0) goto L_0x0b44
                r2 = 14
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
                r26 = 0
                r0[r26] = r10
                java.lang.Long r10 = java.lang.Long.valueOf(r12)
                r25 = 1
                r0[r25] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r61)
                r24 = 2
                r0[r24] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
                r0[r21] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r35)
                r0[r22] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r34)
                r0[r29] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r41)
                r14 = 6
                r0[r14] = r10
                r10 = 7
                java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
                r0[r10] = r14
                r10 = 8
                if (r6 != 0) goto L_0x0a26
                r14 = r36
                goto L_0x0a2a
            L_0x0a26:
                java.lang.String r14 = r6.mo21753c(r8)
            L_0x0a2a:
                r0[r10] = r14
                r10 = 9
                if (r4 != 0) goto L_0x0a33
                r14 = r36
                goto L_0x0a37
            L_0x0a33:
                java.lang.String r14 = r4.mo21753c(r8)
            L_0x0a37:
                r0[r10] = r14
                r10 = 10
                if (r5 != 0) goto L_0x0a40
                r14 = r36
                goto L_0x0a44
            L_0x0a40:
                java.lang.String r14 = r5.mo21753c(r8)
            L_0x0a44:
                r0[r10] = r14
                r10 = 11
                if (r6 != 0) goto L_0x0a4d
                r14 = r36
                goto L_0x0a51
            L_0x0a4d:
                java.lang.String r14 = r6.mo21753c(r8)
            L_0x0a51:
                r0[r10] = r14
                r10 = 12
                if (r4 != 0) goto L_0x0a5a
                r14 = r36
                goto L_0x0a5e
            L_0x0a5a:
                java.lang.String r14 = r4.mo21753c(r8)
            L_0x0a5e:
                r0[r10] = r14
                if (r5 != 0) goto L_0x0a63
                goto L_0x0a67
            L_0x0a63:
                java.lang.String r36 = r5.mo21753c(r8)
            L_0x0a67:
                r0[r16] = r36
                java.lang.String r10 = "!UnifyRequest [%d,%d,%d] [%d,%d,%d,%d] TO:%d max CPU:%s GPU:%s IO:%s cur CPU:%s GPU:%s IO:%s"
                java.lang.String r0 = java.lang.String.format(r10, r0)
                com.tencent.p014mm.hardcoder.C17774h.m18166c(r3, r0)
                if (r7 <= 0) goto L_0x0a76
                r0 = 1
                goto L_0x0a77
            L_0x0a76:
                r0 = 0
            L_0x0a77:
                if (r0 == 0) goto L_0x0b40
                if (r1 > 0) goto L_0x0a82
                int r0 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
                if (r0 <= 0) goto L_0x0a80
                goto L_0x0a82
            L_0x0a80:
                r0 = 0
                goto L_0x0a83
            L_0x0a82:
                r0 = 1
            L_0x0a83:
                if (r0 == 0) goto L_0x0b3c
                if (r61 <= 0) goto L_0x0a89
                r0 = 1
                goto L_0x0a8a
            L_0x0a89:
                r0 = 0
            L_0x0a8a:
                if (r0 == 0) goto L_0x0b38
                if (r11 > 0) goto L_0x0a97
                if (r35 > 0) goto L_0x0a97
                if (r34 > 0) goto L_0x0a97
                if (r41 <= 0) goto L_0x0a95
                goto L_0x0a97
            L_0x0a95:
                r0 = 0
                goto L_0x0a98
            L_0x0a97:
                r0 = 1
            L_0x0a98:
                if (r0 == 0) goto L_0x0b34
                boolean r0 = com.tencent.p014mm.hardcoder.HardCoderJNI.isCheckEnv()
                if (r0 == 0) goto L_0x0b24
                long r62 = android.os.SystemClock.elapsedRealtimeNanos()
                r53 = r1
                r54 = r12
                r56 = r11
                r57 = r35
                r58 = r34
                r59 = r50
                r60 = r7
                r20 = r3
                long r2 = com.tencent.p014mm.hardcoder.HardCoderJNI.requestUnifyCpuIOThreadCoreGpu(r53, r54, r56, r57, r58, r59, r60, r61, r62)
                com.tencent.mm.hardcoder.f r0 = new com.tencent.mm.hardcoder.f
                r39 = r0
                r40 = r1
                r41 = r12
                r43 = r11
                r44 = r35
                r45 = r34
                r46 = r50
                r39.<init>(r40, r41, r43, r44, r45, r46)
                com.tencent.p014mm.hardcoder.HardCoderJNI.putRequestStatusHashMap(r2, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r7 = "hardcoder requestUnifyCpuIOThreadCoreGpu requestId:"
                r0.append(r7)
                r0.append(r2)
                java.lang.String r2 = "reqScene["
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", "
                r0.append(r2)
                r0.append(r12)
                java.lang.String r2 = "] running[enable:"
                r0.append(r2)
                boolean r2 = com.tencent.p014mm.hardcoder.HardCoderJNI.isHcEnable()
                r0.append(r2)
                java.lang.String r2 = ", env:"
                r0.append(r2)
                boolean r2 = com.tencent.p014mm.hardcoder.HardCoderJNI.isCheckEnv()
                if (r2 == 0) goto L_0x0b0a
                int r2 = com.tencent.p014mm.hardcoder.HardCoderJNI.isRunning()
                if (r2 <= 0) goto L_0x0b0a
                r2 = 1
                goto L_0x0b0b
            L_0x0b0a:
                r2 = 0
            L_0x0b0b:
                r0.append(r2)
                r2 = r48
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r3 = r20
                com.tencent.p014mm.hardcoder.C17774h.m18166c(r3, r0)
                com.tencent.mm.hardcoder.g r0 = com.tencent.p014mm.hardcoder.HardCoderJNI.sceneReportCallback
                if (r0 == 0) goto L_0x0b26
                r0.sceneReport(r1, r12)
                goto L_0x0b26
            L_0x0b24:
                r2 = r48
            L_0x0b26:
                com.tencent.mm.hardcoder.b r7 = com.tencent.p014mm.hardcoder.C17766b.this
                r10 = r23
                r12 = r35
                r13 = r34
                r14 = r50
                com.tencent.p014mm.hardcoder.C17766b.m18158a(r7, r8, r10, r11, r12, r13, r14)
                goto L_0x0b4c
            L_0x0b34:
                com.tencent.p014mm.hardcoder.C17766b.m18159b(r17)
                throw r17
            L_0x0b38:
                com.tencent.p014mm.hardcoder.C17766b.m18159b(r17)
                throw r17
            L_0x0b3c:
                com.tencent.p014mm.hardcoder.C17766b.m18159b(r17)
                throw r17
            L_0x0b40:
                com.tencent.p014mm.hardcoder.C17766b.m18159b(r17)
                throw r17
            L_0x0b44:
                r2 = r48
                r24 = 2
                r25 = 1
                r26 = 0
            L_0x0b4c:
                r10 = r4
                r20 = r5
                r9 = r6
                r6 = r47
            L_0x0b52:
                r13 = r2
                r1 = r15
                r15 = r23
                r12 = r30
                r11 = r33
                r7 = r37
                r2 = 2
                r4 = 0
                r5 = 1
                r14 = 14
                goto L_0x017a
            L_0x0b63:
                r15 = r1
                java.lang.String r0 = "HCPerfManager thread run end."
                com.tencent.p014mm.hardcoder.C17774h.m18166c(r3, r0)
                return
            L_0x0b6a:
                r0 = move-exception
                r15 = r1
                r17 = r10
            L_0x0b6e:
                r1 = r0
                r10 = r17
                r17 = r11
            L_0x0b73:
                if (r10 == 0) goto L_0x0b91
                r10.close()     // Catch:{ Exception -> 0x0b79 }
                goto L_0x0b91
            L_0x0b79:
                r0 = move-exception
                r2 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                java.lang.String r2 = r2.getMessage()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r9, r0)
            L_0x0b91:
                if (r17 == 0) goto L_0x0baf
                r17.close()     // Catch:{ Exception -> 0x0b97 }
                goto L_0x0baf
            L_0x0b97:
                r0 = move-exception
                r2 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r2 = r2.getMessage()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.hardcoder.C17774h.m18165b(r9, r0)
            L_0x0baf:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.hardcoder.C17766b.C17768b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.hardcoder.b$c */
    public static class C17769c {

        /* renamed from: a */
        public long f48912a = 0;

        /* renamed from: b */
        public int f48913b = 0;

        /* renamed from: c */
        public int f48914c = 0;

        /* renamed from: d */
        public int f48915d = 0;

        /* renamed from: e */
        public int f48916e = 0;

        /* renamed from: f */
        public int f48917f = 0;

        /* renamed from: g */
        public int[] f48918g = null;

        /* renamed from: h */
        public int f48919h = 0;

        /* renamed from: i */
        public long f48920i = 0;

        /* renamed from: j */
        public long f48921j = 0;

        /* renamed from: k */
        public long f48922k = 0;

        /* renamed from: l */
        public long f48923l = 0;

        /* renamed from: m */
        public int f48924m = 0;

        /* renamed from: n */
        public String f48925n;

        /* renamed from: o */
        public int f48926o = 0;

        /* renamed from: p */
        public int f48927p = 0;

        /* renamed from: q */
        public long f48928q = 0;

        /* renamed from: r */
        public int[] f48929r = new int[4];

        /* renamed from: s */
        public int[] f48930s = new int[4];

        /* renamed from: t */
        public int[] f48931t = null;

        /* renamed from: u */
        public long f48932u = 0;

        /* renamed from: a */
        public String mo21751a() {
            if (!mo21752b()) {
                return "[ ]";
            }
            StringBuilder sb = new StringBuilder("[");
            for (int i : this.f48918g) {
                sb.append("" + i + " ");
            }
            sb.append("]");
            return sb.toString();
        }

        /* renamed from: b */
        public boolean mo21752b() {
            int[] iArr = this.f48918g;
            return iArr != null && iArr.length > 0 && (iArr.length != 1 || iArr[0] > 0);
        }

        /* renamed from: c */
        public String mo21753c(long j) {
            return String.format("hashCode:%x time:[init:%d, start:%d, stop:%d][delay:%d, timeout:%d][scene:%d, action:%d, callerTid:%d][cpu:%d, io:%d, gpu:%d] bindTids:%s [TAG:%s]", new Object[]{Integer.valueOf(hashCode()), Long.valueOf(this.f48922k - j), Long.valueOf(this.f48921j - j), Long.valueOf(this.f48923l - j), Integer.valueOf(this.f48913b), Integer.valueOf(this.f48914c), Integer.valueOf(this.f48919h), Long.valueOf(this.f48920i), Integer.valueOf(this.f48924m), Integer.valueOf(this.f48915d), Integer.valueOf(this.f48917f), Integer.valueOf(this.f48916e), mo21751a(), this.f48925n});
        }
    }

    /* renamed from: com.tencent.mm.hardcoder.b$d */
    public static class C17770d {

        /* renamed from: a */
        public long f48933a = 0;

        /* renamed from: b */
        public int f48934b = 0;
    }

    public C17766b(HardCoderJNI.HCPerfManagerThread hCPerfManagerThread) {
        C17771c cVar = new C17771c();
        this.f48906a = cVar;
        synchronized (cVar) {
            if (cVar.f48936e == null) {
                Thread thread = new Thread(cVar);
                cVar.f48936e = thread;
                thread.setPriority(5);
                cVar.f48936e.start();
            }
        }
        this.f48908c = hCPerfManagerThread;
        Thread newThread = hCPerfManagerThread.newThread(new C17768b((C17767a) null), "HCPerfManager", 10);
        this.f48907b = newThread;
        newThread.start();
        C17774h.m18166c("Hardcoder.HCPerfManager", String.format("HCPerfManager new thread[%s]", new Object[]{this.f48907b}));
    }

    /* renamed from: a */
    public static void m18158a(C17766b bVar, long j, List list, int i, int i2, int i3, int[] iArr) {
        C17771c cVar = bVar.f48906a;
        List list2 = list;
        C17771c.C17772a aVar = new C17771c.C17772a(j, new ArrayList(list), i, i2, i3, iArr);
        if (cVar.f48935d != null) {
            synchronized (cVar) {
                ((ConcurrentLinkedQueue) cVar.f48935d).add(aVar);
                cVar.notify();
            }
        }
    }

    /* renamed from: b */
    public static void m18159b(String str) {
        if (str == null) {
            throw new AssertionError();
        }
        throw new AssertionError(str);
    }
}
