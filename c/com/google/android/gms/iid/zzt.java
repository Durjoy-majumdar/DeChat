package com.google.android.gms.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Queue;

final class zzt implements ServiceConnection {
    public int state;
    public final Messenger zzcc;
    public zzy zzcd;
    public final Queue<zzz<?>> zzce;
    public final SparseArray<zzz<?>> zzcf;
    public final /* synthetic */ zzr zzcg;

    private zzt(zzr zzr) {
        this.zzcg = zzr;
        this.state = 0;
        this.zzcc = new Messenger(new Handler(Looper.getMainLooper(), new zzu(this)));
        this.zzce = new ArrayDeque();
        this.zzcf = new SparseArray<>();
    }

    private final void zzr() {
        this.zzcg.zzbz.execute(new zzw(this));
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            zzd(0, "Null service connection");
            return;
        }
        try {
            this.zzcd = new zzy(iBinder);
            this.state = 2;
            zzr();
        } catch (RemoteException e) {
            zzd(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
        zzd(2, "Service disconnected");
    }

    public final synchronized void zzd(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i2 = this.state;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.state = 4;
            ConnectionTracker.getInstance().unbindService(this.zzcg.zzk, this);
            zzaa zzaa = new zzaa(i, str);
            for (zzz<?> zzd : this.zzce) {
                zzd.zzd(zzaa);
            }
            this.zzce.clear();
            for (int i3 = 0; i3 < this.zzcf.size(); i3++) {
                this.zzcf.valueAt(i3).zzd(zzaa);
            }
            this.zzcf.clear();
        } else if (i2 == 3) {
            this.state = 4;
        } else if (i2 != 4) {
            int i4 = this.state;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r1.zzd(new com.google.android.gms.iid.zzaa(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r1.zzh(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r5 = r5.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzd(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)
            monitor-enter(r4)
            android.util.SparseArray<com.google.android.gms.iid.zzz<?>> r1 = r4.zzcf     // Catch:{ all -> 0x003c }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x003c }
            com.google.android.gms.iid.zzz r1 = (com.google.android.gms.iid.zzz) r1     // Catch:{ all -> 0x003c }
            r2 = 1
            if (r1 != 0) goto L_0x0016
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x0016:
            android.util.SparseArray<com.google.android.gms.iid.zzz<?>> r3 = r4.zzcf     // Catch:{ all -> 0x003c }
            r3.remove(r0)     // Catch:{ all -> 0x003c }
            r4.zzs()     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r3 = 0
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0038
            com.google.android.gms.iid.zzaa r5 = new com.google.android.gms.iid.zzaa
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.zzd(r5)
            goto L_0x003b
        L_0x0038:
            r1.zzh(r5)
        L_0x003b:
            return r2
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzt.zzd(android.os.Message):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zze(com.google.android.gms.iid.zzz r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.state     // Catch:{ all -> 0x008e }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008e }
            int r0 = r5.state     // Catch:{ all -> 0x008e }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r2.<init>(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x008e }
            r2.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x008e }
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            throw r6     // Catch:{ all -> 0x008e }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<com.google.android.gms.iid.zzz<?>> r0 = r5.zzce     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            r5.zzr()     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<com.google.android.gms.iid.zzz<?>> r0 = r5.zzce     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<com.google.android.gms.iid.zzz<?>> r0 = r5.zzce     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            int r6 = r5.state     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            com.google.android.gms.common.internal.Preconditions.checkState(r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x008e }
            r5.state = r3     // Catch:{ all -> 0x008e }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x008e }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ all -> 0x008e }
            com.google.android.gms.iid.zzr r1 = r5.zzcg     // Catch:{ all -> 0x008e }
            android.content.Context r1 = r1.zzk     // Catch:{ all -> 0x008e }
            boolean r6 = r0.bindService(r1, r6, r5, r3)     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x007a
            java.lang.String r6 = "Unable to bind to service"
            r5.zzd(r2, r6)     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x007a:
            com.google.android.gms.iid.zzr r6 = r5.zzcg     // Catch:{ all -> 0x008e }
            java.util.concurrent.ScheduledExecutorService r6 = r6.zzbz     // Catch:{ all -> 0x008e }
            com.google.android.gms.iid.zzv r0 = new com.google.android.gms.iid.zzv     // Catch:{ all -> 0x008e }
            r0.<init>(r5)     // Catch:{ all -> 0x008e }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008e }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r5)
            return r3
        L_0x008e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzt.zze(com.google.android.gms.iid.zzz):boolean");
    }

    public final synchronized void zzg(int i) {
        zzz zzz = this.zzcf.get(i);
        if (zzz != null) {
            this.zzcf.remove(i);
            zzz.zzd(new zzaa(3, "Timed out waiting for response"));
            zzs();
        }
    }

    public final synchronized void zzs() {
        if (this.state == 2 && this.zzce.isEmpty() && this.zzcf.size() == 0) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.state = 3;
            ConnectionTracker.getInstance().unbindService(this.zzcg.zzk, this);
        }
    }

    public final synchronized void zzt() {
        if (this.state == 1) {
            zzd(1, "Timed out while binding");
        }
    }
}
