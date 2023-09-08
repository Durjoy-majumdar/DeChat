package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;

final class zzi extends AccountTransferClient.zzd<byte[]> {
    private final /* synthetic */ zzh zzbb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzi(zzh zzh, AccountTransferClient.zze zze) {
        super(zze);
        this.zzbb = zzh;
    }

    public final void zzd(byte[] bArr) {
        this.zzbb.setResult(bArr);
    }
}
