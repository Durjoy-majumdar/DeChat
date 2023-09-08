package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;

final class zzq extends zzn<CapabilityApi.GetAllCapabilitiesResult> {
    private final /* synthetic */ int zzbq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzq(zzo zzo, GoogleApiClient googleApiClient, int i) {
        super(googleApiClient);
        this.zzbq = i;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzx(status, (Map<String, CapabilityInfo>) null);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzep) ((zzhg) anyClient).getService()).zza((zzek) new zzgq(this), this.zzbq);
    }
}
