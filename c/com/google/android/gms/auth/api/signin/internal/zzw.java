package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth.zzd;
import com.google.android.gms.internal.auth.zzf;

public final class zzw extends zzd implements zzv {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zzd(zzt zzt, GoogleSignInOptions googleSignInOptions) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzt);
        zzf.zzd(obtainAndWriteInterfaceToken, (Parcelable) googleSignInOptions);
        transactAndReadExceptionReturnVoid(101, obtainAndWriteInterfaceToken);
    }

    public final void zze(zzt zzt, GoogleSignInOptions googleSignInOptions) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzt);
        zzf.zzd(obtainAndWriteInterfaceToken, (Parcelable) googleSignInOptions);
        transactAndReadExceptionReturnVoid(102, obtainAndWriteInterfaceToken);
    }

    public final void zzf(zzt zzt, GoogleSignInOptions googleSignInOptions) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzt);
        zzf.zzd(obtainAndWriteInterfaceToken, (Parcelable) googleSignInOptions);
        transactAndReadExceptionReturnVoid(103, obtainAndWriteInterfaceToken);
    }
}
