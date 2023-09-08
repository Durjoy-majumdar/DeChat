package com.tencent.p014mm.plugin.magicbrush;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.Surface;

/* renamed from: com.tencent.mm.plugin.magicbrush.j0 */
public interface C85270j0 extends IInterface {

    /* renamed from: com.tencent.mm.plugin.magicbrush.j0$a */
    public static abstract class C85271a extends Binder implements C85270j0 {

        /* renamed from: d */
        public static final /* synthetic */ int f248429d = 0;

        /* renamed from: com.tencent.mm.plugin.magicbrush.j0$a$a */
        public static class C85272a implements C85270j0 {

            /* renamed from: d */
            public IBinder f248430d;

            public C85272a(IBinder iBinder) {
                this.f248430d = iBinder;
            }

            /* renamed from: DN */
            public void mo118432DN(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.f248430d.transact(6, obtain, obtain2, 0)) {
                        int i2 = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ed */
            public void mo118433Ed(String str, MBBuildConfig mBBuildConfig) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    if (mBBuildConfig != null) {
                        obtain.writeInt(1);
                        mBBuildConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f248430d.transact(8, obtain, obtain2, 0)) {
                        int i = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void Il0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    if (!this.f248430d.transact(11, obtain, obtain2, 0)) {
                        int i = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: TE */
            public void mo118435TE(String str, int i, int i2, int i3, long j, int[] iArr, float[] fArr, float[] fArr2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    obtain.writeIntArray(iArr);
                    obtain.writeFloatArray(fArr);
                    obtain.writeFloatArray(fArr2);
                    if (!this.f248430d.transact(7, obtain, obtain2, 0)) {
                        int i4 = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void V20(String str, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f248430d.transact(14, obtain, obtain2, 0)) {
                        int i = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void Y30(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    if (!this.f248430d.transact(2, obtain, obtain2, 0)) {
                        int i2 = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f248430d;
            }

            /* renamed from: dF */
            public void mo118438dF(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    if (!this.f248430d.transact(10, obtain, obtain2, 0)) {
                        int i = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: eV */
            public void mo118439eV(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    if (!this.f248430d.transact(9, obtain, obtain2, 0)) {
                        int i = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: fH */
            public void mo118440fH(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.f248430d.transact(12, obtain, obtain2, 0)) {
                        int i2 = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void g50(String str, int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.f248430d.transact(5, obtain, obtain2, 0)) {
                        int i4 = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: hU */
            public void mo118442hU(String str, int i, Surface surface, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.f248430d.transact(4, obtain, obtain2, 0)) {
                        int i4 = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: kG */
            public void mo118443kG(String str, C85244b0 b0Var) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(b0Var != null ? b0Var.asBinder() : null);
                    if (!this.f248430d.transact(13, obtain, obtain2, 0)) {
                        int i = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: rn */
            public void mo118444rn(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.f248430d.transact(1, obtain, obtain2, 0)) {
                        int i = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void t20(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (!this.f248430d.transact(3, obtain, obtain2, 0)) {
                        int i2 = C85271a.f248429d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C85271a() {
            attachInterface(this, "com.tencent.mm.plugin.magicbrush.IMBServerMgr");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.tencent.mm.plugin.magicbrush.MBBuildConfig} */
        /* JADX WARNING: type inference failed for: r2v1 */
        /* JADX WARNING: type inference failed for: r2v5 */
        /* JADX WARNING: type inference failed for: r2v17, types: [com.tencent.mm.plugin.magicbrush.b0] */
        /* JADX WARNING: type inference failed for: r2v24 */
        /* JADX WARNING: type inference failed for: r2v25 */
        /* JADX WARNING: type inference failed for: r2v26 */
        /* JADX WARNING: type inference failed for: r2v27 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r15, android.os.Parcel r16, android.os.Parcel r17, int r18) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r3 = 1
                java.lang.String r4 = "com.tencent.mm.plugin.magicbrush.IMBServerMgr"
                if (r0 == r2) goto L_0x0199
                r2 = 0
                switch(r0) {
                    case 1: goto L_0x0180;
                    case 2: goto L_0x0167;
                    case 3: goto L_0x014e;
                    case 4: goto L_0x0121;
                    case 5: goto L_0x0104;
                    case 6: goto L_0x00ef;
                    case 7: goto L_0x00c2;
                    case 8: goto L_0x00a2;
                    case 9: goto L_0x0091;
                    case 10: goto L_0x0080;
                    case 11: goto L_0x006f;
                    case 12: goto L_0x005a;
                    case 13: goto L_0x002e;
                    case 14: goto L_0x0014;
                    default: goto L_0x000f;
                }
            L_0x000f:
                boolean r0 = super.onTransact(r15, r16, r17, r18)
                return r0
            L_0x0014:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                int r1 = r16.readInt()
                if (r1 == 0) goto L_0x0023
                r1 = 1
                goto L_0x0024
            L_0x0023:
                r1 = 0
            L_0x0024:
                r2 = r14
                g42.f r2 = (g42.C87148f) r2
                r2.V20(r0, r1)
                r17.writeNoException()
                return r3
            L_0x002e:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                android.os.IBinder r1 = r16.readStrongBinder()
                if (r1 != 0) goto L_0x003c
                goto L_0x0050
            L_0x003c:
                java.lang.String r2 = "com.tencent.mm.plugin.magicbrush.IMBClientMgr"
                android.os.IInterface r2 = r1.queryLocalInterface(r2)
                if (r2 == 0) goto L_0x004b
                boolean r4 = r2 instanceof com.tencent.p014mm.plugin.magicbrush.C85244b0
                if (r4 == 0) goto L_0x004b
                com.tencent.mm.plugin.magicbrush.b0 r2 = (com.tencent.p014mm.plugin.magicbrush.C85244b0) r2
                goto L_0x0050
            L_0x004b:
                com.tencent.mm.plugin.magicbrush.b0$a$a r2 = new com.tencent.mm.plugin.magicbrush.b0$a$a
                r2.<init>(r1)
            L_0x0050:
                r1 = r14
                g42.f r1 = (g42.C87148f) r1
                r1.mo118443kG(r0, r2)
                r17.writeNoException()
                return r3
            L_0x005a:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                int r1 = r16.readInt()
                r2 = r14
                g42.f r2 = (g42.C87148f) r2
                r2.mo118440fH(r0, r1)
                r17.writeNoException()
                return r3
            L_0x006f:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                r1 = r14
                g42.f r1 = (g42.C87148f) r1
                r1.Il0(r0)
                r17.writeNoException()
                return r3
            L_0x0080:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                r1 = r14
                g42.f r1 = (g42.C87148f) r1
                r1.mo118438dF(r0)
                r17.writeNoException()
                return r3
            L_0x0091:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                r1 = r14
                g42.f r1 = (g42.C87148f) r1
                r1.mo118439eV(r0)
                r17.writeNoException()
                return r3
            L_0x00a2:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                int r4 = r16.readInt()
                if (r4 == 0) goto L_0x00b8
                android.os.Parcelable$Creator<com.tencent.mm.plugin.magicbrush.MBBuildConfig<?>> r2 = com.tencent.p014mm.plugin.magicbrush.MBBuildConfig.CREATOR
                java.lang.Object r1 = r2.createFromParcel(r1)
                r2 = r1
                com.tencent.mm.plugin.magicbrush.MBBuildConfig r2 = (com.tencent.p014mm.plugin.magicbrush.MBBuildConfig) r2
            L_0x00b8:
                r1 = r14
                g42.f r1 = (g42.C87148f) r1
                r1.mo118433Ed(r0, r2)
                r17.writeNoException()
                return r3
            L_0x00c2:
                r1.enforceInterface(r4)
                java.lang.String r5 = r16.readString()
                int r6 = r16.readInt()
                int r7 = r16.readInt()
                int r8 = r16.readInt()
                long r9 = r16.readLong()
                int[] r11 = r16.createIntArray()
                float[] r12 = r16.createFloatArray()
                float[] r13 = r16.createFloatArray()
                r4 = r14
                g42.f r4 = (g42.C87148f) r4
                r4.mo118435TE(r5, r6, r7, r8, r9, r11, r12, r13)
                r17.writeNoException()
                return r3
            L_0x00ef:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                int r1 = r16.readInt()
                r2 = r14
                g42.f r2 = (g42.C87148f) r2
                r2.mo118432DN(r0, r1)
                r17.writeNoException()
                return r3
            L_0x0104:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                int r2 = r16.readInt()
                int r4 = r16.readInt()
                int r1 = r16.readInt()
                r5 = r14
                g42.f r5 = (g42.C87148f) r5
                r5.g50(r0, r2, r4, r1)
                r17.writeNoException()
                return r3
            L_0x0121:
                r1.enforceInterface(r4)
                java.lang.String r7 = r16.readString()
                int r8 = r16.readInt()
                int r0 = r16.readInt()
                if (r0 == 0) goto L_0x013b
                android.os.Parcelable$Creator r0 = android.view.Surface.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r1)
                r2 = r0
                android.view.Surface r2 = (android.view.Surface) r2
            L_0x013b:
                r9 = r2
                int r10 = r16.readInt()
                int r11 = r16.readInt()
                r6 = r14
                g42.f r6 = (g42.C87148f) r6
                r6.mo118442hU(r7, r8, r9, r10, r11)
                r17.writeNoException()
                return r3
            L_0x014e:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                int r2 = r16.readInt()
                java.lang.String r1 = r16.readString()
                r4 = r14
                g42.f r4 = (g42.C87148f) r4
                r4.t20(r0, r2, r1)
                r17.writeNoException()
                return r3
            L_0x0167:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                java.lang.String r2 = r16.readString()
                int r1 = r16.readInt()
                r4 = r14
                g42.f r4 = (g42.C87148f) r4
                r4.Y30(r0, r2, r1)
                r17.writeNoException()
                return r3
            L_0x0180:
                r1.enforceInterface(r4)
                java.lang.String r0 = r16.readString()
                java.lang.String r2 = r16.readString()
                java.lang.String r1 = r16.readString()
                r4 = r14
                g42.f r4 = (g42.C87148f) r4
                r4.mo118444rn(r0, r2, r1)
                r17.writeNoException()
                return r3
            L_0x0199:
                r0 = r17
                r0.writeString(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.magicbrush.C85270j0.C85271a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: DN */
    void mo118432DN(String str, int i);

    /* renamed from: Ed */
    void mo118433Ed(String str, MBBuildConfig mBBuildConfig);

    void Il0(String str);

    /* renamed from: TE */
    void mo118435TE(String str, int i, int i2, int i3, long j, int[] iArr, float[] fArr, float[] fArr2);

    void V20(String str, boolean z);

    void Y30(String str, String str2, int i);

    /* renamed from: dF */
    void mo118438dF(String str);

    /* renamed from: eV */
    void mo118439eV(String str);

    /* renamed from: fH */
    void mo118440fH(String str, int i);

    void g50(String str, int i, int i2, int i3);

    /* renamed from: hU */
    void mo118442hU(String str, int i, Surface surface, int i2, int i3);

    /* renamed from: kG */
    void mo118443kG(String str, C85244b0 b0Var);

    /* renamed from: rn */
    void mo118444rn(String str, String str2, String str3);

    void t20(String str, int i, String str2);
}
