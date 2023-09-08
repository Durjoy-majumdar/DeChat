package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi;
import java.util.ArrayList;

final class zzfi extends zzn<NodeApi.GetConnectedNodesResult> {
    public zzfi(zzfg zzfg, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzfj(status, new ArrayList());
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzep) ((zzhg) anyClient).getService()).zzc(new zzgu(this));
    }
}
