package com.tencent.p014mm.remoteservice;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.remoteservice.C96899b;
import com.tencent.p014mm.remoteservice.RemoteService;

/* renamed from: com.tencent.mm.remoteservice.c */
public interface C96902c extends IInterface {

    /* renamed from: com.tencent.mm.remoteservice.c$a */
    public static abstract class C96903a extends Binder implements C96902c {

        /* renamed from: d */
        public static final /* synthetic */ int f283903d = 0;

        /* renamed from: com.tencent.mm.remoteservice.c$a$a */
        public static class C96904a implements C96902c {

            /* renamed from: d */
            public IBinder f283904d;

            public C96904a(IBinder iBinder) {
                this.f283904d = iBinder;
            }

            /* renamed from: DY */
            public void mo135246DY(String str, String str2, Bundle bundle, C96899b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.remoteservice.ICommRemoteServer");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f283904d.transact(1, obtain, obtain2, 0)) {
                        int i = C96903a.f283903d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f283904d;
            }
        }

        public C96903a() {
            attachInterface(this, "com.tencent.mm.remoteservice.ICommRemoteServer");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.remoteservice.ICommRemoteServer");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                ((RemoteService.C96896a) this).mo135246DY(readString, readString2, bundle, C96899b.C96900a.asInterface(parcel.readStrongBinder()));
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
                parcel2.writeString("com.tencent.mm.remoteservice.ICommRemoteServer");
                return true;
            }
        }
    }

    /* renamed from: DY */
    void mo135246DY(String str, String str2, Bundle bundle, C96899b bVar);
}
