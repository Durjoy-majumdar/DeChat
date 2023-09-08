package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzn extends zzp<Status> {
    public zzn(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzh zzh = (zzh) anyClient;
        ((zzv) zzh.getService()).zzf(new zzo(this), zzh.zzn());
    }
}
