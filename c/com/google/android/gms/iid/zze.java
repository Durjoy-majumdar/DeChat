package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zze extends Service {
    private final Object lock = new Object();
    public final ExecutorService zzax = Executors.newSingleThreadExecutor();
    private Binder zzay;
    private int zzaz;
    private int zzba = 0;

    /* access modifiers changed from: private */
    public final void zzf(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            int i = this.zzba - 1;
            this.zzba = i;
            if (i == 0) {
                stopSelfResult(this.zzaz);
            }
        }
    }

    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        boolean isLoggable = Log.isLoggable("EnhancedIntentService", 3);
        if (this.zzay == null) {
            this.zzay = new zzi(this);
        }
        return this.zzay;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.zzaz = i2;
            this.zzba++;
        }
        if (intent == null) {
            zzf(intent);
            return 2;
        }
        this.zzax.execute(new zzf(this, intent, intent));
        return 3;
    }
}
