package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.tencent.tmsqmsp.oaid2.g0 */
public interface C116453g0 extends IInterface {

    /* renamed from: com.tencent.tmsqmsp.oaid2.g0$a */
    public static abstract class C116454a extends Binder implements C116453g0 {

        /* renamed from: com.tencent.tmsqmsp.oaid2.g0$a$a */
        public static class C116455a implements C116453g0 {

            /* renamed from: a */
            public IBinder f349368a;

            public C116455a(IBinder iBinder) {
                this.f349368a = iBinder;
            }

            /* renamed from: a */
            public String mo179891a(String str, String str2, String str3) {
                String str4;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f349368a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    str4 = obtain2.readString();
                } catch (RemoteException unused) {
                    str4 = "";
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
                return str4;
            }

            public IBinder asBinder() {
                return this.f349368a;
            }
        }

        /* renamed from: a */
        public static C116453g0 m164163a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C116453g0)) ? new C116455a(iBinder) : (C116453g0) queryLocalInterface;
        }
    }
}
