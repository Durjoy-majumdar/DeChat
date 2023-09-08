package com.tencent.matrix.openglleak.detector;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.openglleak.detector.OpenglIndexDetectorService;
import java.util.Map;

/* renamed from: com.tencent.matrix.openglleak.detector.a */
public interface C80507a extends IInterface {

    /* renamed from: com.tencent.matrix.openglleak.detector.a$a */
    public static abstract class C80508a extends Binder implements C80507a {

        /* renamed from: d */
        public static final /* synthetic */ int f235508d = 0;

        /* renamed from: com.tencent.matrix.openglleak.detector.a$a$a */
        public static class C80509a implements C80507a {

            /* renamed from: d */
            public IBinder f235509d;

            public C80509a(IBinder iBinder) {
                this.f235509d = iBinder;
            }

            public IBinder asBinder() {
                return this.f235509d;
            }

            /* renamed from: uN */
            public void mo112032uN() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
                    if (!this.f235509d.transact(2, obtain, obtain2, 0)) {
                        int i = C80508a.f235508d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Map zs0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
                    if (!this.f235509d.transact(1, obtain, obtain2, 0)) {
                        int i = C80508a.f235508d;
                    }
                    obtain2.readException();
                    return obtain2.readHashMap(C80509a.class.getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C80508a() {
            attachInterface(this, "com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
                Map<String, Integer> zs02 = ((OpenglIndexDetectorService.C80506a) this).zs0();
                parcel2.writeNoException();
                parcel2.writeMap(zs02);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
                ((OpenglIndexDetectorService.C80506a) this).mo112032uN();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
                return true;
            }
        }
    }

    /* renamed from: uN */
    void mo112032uN();

    Map zs0();
}
