package ov0;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C97625j3;
import f40.C86709a0;
import yu0.C102908a;

/* renamed from: ov0.d */
public class C100546d extends C102908a {

    /* renamed from: e */
    public static C100546d f294591e;

    /* renamed from: f */
    public static int f294592f;

    /* renamed from: b */
    public C100554g f294593b;

    /* renamed from: c */
    public C100544c f294594c;

    /* renamed from: d */
    public C100554g f294595d;

    /* renamed from: ov0.d$a */
    public class C100547a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f294596d;

        /* renamed from: e */
        public final /* synthetic */ C100550c f294597e;

        /* renamed from: f */
        public final /* synthetic */ int f294598f;

        /* renamed from: ov0.d$a$a */
        public class C100548a implements MMHandlerThread.IWaitWorkThread {
            public C100548a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:7:0x00e5, code lost:
                if (r15.startsWith(r19.mo119976n()) != false) goto L_0x00e7;
             */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x00f4  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0115  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean doInBackground() {
                /*
                    r20 = this;
                    ov0.C100546d.m131562d()
                    com.tencent.mm.pointers.PLong r0 = new com.tencent.mm.pointers.PLong
                    r0.<init>()
                    com.tencent.mm.pointers.PLong r1 = new com.tencent.mm.pointers.PLong
                    r1.<init>()
                    com.tencent.mm.pointers.PLong r2 = new com.tencent.mm.pointers.PLong
                    r2.<init>()
                    r3 = r20
                    ov0.d$a r4 = ov0.C100546d.C100547a.this
                    ov0.d r5 = ov0.C100546d.this
                    ov0.d$c r6 = r4.f294597e
                    int r4 = r4.f294598f
                    r5.getClass()
                    eb0.c r7 = eb0.C97625j3.m125812b()
                    r7.getClass()
                    f40.C86709a0.m107528h()
                    f40.o r7 = f40.C86709a0.m107535s()
                    r8 = 0
                    r7.mo121137c(r8)
                    java.lang.String r7 = "MicroMsg.BakOldTempDbModel"
                    java.lang.String r8 = "bakoldInitTempDBimp after close db"
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
                    eb0.c r8 = eb0.C97625j3.m125812b()
                    java.lang.String r8 = r8.mo105899n()
                    long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
                    eb0.c r10 = eb0.C97625j3.m125812b()
                    java.lang.String r10 = r10.mo105900o()
                    long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)
                    long r8 = r8 + r10
                    r2.value = r8
                    eb0.c r10 = eb0.C97625j3.m125812b()
                    java.lang.String r10 = r10.mo105891f()
                    android.os.StatFs r11 = new android.os.StatFs
                    java.lang.String r12 = a70.C112760b.m154195C()
                    r11.<init>(r12)
                    int r12 = r11.getBlockSize()
                    long r12 = (long) r12
                    int r11 = r11.getAvailableBlocks()
                    long r14 = (long) r11
                    long r12 = r12 * r14
                    r0.value = r12
                    java.io.File r11 = p206nj.C88956h.m111060a()
                    com.tencent.mm.vfs.m1 r11 = com.tencent.p014mm.vfs.C86009m1.m106378c(r11)
                    android.os.StatFs r12 = new android.os.StatFs
                    java.lang.String r13 = r11.mo119976n()
                    r12.<init>(r13)
                    int r13 = r12.getBlockCount()
                    long r13 = (long) r13
                    int r15 = r12.getAvailableBlocks()
                    r16 = r4
                    long r3 = (long) r15
                    int r15 = r12.getBlockSize()
                    r17 = r5
                    r18 = r6
                    long r5 = (long) r15
                    int r12 = r12.getAvailableBlocks()
                    r15 = r10
                    r19 = r11
                    long r10 = (long) r12
                    long r5 = r5 * r10
                    r1.value = r5
                    r5 = 3
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    long r10 = r0.value
                    java.lang.Long r6 = java.lang.Long.valueOf(r10)
                    r10 = 0
                    r5[r10] = r6
                    long r11 = r1.value
                    java.lang.Long r6 = java.lang.Long.valueOf(r11)
                    r11 = 1
                    r5[r11] = r6
                    java.lang.Long r6 = java.lang.Long.valueOf(r8)
                    r12 = 2
                    r5[r12] = r6
                    java.lang.String r6 = "MicroMsg.BakUtil"
                    java.lang.String r12 = "checkDataFull, SDAvailSize:%d, DataAvailSize%d, dbSize:%d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r5)
                    r5 = 0
                    int r12 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                    if (r12 > 0) goto L_0x00ce
                    goto L_0x00ef
                L_0x00ce:
                    long r13 = r13 - r3
                    int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                    if (r3 >= 0) goto L_0x00d4
                    goto L_0x00ef
                L_0x00d4:
                    long r3 = r0.value
                    long r12 = r1.value
                    int r14 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                    if (r14 == 0) goto L_0x00e7
                    java.lang.String r3 = r19.mo119976n()
                    r4 = r15
                    boolean r3 = r4.startsWith(r3)
                    if (r3 == 0) goto L_0x00e9
                L_0x00e7:
                    r0.value = r5
                L_0x00e9:
                    long r3 = r1.value
                    int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                    if (r5 <= 0) goto L_0x00f1
                L_0x00ef:
                    r3 = 0
                    goto L_0x00f2
                L_0x00f1:
                    r3 = 1
                L_0x00f2:
                    if (r3 != 0) goto L_0x0115
                    java.lang.Object[] r3 = new java.lang.Object[r11]
                    long r4 = r2.value
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r3[r10] = r4
                    java.lang.String r4 = "bakoldInitTempDBimp data free error, len %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r4, r3)
                    r3 = r18
                    r3.f294604d = r10
                    long r4 = r0.value
                    r3.f294606f = r4
                    long r0 = r1.value
                    r3.f294607g = r0
                    long r0 = r2.value
                    r3.f294605e = r0
                    goto L_0x02b4
                L_0x0115:
                    r3 = r18
                    eb0.c r4 = eb0.C97625j3.m125812b()
                    java.lang.String r4 = r4.mo105899n()
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    eb0.c r6 = eb0.C97625j3.m125812b()
                    java.lang.String r6 = r6.mo105899n()
                    r5.append(r6)
                    java.lang.String r6 = ".tem"
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r5)
                    eb0.c r4 = eb0.C97625j3.m125812b()
                    java.lang.String r4 = r4.mo105900o()
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    eb0.c r8 = eb0.C97625j3.m125812b()
                    java.lang.String r8 = r8.mo105900o()
                    r5.append(r8)
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r5)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    eb0.c r5 = eb0.C97625j3.m125812b()
                    java.lang.String r5 = r5.mo105900o()
                    r4.append(r5)
                    java.lang.String r5 = "-journal"
                    r4.append(r5)
                    java.lang.String r4 = r4.toString()
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    eb0.c r9 = eb0.C97625j3.m125812b()
                    java.lang.String r9 = r9.mo105900o()
                    r8.append(r9)
                    r8.append(r6)
                    r8.append(r5)
                    java.lang.String r5 = r8.toString()
                    com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r5)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    eb0.c r5 = eb0.C97625j3.m125812b()
                    java.lang.String r5 = r5.mo105900o()
                    r4.append(r5)
                    java.lang.String r5 = "-wal"
                    r4.append(r5)
                    java.lang.String r4 = r4.toString()
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    eb0.c r9 = eb0.C97625j3.m125812b()
                    java.lang.String r9 = r9.mo105900o()
                    r8.append(r9)
                    r8.append(r6)
                    r8.append(r5)
                    java.lang.String r5 = r8.toString()
                    com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r5)
                    java.lang.String r4 = "bakoldInitTempDBimp before reset account"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
                    f40.e r4 = f40.C86709a0.m107523b()
                    byte[] r5 = r4.f251752c
                    monitor-enter(r5)
                    r4.mo121123x()     // Catch:{ all -> 0x02b5 }
                    monitor-exit(r5)     // Catch:{ all -> 0x02b5 }
                    f40.e r4 = f40.C86709a0.m107523b()
                    r4.mo121116o()
                    java.lang.String r4 = "bakoldInitTempDBimp before TemAccStg setAccInfo"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
                    r4 = r17
                    ov0.g r5 = r4.f294595d
                    if (r5 != 0) goto L_0x01f2
                    ov0.g r5 = new ov0.g
                    r5.<init>()
                    r4.f294595d = r5
                L_0x01f2:
                    ov0.g r5 = r4.f294595d
                    eb0.c r8 = eb0.C97625j3.m125812b()
                    java.lang.String r8 = r8.mo105891f()
                    eb0.c r9 = eb0.C97625j3.m125812b()
                    int r9 = r9.mo105881G()
                    r5.getClass()
                    r12 = 2
                    java.lang.Object[] r12 = new java.lang.Object[r12]
                    r12[r10] = r8
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                    r12[r11] = r10
                    java.lang.String r10 = "MicroMsg.BakOldTempStorage"
                    java.lang.String r13 = "accPath:%s, accUin:%d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r12)
                    r5.f294625o = r9
                    r5.f294626p = r8
                    java.lang.String r5 = "bakoldInitTempDBimp before TemAccStg initDB"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
                    ov0.g r5 = r4.f294595d
                    if (r5 != 0) goto L_0x022d
                    ov0.g r5 = new ov0.g
                    r5.<init>()
                    r4.f294595d = r5
                L_0x022d:
                    ov0.g r4 = r4.f294595d
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    eb0.c r8 = eb0.C97625j3.m125812b()
                    java.lang.String r8 = r8.mo105899n()
                    r5.append(r8)
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    eb0.c r8 = eb0.C97625j3.m125812b()
                    int r8 = r8.mo105881G()
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    eb0.c r10 = eb0.C97625j3.m125812b()
                    java.lang.String r10 = r10.mo105900o()
                    r9.append(r10)
                    r9.append(r6)
                    java.lang.String r6 = r9.toString()
                    r9 = r16
                    r4.mo140002b(r5, r8, r6, r9)
                    java.lang.String r4 = "bakoldInitTempDBimp after TemAccStg initDB"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
                    com.tencent.mm.autogen.events.BackupResetAccUinEvent r4 = new com.tencent.mm.autogen.events.BackupResetAccUinEvent
                    r4.<init>()
                    r4.publish()
                    r3.f294604d = r11
                    long r4 = r0.value
                    r3.f294606f = r4
                    long r0 = r1.value
                    r3.f294607g = r0
                    long r0 = r2.value
                    r3.f294605e = r0
                    java.lang.String r0 = jv0.C99055a.m129003b()
                    com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r0)
                    java.lang.String r2 = "backupItem/"
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.tencent.p014mm.vfs.C86013q1.m106461v(r1)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r0)
                    java.lang.String r0 = "backupMeida/"
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
                L_0x02b4:
                    return r11
                L_0x02b5:
                    r0 = move-exception
                    monitor-exit(r5)     // Catch:{ all -> 0x02b5 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ov0.C100546d.C100547a.C100548a.doInBackground():boolean");
            }

            public boolean onPostExecute() {
                Log.m105924i("MicroMsg.BakOldTempDbModel", "initTempDB onPostExecute");
                C100547a.this.f294597e.run();
                C100546d.f294592f--;
                return false;
            }

            public String toString() {
                return super.toString() + "|initTempDB";
            }
        }

        public C100547a(long j, C100550c cVar, int i) {
            this.f294596d = j;
            this.f294597e = cVar;
            this.f294598f = i;
        }

        public void run() {
            C86709a0.m107523b().mo121108c();
            Log.m105925i("MicroMsg.BakOldTempDbModel", "initTempDB, initTempDBCount:%d  timediff:%d ", Integer.valueOf(C100546d.f294592f), Long.valueOf(Util.milliSecondsToNow(this.f294596d)));
            C100546d.f294592f++;
            C86709a0.m107525e().postAtFrontOfWorker(new C100548a());
        }
    }

    /* renamed from: ov0.d$b */
    public class C100549b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f294601d;

        /* renamed from: e */
        public final /* synthetic */ int f294602e;

        public C100549b(Runnable runnable, int i) {
            this.f294601d = runnable;
            this.f294602e = i;
        }

        public void run() {
            C100546d.this.mo139992c(this.f294601d, this.f294602e - 1);
        }
    }

