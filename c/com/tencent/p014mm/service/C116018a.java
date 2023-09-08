package com.tencent.p014mm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.service.a */
public interface C116018a extends IInterface {

    /* renamed from: com.tencent.mm.service.a$a */
    public static abstract class C116019a extends Binder implements C116018a {

        /* renamed from: d */
        public static final /* synthetic */ int f348004d = 0;

        /* renamed from: com.tencent.mm.service.a$a$a */
        public static class C116020a implements C116018a {

            /* renamed from: d */
            public IBinder f348005d;

            public C116020a(IBinder iBinder) {
                this.f348005d = iBinder;
            }

            /* renamed from: Gy */
            public void mo176874Gy(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f348005d.transact(1, obtain, obtain2, 0)) {
                        int i = C116019a.f348004d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f348005d;
            }
        }

        public C116019a() {
            attachInterface(this, "com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
                mo176874Gy(parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
                return true;
            }
        }
    }

    /* renamed from: Gy */
    void mo176874Gy(IBinder iBinder);
}
