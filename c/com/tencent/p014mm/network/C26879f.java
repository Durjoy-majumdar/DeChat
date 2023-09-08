package com.tencent.p014mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.network.f */
public interface C26879f extends IInterface {

    /* renamed from: com.tencent.mm.network.f$a */
    public static abstract class C26880a extends Binder implements C26879f {

        /* renamed from: d */
        public static final /* synthetic */ int f74761d = 0;

        /* renamed from: com.tencent.mm.network.f$a$a */
        public static class C26881a implements C26879f {

            /* renamed from: d */
            public IBinder f74762d;

            public C26881a(IBinder iBinder) {
                this.f74762d = iBinder;
            }

            /* renamed from: A4 */
            public int mo54103A4(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeByteArray(bArr);
                    if (!this.f74762d.transact(19, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: B */
            public String mo54104B() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(17, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: C2 */
            public int mo54105C2(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    if (!this.f74762d.transact(36, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: D */
            public byte[] mo54106D() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(10, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: E0 */
            public void mo54107E0(int i, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.f74762d.transact(22, obtain, obtain2, 0)) {
                        int i2 = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: G3 */
            public boolean mo54108G3() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    boolean z = false;
                    if (!this.f74762d.transact(12, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
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

            /* renamed from: J2 */
            public byte[] mo54109J2(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    if (!this.f74762d.transact(28, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: N0 */
            public int mo54110N0(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    if (!this.f74762d.transact(35, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: P2 */
            public void mo54111P2() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(31, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: S */
            public byte[] mo54112S(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeInt(i);
                    if (!this.f74762d.transact(8, obtain, obtain2, 0)) {
                        int i2 = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: X0 */
            public void mo54113X0(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeInt(i);
                    if (!this.f74762d.transact(2, obtain, obtain2, 0)) {
                        int i2 = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: X2 */
            public void mo54114X2(String str, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    if (!this.f74762d.transact(13, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Y4 */
            public void mo54115Y4(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f74762d.transact(15, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f74762d;
            }

            /* renamed from: b */
            public void mo54116b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeInt(i);
                    if (!this.f74762d.transact(3, obtain, obtain2, 0)) {
                        int i2 = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f2 */
            public byte[] mo54117f2(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    if (!this.f74762d.transact(27, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g3 */
            public void mo54118g3(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.f74762d.transact(34, obtain, obtain2, 0)) {
                        int i2 = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public byte[] getCookie() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(9, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getUin() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(11, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getUsername() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(7, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isForeground() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    boolean z = false;
                    if (!this.f74762d.transact(16, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
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

            /* renamed from: j1 */
            public void mo54123j1() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(30, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l4 */
            public byte[] mo54124l4() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(20, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m3 */
            public byte[] mo54125m3(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    if (!this.f74762d.transact(14, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n0 */
            public void mo54126n0(int i, byte[] bArr, byte[] bArr2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.f74762d.transact(23, obtain, obtain2, 0)) {
                        int i2 = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q3 */
            public boolean mo54127q3(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.f74762d.transact(29, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
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

            /* renamed from: q4 */
            public byte[] mo54128q4(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    if (!this.f74762d.transact(26, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r1 */
            public int mo54129r1(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeByteArray(bArr);
                    if (!this.f74762d.transact(21, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void reset() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(1, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setUsername(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    obtain.writeString(str);
                    if (!this.f74762d.transact(4, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x4 */
            public void mo54132x4() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
                    if (!this.f74762d.transact(33, obtain, obtain2, 0)) {
                        int i = C26880a.f74761d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C26880a() {
            attachInterface(this, "com.tencent.mm.network.IAccInfo_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).reset();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo54113X0(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo54116b(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).f344117e = parcel.readString();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo174414l(parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).f344124o = parcel.createByteArray();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        String str = ((C114762a) this).f344117e;
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] S = ((C114762a) this).mo54112S(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeByteArray(S);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] bArr = ((C114762a) this).f344121i;
                        parcel2.writeNoException();
                        parcel2.writeByteArray(bArr);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] bArr2 = ((C114762a) this).f344124o;
                        parcel2.writeNoException();
                        parcel2.writeByteArray(bArr2);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        int i3 = ((C114762a) this).f344122j;
                        parcel2.writeNoException();
                        parcel2.writeInt(i3);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        boolean G3 = ((C114762a) this).mo54108G3();
                        parcel2.writeNoException();
                        parcel2.writeInt(G3 ? 1 : 0);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo54114X2(parcel.readString(), parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] m3 = ((C114762a) this).mo54125m3(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeByteArray(m3);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        ((C114762a) this).mo54115Y4(z);
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        boolean z2 = ((C114762a) this).f344125p;
                        parcel2.writeNoException();
                        parcel2.writeInt(z2 ? 1 : 0);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        String str2 = ((C114762a) this).f344126q;
                        parcel2.writeNoException();
                        parcel2.writeString(str2);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).f344126q = parcel.readString();
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        int A4 = ((C114762a) this).mo54103A4(parcel.createByteArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(A4);
                        return true;
                    case 20:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] l4 = ((C114762a) this).mo54124l4();
                        parcel2.writeNoException();
                        parcel2.writeByteArray(l4);
                        return true;
                    case 21:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        int r1 = ((C114762a) this).mo54129r1(parcel.createByteArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(r1);
                        return true;
                    case 22:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo54107E0(parcel.readInt(), parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo54126n0(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] createByteArray = parcel.createByteArray();
                        ((ArrayList) ((C114762a) this).f344130u).add(new String(createByteArray));
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] createByteArray2 = parcel.createByteArray();
                        boolean contains = ((ArrayList) ((C114762a) this).f344130u).contains(new String(createByteArray2));
                        parcel2.writeNoException();
                        parcel2.writeInt(contains ? 1 : 0);
                        return true;
                    case 26:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] q4 = ((C114762a) this).mo54128q4(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeByteArray(q4);
                        return true;
                    case 27:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] f2 = ((C114762a) this).mo54117f2(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeByteArray(f2);
                        return true;
                    case 28:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        byte[] J2 = ((C114762a) this).mo54109J2(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeByteArray(J2);
                        return true;
                    case 29:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        boolean q3 = ((C114762a) this).mo54127q3(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(q3 ? 1 : 0);
                        return true;
                    case 30:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo54123j1();
                        parcel2.writeNoException();
                        return true;
                    case 31:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo54111P2();
                        parcel2.writeNoException();
                        return true;
                    case 32:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        String readString = parcel.readString();
                        C114762a aVar = (C114762a) this;
                        if (aVar.mo54127q3(readString)) {
                            byte[] J22 = aVar.mo54109J2(readString);
                            byte[] f25 = aVar.mo54117f2(readString);
                            if (J22 != null && J22.length > 0 && f25 != null && f25.length > 0) {
                                z = true;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(z ? 1 : 0);
                        return true;
                    case 33:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo54132x4();
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        ((C114762a) this).mo54118g3(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        int N0 = ((C114762a) this).mo54110N0(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(N0);
                        return true;
                    case 36:
                        parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
                        int C2 = ((C114762a) this).mo54105C2(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(C2);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.tencent.mm.network.IAccInfo_AIDL");
                return true;
            }
        }
    }

    /* renamed from: A4 */
    int mo54103A4(byte[] bArr);

    /* renamed from: B */
    String mo54104B();

    /* renamed from: C2 */
    int mo54105C2(String str);

    /* renamed from: D */
    byte[] mo54106D();

    /* renamed from: E0 */
    void mo54107E0(int i, byte[] bArr);

    /* renamed from: G3 */
    boolean mo54108G3();

    /* renamed from: J2 */
    byte[] mo54109J2(String str);

    /* renamed from: N0 */
    int mo54110N0(String str);

    /* renamed from: P2 */
    void mo54111P2();

    /* renamed from: S */
    byte[] mo54112S(int i);

    /* renamed from: X0 */
    void mo54113X0(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    /* renamed from: X2 */
    void mo54114X2(String str, byte[] bArr);

    /* renamed from: Y4 */
    void mo54115Y4(boolean z);

    /* renamed from: b */
    void mo54116b(int i);

    /* renamed from: f2 */
    byte[] mo54117f2(String str);

    /* renamed from: g3 */
    void mo54118g3(String str, int i);

    byte[] getCookie();

    int getUin();

    String getUsername();

    boolean isForeground();

    /* renamed from: j1 */
    void mo54123j1();

    /* renamed from: l4 */
    byte[] mo54124l4();

    /* renamed from: m3 */
    byte[] mo54125m3(String str);

    /* renamed from: n0 */
    void mo54126n0(int i, byte[] bArr, byte[] bArr2);

    /* renamed from: q3 */
    boolean mo54127q3(String str);

    /* renamed from: q4 */
    byte[] mo54128q4(String str);

    /* renamed from: r1 */
    int mo54129r1(byte[] bArr);

    void reset();

    void setUsername(String str);

    /* renamed from: x4 */
    void mo54132x4();
}
