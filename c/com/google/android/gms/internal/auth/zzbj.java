package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public abstract class zzbj extends zze implements zzbi {
    public zzbj() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzd((ProxyResponse) zzf.zzd(parcel, ProxyResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzf(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
