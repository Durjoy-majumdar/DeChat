package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.tencent.tmsqmsp.oaid2.q */
public interface C116476q extends IInterface {

    /* renamed from: com.tencent.tmsqmsp.oaid2.q$a */
    public static abstract class C116477a extends Binder implements C116476q {

        /* renamed from: com.tencent.tmsqmsp.oaid2.q$a$a */
        public static class C116478a implements C116476q {

            /* renamed from: a */
            public IBinder f349416a;

            public C116478a(IBinder iBinder) {
                this.f349416a = iBinder;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            public String mo179928a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f349416a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public IBinder asBinder() {
                return this.f349416a;
            }

            /* renamed from: c */
            public boolean mo179929c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                boolean z = false;
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f349416a.transact(2, obtain, obtain2, 0);
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
            /* renamed from: d */
            public String mo179930d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f349416a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            /* renamed from: f */
            public void mo179931f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f349416a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException unused) {
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
                if (r1.readInt() != 0) goto L_0x0027;
             */
            /* renamed from: g */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo179932g() {
                /*
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    r2 = 1
                    r3 = 0
                    java.lang.String r4 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r4)     // Catch:{ RemoteException -> 0x0026, all -> 0x001e }
                    android.os.IBinder r4 = r5.f349416a     // Catch:{ RemoteException -> 0x0026, all -> 0x001e }
                    r4.transact(r2, r0, r1, r3)     // Catch:{ RemoteException -> 0x0026, all -> 0x001e }
                    r1.readException()     // Catch:{ RemoteException -> 0x0026, all -> 0x001e }
                    int r4 = r1.readInt()     // Catch:{ RemoteException -> 0x0026, all -> 0x001e }
                    if (r4 == 0) goto L_0x0026
                    goto L_0x0027
                L_0x001e:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
                L_0x0026:
                    r2 = 0
                L_0x0027:
                    r1.recycle()
                    r0.recycle()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116476q.C116477a.C116478a.mo179932g():boolean");
            }
        }

        /* renamed from: a */
        public static C116476q m164248a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C116476q)) ? new C116478a(iBinder) : (C116476q) queryLocalInterface;
        }
    }

    /* renamed from: a */
    String mo179928a();

    /* renamed from: c */
    boolean mo179929c();

    /* renamed from: d */
    String mo179930d();

    /* renamed from: f */
    void mo179931f();

    /* renamed from: g */
    boolean mo179932g();
}
