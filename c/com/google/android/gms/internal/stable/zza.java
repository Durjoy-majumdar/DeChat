package com.google.android.gms.internal.stable;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zza(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    public IBinder asBinder() {
        return this.zza;
    }

    public Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public Parcel transactAndReadException(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.zza.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public void transactAndReadExceptionReturnVoid(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void transactOneway(int i, Parcel parcel) {
        try {
            this.zza.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
