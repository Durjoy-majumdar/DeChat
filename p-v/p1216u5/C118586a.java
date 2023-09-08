package p1216u5;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u5.a */
public interface C118586a extends IInterface {

    /* renamed from: u5.a$a */
    public static abstract class C118587a extends Binder implements C118586a {

        /* renamed from: d */
        public static final /* synthetic */ int f354878d = 0;

        /* renamed from: u5.a$a$a */
        public static class C118588a implements C118586a {

            /* renamed from: d */
            public IBinder f354879d;

            public C118588a(IBinder iBinder) {
                this.f354879d = iBinder;
            }

            public Bundle Wp0(int i, String str, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    if (!this.f354879d.transact(3, obtain, obtain2, 0)) {
                        int i2 = C118587a.f354878d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Xq */
            public int mo183337Xq(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f354879d.transact(1, obtain, obtain2, 0)) {
                        int i2 = C118587a.f354878d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f354879d;
            }

            /* renamed from: ks */
            public int mo183338ks(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f354879d.transact(5, obtain, obtain2, 0)) {
                        int i2 = C118587a.f354878d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle r50(int i, String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.f354879d.transact(4, obtain, obtain2, 0)) {
                        int i2 = C118587a.f354878d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: tx */
            public Bundle mo183340tx(int i, String str, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f354879d.transact(2, obtain, obtain2, 0)) {
                        int i2 = C118587a.f354878d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    Bundle Wp0(int i, String str, String str2, String str3, String str4);

    /* renamed from: Xq */
    int mo183337Xq(int i, String str, String str2);

    /* renamed from: ks */
    int mo183338ks(int i, String str, String str2);

    Bundle r50(int i, String str, String str2, String str3);

    /* renamed from: tx */
    Bundle mo183340tx(int i, String str, String str2, Bundle bundle);
}
