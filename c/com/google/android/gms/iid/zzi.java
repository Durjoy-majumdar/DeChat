package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class zzi extends Binder {
    /* access modifiers changed from: private */
    public final zze zzbi;

    public zzi(zze zze) {
        this.zzbi = zze;
    }

    public final void zzd(zzg zzg) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable("EnhancedIntentService", 3);
            Log.isLoggable("EnhancedIntentService", 3);
            this.zzbi.zzax.execute(new zzj(this, zzg));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
