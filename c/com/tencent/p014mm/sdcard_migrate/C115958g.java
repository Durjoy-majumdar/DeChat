package com.tencent.p014mm.sdcard_migrate;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.tencent.p014mm.sdcard_migrate.util.ExtStorageMigrateException;

/* renamed from: com.tencent.mm.sdcard_migrate.g */
public interface C115958g extends IInterface {

    /* renamed from: com.tencent.mm.sdcard_migrate.g$a */
    public static abstract class C115959a extends Binder implements C115958g {

        /* renamed from: com.tencent.mm.sdcard_migrate.g$a$a */
        public static class C115960a implements C115958g {

            /* renamed from: d */
            public IBinder f347892d;

            public C115960a(IBinder iBinder) {
                this.f347892d = iBinder;
            }

            public IBinder asBinder() {
                return this.f347892d;
            }
        }

        public C115959a() {
            attachInterface(this, "com.tencent.mm.sdcard_migrate.IMigrateResultCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.tencent.mm.sdcard_migrate.IMigrateResultCallback");
                        int readInt = parcel.readInt();
                        MigrateResultCallback migrateResultCallback = (MigrateResultCallback) this;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            migrateResultCallback.mo176469c(readInt);
                        } else {
                            migrateResultCallback.f347869d.post(new C115964i(migrateResultCallback, readInt));
                        }
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.tencent.mm.sdcard_migrate.IMigrateResultCallback");
                        ((MigrateResultCallback) this).mo176533o(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.tencent.mm.sdcard_migrate.IMigrateResultCallback");
                        int readInt2 = parcel.readInt();
                        MigrateResultCallback migrateResultCallback2 = (MigrateResultCallback) this;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            migrateResultCallback2.mo176471f(readInt2);
                        } else {
                            migrateResultCallback2.f347869d.post(new C115965j(migrateResultCallback2, readInt2));
                        }
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.tencent.mm.sdcard_migrate.IMigrateResultCallback");
                        ((MigrateResultCallback) this).mo176532m(parcel.readInt(), parcel.readInt() != 0 ? ExtStorageMigrateException.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.tencent.mm.sdcard_migrate.IMigrateResultCallback");
                        MigrateResultCallback migrateResultCallback3 = (MigrateResultCallback) this;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            migrateResultCallback3.mo176473j();
                        } else {
                            migrateResultCallback3.f347869d.post(new C115966k(migrateResultCallback3));
                        }
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.tencent.mm.sdcard_migrate.IMigrateResultCallback");
                        int readInt3 = parcel.readInt();
                        int readInt4 = parcel.readInt();
                        MigrateResultCallback migrateResultCallback4 = (MigrateResultCallback) this;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            migrateResultCallback4.mo176468a(readInt3, readInt4);
                        } else {
                            migrateResultCallback4.f347869d.post(new C115967l(migrateResultCallback4, readInt3, readInt4));
                        }
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.tencent.mm.sdcard_migrate.IMigrateResultCallback");
                return true;
            }
        }
    }
}
