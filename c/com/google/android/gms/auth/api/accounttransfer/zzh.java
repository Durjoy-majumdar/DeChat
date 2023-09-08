package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzaa;
import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzag;

final class zzh extends AccountTransferClient.zze<byte[]> {
    private final /* synthetic */ zzag zzba;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzh(AccountTransferClient accountTransferClient, zzag zzag) {
        super((zzf) null);
        this.zzba = zzag;
    }

    public final void zzd(zzac zzac) {
        zzac.zzd((zzaa) new zzi(this, this), this.zzba);
    }
}
