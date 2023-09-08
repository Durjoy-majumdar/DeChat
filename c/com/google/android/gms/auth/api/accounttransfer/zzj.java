package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzaa;
import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzy;

final class zzj extends AccountTransferClient.zze<DeviceMetaData> {
    private final /* synthetic */ zzy zzbc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzj(AccountTransferClient accountTransferClient, zzy zzy) {
        super((zzf) null);
        this.zzbc = zzy;
    }

    public final void zzd(zzac zzac) {
        zzac.zzd((zzaa) new zzk(this, this), this.zzbc);
    }
}
