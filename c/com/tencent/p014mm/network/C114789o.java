package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.network.C114800v;
import ob0.C117734h0;

/* renamed from: com.tencent.mm.network.o */
public interface C114789o extends IInterface {

    /* renamed from: com.tencent.mm.network.o$a */
    public static abstract class C114790a extends Binder implements C114789o {

        /* renamed from: d */
        public static final /* synthetic */ int f344180d = 0;

        /* renamed from: com.tencent.mm.network.o$a$a */
        public static class C114791a implements C114789o {

            /* renamed from: d */
            public IBinder f344181d;

            public C114791a(IBinder iBinder) {
                this.f344181d = iBinder;
            }

            /* renamed from: Rb */
            public void mo174444Rb(int i, int i2, int i3, String str, C114800v vVar, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IOnGYNetEnd_AIDL");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(vVar != null ? vVar.asBinder() : null);
                    obtain.writeByteArray(bArr);
                    if (!this.f344181d.transact(1, obtain, obtain2, 0)) {
                        int i4 = C114790a.f344180d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f344181d;
            }
        }

        public C114790a() {
            attachInterface(this, "com.tencent.mm.network.IOnGYNetEnd_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
                ((C117734h0) this).mo174444Rb(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), C114800v.C114801a.m161583a(parcel.readStrongBinder()), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.network.IOnGYNetEnd_AIDL");
                return true;
            }
        }
    }

    /* renamed from: Rb */
    void mo174444Rb(int i, int i2, int i3, String str, C114800v vVar, byte[] bArr);
}
