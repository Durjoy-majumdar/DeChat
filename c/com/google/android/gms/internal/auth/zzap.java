package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzap extends zzav<CredentialRequestResult> {
    private final /* synthetic */ CredentialRequest zzdr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzap(zzao zzao, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.zzdr = credentialRequest;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return zzan.zzf(status);
    }

    public final void zzd(Context context, zzbc zzbc) {
        zzbc.zzd((zzba) new zzaq(this), this.zzdr);
    }
}
