package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.network.w */
public interface C40384w extends IInterface {

    /* renamed from: com.tencent.mm.network.w$a */
    public static abstract class C40385a extends Binder implements C40384w {

        /* renamed from: d */
        public static final /* synthetic */ int f108513d = 0;

        /* renamed from: com.tencent.mm.network.w$a$a */
        public static class C40386a implements C40384w {

            /* renamed from: d */
            public IBinder f108514d;

            public C40386a(IBinder iBinder) {
                this.f108514d = iBinder;
            }

            /* renamed from: Yt */
            public void mo62838Yt(boolean z, float f, float f2, boolean z2, int i, int i2, int i3, boolean z3, int i4, int i5, int i6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.ISpeedTestCallback_AIDL");
                    int i7 = 1;
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!z3) {
                        i7 = 0;
                    }
                    obtain.writeInt(i7);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f108514d.transact(2, obtain, obtain2, 0)) {
                        int i8 = C40385a.f108513d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f108514d;
            }

            /* renamed from: pB */
            public void mo62839pB(boolean z, float f, float f2, boolean z2, int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.ISpeedTestCallback_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.f108514d.transact(1, obtain, obtain2, 0)) {
                        int i4 = C40385a.f108513d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C40385a() {
            attachInterface(this, "com.tencent.mm.network.ISpeedTestCallback_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = i;
            Parcel parcel3 = parcel;
            if (i3 == 1) {
                Parcel parcel4 = parcel2;
                parcel3.enforceInterface("com.tencent.mm.network.ISpeedTestCallback_AIDL");
                mo62839pB(parcel.readInt() != 0, parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i3 == 2) {
                Parcel parcel5 = parcel2;
                parcel3.enforceInterface("com.tencent.mm.network.ISpeedTestCallback_AIDL");
                mo62838Yt(parcel.readInt() != 0, parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i3 != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.network.ISpeedTestCallback_AIDL");
                return true;
            }
        }
    }

    /* renamed from: Yt */
    void mo62838Yt(boolean z, float f, float f2, boolean z2, int i, int i2, int i3, boolean z3, int i4, int i5, int i6);

    /* renamed from: pB */
    void mo62839pB(boolean z, float f, float f2, boolean z2, int i, int i2, int i3);
}
