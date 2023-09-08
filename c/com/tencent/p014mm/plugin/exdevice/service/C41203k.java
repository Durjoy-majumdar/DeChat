package com.tencent.p014mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.exdevice.service.k */
public interface C41203k extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.k$a */
    public static abstract class C41204a extends Binder implements C41203k {

        /* renamed from: d */
        public static final /* synthetic */ int f110960d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.k$a$a */
        public static class C41205a implements C41203k {

            /* renamed from: d */
            public IBinder f110961d;

            public C41205a(IBinder iBinder) {
                this.f110961d = iBinder;
            }

            public IBinder asBinder() {
                return this.f110961d;
            }

            public void wt0(double d, int i, int i2, byte[] bArr, double d2, int i3, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
                    obtain.writeDouble(d);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    obtain.writeDouble(d2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    if (!this.f110961d.transact(1, obtain, obtain2, 0)) {
                        int i4 = C41204a.f110960d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C41204a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
                ((C41180b) this).wt0(parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.readDouble(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
                return true;
            }
        }
    }

    void wt0(double d, int i, int i2, byte[] bArr, double d2, int i3, String str);
}
