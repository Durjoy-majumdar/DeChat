package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzat extends zzav<Status> {
    public zzat(zzao zzao, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final void zzd(Context context, zzbc zzbc) {
        zzbc.zzd(new zzau(this));
    }
}
