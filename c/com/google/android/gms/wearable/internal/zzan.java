package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelApi;

final class zzan extends zzn<Status> {
    private final String zzce;
    private ChannelApi.ChannelListener zzcf;

    public zzan(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener, String str) {
        super(googleApiClient);
        this.zzcf = (ChannelApi.ChannelListener) Preconditions.checkNotNull(channelListener);
        this.zzce = str;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        this.zzcf = null;
        return status;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzhg) anyClient).zza(this, this.zzcf, this.zzce);
        this.zzcf = null;
    }
}
