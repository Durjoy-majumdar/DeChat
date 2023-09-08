package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzf;

public abstract class zze extends com.google.android.gms.internal.auth.zze implements zzd {
    public zze() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzf((Account) zzf.zzd(parcel, Account.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzd(zzf.zzd(parcel));
        }
        return true;
    }
}
