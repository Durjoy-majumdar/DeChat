package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.PutDataRequest;

final class zzbx extends zzn<DataApi.DataItemResult> {
    private final /* synthetic */ PutDataRequest zzdb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbx(zzbw zzbw, GoogleApiClient googleApiClient, PutDataRequest putDataRequest) {
        super(googleApiClient);
        this.zzdb = putDataRequest;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzcg(status, (DataItem) null);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzhg) anyClient).zza((BaseImplementation.ResultHolder<DataApi.DataItemResult>) this, this.zzdb);
    }
}
