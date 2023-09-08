package qt3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.soter.soterserver.SoterExportResult;
import com.tencent.soter.soterserver.SoterExtraParam;
import com.tencent.soter.soterserver.SoterSessionResult;
import com.tencent.soter.soterserver.SoterSignResult;

/* renamed from: qt3.a */
public interface C22129a extends IInterface {

    /* renamed from: qt3.a$a */
    public static abstract class C22130a extends Binder implements C22129a {

        /* renamed from: d */
        public static final /* synthetic */ int f62615d = 0;

        /* renamed from: qt3.a$a$a */
        public static class C22131a implements C22129a {

            /* renamed from: d */
            public IBinder f62616d;

            public C22131a(IBinder iBinder) {
                this.f62616d = iBinder;
            }

            /* renamed from: AL */
            public SoterExtraParam mo35216AL(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeString(str);
                    if (!this.f62616d.transact(13, obtain, obtain2, 0)) {
                        int i = C22130a.f62615d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? SoterExtraParam.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int E20(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.f62616d.transact(5, obtain, obtain2, 0)) {
                        int i2 = C22130a.f62615d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: LE */
            public SoterExportResult mo35218LE(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeInt(i);
                    if (!this.f62616d.transact(2, obtain, obtain2, 0)) {
                        int i2 = C22130a.f62615d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? SoterExportResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: M9 */
            public int mo35219M9(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeInt(i);
                    if (!this.f62616d.transact(7, obtain, obtain2, 0)) {
                        int i2 = C22130a.f62615d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: TO */
            public SoterSessionResult mo35220TO(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f62616d.transact(9, obtain, obtain2, 0)) {
                        int i2 = C22130a.f62615d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? SoterSessionResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int W50(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.f62616d.transact(4, obtain, obtain2, 0)) {
                        int i2 = C22130a.f62615d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ZF */
            public SoterSignResult mo35222ZF(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeLong(j);
                    if (!this.f62616d.transact(10, obtain, obtain2, 0)) {
                        int i = C22130a.f62615d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? SoterSignResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f62616d;
            }

            /* renamed from: bD */
            public boolean mo35223bD(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f62616d.transact(8, obtain, obtain2, 0)) {
                        int i2 = C22130a.f62615d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int jp0(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeInt(i);
                    if (!this.f62616d.transact(1, obtain, obtain2, 0)) {
                        int i2 = C22130a.f62615d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean lj0(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f62616d.transact(3, obtain, obtain2, 0)) {
                        int i2 = C22130a.f62615d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: mL */
            public SoterExportResult mo35226mL(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.f62616d.transact(6, obtain, obtain2, 0)) {
                        int i2 = C22130a.f62615d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? SoterExportResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: AL */
    SoterExtraParam mo35216AL(String str);

    int E20(int i, String str);

    /* renamed from: LE */
    SoterExportResult mo35218LE(int i);

    /* renamed from: M9 */
    int mo35219M9(int i);

    /* renamed from: TO */
    SoterSessionResult mo35220TO(int i, String str, String str2);

    int W50(int i, String str);

    /* renamed from: ZF */
    SoterSignResult mo35222ZF(long j);

    /* renamed from: bD */
    boolean mo35223bD(int i, String str);

    int jp0(int i);

    boolean lj0(int i);

    /* renamed from: mL */
    SoterExportResult mo35226mL(int i, String str);
}
