package com.tencent.p014mm.sdcard_migrate;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.sdcard_migrate.h */
public interface C115961h extends IInterface {

    /* renamed from: com.tencent.mm.sdcard_migrate.h$a */
    public static abstract class C115962a extends Binder implements C115961h {

        /* renamed from: d */
        public static final /* synthetic */ int f347893d = 0;

        /* renamed from: com.tencent.mm.sdcard_migrate.h$a$a */
        public static class C115963a implements C115961h {

            /* renamed from: d */
            public IBinder f347894d;

            public C115963a(IBinder iBinder) {
                this.f347894d = iBinder;
            }

            public boolean G90() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.sdcard_migrate.IMigrateServiceController");
                    boolean z = false;
                    if (!this.f347894d.transact(1, obtain, obtain2, 0)) {
                        int i = C115962a.f347893d;
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

            public IBinder asBinder() {
                return this.f347894d;
            }

            /* renamed from: dx */
            public void mo176510dx(ExtStorageMigrateConfig extStorageMigrateConfig) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.sdcard_migrate.IMigrateServiceController");
                    if (extStorageMigrateConfig != null) {
                        obtain.writeInt(1);
                        extStorageMigrateConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f347894d.transact(4, obtain, obtain2, 0)) {
                        int i = C115962a.f347893d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: uR */
            public void mo176511uR(MigrateResultCallback migrateResultCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.sdcard_migrate.IMigrateServiceController");
                    if (migrateResultCallback != null) {
                        obtain.writeInt(1);
                        migrateResultCallback.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f347894d.transact(2, obtain, obtain2, 0)) {
                        int i = C115962a.f347893d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void vh0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.sdcard_migrate.IMigrateServiceController");
                    if (!this.f347894d.transact(5, obtain, obtain2, 0)) {
                        int i = C115962a.f347893d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C115962a() {
            attachInterface(this, "com.tencent.mm.sdcard_migrate.IMigrateServiceController");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [com.tencent.mm.sdcard_migrate.MigrateResultCallback] */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                java.lang.String r0 = "com.tencent.mm.sdcard_migrate.IMigrateServiceController"
                r1 = 1
                if (r5 == r1) goto L_0x0091
                r2 = 2
                r3 = 0
                if (r5 == r2) goto L_0x0075
                r2 = 3
                if (r5 == r2) goto L_0x0049
                r2 = 4
                if (r5 == r2) goto L_0x002d
                r2 = 5
                if (r5 == r2) goto L_0x0020
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r2) goto L_0x001c
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x001c:
                r7.writeString(r0)
                return r1
            L_0x0020:
                r6.enforceInterface(r0)
                r5 = r4
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService$a r5 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.C115935a) r5
                r5.vh0()
                r7.writeNoException()
                return r1
            L_0x002d:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003f
                android.os.Parcelable$Creator<com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig> r5 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateConfig.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig r3 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateConfig) r3
            L_0x003f:
                r5 = r4
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService$a r5 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.C115935a) r5
                r5.mo176510dx(r3)
                r7.writeNoException()
                return r1
            L_0x0049:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x005a
                android.os.Parcelable$Creator<com.tencent.mm.sdcard_migrate.MigrateResultCallback> r5 = com.tencent.p014mm.sdcard_migrate.MigrateResultCallback.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                com.tencent.mm.sdcard_migrate.MigrateResultCallback r5 = (com.tencent.p014mm.sdcard_migrate.MigrateResultCallback) r5
            L_0x005a:
                r5 = r4
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService$a r5 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.C115935a) r5
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService r6 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.this
                com.tencent.mm.sdcard_migrate.MigrateResultCallback[] r8 = r6.f347843g
                monitor-enter(r8)
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService r5 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.this     // Catch:{ all -> 0x0072 }
                com.tencent.mm.sdcard_migrate.MigrateResultCallback[] r5 = r5.f347843g     // Catch:{ all -> 0x0072 }
                r6 = 0
                r0 = r5[r6]     // Catch:{ all -> 0x0072 }
                if (r0 == 0) goto L_0x006d
                r5[r6] = r3     // Catch:{ all -> 0x0072 }
            L_0x006d:
                monitor-exit(r8)     // Catch:{ all -> 0x0072 }
                r7.writeNoException()
                return r1
            L_0x0072:
                r5 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x0072 }
                throw r5
            L_0x0075:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0087
                android.os.Parcelable$Creator<com.tencent.mm.sdcard_migrate.MigrateResultCallback> r5 = com.tencent.p014mm.sdcard_migrate.MigrateResultCallback.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                com.tencent.mm.sdcard_migrate.MigrateResultCallback r3 = (com.tencent.p014mm.sdcard_migrate.MigrateResultCallback) r3
            L_0x0087:
                r5 = r4
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService$a r5 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.C115935a) r5
                r5.mo176511uR(r3)
                r7.writeNoException()
                return r1
            L_0x0091:
                r6.enforceInterface(r0)
                r5 = r4
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService$a r5 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.C115935a) r5
                boolean r5 = r5.G90()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdcard_migrate.C115961h.C115962a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    boolean G90();

    /* renamed from: dx */
    void mo176510dx(ExtStorageMigrateConfig extStorageMigrateConfig);

    /* renamed from: uR */
    void mo176511uR(MigrateResultCallback migrateResultCallback);

    void vh0();
}
