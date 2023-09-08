package p20;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.ipcinvoker.C80907o;

/* renamed from: p20.b */
public interface C89308b extends IInterface {

    /* renamed from: p20.b$a */
    public static abstract class C89309a extends Binder implements C89308b {

        /* renamed from: d */
        public static final /* synthetic */ int f257264d = 0;

        /* renamed from: p20.b$a$a */
        public static class C89310a implements C89308b {

            /* renamed from: d */
            public IBinder f257265d;

            public C89310a(IBinder iBinder) {
                this.f257265d = iBinder;
            }

            public IBinder asBinder() {
                return this.f257265d;
            }

            public void onCallback(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f257265d.transact(1, obtain, obtain2, 0)) {
                        int i = C89309a.f257264d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C89309a() {
            attachInterface(this, "com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
                ((C80907o.C80909b) this).onCallback(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
                return true;
            }
        }
    }

    void onCallback(Bundle bundle);
}
