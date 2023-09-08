package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzd;
import com.google.android.gms.internal.auth.zzf;

public final class zzh extends zzd implements zzf {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    public final void zzd(zzd zzd, Account account) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzd);
        zzf.zzd(obtainAndWriteInterfaceToken, (Parcelable) account);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void zzd(zzd zzd, String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzd);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void zze(boolean z) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
