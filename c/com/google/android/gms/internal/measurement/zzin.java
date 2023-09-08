package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

final class zzin implements Runnable {
    private final /* synthetic */ zzie zzaow;
    private final /* synthetic */ zzii zzape;

    public zzin(zzii zzii, zzie zzie) {
        this.zzape = zzii;
        this.zzaow = zzie;
    }

    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        zzey zzd = this.zzape.zzaoy;
        if (zzd == null) {
            this.zzape.zzge().zzim().log("Failed to send current screen to service");
            return;
        }
        try {
            zzie zzie = this.zzaow;
            if (zzie == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.zzape.getContext().getPackageName();
            } else {
                j = zzie.zzaoj;
                str = zzie.zzul;
                str2 = zzie.zzaoi;
                packageName = this.zzape.getContext().getPackageName();
            }
            zzd.zza(j, str, str2, packageName);
            this.zzape.zzcu();
        } catch (RemoteException e) {
            this.zzape.zzge().zzim().zzg("Failed to send current screen to the service", e);
        }
    }
}
