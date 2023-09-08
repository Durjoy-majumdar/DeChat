package a14;

import a14.C53910k1;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.tav.coremedia.TimeUtil;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import wx3.C66212f;

/* renamed from: a14.s0 */
public final class C53946s0 extends C53910k1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: n */
    public static final C53946s0 f151194n;

    /* renamed from: o */
    public static final long f151195o;

    static {
        Long l;
        C53946s0 s0Var = new C53946s0();
        f151194n = s0Var;
        s0Var.mo74571k0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f151195o = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: F0 */
    public final synchronized void mo74629F0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            mo74576C0();
            notifyAll();
        }
    }

    /* renamed from: Q */
    public C53883f1 mo74579Q(long j, Runnable runnable, C66212f fVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? MAlarmHandler.NEXT_FIRE_INTERVAL : TimeUtil.SECOND_TO_US * j;
        }
        if (j2 >= 4611686018427387903L) {
            return C53925m2.f151179d;
        }
        long nanoTime = System.nanoTime();
        C53910k1.C53912b bVar = new C53910k1.C53912b(j2 + nanoTime, runnable);
        mo74577E0(nanoTime, bVar);
        return bVar;
    }

    /* renamed from: q0 */
    public Thread mo74560q0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0096, code lost:
        _thread = null;
        mo74629F0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009f, code lost:
        if (mo74582z0() == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a1, code lost:
        mo74560q0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal<a14.j1> r0 = a14.C53968x2.f151212b
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch:{ all -> 0x0091 }
            int r0 = debugStatus     // Catch:{ all -> 0x0093 }
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r0 == r4) goto L_0x0016
            if (r0 != r3) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            r0 = 0
            goto L_0x0023
        L_0x001c:
            debugStatus = r6     // Catch:{ all -> 0x0093 }
            r17.notifyAll()     // Catch:{ all -> 0x0093 }
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            r0 = 1
        L_0x0023:
            if (r0 != 0) goto L_0x0034
            _thread = r2
            r17.mo74629F0()
            boolean r0 = r17.mo74582z0()
            if (r0 != 0) goto L_0x0033
            r17.mo74560q0()
        L_0x0033:
            return
        L_0x0034:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L_0x003a:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0091 }
            long r11 = r17.mo74573n0()     // Catch:{ all -> 0x0091 }
            r13 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            long r15 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0091 }
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            long r9 = f151195o     // Catch:{ all -> 0x0091 }
            long r9 = r9 + r15
        L_0x0052:
            long r15 = r9 - r15
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0067
            _thread = r2
            r17.mo74629F0()
            boolean r0 = r17.mo74582z0()
            if (r0 != 0) goto L_0x0066
            r17.mo74560q0()
        L_0x0066:
            return
        L_0x0067:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            r11 = r15
            goto L_0x006e
        L_0x006d:
            r9 = r7
        L_0x006e:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            int r0 = debugStatus     // Catch:{ all -> 0x0091 }
            if (r0 == r4) goto L_0x007b
            if (r0 != r3) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r0 = 0
            goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            if (r0 == 0) goto L_0x008d
            _thread = r2
            r17.mo74629F0()
            boolean r0 = r17.mo74582z0()
            if (r0 != 0) goto L_0x008c
            r17.mo74560q0()
        L_0x008c:
            return
        L_0x008d:
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r11)     // Catch:{ all -> 0x0091 }
            goto L_0x003a
        L_0x0091:
            r0 = move-exception
            goto L_0x0096
        L_0x0093:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0096:
            _thread = r2
            r17.mo74629F0()
            boolean r2 = r17.mo74582z0()
            if (r2 != 0) goto L_0x00a4
            r17.mo74560q0()
        L_0x00a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53946s0.run():void");
    }

    /* renamed from: s0 */
    public void mo74601s0(long j, C53910k1.C53913c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* renamed from: x0 */
    public void mo74580x0(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.mo74580x0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
