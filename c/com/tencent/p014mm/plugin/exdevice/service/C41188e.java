package com.tencent.p014mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.exdevice.service.e */
public interface C41188e extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.e$a */
    public static abstract class C41189a extends Binder implements C41188e {

        /* renamed from: d */
        public static final /* synthetic */ int f110950d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.e$a$a */
        public static class C41190a implements C41188e {

            /* renamed from: d */
            public IBinder f110951d;

            public C41190a(IBinder iBinder) {
                this.f110951d = iBinder;
            }

            public IBinder asBinder() {
                return this.f110951d;
            }

            /* renamed from: gj */
            public void mo64196gj(int i, int i2, String str, String str2, String str3, int i3, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    if (!this.f110951d.transact(1, obtain, obtain2, 0)) {
                        int i4 = C41189a.f110950d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C41189a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
        }

        /* renamed from: a */
        public static C41188e m44638a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C41188e)) ? new C41190a(iBinder) : (C41188e) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
                mo64196gj(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
                return true;
            }
        }
    }

    /* renamed from: gj */
    void mo64196gj(int i, int i2, String str, String str2, String str3, int i3, byte[] bArr);
}
