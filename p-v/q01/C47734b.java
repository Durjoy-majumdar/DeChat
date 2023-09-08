package q01;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import t01.C48520a;

/* renamed from: q01.b */
public interface C47734b extends IInterface {

    /* renamed from: q01.b$a */
    public static abstract class C47735a extends Binder implements C47734b {

        /* renamed from: d */
        public static final /* synthetic */ int f128249d = 0;

        /* renamed from: q01.b$a$a */
        public static class C47736a implements C47734b {

            /* renamed from: d */
            public IBinder f128250d;

            public C47736a(IBinder iBinder) {
                this.f128250d = iBinder;
            }

            /* renamed from: A9 */
            public void mo72549A9(String str, int i, int i2, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (!this.f128250d.transact(1, obtain, obtain2, 0)) {
                        int i3 = C47735a.f128249d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f128250d;
            }

            /* renamed from: oD */
            public void mo72550oD(String str, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (!this.f128250d.transact(2, obtain, obtain2, 0)) {
                        int i = C47735a.f128249d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C47735a() {
            attachInterface(this, "com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
                ((C48520a.C48524d) this).mo72549A9(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
                ((C48520a.C48524d) this).mo72550oD(parcel.readString(), parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
                return true;
            }
        }
    }

    /* renamed from: A9 */
    void mo72549A9(String str, int i, int i2, String str2);

    /* renamed from: oD */
    void mo72550oD(String str, long j, long j2);
}
