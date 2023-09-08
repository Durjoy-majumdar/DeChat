package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;

final class zzk extends AccountTransferClient.zzd<DeviceMetaData> {
    private final /* synthetic */ zzj zzbd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzk(zzj zzj, AccountTransferClient.zze zze) {
        super(zze);
        this.zzbd = zzj;
    }

    public final void zzd(DeviceMetaData deviceMetaData) {
        this.zzbd.setResult(deviceMetaData);
    }
}
