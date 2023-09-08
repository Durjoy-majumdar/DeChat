package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f40.C86723g;

/* renamed from: com.tencent.mm.network.k */
public interface C114778k extends IInterface {

    /* renamed from: com.tencent.mm.network.k$a */
    public static abstract class C114779a extends Binder implements C114778k {

        /* renamed from: d */
        public static final /* synthetic */ int f344158d = 0;

        /* renamed from: com.tencent.mm.network.k$a$a */
        public static class C114780a implements C114778k {

            /* renamed from: d */
            public IBinder f344159d;

            public C114780a(IBinder iBinder) {
                this.f344159d = iBinder;
            }

            public IBinder asBinder() {
                return this.f344159d;
            }

            public void networkAnalysisCallBack(int i, int i2, boolean z, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    if (!this.f344159d.transact(1, obtain, obtain2, 0)) {
                        int i3 = C114779a.f344158d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C114779a() {
            attachInterface(this, "com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
                ((C86723g.C86731c) this).networkAnalysisCallBack(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
                return true;
            }
        }
    }

    void networkAnalysisCallBack(int i, int i2, boolean z, String str);
}
