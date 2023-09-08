package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class zzbb extends zze implements zzba {
    public zzbb() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzd((Status) zzf.zzd(parcel, Status.CREATOR), (Credential) zzf.zzd(parcel, Credential.CREATOR));
        } else if (i == 2) {
            zze((Status) zzf.zzd(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            zzd((Status) zzf.zzd(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
