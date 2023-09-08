package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.wearable.MessageApi;

final class zzew extends zzn<Status> {
    private final /* synthetic */ MessageApi.MessageListener zzef;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzew(zzeu zzeu, GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener) {
        super(googleApiClient);
        this.zzef = messageListener;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzhg) anyClient).zza((BaseImplementation.ResultHolder<Status>) this, this.zzef);
    }
}
