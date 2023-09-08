package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.auth.zze;

public abstract class zzs extends zze implements zzr {
    public zzs() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzq();
        } else if (i != 2) {
            return false;
        } else {
            zzr();
        }
        return true;
    }
}
