package android.support.p427v4.p1171os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p427v4.p1171os.ResultReceiver;

/* renamed from: android.support.v4.os.a */
public interface C112833a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    public static abstract class C112834a extends Binder implements C112833a {

        /* renamed from: d */
        public static final /* synthetic */ int f337817d = 0;

        /* renamed from: android.support.v4.os.a$a$a */
        public static class C112835a implements C112833a {

            /* renamed from: d */
            public IBinder f337818d;

            public C112835a(IBinder iBinder) {
                this.f337818d = iBinder;
            }

            /* renamed from: CZ */
            public void mo164638CZ(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f337818d.transact(1, obtain, (Parcel) null, 1)) {
                        int i2 = C112834a.f337817d;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f337818d;
            }
        }

        public C112834a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                ((ResultReceiver.C112831b) this).mo164638CZ(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: CZ */
    void mo164638CZ(int i, Bundle bundle);
}
