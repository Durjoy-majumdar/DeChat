package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;

final class zzat extends RegisterListenerMethod<zzhg, ChannelClient.ChannelCallback> {
    private final IntentFilter[] zzba;
    private final String zzce;
    private final ChannelApi.ChannelListener zzcf;
    private final ListenerHolder<ChannelApi.ChannelListener> zzci;

    public zzat(ChannelApi.ChannelListener channelListener, String str, IntentFilter[] intentFilterArr, ListenerHolder<ChannelClient.ChannelCallback> listenerHolder, ListenerHolder<ChannelApi.ChannelListener> listenerHolder2) {
        super(listenerHolder);
        this.zzcf = channelListener;
        this.zzba = intentFilterArr;
        this.zzce = str;
        this.zzci = listenerHolder2;
    }

    public final /* synthetic */ void registerListener(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        ((zzhg) anyClient).zza((BaseImplementation.ResultHolder<Status>) new zzgh(taskCompletionSource), this.zzcf, this.zzci, this.zzce, this.zzba);
    }
}
