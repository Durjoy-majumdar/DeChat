package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.tencent.tmsqmsp.oaid2.n */
public interface C116470n extends IInterface {
    /* renamed from: b */
    String mo120395b();

    /* renamed from: b */
    String mo120396b(String str);

    /* renamed from: c */
    boolean mo120397c();

    /* renamed from: com.tencent.tmsqmsp.oaid2.n$a */
    public static abstract class C86069a extends Binder implements C116470n {
        /* renamed from: a */
        public static C116470n m106573a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C116470n)) ? new C86070a(iBinder) : (C116470n) queryLocalInterface;
        }

        /* renamed from: com.tencent.tmsqmsp.oaid2.n$a$a */
        public static class C86070a implements C116470n {

            /* renamed from: a */
            public IBinder f250540a;

            public C86070a(IBinder iBinder) {
                this.f250540a = iBinder;
            }

            public IBinder asBinder() {
                return this.f250540a;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: b */
            public String mo120395b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f250540a.transact(1, obtain, obtain2, 0);
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

            /* renamed from: c */
            public boolean mo120397c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                boolean z = false;
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f250540a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                } catch (RemoteException unused) {
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
                return z;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: b */
            public String mo120396b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    obtain.writeString(str);
                    this.f250540a.transact(5, obtain, obtain2, 0);
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
