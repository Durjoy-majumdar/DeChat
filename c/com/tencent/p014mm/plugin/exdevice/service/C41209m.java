package com.tencent.p014mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager;

/* renamed from: com.tencent.mm.plugin.exdevice.service.m */
public interface C41209m extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.m$a */
    public static abstract class C41210a extends Binder implements C41209m {

        /* renamed from: d */
        public static final /* synthetic */ int f110964d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.m$a$a */
        public static class C41211a implements C41209m {

            /* renamed from: d */
            public IBinder f110965d;

            public C41211a(IBinder iBinder) {
                this.f110965d = iBinder;
            }

            public IBinder asBinder() {
                return this.f110965d;
            }

            /* renamed from: qV */
            public void mo64187qV(long j, int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (!this.f110965d.transact(1, obtain, obtain2, 0)) {
                        int i3 = C41210a.f110964d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C41210a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
                ((ExdeviceEventManager.C41108b) this).mo64187qV(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
                return true;
            }
        }
    }

    /* renamed from: qV */
    void mo64187qV(long j, int i, int i2, String str);
}
