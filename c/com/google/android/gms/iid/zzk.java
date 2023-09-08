package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
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

public final class zzk implements ServiceConnection {
    private final Intent zzbl;
    private final ScheduledExecutorService zzbm;
    private final Queue<zzg> zzbn;
    private zzi zzbo;
    private boolean zzbp;
    private final Context zzk;

    public zzk(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0));
    }

    private zzk(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zzbn = new ArrayDeque();
        this.zzbp = false;
        Context applicationContext = context.getApplicationContext();
        this.zzk = applicationContext;
        this.zzbl = new Intent(str).setPackage(applicationContext.getPackageName());
        this.zzbm = scheduledExecutorService;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:25|23|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0057 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[LOOP:1: B:22:0x0057->B:25:0x005f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzl() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x006f }
        L_0x0008:
            java.util.Queue<com.google.android.gms.iid.zzg> r0 = r4.zzbn     // Catch:{ all -> 0x006f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x006f }
            com.google.android.gms.iid.zzi r0 = r4.zzbo     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x006f }
            java.util.Queue<com.google.android.gms.iid.zzg> r0 = r4.zzbn     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x006f }
            com.google.android.gms.iid.zzg r0 = (com.google.android.gms.iid.zzg) r0     // Catch:{ all -> 0x006f }
            com.google.android.gms.iid.zzi r2 = r4.zzbo     // Catch:{ all -> 0x006f }
            r2.zzd((com.google.android.gms.iid.zzg) r0)     // Catch:{ all -> 0x006f }
            goto L_0x0008
        L_0x0034:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x003e
            boolean r0 = r4.zzbp     // Catch:{ all -> 0x006f }
        L_0x003e:
            boolean r0 = r4.zzbp     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x006b
            r0 = 1
            r4.zzbp = r0     // Catch:{ all -> 0x006f }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ SecurityException -> 0x0057 }
            android.content.Context r1 = r4.zzk     // Catch:{ SecurityException -> 0x0057 }
            android.content.Intent r2 = r4.zzbl     // Catch:{ SecurityException -> 0x0057 }
            r3 = 65
            boolean r0 = r0.bindService(r1, r2, r4, r3)     // Catch:{ SecurityException -> 0x0057 }
            if (r0 == 0) goto L_0x0057
            monitor-exit(r4)
            return
        L_0x0057:
            java.util.Queue<com.google.android.gms.iid.zzg> r0 = r4.zzbn     // Catch:{ all -> 0x006f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x006b
            java.util.Queue<com.google.android.gms.iid.zzg> r0 = r4.zzbn     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x006f }
            com.google.android.gms.iid.zzg r0 = (com.google.android.gms.iid.zzg) r0     // Catch:{ all -> 0x006f }
            r0.finish()     // Catch:{ all -> 0x006f }
            goto L_0x0057
        L_0x006b:
            monitor-exit(r4)
            return
        L_0x006d:
            monitor-exit(r4)
            return
        L_0x006f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzk.zzl():void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.zzbp = false;
            this.zzbo = (zzi) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                new StringBuilder(String.valueOf(componentName).length() + 20);
            }
            zzl();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            new StringBuilder(String.valueOf(componentName).length() + 23);
        }
        zzl();
    }

    public final synchronized void zzd(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        boolean isLoggable = Log.isLoggable("EnhancedIntentService", 3);
        this.zzbn.add(new zzg(intent, pendingResult, this.zzbm));
        zzl();
    }
}
