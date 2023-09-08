package com.google.android.gms.iid;

import android.util.Log;

final class zzj implements Runnable {
    private final /* synthetic */ zzg zzbj;
    private final /* synthetic */ zzi zzbk;

    public zzj(zzi zzi, zzg zzg) {
        this.zzbk = zzi;
        this.zzbj = zzg;
    }

    public final void run() {
        Log.isLoggable("EnhancedIntentService", 3);
        this.zzbk.zzbi.handleIntent(this.zzbj.intent);
        this.zzbj.finish();
    }
}
