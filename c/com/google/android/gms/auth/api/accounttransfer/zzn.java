package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzv;

final class zzn extends zzv {
    private final /* synthetic */ AccountTransferClient.zzf zzbj;

    public zzn(AccountTransferClient.zzf zzf) {
        this.zzbj = zzf;
    }

    public final void onFailure(Status status) {
        this.zzbj.zzd(status);
    }

    public final void zzi() {
        this.zzbj.setResult(null);
    }
}
