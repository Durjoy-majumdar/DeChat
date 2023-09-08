package com.tencent.p014mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.exdevice.model.C41125f0;

/* renamed from: com.tencent.mm.plugin.exdevice.service.l */
public interface C41206l extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.l$a */
    public static abstract class C41207a extends Binder implements C41206l {

        /* renamed from: d */
        public static final /* synthetic */ int f110962d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.l$a$a */
        public static class C41208a implements C41206l {

            /* renamed from: d */
            public IBinder f110963d;

            public C41208a(IBinder iBinder) {
                this.f110963d = iBinder;
            }

            public void Cc0(long j, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
                    obtain.writeLong(j);
                    obtain.writeByteArray(bArr);
                    if (!this.f110963d.transact(1, obtain, obtain2, 0)) {
                        int i = C41207a.f110962d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f110963d;
            }
        }

        public C41207a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
                ((C41125f0) this).Cc0(parcel.readLong(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
                return true;
            }
        }
    }

    void Cc0(long j, byte[] bArr);
}
