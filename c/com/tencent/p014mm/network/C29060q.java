package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.network.q */
public interface C29060q extends IInterface {

    /* renamed from: com.tencent.mm.network.q$a */
    public static abstract class C29061a extends Binder implements C29060q {
        private static final String DESCRIPTOR = "com.tencent.mm.network.IOnNetworkChange_AIDL";
        public static final int TRANSACTION_onNetworkChange = 1;

        /* renamed from: com.tencent.mm.network.q$a$a */
        public static class C29062a implements C29060q {

            /* renamed from: e */
            public static C29060q f79607e;

            /* renamed from: d */
            public IBinder f79608d;

            public C29062a(IBinder iBinder) {
                this.f79608d = iBinder;
            }

            public IBinder asBinder() {
                return this.f79608d;
            }

            public void onNetworkChange(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C29061a.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.f79608d.transact(1, obtain, obtain2, 0) || C29061a.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C29061a.getDefaultImpl().onNetworkChange(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C29061a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static C29060q asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C29060q)) ? new C29062a(iBinder) : (C29060q) queryLocalInterface;
        }

        public static C29060q getDefaultImpl() {
            return C29062a.f79607e;
        }

        public static boolean setDefaultImpl(C29060q qVar) {
            if (C29062a.f79607e != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (qVar == null) {
                return false;
            } else {
                C29062a.f79607e = qVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onNetworkChange(parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onNetworkChange(int i);
}
