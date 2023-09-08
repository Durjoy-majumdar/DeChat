package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class zzgg extends zzhh {
    /* access modifiers changed from: private */
    public static final AtomicLong zzalx = new AtomicLong(Long.MIN_VALUE);
    private ExecutorService zzaln;
    /* access modifiers changed from: private */
    public zzgk zzalo;
    /* access modifiers changed from: private */
    public zzgk zzalp;
    private final PriorityBlockingQueue<zzgj<?>> zzalq = new PriorityBlockingQueue<>();
    private final BlockingQueue<zzgj<?>> zzalr = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler zzals = new zzgi(this, "Thread death: Uncaught exception on worker thread");
    private final Thread.UncaughtExceptionHandler zzalt = new zzgi(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */
    public final Object zzalu = new Object();
    /* access modifiers changed from: private */
    public final Semaphore zzalv = new Semaphore(2);
    /* access modifiers changed from: private */
    public volatile boolean zzalw;

    public zzgg(zzgl zzgl) {
        super(zzgl);
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private final void zza(zzgj<?> zzgj) {
        synchronized (this.zzalu) {
            this.zzalq.add(zzgj);
            zzgk zzgk = this.zzalo;
            if (zzgk == null) {
                zzgk zzgk2 = new zzgk(this, "Measurement Worker", this.zzalq);
                this.zzalo = zzgk2;
                zzgk2.setUncaughtExceptionHandler(this.zzals);
                this.zzalo.start();
            } else {
                zzgk.zzjn();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|(1:19)(1:20)|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = zzge().zzip();
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r4.length() == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r3 = "Timed out waiting for ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r3 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r2.log(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = zzge().zzip();
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r4.length() != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r3 = "Interrupted waiting for ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r3 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r2.log(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r1 = r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T zza(java.util.concurrent.atomic.AtomicReference<T> r1, long r2, java.lang.String r4, java.lang.Runnable r5) {
        /*
            r0 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzgg r2 = r0.zzgd()     // Catch:{ all -> 0x005c }
            r2.zzc((java.lang.Runnable) r5)     // Catch:{ all -> 0x005c }
            r2 = 15000(0x3a98, double:7.411E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0037 }
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L_0x0036
            com.google.android.gms.internal.measurement.zzfg r2 = r0.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            java.lang.String r3 = "Timed out waiting for "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x002d
            java.lang.String r3 = r3.concat(r4)
            goto L_0x0033
        L_0x002d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x0033:
            r2.log(r3)
        L_0x0036:
            return r1
        L_0x0037:
            com.google.android.gms.internal.measurement.zzfg r2 = r0.zzge()     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "Interrupted waiting for "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005c }
            int r5 = r4.length()     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0050
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x005c }
            goto L_0x0056
        L_0x0050:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x005c }
            r4.<init>(r3)     // Catch:{ all -> 0x005c }
            r3 = r4
        L_0x0056:
            r2.log(r3)     // Catch:{ all -> 0x005c }
            r2 = 0
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            return r2
        L_0x005c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgg.zza(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final void zzab() {
        if (Thread.currentThread() != this.zzalo) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final <V> Future<V> zzb(Callable<V> callable) {
        zzch();
        Preconditions.checkNotNull(callable);
        zzgj zzgj = new zzgj(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzalo) {
            if (!this.zzalq.isEmpty()) {
                zzge().zzip().log("Callable skipped the worker queue.");
            }
            zzgj.run();
        } else {
            zza((zzgj<?>) zzgj);
        }
        return zzgj;
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    public final <V> Future<V> zzc(Callable<V> callable) {
        zzch();
        Preconditions.checkNotNull(callable);
        zzgj zzgj = new zzgj(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzalo) {
            zzgj.run();
        } else {
            zza((zzgj<?>) zzgj);
        }
        return zzgj;
    }

    public final void zzc(Runnable runnable) {
        zzch();
        Preconditions.checkNotNull(runnable);
        zza((zzgj<?>) new zzgj(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzd(Runnable runnable) {
        zzch();
        Preconditions.checkNotNull(runnable);
        zzgj zzgj = new zzgj(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzalu) {
            this.zzalr.add(zzgj);
            zzgk zzgk = this.zzalp;
            if (zzgk == null) {
                zzgk zzgk2 = new zzgk(this, "Measurement Network", this.zzalr);
                this.zzalp = zzgk2;
                zzgk2.setUncaughtExceptionHandler(this.zzalt);
                this.zzalp.start();
            } else {
                zzgk.zzjn();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    public final void zzfs() {
        if (Thread.currentThread() != this.zzalp) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final /* bridge */ /* synthetic */ zzdu zzft() {
        return super.zzft();
    }

    public final /* bridge */ /* synthetic */ zzhk zzfu() {
        return super.zzfu();
    }

    public final /* bridge */ /* synthetic */ zzfb zzfv() {
        return super.zzfv();
    }

    public final /* bridge */ /* synthetic */ zzeo zzfw() {
        return super.zzfw();
    }

    public final /* bridge */ /* synthetic */ zzii zzfx() {
        return super.zzfx();
    }

    public final /* bridge */ /* synthetic */ zzif zzfy() {
        return super.zzfy();
    }

    public final /* bridge */ /* synthetic */ zzfc zzfz() {
        return super.zzfz();
    }

    public final /* bridge */ /* synthetic */ zzfe zzga() {
        return super.zzga();
    }

    public final /* bridge */ /* synthetic */ zzka zzgb() {
        return super.zzgb();
    }

    public final /* bridge */ /* synthetic */ zzjh zzgc() {
        return super.zzgc();
    }

    public final /* bridge */ /* synthetic */ zzgg zzgd() {
        return super.zzgd();
    }

    public final /* bridge */ /* synthetic */ zzfg zzge() {
        return super.zzge();
    }

    public final /* bridge */ /* synthetic */ zzfr zzgf() {
        return super.zzgf();
    }

    public final /* bridge */ /* synthetic */ zzef zzgg() {
        return super.zzgg();
    }

    public final boolean zzhf() {
        return false;
    }

    public final boolean zzjk() {
        return Thread.currentThread() == this.zzalo;
    }

    public final ExecutorService zzjl() {
        ExecutorService executorService;
        synchronized (this.zzalu) {
            if (this.zzaln == null) {
                this.zzaln = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.zzaln;
        }
        return executorService;
    }
}
