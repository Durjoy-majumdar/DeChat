package com.google.android.gms.internal.p1178authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzh */
public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zza((Status) zzc.zza(parcel, Status.CREATOR));
        return true;
    }
}
