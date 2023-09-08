package com.tencent.p014mm.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.service.b */
public interface C116021b extends IInterface {

    /* renamed from: com.tencent.mm.service.b$a */
    public static abstract class C116022a extends Binder implements C116021b {

        /* renamed from: d */
        public static final /* synthetic */ int f348006d = 0;

        /* renamed from: com.tencent.mm.service.b$a$a */
        public static class C116023a implements C116021b {

            /* renamed from: d */
            public IBinder f348007d;

            public C116023a(IBinder iBinder) {
                this.f348007d = iBinder;
            }

            /* renamed from: BE */
            public void mo176870BE(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f348007d.transact(3, obtain, obtain2, 0)) {
                        int i = C116022a.f348006d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ku */
            public void mo176871Ku(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f348007d.transact(2, obtain, obtain2, 0)) {
                        int i = C116022a.f348006d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ND */
            public void mo176872ND(Intent intent, C116018a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (!this.f348007d.transact(1, obtain, obtain2, 0)) {
                        int i = C116022a.f348006d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Vr */
            public void mo176873Vr(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f348007d.transact(4, obtain, obtain2, 0)) {
                        int i = C116022a.f348006d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f348007d;
            }
        }

        public C116022a() {
            attachInterface(this, "com.tencent.mm.service.IMMServiceStub_AIDL");
        }

        /* renamed from: a */
        public static C116021b m163156a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.service.IMMServiceStub_AIDL");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C116021b)) ? new C116023a(iBinder) : (C116021b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [com.tencent.mm.service.a] */
        /* JADX WARNING: type inference failed for: r0v6, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r0v9, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r0v12, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r0v15 */
        /* JADX WARNING: type inference failed for: r0v16 */
        /* JADX WARNING: type inference failed for: r0v17 */
        /* JADX WARNING: type inference failed for: r0v18 */
        /* JADX WARNING: type inference failed for: r0v19 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "com.tencent.mm.service.IMMServiceStub_AIDL"
                if (r5 == r1) goto L_0x0071
                r3 = 2
                if (r5 == r3) goto L_0x0055
                r3 = 3
                if (r5 == r3) goto L_0x0039
                r3 = 4
                if (r5 == r3) goto L_0x001d
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0019
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0019:
                r7.writeString(r2)
                return r1
            L_0x001d:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x002f
                android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x002f:
                r5 = r4
                com.tencent.mm.service.CommonProcessService$a r5 = (com.tencent.p014mm.service.CommonProcessService.C116017a) r5
                r5.mo176873Vr(r0)
                r7.writeNoException()
                return r1
            L_0x0039:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x004b
                android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x004b:
                r5 = r4
                com.tencent.mm.service.CommonProcessService$a r5 = (com.tencent.p014mm.service.CommonProcessService.C116017a) r5
                r5.mo176870BE(r0)
                r7.writeNoException()
                return r1
            L_0x0055:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0067
                android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x0067:
                r5 = r4
                com.tencent.mm.service.CommonProcessService$a r5 = (com.tencent.p014mm.service.CommonProcessService.C116017a) r5
                r5.mo176871Ku(r0)
                r7.writeNoException()
                return r1
            L_0x0071:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0083
                android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.content.Intent r5 = (android.content.Intent) r5
                goto L_0x0084
            L_0x0083:
                r5 = r0
            L_0x0084:
                android.os.IBinder r6 = r6.readStrongBinder()
                if (r6 != 0) goto L_0x008b
                goto L_0x00a0
            L_0x008b:
                java.lang.String r8 = "com.tencent.mm.service.IMMServiceConnectionStub_AIDL"
                android.os.IInterface r8 = r6.queryLocalInterface(r8)
                if (r8 == 0) goto L_0x009b
                boolean r0 = r8 instanceof com.tencent.p014mm.service.C116018a
                if (r0 == 0) goto L_0x009b
                r0 = r8
                com.tencent.mm.service.a r0 = (com.tencent.p014mm.service.C116018a) r0
                goto L_0x00a0
            L_0x009b:
                com.tencent.mm.service.a$a$a r0 = new com.tencent.mm.service.a$a$a
                r0.<init>(r6)
            L_0x00a0:
                r6 = r4
                com.tencent.mm.service.CommonProcessService$a r6 = (com.tencent.p014mm.service.CommonProcessService.C116017a) r6
                r6.mo176872ND(r5, r0)
                r7.writeNoException()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.service.C116021b.C116022a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: BE */
    void mo176870BE(Intent intent);

    /* renamed from: Ku */
    void mo176871Ku(Intent intent);

    /* renamed from: ND */
    void mo176872ND(Intent intent, C116018a aVar);

    /* renamed from: Vr */
    void mo176873Vr(Intent intent);
}
