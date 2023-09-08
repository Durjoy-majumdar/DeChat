package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.tmsqmsp.oaid2.m */
public interface C86065m extends IInterface {

    /* renamed from: com.tencent.tmsqmsp.oaid2.m$a */
    public static abstract class C86066a extends Binder implements C86065m {

        /* renamed from: com.tencent.tmsqmsp.oaid2.m$a$a */
        public static class C86067a implements C86065m {

            /* renamed from: a */
            public IBinder f250538a;

            public C86067a(IBinder iBinder) {
                this.f250538a = iBinder;
            }

            public IBinder asBinder() {
                return this.f250538a;
            }

            /* renamed from: h */
            public boolean mo120384h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    boolean z = false;
                    this.f250538a.transact(2, obtain, obtain2, 0);
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

            /* renamed from: m */
            public String mo120385m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f250538a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C86065m m106562a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C86065m)) ? new C86067a(iBinder) : (C86065m) queryLocalInterface;
        }
    }

    /* renamed from: h */
    boolean mo120384h();

    /* renamed from: m */
    String mo120385m();
}
