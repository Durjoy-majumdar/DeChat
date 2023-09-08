package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.network.x */
public interface C81044x extends IInterface {

    /* renamed from: com.tencent.mm.network.x$a */
    public static abstract class C81045a extends Binder implements C81044x {

        /* renamed from: d */
        public static final /* synthetic */ int f238069d = 0;

        /* renamed from: com.tencent.mm.network.x$a$a */
        public static class C81046a implements C81044x {

            /* renamed from: d */
            public IBinder f238070d;

            public C81046a(IBinder iBinder) {
                this.f238070d = iBinder;
            }

            public IBinder asBinder() {
                return this.f238070d;
            }

            /* renamed from: iD */
            public boolean mo112343iD() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IWorkerCallback_AIDL");
                    boolean z = false;
                    if (!this.f238070d.transact(1, obtain, obtain2, 0)) {
                        int i = C81045a.f238069d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C81045a() {
            attachInterface(this, "com.tencent.mm.network.IWorkerCallback_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.network.IWorkerCallback_AIDL");
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.network.IWorkerCallback_AIDL");
                return true;
            }
        }
    }

    /* renamed from: iD */
    boolean mo112343iD();
}
