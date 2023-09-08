package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.account.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zzl extends BaseImplementation.ApiMethodImpl<Result, zzu> {
    private final /* synthetic */ boolean zzag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzl(zzk zzk, Api api, GoogleApiClient googleApiClient, boolean z) {
        super((Api<?>) api, googleApiClient);
        this.zzag = z;
    }

    public final Result createFailedResult(Status status) {
        return new zzs(status);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzf) ((zzu) anyClient).getService()).zze(this.zzag);
        setResult(new zzs(Status.RESULT_SUCCESS));
    }
}
