package com.tencent.p014mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.exdevice.service.c */
public interface C41182c extends IInterface {

    /* renamed from: com.tencent.mm.plugin.exdevice.service.c$a */
    public static abstract class C41183a extends Binder implements C41182c {

        /* renamed from: d */
        public static final /* synthetic */ int f110946d = 0;

        /* renamed from: com.tencent.mm.plugin.exdevice.service.c$a$a */
        public static class C41184a implements C41182c {

            /* renamed from: d */
            public IBinder f110947d;

            public C41184a(IBinder iBinder) {
                this.f110947d = iBinder;
            }

            /* renamed from: Ds */
            public void mo23540Ds(long j, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeLong(j);
                    obtain.writeByteArray(bArr);
                    if (!this.f110947d.transact(12, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Eh */
            public boolean mo23541Eh(int i, C41188e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f110947d.transact(2, obtain, obtain2, 0)) {
                        int i2 = C41183a.f110946d;
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

            public boolean Fk0(C41185d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f110947d.transact(9, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
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

            public boolean J90(int i, C41188e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f110947d.transact(1, obtain, obtain2, 0)) {
                        int i2 = C41183a.f110946d;
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

            public boolean Ks0(int i, C41188e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f110947d.transact(14, obtain, obtain2, 0)) {
                        int i2 = C41183a.f110946d;
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

            public boolean Pr0(long j, int i, C41191f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f110947d.transact(16, obtain, obtain2, 0)) {
                        int i2 = C41183a.f110946d;
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

            /* renamed from: Qk */
            public boolean mo23546Qk(String str, boolean z, C41203k kVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeString(str);
                    boolean z2 = true;
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
                    if (!this.f110947d.transact(13, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f110947d;
            }

            /* renamed from: bO */
            public boolean mo23547bO(long j, byte[] bArr, C41209m mVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeLong(j);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f110947d.transact(19, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
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

            public boolean i60(int i, C41188e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f110947d.transact(15, obtain, obtain2, 0)) {
                        int i2 = C41183a.f110946d;
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

            /* renamed from: mc */
            public long[] mo23557mc() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    if (!this.f110947d.transact(3, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
                    }
                    obtain2.readException();
                    return obtain2.createLongArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void n90(C41197h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    if (!this.f110947d.transact(11, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: pR */
            public long mo23559pR(C41200j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    if (!this.f110947d.transact(7, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean pq0(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.f110947d.transact(17, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
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

            public boolean vc0(long j, int i, C41191f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f110947d.transact(4, obtain, obtain2, 0)) {
                        int i2 = C41183a.f110946d;
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

            /* renamed from: vu */
            public boolean mo23562vu(C41206l lVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f110947d.transact(18, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
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

            public boolean wl0(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.f110947d.transact(5, obtain, obtain2, 0)) {
                        int i = C41183a.f110946d;
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
        }

        public C41183a() {
            attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r7v0 */
        /* JADX WARNING: type inference failed for: r7v1, types: [com.tencent.mm.plugin.exdevice.service.f] */
        /* JADX WARNING: type inference failed for: r7v5, types: [com.tencent.mm.plugin.exdevice.service.j] */
        /* JADX WARNING: type inference failed for: r7v9, types: [com.tencent.mm.plugin.exdevice.service.d] */
        /* JADX WARNING: type inference failed for: r7v13, types: [android.os.IInterface] */
        /* JADX WARNING: type inference failed for: r7v17, types: [com.tencent.mm.plugin.exdevice.service.h] */
        /* JADX WARNING: type inference failed for: r7v21, types: [com.tencent.mm.plugin.exdevice.service.k] */
        /* JADX WARNING: type inference failed for: r7v25, types: [com.tencent.mm.plugin.exdevice.service.f] */
        /* JADX WARNING: type inference failed for: r7v29, types: [com.tencent.mm.plugin.exdevice.service.l] */
        /* JADX WARNING: type inference failed for: r7v33, types: [com.tencent.mm.plugin.exdevice.service.m] */
        /* JADX WARNING: type inference failed for: r7v37 */
        /* JADX WARNING: type inference failed for: r7v38 */
        /* JADX WARNING: type inference failed for: r7v39 */
        /* JADX WARNING: type inference failed for: r7v40 */
        /* JADX WARNING: type inference failed for: r7v41 */
        /* JADX WARNING: type inference failed for: r7v42 */
        /* JADX WARNING: type inference failed for: r7v43 */
        /* JADX WARNING: type inference failed for: r7v44 */
        /* JADX WARNING: type inference failed for: r7v45 */
        /* JADX WARNING: type inference failed for: r7v46 */
        /* JADX WARNING: type inference failed for: r7v47 */
        /* JADX WARNING: type inference failed for: r7v48 */
        /* JADX WARNING: type inference failed for: r7v49 */
        /* JADX WARNING: type inference failed for: r7v50 */
        /* JADX WARNING: type inference failed for: r7v51 */
        /* JADX WARNING: type inference failed for: r7v52 */
        /* JADX WARNING: type inference failed for: r7v53 */
        /* JADX WARNING: type inference failed for: r7v54 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
            /*
                r8 = this;
                l71.a$b r0 = l71.C117461a.C117463b.INVOKE_ONCE
                r1 = 1
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r3 = "com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL"
                if (r9 == r2) goto L_0x02f7
                java.lang.String r2 = "MicroMsg.exdevice.RemoteBTDeviceAdapter"
                r4 = 0
                java.lang.String r5 = "com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL"
                java.lang.String r6 = "com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL"
                r7 = 0
                switch(r9) {
                    case 1: goto L_0x02da;
                    case 2: goto L_0x02bd;
                    case 3: goto L_0x02ac;
                    case 4: goto L_0x0279;
                    case 5: goto L_0x0264;
                    case 6: goto L_0x0257;
                    case 7: goto L_0x022a;
                    case 8: goto L_0x01dc;
                    case 9: goto L_0x01b1;
                    case 10: goto L_0x0174;
                    case 11: goto L_0x014b;
                    case 12: goto L_0x0136;
                    case 13: goto L_0x00fe;
                    case 14: goto L_0x00e1;
                    case 15: goto L_0x00c4;
                    case 16: goto L_0x0091;
                    case 17: goto L_0x007c;
                    case 18: goto L_0x004f;
                    case 19: goto L_0x001a;
                    default: goto L_0x0015;
                }
            L_0x0015:
                boolean r9 = super.onTransact(r9, r10, r11, r12)
                return r9
            L_0x001a:
                r10.enforceInterface(r3)
                long r2 = r10.readLong()
                byte[] r9 = r10.createByteArray()
                android.os.IBinder r10 = r10.readStrongBinder()
                if (r10 != 0) goto L_0x002c
                goto L_0x0041
            L_0x002c:
                java.lang.String r12 = "com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL"
                android.os.IInterface r12 = r10.queryLocalInterface(r12)
                if (r12 == 0) goto L_0x003c
                boolean r0 = r12 instanceof com.tencent.p014mm.plugin.exdevice.service.C41209m
                if (r0 == 0) goto L_0x003c
                r7 = r12
                com.tencent.mm.plugin.exdevice.service.m r7 = (com.tencent.p014mm.plugin.exdevice.service.C41209m) r7
                goto L_0x0041
            L_0x003c:
                com.tencent.mm.plugin.exdevice.service.m$a$a r7 = new com.tencent.mm.plugin.exdevice.service.m$a$a
                r7.<init>(r10)
            L_0x0041:
                r10 = r8
                com.tencent.mm.plugin.exdevice.service.o r10 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r10
                boolean r9 = r10.mo23547bO(r2, r9, r7)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x004f:
                r10.enforceInterface(r3)
                android.os.IBinder r9 = r10.readStrongBinder()
                if (r9 != 0) goto L_0x0059
                goto L_0x006e
            L_0x0059:
                java.lang.String r10 = "com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL"
                android.os.IInterface r10 = r9.queryLocalInterface(r10)
                if (r10 == 0) goto L_0x0069
                boolean r12 = r10 instanceof com.tencent.p014mm.plugin.exdevice.service.C41206l
                if (r12 == 0) goto L_0x0069
                r7 = r10
                com.tencent.mm.plugin.exdevice.service.l r7 = (com.tencent.p014mm.plugin.exdevice.service.C41206l) r7
                goto L_0x006e
            L_0x0069:
                com.tencent.mm.plugin.exdevice.service.l$a$a r7 = new com.tencent.mm.plugin.exdevice.service.l$a$a
                r7.<init>(r9)
            L_0x006e:
                r9 = r8
                com.tencent.mm.plugin.exdevice.service.o r9 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r9
                boolean r9 = r9.mo23562vu(r7)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x007c:
                r10.enforceInterface(r3)
                long r9 = r10.readLong()
                r12 = r8
                com.tencent.mm.plugin.exdevice.service.o r12 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r12
                boolean r9 = r12.pq0(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0091:
                r10.enforceInterface(r3)
                long r2 = r10.readLong()
                int r9 = r10.readInt()
                android.os.IBinder r10 = r10.readStrongBinder()
                if (r10 != 0) goto L_0x00a3
                goto L_0x00b6
            L_0x00a3:
                android.os.IInterface r12 = r10.queryLocalInterface(r6)
                if (r12 == 0) goto L_0x00b1
                boolean r0 = r12 instanceof com.tencent.p014mm.plugin.exdevice.service.C41191f
                if (r0 == 0) goto L_0x00b1
                r7 = r12
                com.tencent.mm.plugin.exdevice.service.f r7 = (com.tencent.p014mm.plugin.exdevice.service.C41191f) r7
                goto L_0x00b6
            L_0x00b1:
                com.tencent.mm.plugin.exdevice.service.f$a$a r7 = new com.tencent.mm.plugin.exdevice.service.f$a$a
                r7.<init>(r10)
            L_0x00b6:
                r10 = r8
                com.tencent.mm.plugin.exdevice.service.o r10 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r10
                boolean r9 = r10.Pr0(r2, r9, r7)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x00c4:
                r10.enforceInterface(r3)
                int r9 = r10.readInt()
                android.os.IBinder r10 = r10.readStrongBinder()
                com.tencent.mm.plugin.exdevice.service.e r10 = com.tencent.p014mm.plugin.exdevice.service.C41188e.C41189a.m44638a(r10)
                r12 = r8
                com.tencent.mm.plugin.exdevice.service.o r12 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r12
                boolean r9 = r12.i60(r9, r10)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x00e1:
                r10.enforceInterface(r3)
                int r9 = r10.readInt()
                android.os.IBinder r10 = r10.readStrongBinder()
                com.tencent.mm.plugin.exdevice.service.e r10 = com.tencent.p014mm.plugin.exdevice.service.C41188e.C41189a.m44638a(r10)
                r12 = r8
                com.tencent.mm.plugin.exdevice.service.o r12 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r12
                boolean r9 = r12.Ks0(r9, r10)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x00fe:
                r10.enforceInterface(r3)
                java.lang.String r9 = r10.readString()
                int r12 = r10.readInt()
                if (r12 == 0) goto L_0x010c
                r4 = 1
            L_0x010c:
                android.os.IBinder r10 = r10.readStrongBinder()
                if (r10 != 0) goto L_0x0113
                goto L_0x0128
            L_0x0113:
                java.lang.String r12 = "com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL"
                android.os.IInterface r12 = r10.queryLocalInterface(r12)
                if (r12 == 0) goto L_0x0123
                boolean r0 = r12 instanceof com.tencent.p014mm.plugin.exdevice.service.C41203k
                if (r0 == 0) goto L_0x0123
                r7 = r12
                com.tencent.mm.plugin.exdevice.service.k r7 = (com.tencent.p014mm.plugin.exdevice.service.C41203k) r7
                goto L_0x0128
            L_0x0123:
                com.tencent.mm.plugin.exdevice.service.k$a$a r7 = new com.tencent.mm.plugin.exdevice.service.k$a$a
                r7.<init>(r10)
            L_0x0128:
                r10 = r8
                com.tencent.mm.plugin.exdevice.service.o r10 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r10
                boolean r9 = r10.mo23546Qk(r9, r4, r7)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0136:
                r10.enforceInterface(r3)
                long r2 = r10.readLong()
                byte[] r9 = r10.createByteArray()
                r10 = r8
                com.tencent.mm.plugin.exdevice.service.o r10 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r10
                r10.mo23540Ds(r2, r9)
                r11.writeNoException()
                return r1
            L_0x014b:
                r10.enforceInterface(r3)
                android.os.IBinder r9 = r10.readStrongBinder()
                if (r9 != 0) goto L_0x0155
                goto L_0x016a
            L_0x0155:
                java.lang.String r10 = "com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL"
                android.os.IInterface r10 = r9.queryLocalInterface(r10)
                if (r10 == 0) goto L_0x0165
                boolean r12 = r10 instanceof com.tencent.p014mm.plugin.exdevice.service.C41197h
                if (r12 == 0) goto L_0x0165
                r7 = r10
                com.tencent.mm.plugin.exdevice.service.h r7 = (com.tencent.p014mm.plugin.exdevice.service.C41197h) r7
                goto L_0x016a
            L_0x0165:
                com.tencent.mm.plugin.exdevice.service.h$a$a r7 = new com.tencent.mm.plugin.exdevice.service.h$a$a
                r7.<init>(r9)
            L_0x016a:
                r9 = r8
                com.tencent.mm.plugin.exdevice.service.o r9 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r9
                r9.n90(r7)
                r11.writeNoException()
                return r1
            L_0x0174:
                r10.enforceInterface(r3)
                android.os.IBinder r9 = r10.readStrongBinder()
                if (r9 != 0) goto L_0x017e
                goto L_0x0191
            L_0x017e:
                android.os.IInterface r10 = r9.queryLocalInterface(r5)
                if (r10 == 0) goto L_0x018c
                boolean r12 = r10 instanceof com.tencent.p014mm.plugin.exdevice.service.C41185d
                if (r12 == 0) goto L_0x018c
                r7 = r10
                com.tencent.mm.plugin.exdevice.service.d r7 = (com.tencent.p014mm.plugin.exdevice.service.C41185d) r7
                goto L_0x0191
            L_0x018c:
                com.tencent.mm.plugin.exdevice.service.d$a$a r7 = new com.tencent.mm.plugin.exdevice.service.d$a$a
                r7.<init>(r9)
            L_0x0191:
                r9 = r8
                com.tencent.mm.plugin.exdevice.service.o r9 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r9
                java.lang.String r10 = "unRegistOnDeviceRequest"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.d> r9 = r9.f52298i
                boolean r9 = r9.unregister(r7)
                if (r9 != 0) goto L_0x01a7
                java.lang.String r10 = "mCBListOnDeviceReq.unregister Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r10)
            L_0x01a7:
                l71.C117461a.m165683c(r0)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x01b1:
                r10.enforceInterface(r3)
                android.os.IBinder r9 = r10.readStrongBinder()
                if (r9 != 0) goto L_0x01bb
                goto L_0x01ce
            L_0x01bb:
                android.os.IInterface r10 = r9.queryLocalInterface(r5)
                if (r10 == 0) goto L_0x01c9
                boolean r12 = r10 instanceof com.tencent.p014mm.plugin.exdevice.service.C41185d
                if (r12 == 0) goto L_0x01c9
                r7 = r10
                com.tencent.mm.plugin.exdevice.service.d r7 = (com.tencent.p014mm.plugin.exdevice.service.C41185d) r7
                goto L_0x01ce
            L_0x01c9:
                com.tencent.mm.plugin.exdevice.service.d$a$a r7 = new com.tencent.mm.plugin.exdevice.service.d$a$a
                r7.<init>(r9)
            L_0x01ce:
                r9 = r8
                com.tencent.mm.plugin.exdevice.service.o r9 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r9
                boolean r9 = r9.Fk0(r7)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x01dc:
                r10.enforceInterface(r3)
                long r9 = r10.readLong()
                r12 = r8
                com.tencent.mm.plugin.exdevice.service.o r12 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r12
                java.lang.Object[] r3 = new java.lang.Object[r1]
                java.lang.Long r5 = java.lang.Long.valueOf(r9)
                r3[r4] = r5
                java.lang.String r5 = "stopTask, task Id = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r3)
                r5 = 0
                int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r3 >= 0) goto L_0x0201
                java.lang.String r9 = "taskId < 0"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
                goto L_0x0223
            L_0x0201:
                com.tencent.mm.sdk.platformtools.MMHandler r12 = r12.f52302p
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                android.os.Message r9 = r12.obtainMessage(r1, r9)
                boolean r9 = r12.sendMessage(r9)
                if (r9 != 0) goto L_0x021f
                java.lang.Object[] r9 = new java.lang.Object[r1]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
                r9[r4] = r10
                java.lang.String r10 = "mHandler.sendMessage, message what = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r10, r9)
                goto L_0x0223
            L_0x021f:
                l71.C117461a.m165683c(r0)
                r4 = 1
            L_0x0223:
                r11.writeNoException()
                r11.writeInt(r4)
                return r1
            L_0x022a:
                r10.enforceInterface(r3)
                android.os.IBinder r9 = r10.readStrongBinder()
                if (r9 != 0) goto L_0x0234
                goto L_0x0249
            L_0x0234:
                java.lang.String r10 = "com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL"
                android.os.IInterface r10 = r9.queryLocalInterface(r10)
                if (r10 == 0) goto L_0x0244
                boolean r12 = r10 instanceof com.tencent.p014mm.plugin.exdevice.service.C41200j
                if (r12 == 0) goto L_0x0244
                r7 = r10
                com.tencent.mm.plugin.exdevice.service.j r7 = (com.tencent.p014mm.plugin.exdevice.service.C41200j) r7
                goto L_0x0249
            L_0x0244:
                com.tencent.mm.plugin.exdevice.service.j$a$a r7 = new com.tencent.mm.plugin.exdevice.service.j$a$a
                r7.<init>(r9)
            L_0x0249:
                r9 = r8
                com.tencent.mm.plugin.exdevice.service.o r9 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r9
                long r9 = r9.mo23559pR(r7)
                r11.writeNoException()
                r11.writeLong(r9)
                return r1
            L_0x0257:
                r10.enforceInterface(r3)
                r10.readLong()
                r11.writeNoException()
                r11.writeInt(r4)
                return r1
            L_0x0264:
                r10.enforceInterface(r3)
                long r9 = r10.readLong()
                r12 = r8
                com.tencent.mm.plugin.exdevice.service.o r12 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r12
                boolean r9 = r12.wl0(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0279:
                r10.enforceInterface(r3)
                long r2 = r10.readLong()
                int r9 = r10.readInt()
                android.os.IBinder r10 = r10.readStrongBinder()
                if (r10 != 0) goto L_0x028b
                goto L_0x029e
            L_0x028b:
                android.os.IInterface r12 = r10.queryLocalInterface(r6)
                if (r12 == 0) goto L_0x0299
                boolean r0 = r12 instanceof com.tencent.p014mm.plugin.exdevice.service.C41191f
                if (r0 == 0) goto L_0x0299
                r7 = r12
                com.tencent.mm.plugin.exdevice.service.f r7 = (com.tencent.p014mm.plugin.exdevice.service.C41191f) r7
                goto L_0x029e
            L_0x0299:
                com.tencent.mm.plugin.exdevice.service.f$a$a r7 = new com.tencent.mm.plugin.exdevice.service.f$a$a
                r7.<init>(r10)
            L_0x029e:
                r10 = r8
                com.tencent.mm.plugin.exdevice.service.o r10 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r10
                boolean r9 = r10.vc0(r2, r9, r7)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x02ac:
                r10.enforceInterface(r3)
                r9 = r8
                com.tencent.mm.plugin.exdevice.service.o r9 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r9
                long[] r9 = r9.mo23557mc()
                r11.writeNoException()
                r11.writeLongArray(r9)
                return r1
            L_0x02bd:
                r10.enforceInterface(r3)
                int r9 = r10.readInt()
                android.os.IBinder r10 = r10.readStrongBinder()
                com.tencent.mm.plugin.exdevice.service.e r10 = com.tencent.p014mm.plugin.exdevice.service.C41188e.C41189a.m44638a(r10)
                r12 = r8
                com.tencent.mm.plugin.exdevice.service.o r12 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r12
                boolean r9 = r12.mo23541Eh(r9, r10)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x02da:
                r10.enforceInterface(r3)
                int r9 = r10.readInt()
                android.os.IBinder r10 = r10.readStrongBinder()
                com.tencent.mm.plugin.exdevice.service.e r10 = com.tencent.p014mm.plugin.exdevice.service.C41188e.C41189a.m44638a(r10)
                r12 = r8
                com.tencent.mm.plugin.exdevice.service.o r12 = (com.tencent.p014mm.plugin.exdevice.service.C18696o) r12
                boolean r9 = r12.J90(r9, r10)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x02f7:
                r11.writeString(r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.service.C41182c.C41183a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: Ds */
    void mo23540Ds(long j, byte[] bArr);

    /* renamed from: Eh */
    boolean mo23541Eh(int i, C41188e eVar);

    boolean Fk0(C41185d dVar);

    boolean J90(int i, C41188e eVar);

    boolean Ks0(int i, C41188e eVar);

    boolean Pr0(long j, int i, C41191f fVar);

    /* renamed from: Qk */
    boolean mo23546Qk(String str, boolean z, C41203k kVar);

    /* renamed from: bO */
    boolean mo23547bO(long j, byte[] bArr, C41209m mVar);

    boolean i60(int i, C41188e eVar);

    /* renamed from: mc */
    long[] mo23557mc();

    void n90(C41197h hVar);

    /* renamed from: pR */
    long mo23559pR(C41200j jVar);

    boolean pq0(long j);

    boolean vc0(long j, int i, C41191f fVar);

    /* renamed from: vu */
    boolean mo23562vu(C41206l lVar);

    boolean wl0(long j);
}
