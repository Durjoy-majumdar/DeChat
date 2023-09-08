package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzl extends zzp<Status> {
    public zzl(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzh zzh = (zzh) anyClient;
        ((zzv) zzh.getService()).zze(new zzm(this), zzh.zzn());
    }
}
