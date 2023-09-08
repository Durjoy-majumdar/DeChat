package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.network.j */
public interface C40377j extends IInterface {

    /* renamed from: com.tencent.mm.network.j$a */
    public static abstract class C40378a extends Binder implements C40377j {

        /* renamed from: d */
        public static final /* synthetic */ int f108505d = 0;

        /* renamed from: com.tencent.mm.network.j$a$a */
        public static class C40379a implements C40377j {

            /* renamed from: d */
            public IBinder f108506d;

            public C40379a(IBinder iBinder) {
                this.f108506d = iBinder;
            }

            public IBinder asBinder() {
                return this.f108506d;
            }

            /* renamed from: q2 */
            public void mo59883q2(boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IMMNetCommonCallback_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    if (!this.f108506d.transact(1, obtain, obtain2, 0)) {
                        int i2 = C40378a.f108505d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C40378a() {
            attachInterface(this, "com.tencent.mm.network.IMMNetCommonCallback_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.network.IMMNetCommonCallback_AIDL");
                mo59883q2(parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.network.IMMNetCommonCallback_AIDL");
                return true;
            }
        }
    }

    /* renamed from: q2 */
    void mo59883q2(boolean z, int i);
}
