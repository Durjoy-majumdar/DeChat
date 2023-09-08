package p1063x8;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: x8.a */
public interface C91141a extends IInterface {

    /* renamed from: x8.a$a */
    public static abstract class C91142a extends Binder implements C91141a {

        /* renamed from: d */
        public static final /* synthetic */ int f261358d = 0;

        /* renamed from: x8.a$a$a */
        public static class C91143a implements C91141a {

            /* renamed from: d */
            public IBinder f261359d;

            public C91143a(IBinder iBinder) {
                this.f261359d = iBinder;
            }

            /* renamed from: Fn */
            public boolean mo125212Fn(Intent intent, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                    boolean z = true;
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f261359d.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f261359d;
            }

            public int getVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                    this.f261359d.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: Fn */
    boolean mo125212Fn(Intent intent, Bundle bundle);

    int getVersion();
}
