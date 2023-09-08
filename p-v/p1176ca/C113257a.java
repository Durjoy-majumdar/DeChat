package p1176ca;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ca.a */
public interface C113257a extends IInterface {

    /* renamed from: ca.a$a */
    public static abstract class C113258a extends Binder implements C113257a {

        /* renamed from: d */
        public static final /* synthetic */ int f338869d = 0;

        /* renamed from: ca.a$a$a */
        public static class C113259a implements C113257a {

            /* renamed from: d */
            public IBinder f338870d;

            public C113259a(IBinder iBinder) {
                this.f338870d = iBinder;
            }

            /* renamed from: a6 */
            public int mo165803a6(C113260b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f338870d.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f338870d;
            }

            /* renamed from: dI */
            public byte[] mo165804dI(String str, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    this.f338870d.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int jh0(String str, String str2, C113260b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f338870d.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void ov0(String str, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    this.f338870d.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: a6 */
    int mo165803a6(C113260b bVar);

    /* renamed from: dI */
    byte[] mo165804dI(String str, byte[] bArr);

    int jh0(String str, String str2, C113260b bVar);

    void ov0(String str, byte[] bArr);
}
