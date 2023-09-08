package p428b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.a */
public interface C67122a extends IInterface {

    /* renamed from: b.a$a */
    public static abstract class C67123a extends Binder implements C67122a {

        /* renamed from: d */
        public static final /* synthetic */ int f192730d = 0;

        /* renamed from: b.a$a$a */
        public static class C67124a implements C67122a {

            /* renamed from: d */
            public IBinder f192731d;

            public C67124a(IBinder iBinder) {
                this.f192731d = iBinder;
            }

            public IBinder asBinder() {
                return this.f192731d;
            }

            public void p90(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f192731d.transact(1, obtain, (Parcel) null, 1)) {
                        int i2 = C67123a.f192730d;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    void p90(String str, int i, String str2, Notification notification);
}
