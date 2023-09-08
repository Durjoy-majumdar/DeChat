package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.app.C114663g0;

/* renamed from: com.tencent.mm.network.i */
public interface C114773i extends IInterface {

    /* renamed from: com.tencent.mm.network.i$a */
    public static abstract class C114774a extends Binder implements C114773i {

        /* renamed from: d */
        public static final /* synthetic */ int f344150d = 0;

        /* renamed from: com.tencent.mm.network.i$a$a */
        public static class C114775a implements C114773i {

            /* renamed from: d */
            public IBinder f344151d;

            public C114775a(IBinder iBinder) {
                this.f344151d = iBinder;
            }

            public IBinder asBinder() {
                return this.f344151d;
            }

            public void c40(int i, int i2, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IIpxxCallback_AIDL");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (!this.f344151d.transact(1, obtain, obtain2, 0)) {
                        int i3 = C114774a.f344150d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C114774a() {
            attachInterface(this, "com.tencent.mm.network.IIpxxCallback_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.network.IIpxxCallback_AIDL");
                ((C114663g0.C114665b) this).c40(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.network.IIpxxCallback_AIDL");
                return true;
            }
        }
    }

    void c40(int i, int i2, long j, long j2);
}
