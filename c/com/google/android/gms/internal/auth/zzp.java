package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

final class zzp extends zzq {
    private final /* synthetic */ zzo zzai;

    public zzp(zzo zzo) {
        this.zzai = zzo;
    }

    public final void zzd(boolean z) {
        this.zzai.setResult(new zzt(z ? Status.RESULT_SUCCESS : zzk.zzaf));
    }
}
