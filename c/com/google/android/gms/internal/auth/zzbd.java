package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class zzbd extends zzd implements zzbc {
    public zzbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zzd(zzba zzba) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzba);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    public final void zzd(zzba zzba, CredentialRequest credentialRequest) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzba);
        zzf.zzd(obtainAndWriteInterfaceToken, (Parcelable) credentialRequest);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    public final void zzd(zzba zzba, zzay zzay) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzba);
        zzf.zzd(obtainAndWriteInterfaceToken, (Parcelable) zzay);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void zzd(zzba zzba, zzbe zzbe) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzba);
        zzf.zzd(obtainAndWriteInterfaceToken, (Parcelable) zzbe);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }
}
