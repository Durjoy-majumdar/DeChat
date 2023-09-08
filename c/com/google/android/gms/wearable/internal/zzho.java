package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.CapabilityApi;

final class zzho implements ListenerHolder.Notifier<CapabilityApi.CapabilityListener> {
    private final /* synthetic */ zzah zzfr;

    public zzho(zzah zzah) {
        this.zzfr = zzah;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((CapabilityApi.CapabilityListener) obj).onCapabilityChanged(this.zzfr);
    }

    public final void onNotifyListenerFailed() {
    }
}
