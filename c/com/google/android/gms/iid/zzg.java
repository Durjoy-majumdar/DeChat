package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzg {
    public final Intent intent;
    private final BroadcastReceiver.PendingResult zzbe;
    private boolean zzbf = false;
    private final ScheduledFuture<?> zzbg;

    public zzg(Intent intent2, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.intent = intent2;
        this.zzbe = pendingResult;
        this.zzbg = scheduledExecutorService.schedule(new zzh(this, intent2), 9500, TimeUnit.MILLISECONDS);
    }

    public final synchronized void finish() {
        if (!this.zzbf) {
            this.zzbe.finish();
            this.zzbg.cancel(false);
            this.zzbf = true;
        }
    }
}
