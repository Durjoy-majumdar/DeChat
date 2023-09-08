package com.tencent.p014mm.plugin.fts;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.PriorityBlockingQueue;
import kv1.C76636p;
import lv1.C99664b;

/* renamed from: com.tencent.mm.plugin.fts.i */
public class C93836i implements C76636p {

    /* renamed from: a */
    public C93837a f270824a = new C93837a(this);

    /* renamed from: com.tencent.mm.plugin.fts.i$a */
    public class C93837a extends Thread {

        /* renamed from: d */
        public int f270825d = 0;

        /* renamed from: e */
        public int f270826e = Integer.MAX_VALUE;

        /* renamed from: f */
        public PriorityBlockingQueue<C99664b> f270827f = new PriorityBlockingQueue<>();

        /* renamed from: g */
        public volatile boolean f270828g = false;

        /* renamed from: h */
        public C99664b f270829h;

        /* renamed from: i */
        public boolean f270830i;

        /* renamed from: j */
        public Runnable f270831j;

        /* renamed from: n */
        public boolean f270832n = false;

        public C93837a(C93836i iVar) {
            super("SearchDaemon");
        }

        /* renamed from: a */
        public synchronized void mo128805a(boolean z) {
            int i;
            if (this.f270830i != z) {
                this.f270830i = z;
                if (this.f270826e >= 0 && isAlive() && (i = this.f270825d) != 0) {
                    int i2 = this.f270830i ? 10 : 0;
                    try {
                        Process.setThreadPriority(i, i2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("*** Switch priority: ");
                        sb.append(this.f270830i ? "foreground" : "background");
                        Log.m105924i("MicroMsg.FTS.FTSTaskDaemon", sb.toString());
                    } catch (SecurityException e) {
                        Log.printErrStackTrace("MicroMsg.FTS.FTSTaskDaemon", e, "setLowPriorityMode failed, tid=%d, p=%d", Integer.valueOf(this.f270825d), Integer.valueOf(i2));
                    }
                }
            } else {
                return;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo128806b(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f270826e     // Catch:{ all -> 0x0032 }
                if (r0 == r3) goto L_0x0030
                boolean r0 = r2.isAlive()     // Catch:{ all -> 0x0032 }
                if (r0 != 0) goto L_0x000c
                goto L_0x0030
            L_0x000c:
                if (r3 >= 0) goto L_0x0019
                int r0 = r2.f270826e     // Catch:{ all -> 0x0032 }
                if (r0 < 0) goto L_0x0019
                int r0 = r2.f270825d     // Catch:{ all -> 0x0032 }
                r1 = -8
                android.os.Process.setThreadPriority(r0, r1)     // Catch:{ all -> 0x0032 }
                goto L_0x002c
            L_0x0019:
                if (r3 < 0) goto L_0x002c
                int r0 = r2.f270826e     // Catch:{ all -> 0x0032 }
                if (r0 >= 0) goto L_0x002c
                boolean r0 = r2.f270830i     // Catch:{ all -> 0x0032 }
                if (r0 == 0) goto L_0x0026
                r0 = 10
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                int r1 = r2.f270825d     // Catch:{ all -> 0x0032 }
                android.os.Process.setThreadPriority(r1, r0)     // Catch:{ all -> 0x0032 }
            L_0x002c:
                r2.f270826e = r3     // Catch:{ all -> 0x0032 }
                monitor-exit(r2)
                return
            L_0x0030:
                monitor-exit(r2)
                return
            L_0x0032:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.C93836i.C93837a.mo128806b(int):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x0123 A[SYNTHETIC, Splitter:B:47:0x0123] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x011c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r15 = this;
                r1 = r15
                java.lang.String r2 = "MicroMsg.FTS.FTSTaskDaemon"
                int r0 = android.os.Process.myTid()
                r1.f270825d = r0
            L_0x0009:
                r3 = 4
                r4 = 2
                r5 = 3
                r6 = 0
                r7 = 1
                r8 = 0
                java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x0117 }
                boolean r0 = r1.f270828g     // Catch:{ Exception -> 0x0117 }
                if (r0 == 0) goto L_0x001e
                com.tencent.p014mm.plugin.fts.C93824b.m118491a()
                r1.f270829h = r6
                r1.f270825d = r8
                return
            L_0x001e:
                r1.f270829h = r6     // Catch:{ Exception -> 0x0117 }
                java.util.concurrent.PriorityBlockingQueue<lv1.b> r0 = r1.f270827f     // Catch:{ Exception -> 0x0117 }
                java.lang.Object r0 = r0.take()     // Catch:{ Exception -> 0x0117 }
                r9 = r0
                lv1.b r9 = (lv1.C99664b) r9     // Catch:{ Exception -> 0x0117 }
                if (r9 != 0) goto L_0x002d
                goto L_0x011c
            L_0x002d:
                r1.f270829h = r9     // Catch:{ Exception -> 0x0111 }
                int r0 = r9.mo128767d()     // Catch:{ Exception -> 0x0111 }
                r15.mo128806b(r0)     // Catch:{ Exception -> 0x0111 }
                java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x0111 }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x010f }
                if (r0 == 0) goto L_0x0044
                java.lang.String r10 = r9.toString()     // Catch:{ Exception -> 0x010f }
            L_0x0044:
                r9.mo139037a()     // Catch:{ Exception -> 0x010f }
                int r0 = r9.mo128768e()     // Catch:{ Exception -> 0x010f }
                long r11 = r9.f292080f     // Catch:{ Exception -> 0x010f }
                kv1.C99252h.m129301f(r0, r11)     // Catch:{ Exception -> 0x010f }
                int r0 = r9.mo128768e()     // Catch:{ Exception -> 0x010f }
                long r11 = r9.f292080f     // Catch:{ Exception -> 0x010f }
                kv1.C99252h.m129302g(r0, r11)     // Catch:{ Exception -> 0x010f }
                r11 = 1
                long r13 = r9.f292081g     // Catch:{ Exception -> 0x010f }
                long r11 = r11 & r13
                r13 = 0
                int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r0 <= 0) goto L_0x0066
                r0 = 1
                goto L_0x0067
            L_0x0066:
                r0 = 0
            L_0x0067:
                if (r0 == 0) goto L_0x0082
                long r11 = r9.f292080f     // Catch:{ Exception -> 0x010f }
                r13 = 1000(0x3e8, double:4.94E-321)
                int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r0 <= 0) goto L_0x0082
                r13 = 3600000(0x36ee80, double:1.7786363E-317)
                int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r0 >= 0) goto L_0x0082
                r0 = 27
                kv1.C99252h.m129301f(r0, r11)     // Catch:{ Exception -> 0x010f }
                long r11 = r9.f292080f     // Catch:{ Exception -> 0x010f }
                kv1.C99252h.m129302g(r0, r11)     // Catch:{ Exception -> 0x010f }
            L_0x0082:
                boolean r0 = r9 instanceof lv1.C99678j     // Catch:{ Exception -> 0x010f }
                if (r0 == 0) goto L_0x00b4
                r0 = r9
                lv1.j r0 = (lv1.C99678j) r0     // Catch:{ Exception -> 0x010f }
                java.lang.String r11 = "[%s][Request=%s][Result=%s] Done, %dms"
                java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x010f }
                r12[r8] = r10     // Catch:{ Exception -> 0x010f }
                lv1.k r13 = r0.f292133j     // Catch:{ Exception -> 0x010f }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x010f }
                r12[r7] = r13     // Catch:{ Exception -> 0x010f }
                lv1.l r13 = r0.f292134n     // Catch:{ Exception -> 0x010f }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x010f }
                r12[r4] = r13     // Catch:{ Exception -> 0x010f }
                long r13 = r9.f292080f     // Catch:{ Exception -> 0x010f }
                java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x010f }
                r12[r5] = r13     // Catch:{ Exception -> 0x010f }
                java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch:{ Exception -> 0x010f }
                lv1.l r0 = r0.f292134n     // Catch:{ Exception -> 0x010f }
                java.util.List<lv1.n> r0 = r0.f32076e     // Catch:{ Exception -> 0x010f }
                int r0 = r0.size()     // Catch:{ Exception -> 0x010f }
                goto L_0x00c7
            L_0x00b4:
                java.lang.String r0 = "[%s] Done, %dms"
                java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x010f }
                r11[r8] = r10     // Catch:{ Exception -> 0x010f }
                long r12 = r9.f292080f     // Catch:{ Exception -> 0x010f }
                java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x010f }
                r11[r7] = r12     // Catch:{ Exception -> 0x010f }
                java.lang.String r11 = java.lang.String.format(r0, r11)     // Catch:{ Exception -> 0x010f }
                r0 = 0
            L_0x00c7:
                int r12 = r9.mo128768e()     // Catch:{ Exception -> 0x010f }
                long r13 = r9.f292080f     // Catch:{ Exception -> 0x010f }
                long r3 = (long) r0     // Catch:{ Exception -> 0x010f }
                kv1.C99252h.m129303h(r12, r13, r3)     // Catch:{ Exception -> 0x010f }
                java.lang.String r0 = r9.mo139039f()     // Catch:{ Exception -> 0x010f }
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x010f }
                java.lang.String r4 = " "
                if (r3 != 0) goto L_0x00ef
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010f }
                r3.<init>()     // Catch:{ Exception -> 0x010f }
                r3.append(r11)     // Catch:{ Exception -> 0x010f }
                r3.append(r4)     // Catch:{ Exception -> 0x010f }
                r3.append(r0)     // Catch:{ Exception -> 0x010f }
                java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x010f }
            L_0x00ef:
                java.lang.String r0 = r9.mo94944c()     // Catch:{ Exception -> 0x010f }
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x010f }
                if (r3 != 0) goto L_0x010b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010f }
                r3.<init>()     // Catch:{ Exception -> 0x010f }
                r3.append(r11)     // Catch:{ Exception -> 0x010f }
                r3.append(r4)     // Catch:{ Exception -> 0x010f }
                r3.append(r0)     // Catch:{ Exception -> 0x010f }
                java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x010f }
            L_0x010b:
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)     // Catch:{ Exception -> 0x010f }
                goto L_0x011c
            L_0x010f:
                r0 = move-exception
                goto L_0x011a
            L_0x0111:
                r0 = move-exception
                r10 = r6
                goto L_0x011a
            L_0x0114:
                r0 = move-exception
                goto L_0x020d
            L_0x0117:
                r0 = move-exception
                r9 = r6
                r10 = r9
            L_0x011a:
                if (r9 != 0) goto L_0x0123
            L_0x011c:
                com.tencent.p014mm.plugin.fts.C93824b.m118491a()
                r1.f270829h = r6
                goto L_0x0009
            L_0x0123:
                boolean r3 = r0 instanceof java.lang.InterruptedException     // Catch:{ all -> 0x0114 }
                if (r3 == 0) goto L_0x014f
                boolean r0 = r9.mo128769g()     // Catch:{ all -> 0x0114 }
                if (r0 != 0) goto L_0x0132
                java.util.concurrent.PriorityBlockingQueue<lv1.b> r0 = r1.f270827f     // Catch:{ all -> 0x0114 }
                r0.put(r9)     // Catch:{ all -> 0x0114 }
            L_0x0132:
                java.lang.String r0 = "[%s][cancelled:%b] interruputed! %dms"
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0114 }
                r3[r8] = r10     // Catch:{ all -> 0x0114 }
                boolean r4 = r9.mo128769g()     // Catch:{ all -> 0x0114 }
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0114 }
                r3[r7] = r4     // Catch:{ all -> 0x0114 }
                long r4 = r9.f292080f     // Catch:{ all -> 0x0114 }
                java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0114 }
                r5 = 2
                r3[r5] = r4     // Catch:{ all -> 0x0114 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r3)     // Catch:{ all -> 0x0114 }
                goto L_0x011c
            L_0x014f:
                boolean r3 = r0 instanceof com.tencent.p014mm.plugin.fts.C93835h     // Catch:{ all -> 0x0114 }
                if (r3 == 0) goto L_0x015a
                java.lang.String r0 = "stop task and do nothing"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x0114 }
                goto L_0x011c
            L_0x015a:
                boolean r3 = r0 instanceof com.tencent.wcdb.database.SQLiteDatabaseCorruptException     // Catch:{ all -> 0x0114 }
                if (r3 == 0) goto L_0x018d
                java.lang.String r3 = "[%s] failed with exception. \n"
                java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ all -> 0x0114 }
                r4[r8] = r10     // Catch:{ all -> 0x0114 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)     // Catch:{ all -> 0x0114 }
                boolean r3 = r1.f270832n     // Catch:{ all -> 0x0114 }
                if (r3 != 0) goto L_0x011c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
                r3.<init>()     // Catch:{ all -> 0x0114 }
                r3.append(r9)     // Catch:{ all -> 0x0114 }
                java.lang.String r4 = ": "
                r3.append(r4)     // Catch:{ all -> 0x0114 }
                java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0114 }
                r3.append(r0)     // Catch:{ all -> 0x0114 }
                java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0114 }
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0114 }
                java.lang.String r4 = "FTS"
                r3.mo160135k(r4, r0, r6)     // Catch:{ all -> 0x0114 }
                r1.f270832n = r7     // Catch:{ all -> 0x0114 }
                goto L_0x011c
            L_0x018d:
                boolean r3 = r0 instanceof lv1.C99683p     // Catch:{ all -> 0x0114 }
                java.lang.String r4 = "[%s] failed with exception.\n"
                if (r3 == 0) goto L_0x01a0
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0114 }
                r3[r8] = r10     // Catch:{ all -> 0x0114 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)     // Catch:{ all -> 0x0114 }
                r0 = 6
                kv1.C99252h.m129300e(r0)     // Catch:{ all -> 0x0114 }
                goto L_0x011c
            L_0x01a0:
                boolean r3 = r0 instanceof com.tencent.wcdb.database.SQLiteDiskIOException     // Catch:{ all -> 0x0114 }
                if (r3 == 0) goto L_0x01b1
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0114 }
                r3[r8] = r10     // Catch:{ all -> 0x0114 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)     // Catch:{ all -> 0x0114 }
                r0 = 7
                kv1.C99252h.m129300e(r0)     // Catch:{ all -> 0x0114 }
                goto L_0x011c
            L_0x01b1:
                boolean r3 = r0 instanceof java.lang.NullPointerException     // Catch:{ all -> 0x0114 }
                if (r3 == 0) goto L_0x01c8
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0114 }
                r3[r8] = r10     // Catch:{ all -> 0x0114 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)     // Catch:{ all -> 0x0114 }
                kv1.C99252h.m129300e(r5)     // Catch:{ all -> 0x0114 }
                java.lang.Runnable r0 = r1.f270831j     // Catch:{ all -> 0x0114 }
                if (r0 == 0) goto L_0x011c
                r0.run()     // Catch:{ all -> 0x0114 }
                goto L_0x011c
            L_0x01c8:
                boolean r3 = r0 instanceof com.tencent.wcdb.database.SQLiteException     // Catch:{ all -> 0x0114 }
                if (r3 == 0) goto L_0x01f9
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0114 }
                r3[r8] = r10     // Catch:{ all -> 0x0114 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)     // Catch:{ all -> 0x0114 }
                java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0114 }
                if (r3 == 0) goto L_0x01ec
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0114 }
                java.lang.String r3 = "the connection is read-only"
                boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x0114 }
                if (r0 == 0) goto L_0x01ec
                r0 = 17
                kv1.C99252h.m129300e(r0)     // Catch:{ all -> 0x0114 }
                goto L_0x01f0
            L_0x01ec:
                r3 = 4
                kv1.C99252h.m129300e(r3)     // Catch:{ all -> 0x0114 }
            L_0x01f0:
                java.lang.Runnable r0 = r1.f270831j     // Catch:{ all -> 0x0114 }
                if (r0 == 0) goto L_0x011c
                r0.run()     // Catch:{ all -> 0x0114 }
                goto L_0x011c
            L_0x01f9:
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0114 }
                r3[r8] = r10     // Catch:{ all -> 0x0114 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)     // Catch:{ all -> 0x0114 }
                r0 = 5
                kv1.C99252h.m129300e(r0)     // Catch:{ all -> 0x0114 }
                java.lang.Runnable r0 = r1.f270831j     // Catch:{ all -> 0x0114 }
                if (r0 == 0) goto L_0x011c
                r0.run()     // Catch:{ all -> 0x0114 }
                goto L_0x011c
            L_0x020d:
                com.tencent.p014mm.plugin.fts.C93824b.m118491a()
                r1.f270829h = r6
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.C93836i.C93837a.run():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo128801a(lv1.C99664b r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.tencent.mm.plugin.fts.i$a r0 = r2.f270824a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0.getClass()     // Catch:{ all -> 0x001b }
            r1 = 1
            r3.f292079e = r1     // Catch:{ all -> 0x001b }
            java.util.concurrent.PriorityBlockingQueue<lv1.b> r1 = r0.f270827f     // Catch:{ all -> 0x001b }
            r1.remove(r3)     // Catch:{ all -> 0x001b }
            lv1.b r1 = r0.f270829h     // Catch:{ all -> 0x001b }
            if (r1 != r3) goto L_0x0019
            r0.interrupt()     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r2)
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.C93836i.mo128801a(lv1.b):void");
    }

    /* renamed from: b */
    public synchronized void mo128802b() {
        C93837a aVar = this.f270824a;
        if (aVar == null || !aVar.isAlive()) {
            this.f270824a = new C93837a(this);
            Log.m105924i("MicroMsg.FTS.FTSTaskDaemon", "***** Search daemon initialized, waiting for starting.");
            return;
        }
        Log.printErrStackTrace("MicroMsg.FTS.FTSTaskDaemon", new Throwable(), "Duplicated daemon initialization detected, working queue maybe dirty!", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        return r4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized lv1.C99664b mo128803c(int r3, lv1.C99664b r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.tencent.mm.plugin.fts.i$a r0 = r2.f270824a     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x0008
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x0008:
            r4.f292078d = r3     // Catch:{ all -> 0x002c }
            boolean r3 = r0.f270828g     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x000f
            goto L_0x002a
        L_0x000f:
            int r3 = r4.mo128767d()     // Catch:{ all -> 0x002c }
            java.util.concurrent.PriorityBlockingQueue<lv1.b> r1 = r0.f270827f     // Catch:{ all -> 0x002c }
            r1.put(r4)     // Catch:{ all -> 0x002c }
            lv1.b r1 = r0.f270829h     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0020
            r0.mo128806b(r3)     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x0020:
            int r1 = r0.f270826e     // Catch:{ all -> 0x002c }
            if (r3 >= r1) goto L_0x002a
            r0.interrupt()     // Catch:{ all -> 0x002c }
            r0.mo128806b(r3)     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r2)
            return r4
        L_0x002c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.C93836i.mo128803c(int, lv1.b):lv1.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo128804d() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.tencent.mm.plugin.fts.i$a r0 = r2.f270824a     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x000c
            goto L_0x0025
        L_0x000c:
            com.tencent.mm.plugin.fts.i$a r0 = r2.f270824a     // Catch:{ all -> 0x0027 }
            monitor-enter(r0)     // Catch:{ all -> 0x0027 }
            r1 = 1
            r0.f270828g = r1     // Catch:{ all -> 0x0022 }
            r0.interrupt()     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r0 = 0
            r2.f270824a = r0     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "MicroMsg.FTS.FTSTaskDaemon"
            java.lang.String r1 = "***** Search daemon quited."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.C93836i.mo128804d():void");
    }
}
