package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

final class zzim implements Runnable {
    private final /* synthetic */ zzdz zzane;
    private final /* synthetic */ zzii zzape;

    public zzim(zzii zzii, zzdz zzdz) {
        this.zzape = zzii;
        this.zzane = zzdz;
    }

    public final void run() {
        zzey zzd = this.zzape.zzaoy;
        if (zzd == null) {
            this.zzape.zzge().zzim().log("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzd.zza(this.zzane);
            this.zzape.zza(zzd, (AbstractSafeParcelable) null, this.zzane);
            this.zzape.zzcu();
        } catch (RemoteException e) {
            this.zzape.zzge().zzim().zzg("Failed to send app launch to the service", e);
        }
    }
}
