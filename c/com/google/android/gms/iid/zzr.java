package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class zzr {
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzbz;
    private zzt zzca;
    private int zzcb;
    /* access modifiers changed from: private */
    public final Context zzk;

    public zzr(Context context) {
        this(context, Executors.newSingleThreadScheduledExecutor());
    }

    private zzr(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzca = new zzt(this);
        this.zzcb = 1;
        this.zzk = context.getApplicationContext();
        this.zzbz = scheduledExecutorService;
    }

    private final synchronized <T> Task<T> zzd(zzz<T> zzz) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(zzz).length() + 9);
        }
        if (!this.zzca.zze(zzz)) {
            zzt zzt = new zzt(this);
            this.zzca = zzt;
            zzt.zze(zzz);
        }
        return zzz.zzcl.getTask();
    }

    private final synchronized int zzq() {
        int i;
        i = this.zzcb;
        this.zzcb = i + 1;
        return i;
    }

    public final Task<Bundle> zzd(int i, Bundle bundle) {
        return zzd(new zzab(zzq(), 1, bundle));
    }
}
