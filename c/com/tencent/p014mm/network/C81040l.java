package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.network.l */
public interface C81040l extends IInterface {

    /* renamed from: com.tencent.mm.network.l$a */
    public static abstract class C81041a extends Binder implements C81040l {

        /* renamed from: d */
        public static final /* synthetic */ int f238064d = 0;

        /* renamed from: com.tencent.mm.network.l$a$a */
        public static class C81042a implements C81040l {

            /* renamed from: d */
            public IBinder f238065d;

            public C81042a(IBinder iBinder) {
                this.f238065d = iBinder;
            }

            public IBinder asBinder() {
                return this.f238065d;
            }

            /* renamed from: gY */
            public boolean mo112945gY(C29060q qVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
                    obtain.writeStrongBinder(qVar != null ? qVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f238065d.transact(2, obtain, obtain2, 0)) {
                        int i = C81041a.f238064d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: wL */
            public int mo112946wL() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
                    if (!this.f238065d.transact(1, obtain, obtain2, 0)) {
                        int i = C81041a.f238064d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C81041a() {
            attachInterface(this, "com.tencent.mm.network.INetworkEvent_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
                int wL = ((C114787n0) this).mo112946wL();
                parcel2.writeNoException();
                parcel2.writeInt(wL);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
                ((C114787n0) this).mo112945gY(C29060q.C29061a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
                boolean z = false;
                try {
                    z = ((C114787n0) this).f344177g.unregister(C29060q.C29061a.asInterface(parcel.readStrongBinder()));
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.NetworkEvent", "removeListener %s", e);
                    Log.m105921e("MicroMsg.NetworkEvent", "exception:%s", Util.stackTraceToString(e));
                }
                parcel2.writeNoException();
                parcel2.writeInt(z ? 1 : 0);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
                ((C114787n0) this).f344177g.kill();
                parcel2.writeNoException();
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
                parcel2.writeNoException();
                parcel2.writeLong(0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.network.INetworkEvent_AIDL");
                return true;
            }
        }
    }

    /* renamed from: gY */
    boolean mo112945gY(C29060q qVar);

    /* renamed from: wL */
    int mo112946wL();
}
