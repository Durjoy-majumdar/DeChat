package com.tencent.p014mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.exdevice.model.C41119a;

/* renamed from: com.tencent.mm.plugin.exdevice.service.h */
public interface C41197h extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.h$a */
    public static abstract class C41198a extends Binder implements C41197h {

        /* renamed from: d */
        public static final /* synthetic */ int f110956d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.h$a$a */
        public static class C41199a implements C41197h {

            /* renamed from: d */
            public IBinder f110957d;

            public C41199a(IBinder iBinder) {
                this.f110957d = iBinder;
            }

            /* renamed from: Wv */
            public Bundle mo64192Wv(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f110957d.transact(1, obtain, obtain2, 0)) {
                        int i2 = C41198a.f110956d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f110957d;
            }
        }

        public C41198a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
                ((C41119a) this).mo64192Wv(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
                return true;
            }
        }
    }

    /* renamed from: Wv */
    Bundle mo64192Wv(int i, Bundle bundle);
}
