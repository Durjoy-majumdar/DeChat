package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzas extends zzav<Status> {
    private final /* synthetic */ Credential zzdt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzas(zzao zzao, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.zzdt = credential;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final void zzd(Context context, zzbc zzbc) {
        zzbc.zzd((zzba) new zzau(this), new zzay(this.zzdt));
    }
}