    /* renamed from: ov0.d$c */
    public static class C100550c implements Runnable {

        /* renamed from: d */
        public boolean f294604d = true;

        /* renamed from: e */
        public long f294605e = 0;

        /* renamed from: f */
        public long f294606f = 0;

        /* renamed from: g */
        public long f294607g = 0;

        public void run() {
            throw null;
        }
    }

    /* renamed from: d */
    public static void m131562d() {
        C86013q1.m106447h(C97625j3.m125812b().mo105899n() + ".tem");
        C86013q1.m106447h(C97625j3.m125812b().mo105899n() + ".ini" + ".tem");
        StringBuilder sb = new StringBuilder();
        sb.append(C97625j3.m125812b().mo105900o());
        sb.append(".tem");
        C86013q1.m106447h(sb.toString());
        C86013q1.m106447h(C97625j3.m125812b().mo105900o() + ".ini" + ".tem");
    }

    /* renamed from: g */
    public static C100546d m131563g() {
        if (f294591e == null) {
            C100546d dVar = new C100546d();
            f294591e = dVar;
            C102908a.m136012a(dVar);
        }
        return f294591e;
    }

    /* renamed from: b */
    public void mo17656b() {
        f294591e = null;
    }

    /* renamed from: c */
    public void mo139992c(Runnable runnable, int i) {
        if (i < 0 || f294592f == 0) {
            if (i < 0) {
                Log.m105920e("MicroMsg.BakOldTempDbModel", "closeTempDB no left tryCount!!");
            }
            Log.m105924i("MicroMsg.BakOldTempDbModel", "closeDB before");
            if (this.f294595d == null) {
                this.f294595d = new C100554g();
            }
            this.f294595d.mo140001a();
            Log.m105924i("MicroMsg.BakOldTempDbModel", "closeDB after");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        new MMHandler(Looper.getMainLooper()).postDelayed(new C100549b(runnable, i), 500);
    }

    /* renamed from: e */
    public void mo139993e(C100550c cVar, boolean z, int i) {
        long nowMilliSecond = Util.nowMilliSecond();
        Log.m105925i("MicroMsg.BakOldTempDbModel", "initTempDB needSyncPauser:%b %s", Boolean.valueOf(z), Util.getStack());
        MMHandlerThread.postToMainThreadDelayed(new C100547a(nowMilliSecond, cVar, i), 1000);
    }

    /* renamed from: f */
    public C100544c mo139994f() {
        if (this.f294594c == null) {
            this.f294594c = new C100544c();
        }
        return this.f294594c;
    }

    /* renamed from: h */
    public C100554g mo139995h() {
        if (this.f294593b == null) {
            this.f294593b = new C100554g();
        }
        return this.f294593b;
    }
}
