package com.google.android.gms.internal.p1178authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzf */
public final class zzf extends zza implements zze {
    public zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zza(zzg zzg) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, (IInterface) zzg);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
