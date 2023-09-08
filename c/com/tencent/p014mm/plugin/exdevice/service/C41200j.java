package com.tencent.p014mm.plugin.exdevice.service;

import a81.C39515m;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.exdevice.service.C18693i;
import com.tencent.p014mm.plugin.exdevice.service.C41194g;

/* renamed from: com.tencent.mm.plugin.exdevice.service.j */
public interface C41200j extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.j$a */
    public static abstract class C41201a extends Binder implements C41200j {

        /* renamed from: d */
        public static final /* synthetic */ int f110958d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.j$a$a */
        public static class C41202a implements C41200j {

            /* renamed from: d */
            public IBinder f110959d;

            public C41202a(IBinder iBinder) {
                this.f110959d = iBinder;
            }

            public IBinder asBinder() {
                return this.f110959d;
            }

            public C18693i getReqObj() {
                C18693i iVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
                    if (!this.f110959d.transact(1, obtain, obtain2, 0)) {
                        int i = C41201a.f110958d;
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i2 = C18693i.C18694a.f52292d;
                    if (readStrongBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                        iVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C18693i)) ? new C18693i.C18694a.C18695a(readStrongBinder) : (C18693i) queryLocalInterface;
                    }
                    return iVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C41194g wb0() {
                C41194g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
                    if (!this.f110959d.transact(2, obtain, obtain2, 0)) {
                        int i = C41201a.f110958d;
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i2 = C41194g.C41195a.f110954d;
                    if (readStrongBinder == null) {
                        gVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
                        gVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C41194g)) ? new C41194g.C41195a.C41196a(readStrongBinder) : (C41194g) queryLocalInterface;
                    }
                    return gVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C41201a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
                C18693i reqObj = ((C39515m) this).getReqObj();
                parcel2.writeNoException();
                if (reqObj != null) {
                    iBinder = (C18693i.C18694a) reqObj;
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
                C41194g wb02 = ((C39515m) this).wb0();
                parcel2.writeNoException();
                if (wb02 != null) {
                    iBinder = (C41194g.C41195a) wb02;
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
                return true;
            }
        }
    }

    C18693i getReqObj();

    C41194g wb0();
}
