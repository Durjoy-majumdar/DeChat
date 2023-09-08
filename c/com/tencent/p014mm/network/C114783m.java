package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.network.C114800v;

/* renamed from: com.tencent.mm.network.m */
public interface C114783m extends IInterface {

    /* renamed from: com.tencent.mm.network.m$a */
    public static abstract class C114784a extends Binder implements C114783m {

        /* renamed from: d */
        public static final /* synthetic */ int f344171d = 0;

        /* renamed from: com.tencent.mm.network.m$a$a */
        public static class C114785a implements C114783m {

            /* renamed from: d */
            public IBinder f344172d;

            public C114785a(IBinder iBinder) {
                this.f344172d = iBinder;
            }

            public IBinder asBinder() {
                return this.f344172d;
            }

            /* renamed from: jM */
            public void mo174439jM(C114800v vVar, int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IOnAutoAuth_AIDL");
                    obtain.writeStrongBinder(vVar != null ? vVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (!this.f344172d.transact(1, obtain, obtain2, 0)) {
                        int i3 = C114784a.f344171d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C114784a() {
            attachInterface(this, "com.tencent.mm.network.IOnAutoAuth_AIDL");
        }

        /* renamed from: a */
        public static C114783m m161566a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.network.IOnAutoAuth_AIDL");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C114783m)) ? new C114785a(iBinder) : (C114783m) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.network.IOnAutoAuth_AIDL");
                mo174439jM(C114800v.C114801a.m161583a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.network.IOnAutoAuth_AIDL");
                return true;
            }
        }
    }

    /* renamed from: jM */
    void mo174439jM(C114800v vVar, int i, int i2, String str);
}
