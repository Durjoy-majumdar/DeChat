package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.WearableListenerService;

final class zzl implements Runnable {
    private final /* synthetic */ DataHolder zzan;
    private final /* synthetic */ WearableListenerService.zzd zzao;

    public zzl(WearableListenerService.zzd zzd, DataHolder dataHolder) {
        this.zzao = zzd;
        this.zzan = dataHolder;
    }

    public final void run() {
        DataEventBuffer dataEventBuffer = new DataEventBuffer(this.zzan);
        try {
            WearableListenerService.this.onDataChanged(dataEventBuffer);
        } finally {
            dataEventBuffer.release();
        }
    }
}
