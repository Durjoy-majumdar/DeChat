package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;

final class zzr extends zzn<CapabilityApi.AddLocalCapabilityResult> {
    private final /* synthetic */ String zzbp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzr(zzo zzo, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient);
        this.zzbp = str;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzu(status);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzep) ((zzhg) anyClient).getService()).zza((zzek) new zzgl(this), this.zzbp);
    }
}
