package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zzhj implements Runnable {
    private final /* synthetic */ Uri zzco;
    private final /* synthetic */ long zzcq;
    private final /* synthetic */ long zzcr;
    private final /* synthetic */ String zzcs;
    private final /* synthetic */ BaseImplementation.ResultHolder zzfh;
    private final /* synthetic */ zzhg zzfi;

    public zzhj(zzhg zzhg, Uri uri, BaseImplementation.ResultHolder resultHolder, String str, long j, long j2) {
        this.zzfi = zzhg;
        this.zzco = uri;
        this.zzfh = resultHolder;
        this.zzcs = str;
        this.zzcq = j;
        this.zzcr = j2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|(3:16|17|27)) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r10.zzfh.setFailedResult(new com.google.android.gms.common.api.Status(8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = "WearableClient"
            r1 = 2
            android.util.Log.isLoggable(r0, r1)
            android.net.Uri r0 = r10.zzco
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0023
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r0 = r10.zzfh
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r2 = 10
            java.lang.String r3 = "Channel.sendFile used with non-file URI"
            r1.<init>(r2, r3)
        L_0x001f:
            r0.setFailedResult(r1)
            return
        L_0x0023:
            java.io.File r0 = new java.io.File
            android.net.Uri r1 = r10.zzco
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.open(r0, r1)     // Catch:{ FileNotFoundException -> 0x0068 }
            com.google.android.gms.wearable.internal.zzhg r1 = r10.zzfi     // Catch:{ RemoteException -> 0x0054 }
            android.os.IInterface r1 = r1.getService()     // Catch:{ RemoteException -> 0x0054 }
            r2 = r1
            com.google.android.gms.wearable.internal.zzep r2 = (com.google.android.gms.wearable.internal.zzep) r2     // Catch:{ RemoteException -> 0x0054 }
            com.google.android.gms.wearable.internal.zzhc r3 = new com.google.android.gms.wearable.internal.zzhc     // Catch:{ RemoteException -> 0x0054 }
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r1 = r10.zzfh     // Catch:{ RemoteException -> 0x0054 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0054 }
            java.lang.String r4 = r10.zzcs     // Catch:{ RemoteException -> 0x0054 }
            long r6 = r10.zzcq     // Catch:{ RemoteException -> 0x0054 }
            long r8 = r10.zzcr     // Catch:{ RemoteException -> 0x0054 }
            r5 = r0
            r2.zza(r3, r4, r5, r6, r8)     // Catch:{ RemoteException -> 0x0054 }
            r0.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            return
        L_0x0052:
            r1 = move-exception
            goto L_0x0064
        L_0x0054:
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r1 = r10.zzfh     // Catch:{ all -> 0x0052 }
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0052 }
            r3 = 8
            r2.<init>(r3)     // Catch:{ all -> 0x0052 }
            r1.setFailedResult(r2)     // Catch:{ all -> 0x0052 }
            r0.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            return
        L_0x0064:
            r0.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            throw r1
        L_0x0068:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            int r0 = r0 + 46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r0 = r10.zzfh
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r2 = 13
            r1.<init>(r2)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzhj.run():void");
    }
}
