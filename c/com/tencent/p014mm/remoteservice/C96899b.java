package com.tencent.p014mm.remoteservice;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.remoteservice.b */
public interface C96899b extends IInterface {

    /* renamed from: com.tencent.mm.remoteservice.b$a */
    public static abstract class C96900a extends Binder implements C96899b {

        /* renamed from: com.tencent.mm.remoteservice.b$a$a */
        public static class C96901a implements C96899b {

            /* renamed from: e */
            public static C96899b f283901e;

            /* renamed from: d */
            public IBinder f283902d;

            public C96901a(IBinder iBinder) {
                this.f283902d = iBinder;
            }

            public IBinder asBinder() {
                return this.f283902d;
            }

            public void onCallback(String str, Bundle bundle, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.remoteservice.ICommClientCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    if (this.f283902d.transact(1, obtain, obtain2, 0) || C96900a.getDefaultImpl() == null) {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            bundle.readFromParcel(obtain2);
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C96900a.getDefaultImpl().onCallback(str, bundle, z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C96900a() {
            attachInterface(this, "com.tencent.mm.remoteservice.ICommClientCallback");
        }

        public static C96899b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.remoteservice.ICommClientCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C96899b)) ? new C96901a(iBinder) : (C96899b) queryLocalInterface;
        }

        public static C96899b getDefaultImpl() {
            return C96901a.f283901e;
        }

        public static boolean setDefaultImpl(C96899b bVar) {
            if (C96901a.f283901e != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (bVar == null) {
                return false;
            } else {
                C96901a.f283901e = bVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.remoteservice.ICommClientCallback");
                String readString = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                onCallback(readString, bundle, parcel.readInt() != 0);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.remoteservice.ICommClientCallback");
                return true;
            }
        }
    }

    void onCallback(String str, Bundle bundle, boolean z);
}
