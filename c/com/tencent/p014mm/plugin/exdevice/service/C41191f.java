package com.tencent.p014mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.exdevice.service.f */
public interface C41191f extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.f$a */
    public static abstract class C41192a extends Binder implements C41191f {

        /* renamed from: d */
        public static final /* synthetic */ int f110952d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.f$a$a */
        public static class C41193a implements C41191f {

            /* renamed from: d */
            public IBinder f110953d;

            public C41193a(IBinder iBinder) {
                this.f110953d = iBinder;
            }

            public IBinder asBinder() {
                return this.f110953d;
            }

            public void k20(long j, int i, int i2, int i3, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j2);
                    if (!this.f110953d.transact(1, obtain, obtain2, 0)) {
                        int i4 = C41192a.f110952d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C41192a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
                k20(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
                return true;
            }
        }
    }

    void k20(long j, int i, int i2, int i3, long j2);
}
