package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;

final class zzfh extends zzn<NodeApi.GetLocalNodeResult> {
    public zzfh(zzfg zzfg, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzfk(status, (Node) null);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzep) ((zzhg) anyClient).getService()).zzb(new zzgy(this));
    }
}
