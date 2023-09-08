package com.tencent.p014mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.talkroom.component.C115787c;
import com.tencent.p014mm.plugin.talkroom.component.C115790d;

/* renamed from: com.tencent.mm.plugin.talkroom.component.a */
public interface C115781a extends IInterface {

    /* renamed from: com.tencent.mm.plugin.talkroom.component.a$a */
    public static abstract class C115782a extends Binder implements C115781a {

        /* renamed from: d */
        public static final /* synthetic */ int f347356d = 0;

        /* renamed from: com.tencent.mm.plugin.talkroom.component.a$a$a */
        public static class C115783a implements C115781a {

            /* renamed from: d */
            public IBinder f347357d;

            public C115783a(IBinder iBinder) {
                this.f347357d = iBinder;
            }

            public C115790d Ab0(C115784b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
                    C115790d dVar = null;
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f347357d.transact(7, obtain, obtain2, 0)) {
                        int i = C115782a.f347356d;
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i2 = C115790d.C115791a.f347362d;
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                        dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C115790d)) ? new C115790d.C115791a.C115792a(readStrongBinder) : (C115790d) queryLocalInterface;
                    }
                    return dVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int B60() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
                    if (!this.f347357d.transact(2, obtain, obtain2, 0)) {
                        int i = C115782a.f347356d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: OO */
            public byte[] mo176143OO(int[] iArr, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
                    if (iArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(iArr.length);
                    }
                    obtain.writeString(str);
                    if (!this.f347357d.transact(6, obtain, obtain2, 0)) {
                        int i = C115782a.f347356d;
                    }
                    obtain2.readException();
                    byte[] createByteArray = obtain2.createByteArray();
                    obtain2.readIntArray(iArr);
                    return createByteArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ud */
            public C115787c mo176144Ud() {
                C115787c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
                    if (!this.f347357d.transact(8, obtain, obtain2, 0)) {
                        int i = C115782a.f347356d;
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i2 = C115787c.C115788a.f347360d;
                    if (readStrongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                        cVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C115787c)) ? new C115787c.C115788a.C115789a(readStrongBinder) : (C115787c) queryLocalInterface;
                    }
                    return cVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f347357d;
            }

            /* renamed from: kg */
            public int mo176145kg(ILiveConEngineCallback_AIDL iLiveConEngineCallback_AIDL, int i, int i2, int i3, long j, int[] iArr, int[] iArr2, int i4, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
                    obtain.writeStrongBinder(iLiveConEngineCallback_AIDL != null ? iLiveConEngineCallback_AIDL.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    obtain.writeIntArray(iArr);
                    obtain.writeIntArray(iArr2);
                    obtain.writeInt(i4);
                    obtain.writeStringArray(strArr);
                    if (!this.f347357d.transact(3, obtain, obtain2, 0)) {
                        int i5 = C115782a.f347356d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: pl */
            public int mo176146pl() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
                    if (!this.f347357d.transact(1, obtain, obtain2, 0)) {
                        int i = C115782a.f347356d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int ss0(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
                    obtain.writeInt(i);
                    if (!this.f347357d.transact(4, obtain, obtain2, 0)) {
                        int i2 = C115782a.f347356d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int xs0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
                    if (!this.f347357d.transact(5, obtain, obtain2, 0)) {
                        int i = C115782a.f347356d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C115782a() {
            attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int[]} */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: type inference failed for: r3v9, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r3v11, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14 */
        /* JADX WARNING: type inference failed for: r3v15 */
        /* JADX WARNING: type inference failed for: r3v16 */
        /* JADX WARNING: type inference failed for: r3v17 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r17, android.os.Parcel r18, android.os.Parcel r19, int r20) {
            /*
                r16 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r4 = 1
                java.lang.String r5 = "com.tencent.mm.plugin.talkroom.component.IEngine_AIDL"
                if (r0 == r3) goto L_0x0120
                r3 = 0
                switch(r0) {
                    case 1: goto L_0x010e;
                    case 2: goto L_0x00fc;
                    case 3: goto L_0x00ad;
                    case 4: goto L_0x0097;
                    case 5: goto L_0x0085;
                    case 6: goto L_0x0063;
                    case 7: goto L_0x002f;
                    case 8: goto L_0x0017;
                    default: goto L_0x0012;
                }
            L_0x0012:
                boolean r0 = super.onTransact(r17, r18, r19, r20)
                return r0
            L_0x0017:
                r1.enforceInterface(r5)
                r0 = r16
                com.tencent.mm.plugin.talkroom.component.f r0 = (com.tencent.p014mm.plugin.talkroom.component.C115795f) r0
                com.tencent.mm.plugin.talkroom.component.c r0 = r0.mo176144Ud()
                r19.writeNoException()
                if (r0 == 0) goto L_0x002b
                android.os.IBinder r3 = r0.asBinder()
            L_0x002b:
                r2.writeStrongBinder(r3)
                return r4
            L_0x002f:
                r1.enforceInterface(r5)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x003a
                r1 = r3
                goto L_0x004e
            L_0x003a:
                java.lang.String r1 = "com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x0049
                boolean r5 = r1 instanceof com.tencent.p014mm.plugin.talkroom.component.C115784b
                if (r5 == 0) goto L_0x0049
                com.tencent.mm.plugin.talkroom.component.b r1 = (com.tencent.p014mm.plugin.talkroom.component.C115784b) r1
                goto L_0x004e
            L_0x0049:
                com.tencent.mm.plugin.talkroom.component.b$a$a r1 = new com.tencent.mm.plugin.talkroom.component.b$a$a
                r1.<init>(r0)
            L_0x004e:
                r0 = r16
                com.tencent.mm.plugin.talkroom.component.f r0 = (com.tencent.p014mm.plugin.talkroom.component.C115795f) r0
                com.tencent.mm.plugin.talkroom.component.d r0 = r0.Ab0(r1)
                r19.writeNoException()
                if (r0 == 0) goto L_0x005f
                android.os.IBinder r3 = r0.asBinder()
            L_0x005f:
                r2.writeStrongBinder(r3)
                return r4
            L_0x0063:
                r1.enforceInterface(r5)
                int r0 = r18.readInt()
                if (r0 >= 0) goto L_0x006d
                goto L_0x006f
            L_0x006d:
                int[] r3 = new int[r0]
            L_0x006f:
                java.lang.String r0 = r18.readString()
                r1 = r16
                com.tencent.mm.plugin.talkroom.component.f r1 = (com.tencent.p014mm.plugin.talkroom.component.C115795f) r1
                byte[] r0 = r1.mo176143OO(r3, r0)
                r19.writeNoException()
                r2.writeByteArray(r0)
                r2.writeIntArray(r3)
                return r4
            L_0x0085:
                r1.enforceInterface(r5)
                r0 = r16
                com.tencent.mm.plugin.talkroom.component.f r0 = (com.tencent.p014mm.plugin.talkroom.component.C115795f) r0
                int r0 = r0.xs0()
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0097:
                r1.enforceInterface(r5)
                int r0 = r18.readInt()
                r1 = r16
                com.tencent.mm.plugin.talkroom.component.f r1 = (com.tencent.p014mm.plugin.talkroom.component.C115795f) r1
                int r0 = r1.ss0(r0)
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x00ad:
                r1.enforceInterface(r5)
                android.os.IBinder r0 = r18.readStrongBinder()
                if (r0 != 0) goto L_0x00b8
            L_0x00b6:
                r6 = r3
                goto L_0x00cd
            L_0x00b8:
                java.lang.String r3 = "com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL"
                android.os.IInterface r3 = r0.queryLocalInterface(r3)
                if (r3 == 0) goto L_0x00c7
                boolean r5 = r3 instanceof com.tencent.p014mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL
                if (r5 == 0) goto L_0x00c7
                com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL r3 = (com.tencent.p014mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL) r3
                goto L_0x00b6
            L_0x00c7:
                com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL$a$a r3 = new com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL$a$a
                r3.<init>(r0)
                goto L_0x00b6
            L_0x00cd:
                int r7 = r18.readInt()
                int r8 = r18.readInt()
                int r9 = r18.readInt()
                long r10 = r18.readLong()
                int[] r12 = r18.createIntArray()
                int[] r13 = r18.createIntArray()
                int r14 = r18.readInt()
                java.lang.String[] r15 = r18.createStringArray()
                r5 = r16
                com.tencent.mm.plugin.talkroom.component.f r5 = (com.tencent.p014mm.plugin.talkroom.component.C115795f) r5
                int r0 = r5.mo176145kg(r6, r7, r8, r9, r10, r12, r13, r14, r15)
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x00fc:
                r1.enforceInterface(r5)
                r0 = r16
                com.tencent.mm.plugin.talkroom.component.f r0 = (com.tencent.p014mm.plugin.talkroom.component.C115795f) r0
                int r0 = r0.B60()
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x010e:
                r1.enforceInterface(r5)
                r0 = r16
                com.tencent.mm.plugin.talkroom.component.f r0 = (com.tencent.p014mm.plugin.talkroom.component.C115795f) r0
                int r0 = r0.mo176146pl()
                r19.writeNoException()
                r2.writeInt(r0)
                return r4
            L_0x0120:
                r2.writeString(r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.talkroom.component.C115781a.C115782a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    C115790d Ab0(C115784b bVar);

    int B60();

    /* renamed from: OO */
    byte[] mo176143OO(int[] iArr, String str);

    /* renamed from: Ud */
    C115787c mo176144Ud();

    /* renamed from: kg */
    int mo176145kg(ILiveConEngineCallback_AIDL iLiveConEngineCallback_AIDL, int i, int i2, int i3, long j, int[] iArr, int[] iArr2, int i4, String[] strArr);

    /* renamed from: pl */
    int mo176146pl();

    int ss0(int i);

    int xs0();
}
