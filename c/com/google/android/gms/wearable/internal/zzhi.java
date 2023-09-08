package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zzhi implements Runnable {
    private final /* synthetic */ Uri zzco;
    private final /* synthetic */ boolean zzcp;
    private final /* synthetic */ String zzcs;
    private final /* synthetic */ BaseImplementation.ResultHolder zzfh;
    private final /* synthetic */ zzhg zzfi;

    public zzhi(zzhg zzhg, Uri uri, BaseImplementation.ResultHolder resultHolder, boolean z, String str) {
        this.zzfi = zzhg;
        this.zzco = uri;
        this.zzfh = resultHolder;
        this.zzcp = z;
        this.zzcs = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|(3:20|21|31)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.zzfh.setFailedResult(new com.google.android.gms.common.api.Status(8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            java.lang.String r0 = "WearableClient"
            r1 = 2
            android.util.Log.isLoggable(r0, r1)
            android.net.Uri r0 = r4.zzco
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0023
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r0 = r4.zzfh
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r2 = 10
            java.lang.String r3 = "Channel.receiveFile used with non-file URI"
            r1.<init>(r2, r3)
        L_0x001f:
            r0.setFailedResult(r1)
            return
        L_0x0023:
            java.io.File r0 = new java.io.File
            android.net.Uri r1 = r4.zzco
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            r1 = 671088640(0x28000000, float:7.1054274E-15)
            boolean r2 = r4.zzcp
            if (r2 == 0) goto L_0x0037
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            r1 = r1 | r2
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.open(r0, r1)     // Catch:{ FileNotFoundException -> 0x006b }
            com.google.android.gms.wearable.internal.zzhg r1 = r4.zzfi     // Catch:{ RemoteException -> 0x0057 }
            android.os.IInterface r1 = r1.getService()     // Catch:{ RemoteException -> 0x0057 }
            com.google.android.gms.wearable.internal.zzep r1 = (com.google.android.gms.wearable.internal.zzep) r1     // Catch:{ RemoteException -> 0x0057 }
            com.google.android.gms.wearable.internal.zzhf r2 = new com.google.android.gms.wearable.internal.zzhf     // Catch:{ RemoteException -> 0x0057 }
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r3 = r4.zzfh     // Catch:{ RemoteException -> 0x0057 }
            r2.<init>(r3)     // Catch:{ RemoteException -> 0x0057 }
            java.lang.String r3 = r4.zzcs     // Catch:{ RemoteException -> 0x0057 }
            r1.zza((com.google.android.gms.wearable.internal.zzek) r2, (java.lang.String) r3, (android.os.ParcelFileDescriptor) r0)     // Catch:{ RemoteException -> 0x0057 }
            r0.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            return
        L_0x0055:
            r1 = move-exception
            goto L_0x0067
        L_0x0057:
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r1 = r4.zzfh     // Catch:{ all -> 0x0055 }
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0055 }
            r3 = 8
            r2.<init>(r3)     // Catch:{ all -> 0x0055 }
            r1.setFailedResult(r2)     // Catch:{ all -> 0x0055 }
            r0.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            return
        L_0x0067:
            r0.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            throw r1
        L_0x006b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            int r0 = r0 + 49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r0 = r4.zzfh
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r2 = 13
            r1.<init>(r2)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzhi.run():void");
    }
}
