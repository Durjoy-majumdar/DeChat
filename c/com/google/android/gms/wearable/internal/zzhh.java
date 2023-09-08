package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

final class zzhh implements Callable<Boolean> {
    private final /* synthetic */ byte[] zzee;
    private final /* synthetic */ ParcelFileDescriptor zzfg;

    public zzhh(zzhg zzhg, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.zzfg = parcelFileDescriptor;
        this.zzee = bArr;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        new java.lang.StringBuilder(java.lang.String.valueOf(r5.zzfg).length() + 36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (android.util.Log.isLoggable("WearableClient", 3) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        new java.lang.StringBuilder(java.lang.String.valueOf(r5.zzfg).length() + 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        throw r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005f */
    /* renamed from: zzd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean call() {
        /*
            r5 = this;
            java.lang.String r0 = "WearableClient"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L_0x001a
            android.os.ParcelFileDescriptor r2 = r5.zzfg
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            int r2 = r2 + 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
        L_0x001a:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r2 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream
            android.os.ParcelFileDescriptor r3 = r5.zzfg
            r2.<init>(r3)
            byte[] r3 = r5.zzee     // Catch:{ IOException -> 0x005f }
            r2.write(r3)     // Catch:{ IOException -> 0x005f }
            r2.flush()     // Catch:{ IOException -> 0x005f }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x005f }
            if (r3 == 0) goto L_0x0040
            android.os.ParcelFileDescriptor r3 = r5.zzfg     // Catch:{ IOException -> 0x005f }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x005f }
            int r3 = r3.length()     // Catch:{ IOException -> 0x005f }
            int r3 = r3 + 27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005f }
            r4.<init>(r3)     // Catch:{ IOException -> 0x005f }
        L_0x0040:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x005f }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x005c }
            if (r0 == 0) goto L_0x0059
            android.os.ParcelFileDescriptor r0 = r5.zzfg     // Catch:{ IOException -> 0x005c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x005c }
            int r0 = r0.length()     // Catch:{ IOException -> 0x005c }
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005c }
            r1.<init>(r0)     // Catch:{ IOException -> 0x005c }
        L_0x0059:
            r2.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            return r3
        L_0x005d:
            r3 = move-exception
            goto L_0x008d
        L_0x005f:
            android.os.ParcelFileDescriptor r3 = r5.zzfg     // Catch:{ all -> 0x005d }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x005d }
            int r3 = r3.length()     // Catch:{ all -> 0x005d }
            int r3 = r3 + 36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r4.<init>(r3)     // Catch:{ all -> 0x005d }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x008a }
            if (r0 == 0) goto L_0x0087
            android.os.ParcelFileDescriptor r0 = r5.zzfg     // Catch:{ IOException -> 0x008a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x008a }
            int r0 = r0.length()     // Catch:{ IOException -> 0x008a }
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x008a }
        L_0x0087:
            r2.close()     // Catch:{ IOException -> 0x008a }
        L_0x008a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x008d:
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x00a7 }
            if (r0 == 0) goto L_0x00a4
            android.os.ParcelFileDescriptor r0 = r5.zzfg     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x00a7 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x00a7 }
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a7 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00a7 }
        L_0x00a4:
            r2.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x00a7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzhh.call():java.lang.Boolean");
    }
}
