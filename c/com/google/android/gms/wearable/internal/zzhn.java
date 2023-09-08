package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.ChannelApi;

final class zzhn implements ListenerHolder.Notifier<ChannelApi.ChannelListener> {
    private final /* synthetic */ zzaw zzav;

    public zzhn(zzaw zzaw) {
        this.zzav = zzaw;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        this.zzav.zza((ChannelApi.ChannelListener) obj);
    }

    public final void onNotifyListenerFailed() {
    }
}
