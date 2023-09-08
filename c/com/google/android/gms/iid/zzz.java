package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzz<T> {
    public final int what;
    public final int zzck;
    public final TaskCompletionSource<T> zzcl = new TaskCompletionSource<>();
    public final Bundle zzcm;

    public zzz(int i, int i2, Bundle bundle) {
        this.zzck = i;
        this.what = i2;
        this.zzcm = bundle;
    }

    public String toString() {
        int i = this.what;
        int i2 = this.zzck;
        zzu();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=false}");
        return sb.toString();
    }

    public final void zzd(zzaa zzaa) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(this).length() + 14 + String.valueOf(zzaa).length());
        }
        this.zzcl.setException(zzaa);
    }

    public abstract void zzh(Bundle bundle);

    public abstract boolean zzu();
}
