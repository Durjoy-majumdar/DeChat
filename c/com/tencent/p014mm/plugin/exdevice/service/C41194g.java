package com.tencent.p014mm.plugin.exdevice.service;

import a81.C39512l;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.exdevice.service.C41200j;

/* renamed from: com.tencent.mm.plugin.exdevice.service.g */
public interface C41194g extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.g$a */
    public static abstract class C41195a extends Binder implements C41194g {

        /* renamed from: d */
        public static final /* synthetic */ int f110954d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.g$a$a */
        public static class C41196a implements C41194g {

            /* renamed from: d */
            public IBinder f110955d;

            public C41196a(IBinder iBinder) {
                this.f110955d = iBinder;
            }

            public void Jt0(long j, int i, int i2, String str, C41200j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    if (!this.f110955d.transact(1, obtain, obtain2, 0)) {
                        int i3 = C41195a.f110954d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f110955d;
            }
        }

        public C41195a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            C41200j jVar;
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
                long readLong = parcel.readLong();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
                    jVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C41200j)) ? new C41200j.C41201a.C41202a(readStrongBinder) : (C41200j) queryLocalInterface;
                }
                ((C39512l) this).Jt0(readLong, readInt, readInt2, readString, jVar);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
                return true;
            }
        }
    }

    void Jt0(long j, int i, int i2, String str, C41200j jVar);
}
