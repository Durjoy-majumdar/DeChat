package bv3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bv3.a */
public abstract class C0386a extends Binder implements IInterface {
    public C0386a() {
        attachInterface(this, "com.tencent.tinker.lib.IForeService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("com.tencent.tinker.lib.IForeService");
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.tencent.tinker.lib.IForeService");
            return true;
        }
    }
}
