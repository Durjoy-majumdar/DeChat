package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.tencent.tmsqmsp.oaid2.i0 */
public interface C116461i0 extends IInterface {
    /* renamed from: a */
    String mo179904a();

    /* renamed from: a */
    String mo179905a(String str);

    /* renamed from: com.tencent.tmsqmsp.oaid2.i0$a */
    public static abstract class C116462a extends Binder implements C116461i0 {
        /* renamed from: a */
        public static C116461i0 m164183a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C116461i0)) ? new C116463a(iBinder) : (C116461i0) queryLocalInterface;
        }

        /* renamed from: com.tencent.tmsqmsp.oaid2.i0$a$a */
        public static class C116463a implements C116461i0 {

            /* renamed from: a */
            public IBinder f349388a;

            public C116463a(IBinder iBinder) {
                this.f349388a = iBinder;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            public String mo179905a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    obtain.writeString(str);
                    this.f349388a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public IBinder asBinder() {
                return this.f349388a;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            public String mo179904a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.f349388a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }
    }
}
