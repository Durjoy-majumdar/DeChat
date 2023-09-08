package com.tencent.p014mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n71.C47169a;

/* renamed from: com.tencent.mm.plugin.exdevice.service.d */
public interface C41185d extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.d$a */
    public static abstract class C41186a extends Binder implements C41185d {

        /* renamed from: d */
        public static final /* synthetic */ int f110948d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.d$a$a */
        public static class C41187a implements C41185d {

            /* renamed from: d */
            public IBinder f110949d;

            public C41187a(IBinder iBinder) {
                this.f110949d = iBinder;
            }

            public IBinder asBinder() {
                return this.f110949d;
            }

            /* renamed from: fY */
            public void mo64239fY(int i, long j, int i2, int i3, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    if (!this.f110949d.transact(1, obtain, obtain2, 0)) {
                        int i4 = C41186a.f110948d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C41186a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
                ((C47169a) this).mo64239fY(parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
                return true;
            }
        }
    }

    /* renamed from: fY */
    void mo64239fY(int i, long j, int i2, int i3, byte[] bArr);
}
