package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;

final class zzau extends UnregisterListenerMethod<zzhg, ChannelClient.ChannelCallback> {
    private final String zzce;
    private final ChannelApi.ChannelListener zzcf;

    public zzau(ChannelApi.ChannelListener channelListener, String str, ListenerHolder.ListenerKey<ChannelClient.ChannelCallback> listenerKey) {
        super(listenerKey);
        this.zzcf = channelListener;
        this.zzce = str;
    }

    public final /* synthetic */ void unregisterListener(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        ((zzhg) anyClient).zza(new zzgg(taskCompletionSource), this.zzcf, this.zzce);
    }
}
