package ee0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.modelstat.C29039o;
import com.tencent.p014mm.modelstat.C29043p;
import f40.C86709a0;

/* renamed from: ee0.b */
public interface C31566b extends IInterface {

    /* renamed from: ee0.b$a */
    public static abstract class C31567a extends Binder implements C31566b {

        /* renamed from: d */
        public static final /* synthetic */ int f84370d = 0;

        /* renamed from: ee0.b$a$a */
        public static class C31568a implements C31566b {

            /* renamed from: d */
            public IBinder f84371d;

            public C31568a(IBinder iBinder) {
                this.f84371d = iBinder;
            }

            public IBinder asBinder() {
                return this.f84371d;
            }

            public void qu0(int i, int i2, int i3, int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    if (!this.f84371d.transact(2, obtain, obtain2, 0)) {
                        int i5 = C31567a.f84370d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C31567a() {
            attachInterface(this, "com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
                C86709a0.m107525e().postToWorkerDelayed(new C29043p((C29039o) this, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0), 3000);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
                ((C29039o) this).qu0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
                return true;
            }
        }
    }

    void qu0(int i, int i2, int i3, int i4);
}
