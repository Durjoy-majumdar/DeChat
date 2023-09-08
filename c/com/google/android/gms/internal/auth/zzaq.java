package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

final class zzaq extends zzam {
    private final /* synthetic */ zzap zzds;

    public zzaq(zzap zzap) {
        this.zzds = zzap;
    }

    public final void zzd(Status status, Credential credential) {
        this.zzds.setResult(new zzan(status, credential));
    }

    public final void zze(Status status) {
        this.zzds.setResult(zzan.zzf(status));
    }
}
