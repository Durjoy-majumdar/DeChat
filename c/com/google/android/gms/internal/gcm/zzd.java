package com.google.android.gms.internal.gcm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzd implements IInterface {
    private final IBinder zzd;
    private final String zze;

    public zzd(IBinder iBinder, String str) {
        this.zzd = iBinder;
        this.zze = str;
    }

    public IBinder asBinder() {
        return this.zzd;
    }

    public final Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zze);
        return obtain;
    }

    public final void transactAndReadExceptionReturnVoid(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zzd.transact(2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void transactOneway(int i, Parcel parcel) {
        try {
            this.zzd.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
