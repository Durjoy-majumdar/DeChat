package gr0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gr0.b */
public interface C87321b extends IInterface {

    /* renamed from: gr0.b$a */
    public static abstract class C87322a extends Binder implements C87321b {

        /* renamed from: d */
        public static final /* synthetic */ int f253066d = 0;

        /* renamed from: gr0.b$a$a */
        public static class C87323a implements C87321b {

            /* renamed from: d */
            public IBinder f253067d;

            public C87323a(IBinder iBinder) {
                this.f253067d = iBinder;
            }

            public void W00(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCallback");
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f253067d.transact(2, obtain, obtain2, 0)) {
                        int i = C87322a.f253066d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f253067d;
            }
        }
    }

    void W00(IBinder iBinder);
}
