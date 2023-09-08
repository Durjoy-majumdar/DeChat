package p908k9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p908k9.C76523b;

/* renamed from: k9.c */
public interface C76525c extends IInterface {

    /* renamed from: k9.c$a */
    public static abstract class C76526a extends Binder implements C76525c {

        /* renamed from: k9.c$a$a */
        public static class C76527a implements C76525c {

            /* renamed from: d */
            public IBinder f223979d;

            public C76527a(IBinder iBinder) {
                this.f223979d = iBinder;
            }

            public void Ed0(C76523b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
                    obtain.writeStrongBinder(bVar != null ? (C76523b.C76524a) bVar : null);
                    this.f223979d.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: XW */
            public int[] mo106753XW() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
                    this.f223979d.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f223979d;
            }

            public void fk0(C76523b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
                    obtain.writeStrongBinder(bVar != null ? (C76523b.C76524a) bVar : null);
                    this.f223979d.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int mm0(C76523b bVar, int[] iArr, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
                    obtain.writeStrongBinder(bVar != null ? (C76523b.C76524a) bVar : null);
                    obtain.writeIntArray(iArr);
                    obtain.writeByteArray(bArr);
                    this.f223979d.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: rx */
            public boolean mo106756rx(C76523b bVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
                    obtain.writeStrongBinder(bVar != null ? (C76523b.C76524a) bVar : null);
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f223979d.transact(1, obtain, obtain2, 0);
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

            /* renamed from: vU */
            public int[] mo106757vU(C76523b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
                    obtain.writeStrongBinder(bVar != null ? (C76523b.C76524a) bVar : null);
                    this.f223979d.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C76525c m92000a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.securitymgr.IAuthenticationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C76525c)) ? new C76527a(iBinder) : (C76525c) queryLocalInterface;
        }
    }

    void Ed0(C76523b bVar);

    /* renamed from: XW */
    int[] mo106753XW();

    void fk0(C76523b bVar);

    int mm0(C76523b bVar, int[] iArr, byte[] bArr);

    /* renamed from: rx */
    boolean mo106756rx(C76523b bVar, int i);

    /* renamed from: vU */
    int[] mo106757vU(C76523b bVar);
}
