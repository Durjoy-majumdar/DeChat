package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

final class zzam implements ChannelApi.OpenChannelResult {
    private final Channel zzcd;
    private final Status zzp;

    public zzam(Status status, Channel channel) {
        this.zzp = (Status) Preconditions.checkNotNull(status);
        this.zzcd = channel;
    }

    public final Channel getChannel() {
        return this.zzcd;
    }

    public final Status getStatus() {
        return this.zzp;
    }
}
