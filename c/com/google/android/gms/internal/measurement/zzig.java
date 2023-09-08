package com.google.android.gms.internal.measurement;

final class zzig implements Runnable {
    private final /* synthetic */ boolean zzaos;
    private final /* synthetic */ zzie zzaot;
    private final /* synthetic */ zzie zzaou;
    private final /* synthetic */ zzif zzaov;

    public zzig(zzif zzif, boolean z, zzie zzie, zzie zzie2) {
        this.zzaov = zzif;
        this.zzaos = z;
        this.zzaot = zzie;
        this.zzaou = zzie2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r8.zzaov;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            boolean r0 = r8.zzaos
            if (r0 == 0) goto L_0x000d
            com.google.android.gms.internal.measurement.zzif r0 = r8.zzaov
            com.google.android.gms.internal.measurement.zzie r1 = r0.zzaol
            if (r1 == 0) goto L_0x000d
            r0.zza(r1)
        L_0x000d:
            com.google.android.gms.internal.measurement.zzie r0 = r8.zzaot
            r1 = 1
            if (r0 == 0) goto L_0x0037
            long r2 = r0.zzaoj
            com.google.android.gms.internal.measurement.zzie r4 = r8.zzaou
            long r5 = r4.zzaoj
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0037
            java.lang.String r0 = r0.zzaoi
            java.lang.String r2 = r4.zzaoi
            boolean r0 = com.google.android.gms.internal.measurement.zzka.zzs(r0, r2)
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.measurement.zzie r0 = r8.zzaot
            java.lang.String r0 = r0.zzul
            com.google.android.gms.internal.measurement.zzie r2 = r8.zzaou
            java.lang.String r2 = r2.zzul
            boolean r0 = com.google.android.gms.internal.measurement.zzka.zzs(r0, r2)
            if (r0 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = 0
            goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            if (r0 == 0) goto L_0x0070
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.internal.measurement.zzie r2 = r8.zzaou
            com.google.android.gms.internal.measurement.zzif.zza((com.google.android.gms.internal.measurement.zzie) r2, (android.os.Bundle) r0, (boolean) r1)
            com.google.android.gms.internal.measurement.zzie r1 = r8.zzaot
            if (r1 == 0) goto L_0x0063
            java.lang.String r1 = r1.zzul
            if (r1 == 0) goto L_0x0051
            java.lang.String r2 = "_pn"
            r0.putString(r2, r1)
        L_0x0051:
            com.google.android.gms.internal.measurement.zzie r1 = r8.zzaot
            java.lang.String r1 = r1.zzaoi
            java.lang.String r2 = "_pc"
            r0.putString(r2, r1)
            com.google.android.gms.internal.measurement.zzie r1 = r8.zzaot
            long r1 = r1.zzaoj
            java.lang.String r3 = "_pi"
            r0.putLong(r3, r1)
        L_0x0063:
            com.google.android.gms.internal.measurement.zzif r1 = r8.zzaov
            com.google.android.gms.internal.measurement.zzhk r1 = r1.zzfu()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r1.zza(r2, r3, r0)
        L_0x0070:
            com.google.android.gms.internal.measurement.zzif r0 = r8.zzaov
            com.google.android.gms.internal.measurement.zzie r1 = r8.zzaou
            r0.zzaol = r1
            com.google.android.gms.internal.measurement.zzii r0 = r0.zzfx()
            com.google.android.gms.internal.measurement.zzie r1 = r8.zzaou
            r0.zzb((com.google.android.gms.internal.measurement.zzie) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzig.run():void");
    }
}
