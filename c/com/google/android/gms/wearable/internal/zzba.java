package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzba extends zzn<Status> {
    private final /* synthetic */ zzay zzcm;
    private final /* synthetic */ int zzcn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzba(zzay zzay, GoogleApiClient googleApiClient, int i) {
        super(googleApiClient);
        this.zzcm = zzay;
        this.zzcn = i;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzep) ((zzhg) anyClient).getService()).zzb((zzek) new zzgo(this), this.zzcm.zzce, this.zzcn);
    }
}
