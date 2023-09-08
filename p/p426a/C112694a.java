package p426a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a.a */
public interface C112694a extends IInterface {

    /* renamed from: a.a$a */
    public static abstract class C112695a extends Binder implements C112694a {

        /* renamed from: a.a$a$a */
        public static class C112696a implements C112694a {

            /* renamed from: d */
            public IBinder f337416d;

            public C112696a(IBinder iBinder) {
                this.f337416d = iBinder;
            }

            /* renamed from: RM */
            public void mo164422RM(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f337416d.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f337416d;
            }

            /* renamed from: fN */
            public void mo164423fN(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f337416d.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C112694a m154098a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C112694a)) ? new C112696a(iBinder) : (C112694a) queryLocalInterface;
        }
    }

    /* renamed from: RM */
    void mo164422RM(String str, Bundle bundle);

    /* renamed from: fN */
    void mo164423fN(Bundle bundle);
}
