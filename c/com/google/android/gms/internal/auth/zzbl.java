package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public final class zzbl extends zzd implements zzbk {
    public zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbi zzbi, ProxyRequest proxyRequest) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzf.zzd(obtainAndWriteInterfaceToken, (IInterface) zzbi);
        zzf.zzd(obtainAndWriteInterfaceToken, (Parcelable) proxyRequest);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
