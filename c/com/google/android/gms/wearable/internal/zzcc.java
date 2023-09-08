package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;

final class zzcc extends zzn<DataApi.GetFdForAssetResult> {
    private final /* synthetic */ Asset zzdd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcc(zzbw zzbw, GoogleApiClient googleApiClient, Asset asset) {
        super(googleApiClient);
        this.zzdd = asset;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzci(status, (ParcelFileDescriptor) null);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzhg) anyClient).zza((BaseImplementation.ResultHolder<DataApi.GetFdForAssetResult>) this, this.zzdd);
    }
}
