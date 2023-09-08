package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.HashMap;
import java.util.Map;

final class zzer<T> {
    private final Map<T, zzhk<T>> zzeb = new HashMap();

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        new java.lang.StringBuilder((java.lang.String.valueOf(r3.getKey()).length() + 32) + java.lang.String.valueOf(r4).length());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x006a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(android.os.IBinder r8) {
        /*
            r7 = this;
            java.util.Map<T, com.google.android.gms.wearable.internal.zzhk<T>> r0 = r7.zzeb
            monitor-enter(r0)
            if (r8 != 0) goto L_0x0007
            r8 = 0
            goto L_0x001b
        L_0x0007:
            java.lang.String r1 = "com.google.android.gms.wearable.internal.IWearableService"
            android.os.IInterface r1 = r8.queryLocalInterface(r1)     // Catch:{ all -> 0x0089 }
            boolean r2 = r1 instanceof com.google.android.gms.wearable.internal.zzep     // Catch:{ all -> 0x0089 }
            if (r2 == 0) goto L_0x0015
            r8 = r1
            com.google.android.gms.wearable.internal.zzep r8 = (com.google.android.gms.wearable.internal.zzep) r8     // Catch:{ all -> 0x0089 }
            goto L_0x001b
        L_0x0015:
            com.google.android.gms.wearable.internal.zzeq r1 = new com.google.android.gms.wearable.internal.zzeq     // Catch:{ all -> 0x0089 }
            r1.<init>(r8)     // Catch:{ all -> 0x0089 }
            r8 = r1
        L_0x001b:
            com.google.android.gms.wearable.internal.zzgz r1 = new com.google.android.gms.wearable.internal.zzgz     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            java.util.Map<T, com.google.android.gms.wearable.internal.zzhk<T>> r2 = r7.zzeb     // Catch:{ all -> 0x0089 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0089 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0089 }
        L_0x002a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0089 }
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0089 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0089 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x0089 }
            com.google.android.gms.wearable.internal.zzhk r4 = (com.google.android.gms.wearable.internal.zzhk) r4     // Catch:{ all -> 0x0089 }
            com.google.android.gms.wearable.internal.zzd r5 = new com.google.android.gms.wearable.internal.zzd     // Catch:{ RemoteException -> 0x006a }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x006a }
            r8.zza((com.google.android.gms.wearable.internal.zzek) r1, (com.google.android.gms.wearable.internal.zzd) r5)     // Catch:{ RemoteException -> 0x006a }
            java.lang.String r5 = "WearableClient"
            r6 = 3
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch:{ RemoteException -> 0x006a }
            if (r5 == 0) goto L_0x002a
            java.lang.Object r5 = r3.getKey()     // Catch:{ RemoteException -> 0x006a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x006a }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ RemoteException -> 0x006a }
            int r5 = r5.length()     // Catch:{ RemoteException -> 0x006a }
            int r5 = r5 + 27
            int r6 = r6.length()     // Catch:{ RemoteException -> 0x006a }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x006a }
            r6.<init>(r5)     // Catch:{ RemoteException -> 0x006a }
            goto L_0x002a
        L_0x006a:
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0089 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0089 }
            int r3 = r3.length()     // Catch:{ all -> 0x0089 }
            int r3 = r3 + 32
            int r4 = r4.length()     // Catch:{ all -> 0x0089 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r4.<init>(r3)     // Catch:{ all -> 0x0089 }
            goto L_0x002a
        L_0x0087:
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return
        L_0x0089:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzer.zza(android.os.IBinder):void");
    }

    public final void zza(zzhg zzhg, BaseImplementation.ResultHolder<Status> resultHolder, T t) {
        synchronized (this.zzeb) {
            zzhk remove = this.zzeb.remove(t);
            if (remove == null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    new StringBuilder(String.valueOf(t).length() + 25);
                }
                resultHolder.setResult(new Status(4002));
                return;
            }
            remove.clear();
            if (Log.isLoggable("WearableClient", 2)) {
                new StringBuilder(String.valueOf(t).length() + 24);
            }
            ((zzep) zzhg.getService()).zza((zzek) new zzet(this.zzeb, t, resultHolder), new zzfw(remove));
        }
    }

    public final void zza(zzhg zzhg, BaseImplementation.ResultHolder<Status> resultHolder, T t, zzhk<T> zzhk) {
        synchronized (this.zzeb) {
            if (this.zzeb.get(t) != null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    new StringBuilder(String.valueOf(t).length() + 20);
                }
                resultHolder.setResult(new Status(4001));
                return;
            }
            if (Log.isLoggable("WearableClient", 2)) {
                new StringBuilder(String.valueOf(t).length() + 14);
            }
            this.zzeb.put(t, zzhk);
            try {
                ((zzep) zzhg.getService()).zza((zzek) new zzes(this.zzeb, t, resultHolder), new zzd(zzhk));
            } catch (RemoteException e) {
                if (Log.isLoggable("WearableClient", 3)) {
                    new StringBuilder(String.valueOf(t).length() + 39);
                }
                this.zzeb.remove(t);
                throw e;
            }
        }
    }
}
