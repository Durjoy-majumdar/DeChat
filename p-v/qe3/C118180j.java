package qe3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qe3.j */
public interface C118180j extends IInterface {

    /* renamed from: qe3.j$a */
    public static abstract class C101128a extends Binder implements C118180j {

        /* renamed from: d */
        public static final /* synthetic */ int f296023d = 0;

        /* renamed from: qe3.j$a$a */
        public static class C101129a implements C118180j {

            /* renamed from: d */
            public IBinder f296024d;

            public C101129a(IBinder iBinder) {
                this.f296024d = iBinder;
            }

            /* renamed from: M5 */
            public int mo139599M5() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    if (!this.f296024d.transact(20, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean P50() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    boolean z = false;
                    if (!this.f296024d.transact(21, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
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

            public void Pq0(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    obtain.writeInt(i);
                    if (!this.f296024d.transact(29, obtain, obtain2, 0)) {
                        int i2 = C101128a.f296023d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Q9 */
            public void mo139602Q9(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    obtain.writeInt(i);
                    if (!this.f296024d.transact(26, obtain, obtain2, 0)) {
                        int i2 = C101128a.f296023d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Wl */
            public boolean mo139603Wl() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    boolean z = false;
                    if (!this.f296024d.transact(25, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
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

            public byte[] X90() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    if (!this.f296024d.transact(2, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Zi */
            public byte[] mo139605Zi() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    if (!this.f296024d.transact(15, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a9 */
            public boolean mo139606a9(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3, int i3, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeInt(i3);
                    boolean z2 = true;
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f296024d.transact(1, obtain, obtain2, 0)) {
                        int i4 = C101128a.f296023d;
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

            /* renamed from: aM */
            public void mo139607aM(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f296024d.transact(24, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: aS */
            public boolean mo139608aS() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    boolean z = false;
                    if (!this.f296024d.transact(28, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
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

            /* renamed from: ao */
            public void mo139609ao(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    obtain.writeByteArray(bArr);
                    if (!this.f296024d.transact(16, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f296024d;
            }

            /* renamed from: b */
            public void mo139610b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    obtain.writeInt(i);
                    if (!this.f296024d.transact(5, obtain, obtain2, 0)) {
                        int i2 = C101128a.f296023d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long getECDHEngine() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    if (!this.f296024d.transact(22, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getUserName() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    if (!this.f296024d.transact(17, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isAxAuth() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    boolean z = false;
                    if (!this.f296024d.transact(23, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
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

            public void ne0(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    obtain.writeByteArray(bArr);
                    if (!this.f296024d.transact(3, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void v10(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                    obtain.writeByteArray(bArr);
                    if (!this.f296024d.transact(27, obtain, obtain2, 0)) {
                        int i = C101128a.f296023d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C101128a() {
            attachInterface(this, "com.tencent.mm.protocal.IMMBaseReq_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f3, code lost:
            if (r11 != 877) goto L_0x0109;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
            /*
                r9 = this;
                r0 = 1
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r2 = "com.tencent.mm.protocal.IMMBaseReq_AIDL"
                if (r10 == r1) goto L_0x0265
                java.lang.String r1 = ""
                r3 = 701(0x2bd, float:9.82E-43)
                r4 = 252(0xfc, float:3.53E-43)
                r5 = 0
                switch(r10) {
                    case 1: goto L_0x0232;
                    case 2: goto L_0x0223;
                    case 3: goto L_0x0212;
                    case 4: goto L_0x01ff;
                    case 5: goto L_0x01ee;
                    case 6: goto L_0x01db;
                    case 7: goto L_0x01c8;
                    case 8: goto L_0x01b5;
                    case 9: goto L_0x01a2;
                    case 10: goto L_0x018f;
                    case 11: goto L_0x017c;
                    case 12: goto L_0x0169;
                    case 13: goto L_0x0156;
                    case 14: goto L_0x0143;
                    case 15: goto L_0x0132;
                    case 16: goto L_0x0121;
                    case 17: goto L_0x0110;
                    case 18: goto L_0x00e1;
                    case 19: goto L_0x00c3;
                    case 20: goto L_0x00b2;
                    case 21: goto L_0x00a1;
                    case 22: goto L_0x0090;
                    case 23: goto L_0x007f;
                    case 24: goto L_0x006b;
                    case 25: goto L_0x005a;
                    case 26: goto L_0x0049;
                    case 27: goto L_0x0039;
                    case 28: goto L_0x0028;
                    case 29: goto L_0x0017;
                    default: goto L_0x0012;
                }
            L_0x0012:
                boolean r10 = super.onTransact(r10, r11, r12, r13)
                return r10
            L_0x0017:
                r11.enforceInterface(r2)
                int r10 = r11.readInt()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                r11.Pq0(r10)
                r12.writeNoException()
                return r0
            L_0x0028:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                boolean r10 = r10.mo139608aS()
                r12.writeNoException()
                r12.writeInt(r10)
                return r0
            L_0x0039:
                r11.enforceInterface(r2)
                byte[] r10 = r11.createByteArray()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                r11.f293900f = r10
                r12.writeNoException()
                return r0
            L_0x0049:
                r11.enforceInterface(r2)
                int r10 = r11.readInt()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                r11.mo139602Q9(r10)
                r12.writeNoException()
                return r0
            L_0x005a:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                boolean r10 = r10.mo139603Wl()
                r12.writeNoException()
                r12.writeInt(r10)
                return r0
            L_0x006b:
                r11.enforceInterface(r2)
                int r10 = r11.readInt()
                if (r10 == 0) goto L_0x0075
                r5 = 1
            L_0x0075:
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                r10.mo139607aM(r5)
                r12.writeNoException()
                return r0
            L_0x007f:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                boolean r10 = r10.isAxAuth()
                r12.writeNoException()
                r12.writeInt(r10)
                return r0
            L_0x0090:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                long r10 = r10.getECDHEngine()
                r12.writeNoException()
                r12.writeLong(r10)
                return r0
            L_0x00a1:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                boolean r10 = r10.P50()
                r12.writeNoException()
                r12.writeInt(r10)
                return r0
            L_0x00b2:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                int r10 = r10.mo139599M5()
                r12.writeNoException()
                r12.writeInt(r10)
                return r0
            L_0x00c3:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                int r11 = r10.f293902h
                if (r11 == r4) goto L_0x00d0
                if (r11 == r3) goto L_0x00d0
                goto L_0x00da
            L_0x00d0:
                qe3.w$d r10 = r10.f293901g
                qe3.q r10 = (qe3.C118188q) r10
                te3.qu2 r10 = r10.f353310b
                te3.ru2 r10 = r10.f185080d
                java.lang.String r1 = r10.f185299h
            L_0x00da:
                r12.writeNoException()
                r12.writeString(r1)
                return r0
            L_0x00e1:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                int r11 = r10.f293902h
                r13 = 126(0x7e, float:1.77E-43)
                if (r11 == r13) goto L_0x0101
                if (r11 == r4) goto L_0x00f6
                if (r11 == r3) goto L_0x00f6
                r13 = 877(0x36d, float:1.229E-42)
                if (r11 == r13) goto L_0x0101
                goto L_0x0109
            L_0x00f6:
                qe3.w$d r10 = r10.f293901g
                qe3.q r10 = (qe3.C118188q) r10
                te3.qu2 r10 = r10.f353310b
                te3.ru2 r10 = r10.f185080d
                java.lang.String r1 = r10.f185298g
                goto L_0x0109
            L_0x0101:
                qe3.w$d r10 = r10.f293901g
                qe3.t0 r10 = (qe3.C118194t0) r10
                te3.s33 r10 = r10.f353322a
                java.lang.String r1 = r10.f354354e
            L_0x0109:
                r12.writeNoException()
                r12.writeString(r1)
                return r0
            L_0x0110:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                java.lang.String r10 = r10.getUserName()
                r12.writeNoException()
                r12.writeString(r10)
                return r0
            L_0x0121:
                r11.enforceInterface(r2)
                byte[] r10 = r11.createByteArray()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                r11.mo139609ao(r10)
                r12.writeNoException()
                return r0
            L_0x0132:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                byte[] r10 = r10.mo139605Zi()
                r12.writeNoException()
                r12.writeByteArray(r10)
                return r0
            L_0x0143:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                qe3.w$d r10 = r10.f293901g
                int r10 = r10.getSceneStatus()
                r12.writeNoException()
                r12.writeInt(r10)
                return r0
            L_0x0156:
                r11.enforceInterface(r2)
                int r10 = r11.readInt()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                qe3.w$d r11 = r11.f293901g
                r11.setSceneStatus(r10)
                r12.writeNoException()
                return r0
            L_0x0169:
                r11.enforceInterface(r2)
                java.lang.String r10 = r11.readString()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                qe3.w$d r11 = r11.f293901g
                r11.setDeviceID(r10)
                r12.writeNoException()
                return r0
            L_0x017c:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                qe3.w$d r10 = r10.f293901g
                java.lang.String r10 = r10.getDeviceID()
                r12.writeNoException()
                r12.writeString(r10)
                return r0
            L_0x018f:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                qe3.w$d r10 = r10.f293901g
                java.lang.String r10 = r10.getDeviceType()
                r12.writeNoException()
                r12.writeString(r10)
                return r0
            L_0x01a2:
                r11.enforceInterface(r2)
                java.lang.String r10 = r11.readString()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                qe3.w$d r11 = r11.f293901g
                r11.setDeviceType(r10)
                r12.writeNoException()
                return r0
            L_0x01b5:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                qe3.w$d r10 = r10.f293901g
                int r10 = r10.getClientVersion()
                r12.writeNoException()
                r12.writeInt(r10)
                return r0
            L_0x01c8:
                r11.enforceInterface(r2)
                int r10 = r11.readInt()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                qe3.w$d r11 = r11.f293901g
                r11.setClientVersion(r10)
                r12.writeNoException()
                return r0
            L_0x01db:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                qe3.w$d r10 = r10.f293901g
                int r10 = r10.getUin()
                r12.writeNoException()
                r12.writeInt(r10)
                return r0
            L_0x01ee:
                r11.enforceInterface(r2)
                int r10 = r11.readInt()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                r11.mo139610b(r10)
                r12.writeNoException()
                return r0
            L_0x01ff:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                qe3.w$d r10 = r10.f293901g
                byte[] r10 = r10.getSessionKey()
                r12.writeNoException()
                r12.writeByteArray(r10)
                return r0
            L_0x0212:
                r11.enforceInterface(r2)
                byte[] r10 = r11.createByteArray()
                r11 = r9
                ob0.i0 r11 = (ob0.C100321i0) r11
                r11.ne0(r10)
                r12.writeNoException()
                return r0
            L_0x0223:
                r11.enforceInterface(r2)
                r10 = r9
                ob0.i0 r10 = (ob0.C100321i0) r10
                byte[] r10 = r10.f293903i
                r12.writeNoException()
                r12.writeByteArray(r10)
                return r0
            L_0x0232:
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                byte[] r3 = r11.createByteArray()
                int r4 = r11.readInt()
                byte[] r10 = r11.createByteArray()
                byte[] r6 = r11.createByteArray()
                int r7 = r11.readInt()
                int r11 = r11.readInt()
                if (r11 == 0) goto L_0x0255
                r8 = 1
                goto L_0x0256
            L_0x0255:
                r8 = 0
            L_0x0256:
                r1 = r9
                ob0.i0 r1 = (ob0.C100321i0) r1
                r5 = r10
                boolean r10 = r1.mo139606a9(r2, r3, r4, r5, r6, r7, r8)
                r12.writeNoException()
                r12.writeInt(r10)
                return r0
            L_0x0265:
                r12.writeString(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qe3.C118180j.C101128a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: M5 */
    int mo139599M5();

    boolean P50();

    void Pq0(int i);

    /* renamed from: Q9 */
    void mo139602Q9(int i);

    /* renamed from: Wl */
    boolean mo139603Wl();

    byte[] X90();

    /* renamed from: Zi */
    byte[] mo139605Zi();

    /* renamed from: a9 */
    boolean mo139606a9(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3, int i3, boolean z);

    /* renamed from: aM */
    void mo139607aM(boolean z);

    /* renamed from: aS */
    boolean mo139608aS();

    /* renamed from: ao */
    void mo139609ao(byte[] bArr);

    /* renamed from: b */
    void mo139610b(int i);

    long getECDHEngine();

    String getUserName();

    boolean isAxAuth();

    void ne0(byte[] bArr);

    void v10(byte[] bArr);
}
