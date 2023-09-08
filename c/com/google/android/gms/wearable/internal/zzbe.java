package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zzbe extends zzn<Status> {
    private final /* synthetic */ zzay zzcm;
    private final /* synthetic */ Uri zzco;
    private final /* synthetic */ long zzcq;
    private final /* synthetic */ long zzcr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbe(zzay zzay, GoogleApiClient googleApiClient, Uri uri, long j, long j2) {
        super(googleApiClient);
        this.zzcm = zzay;
        this.zzco = uri;
        this.zzcq = j;
        this.zzcr = j2;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzhg) anyClient).zza((BaseImplementation.ResultHolder<Status>) this, this.zzcm.zzce, this.zzco, this.zzcq, this.zzcr);
    }
}
