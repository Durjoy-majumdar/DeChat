package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.tmsqmsp.oaid2.f */
public interface C116449f extends IInterface {

    /* renamed from: com.tencent.tmsqmsp.oaid2.f$a */
    public static abstract class C86058a extends Binder implements C116449f {

        /* renamed from: com.tencent.tmsqmsp.oaid2.f$a$a */
        public static class C86059a implements C116449f {

            /* renamed from: a */
            public IBinder f250529a;

            public C86059a(IBinder iBinder) {
                this.f250529a = iBinder;
            }

            public IBinder asBinder() {
                return this.f250529a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
                if (r1.readInt() == 0) goto L_0x0027;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo120375b() {
                /*
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    r2 = 0
                    r3 = 1
                    java.lang.String r4 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
                    r0.writeInterfaceToken(r4)     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    android.os.IBinder r4 = r5.f250529a     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    r4.transact(r3, r0, r1, r2)     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    r1.readException()     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    int r4 = r1.readInt()     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    if (r4 != 0) goto L_0x0026
                    goto L_0x0027
                L_0x001e:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
                L_0x0026:
                    r2 = 1
                L_0x0027:
                    r1.recycle()
                    r0.recycle()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116449f.C86058a.C86059a.mo120375b():boolean");
            }

            /* renamed from: c */
            public String mo120376c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.f250529a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                }
            }

            /* renamed from: i */
            public String mo120377i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.f250529a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                }
            }
        }

        /* renamed from: a */
        public static C116449f m106551a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C116449f)) ? new C86059a(iBinder) : (C116449f) queryLocalInterface;
        }
    }

    /* renamed from: b */
    boolean mo120375b();

    /* renamed from: c */
    String mo120376c();

    /* renamed from: i */
    String mo120377i();
}
