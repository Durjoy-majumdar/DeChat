package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

public final class zziw implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzii zzape;
    /* access modifiers changed from: private */
    public volatile boolean zzapk;
    private volatile zzff zzapl;

    public zziw(zzii zzii) {
        this.zzape = zzii;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnected(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onConnected"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r4)
            monitor-enter(r3)
            r4 = 0
            com.google.android.gms.internal.measurement.zzff r0 = r3.zzapl     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            android.os.IInterface r0 = r0.getService()     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            com.google.android.gms.internal.measurement.zzey r0 = (com.google.android.gms.internal.measurement.zzey) r0     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            r3.zzapl = r4     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            com.google.android.gms.internal.measurement.zzii r1 = r3.zzape     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            com.google.android.gms.internal.measurement.zzgg r1 = r1.zzgd()     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            com.google.android.gms.internal.measurement.zziz r2 = new com.google.android.gms.internal.measurement.zziz     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            r2.<init>(r3, r0)     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            r1.zzc((java.lang.Runnable) r2)     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            goto L_0x0027
        L_0x0020:
            r4 = move-exception
            goto L_0x0029
        L_0x0022:
            r3.zzapl = r4     // Catch:{ all -> 0x0020 }
            r4 = 0
            r3.zzapk = r4     // Catch:{ all -> 0x0020 }
        L_0x0027:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            return
        L_0x0029:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziw.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzfg zzjo = this.zzape.zzacw.zzjo();
        if (zzjo != null) {
            zzjo.zzip().zzg("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzapk = false;
            this.zzapl = null;
        }
        this.zzape.zzgd().zzc((Runnable) new zzjb(this));
    }

    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zzape.zzge().zzis().log("Service connection suspended");
        this.zzape.zzgd().zzc((Runnable) new zzja(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.zzape.zzge().zzim().log("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.zzapk = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.zzii r4 = r3.zzape     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.zzfg r4 = r4.zzge()     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzim()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.log(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0096
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x004f
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x005f }
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzey     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.internal.measurement.zzey r1 = (com.google.android.gms.internal.measurement.zzey) r1     // Catch:{ RemoteException -> 0x005f }
            goto L_0x003e
        L_0x0039:
            com.google.android.gms.internal.measurement.zzfa r1 = new com.google.android.gms.internal.measurement.zzfa     // Catch:{ RemoteException -> 0x005f }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x005f }
        L_0x003e:
            r0 = r1
            com.google.android.gms.internal.measurement.zzii r5 = r3.zzape     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.internal.measurement.zzfg r5 = r5.zzge()     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzit()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.log(r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x004f:
            com.google.android.gms.internal.measurement.zzii r5 = r3.zzape     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.internal.measurement.zzfg r5 = r5.zzge()     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.zzg(r2, r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x005f:
            com.google.android.gms.internal.measurement.zzii r5 = r3.zzape     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.zzfg r5 = r5.zzge()     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.log(r1)     // Catch:{ all -> 0x001c }
        L_0x006e:
            if (r0 != 0) goto L_0x0086
            r3.zzapk = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.ConnectionTracker r4 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.android.gms.internal.measurement.zzii r5 = r3.zzape     // Catch:{ IllegalArgumentException -> 0x0094 }
            android.content.Context r5 = r5.getContext()     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.android.gms.internal.measurement.zzii r0 = r3.zzape     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.android.gms.internal.measurement.zziw r0 = r0.zzaox     // Catch:{ IllegalArgumentException -> 0x0094 }
            r4.unbindService(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x0094
        L_0x0086:
            com.google.android.gms.internal.measurement.zzii r4 = r3.zzape     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.zzgg r4 = r4.zzgd()     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.zzix r5 = new com.google.android.gms.internal.measurement.zzix     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.zzc((java.lang.Runnable) r5)     // Catch:{ all -> 0x001c }
        L_0x0094:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0096:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziw.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zzape.zzge().zzis().log("Service disconnected");
        this.zzape.zzgd().zzc((Runnable) new zziy(this, componentName));
    }

    public final void zzc(Intent intent) {
        this.zzape.zzab();
        Context context = this.zzape.getContext();
        ConnectionTracker instance = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzapk) {
                this.zzape.zzge().zzit().log("Connection attempt already in progress");
                return;
            }
            this.zzape.zzge().zzit().log("Using local app measurement service");
            this.zzapk = true;
            instance.bindService(context, intent, this.zzape.zzaox, 129);
        }
    }

    public final void zzkh() {
        this.zzape.zzab();
        Context context = this.zzape.getContext();
        synchronized (this) {
            if (this.zzapk) {
                this.zzape.zzge().zzit().log("Connection attempt already in progress");
            } else if (this.zzapl != null) {
                this.zzape.zzge().zzit().log("Already awaiting connection attempt");
            } else {
                this.zzapl = new zzff(context, Looper.getMainLooper(), this, this);
                this.zzape.zzge().zzit().log("Connecting to remote service");
                this.zzapk = true;
                this.zzapl.checkAvailabilityAndConnect();
            }
        }
    }
}
