package com.tencent.p014mm.plugin.exdevice.service;

import a81.C39516n;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.exdevice.service.i */
public interface C18693i extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.i$a */
    public static abstract class C18694a extends Binder implements C18693i {

        /* renamed from: d */
        public static final /* synthetic */ int f52292d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.i$a$a */
        public static class C18695a implements C18693i {

            /* renamed from: d */
            public IBinder f52293d;

            public C18695a(IBinder iBinder) {
                this.f52293d = iBinder;
            }

            public int Km0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                    if (!this.f52293d.transact(3, obtain, obtain2, 0)) {
                        int i = C18694a.f52292d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f52293d;
            }

            public long getDeviceId() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                    if (!this.f52293d.transact(1, obtain, obtain2, 0)) {
                        int i = C18694a.f52292d;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: gh */
            public int mo23534gh() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                    if (!this.f52293d.transact(5, obtain, obtain2, 0)) {
                        int i = C18694a.f52292d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: qq */
            public byte[] mo23535qq() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                    if (!this.f52293d.transact(2, obtain, obtain2, 0)) {
                        int i = C18694a.f52292d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: rX */
            public int mo23536rX() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                    if (!this.f52293d.transact(4, obtain, obtain2, 0)) {
                        int i = C18694a.f52292d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C18694a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                long deviceId = ((C39516n) this).getDeviceId();
                parcel2.writeNoException();
                parcel2.writeLong(deviceId);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                byte[] qq = ((C39516n) this).mo23535qq();
                parcel2.writeNoException();
                parcel2.writeByteArray(qq);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                int Km0 = ((C39516n) this).Km0();
                parcel2.writeNoException();
                parcel2.writeInt(Km0);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                short s = ((C39516n) this).f106097e.f126720b;
                parcel2.writeNoException();
                parcel2.writeInt(s);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                int gh = ((C39516n) this).mo23534gh();
                parcel2.writeNoException();
                parcel2.writeInt(gh);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                return true;
            }
        }
    }

    int Km0();

    long getDeviceId();

    /* renamed from: gh */
    int mo23534gh();

    /* renamed from: qq */
    byte[] mo23535qq();

    /* renamed from: rX */
    int mo23536rX();
}
