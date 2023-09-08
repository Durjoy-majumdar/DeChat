package gr0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService0;
import gr0.C87321b;

/* renamed from: gr0.a */
public interface C87318a extends IInterface {

    /* renamed from: gr0.a$a */
    public static abstract class C87319a extends Binder implements C87318a {

        /* renamed from: d */
        public static final /* synthetic */ int f253064d = 0;

        /* renamed from: gr0.a$a$a */
        public static class C87320a implements C87318a {

            /* renamed from: d */
            public IBinder f253065d;

            public C87320a(IBinder iBinder) {
                this.f253065d = iBinder;
            }

            /* renamed from: Wc */
            public int mo115830Wc(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
                    obtain.writeInt(i);
                    if (!this.f253065d.transact(1, obtain, obtain2, 0)) {
                        int i2 = C87319a.f253064d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f253065d;
            }
        }

        public C87319a() {
            attachInterface(this, "com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            C87321b bVar;
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
                int Wc = ((AppBrandProcessTriggerService0.C83532a) this).mo115830Wc(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(Wc);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCallback");
                    bVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C87321b)) ? new C87321b.C87322a.C87323a(readStrongBinder) : (C87321b) queryLocalInterface;
                }
                AppBrandProcessTriggerService0.C83532a aVar = (AppBrandProcessTriggerService0.C83532a) this;
                AppBrandProcessTriggerService0.this.setCallback(bVar);
                if (bVar != null) {
                    bVar.W00(aVar);
                }
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
                return true;
            }
        }
    }

    /* renamed from: Wc */
    int mo115830Wc(int i);
}
