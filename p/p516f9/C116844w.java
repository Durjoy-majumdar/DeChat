package p516f9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: f9.w */
public final class C116844w implements ServiceConnection {

    /* renamed from: d */
    public final Context f350225d;

    /* renamed from: e */
    public final Intent f350226e;

    /* renamed from: f */
    public final ScheduledExecutorService f350227f;

    /* renamed from: g */
    public final Queue<C116840s> f350228g = new ArrayDeque();

    /* renamed from: h */
    public C116842u f350229h;

    /* renamed from: i */
    public boolean f350230i = false;

    public C116844w(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0);
        Context applicationContext = context.getApplicationContext();
        this.f350225d = applicationContext;
        this.f350226e = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f350227f = scheduledThreadPoolExecutor;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:25|23|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005b */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065 A[LOOP:1: B:22:0x005b->B:25:0x0065, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo180840a() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0077 }
        L_0x0008:
            java.util.Queue<f9.s> r0 = r4.f350228g     // Catch:{ all -> 0x0077 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0077 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0077 }
            f9.u r0 = r4.f350229h     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0077 }
            java.util.Queue<f9.s> r0 = r4.f350228g     // Catch:{ all -> 0x0077 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0077 }
            f9.s r0 = (p516f9.C116840s) r0     // Catch:{ all -> 0x0077 }
            f9.u r2 = r4.f350229h     // Catch:{ all -> 0x0077 }
            r2.mo180838a(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x0008
        L_0x0038:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0042
            boolean r0 = r4.f350230i     // Catch:{ all -> 0x0077 }
        L_0x0042:
            boolean r0 = r4.f350230i     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0073
            r0 = 1
            r4.f350230i = r0     // Catch:{ all -> 0x0077 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ SecurityException -> 0x005b }
            android.content.Context r1 = r4.f350225d     // Catch:{ SecurityException -> 0x005b }
            android.content.Intent r2 = r4.f350226e     // Catch:{ SecurityException -> 0x005b }
            r3 = 65
            boolean r0 = r0.bindService(r1, r2, r4, r3)     // Catch:{ SecurityException -> 0x005b }
            if (r0 == 0) goto L_0x005b
            monitor-exit(r4)
            return
        L_0x005b:
            java.util.Queue<f9.s> r0 = r4.f350228g     // Catch:{ all -> 0x0077 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0077 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0073
            java.util.Queue<f9.s> r0 = r4.f350228g     // Catch:{ all -> 0x0077 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0077 }
            f9.s r0 = (p516f9.C116840s) r0     // Catch:{ all -> 0x0077 }
            r0.mo180836a()     // Catch:{ all -> 0x0077 }
            goto L_0x005b
        L_0x0073:
            monitor-exit(r4)
            return
        L_0x0075:
            monitor-exit(r4)
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p516f9.C116844w.mo180840a():void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f350230i = false;
            this.f350229h = (C116842u) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                new StringBuilder(String.valueOf(componentName).length() + 20);
            }
            mo180840a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            new StringBuilder(String.valueOf(componentName).length() + 23);
        }
        mo180840a();
    }
}
