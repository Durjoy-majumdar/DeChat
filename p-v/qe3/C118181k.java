package qe3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ob0.C117743k0;

/* renamed from: qe3.k */
public interface C118181k extends IInterface {

    /* renamed from: qe3.k$a */
    public static abstract class C118182a extends Binder implements C118181k {

        /* renamed from: d */
        public static final /* synthetic */ int f353303d = 0;

        /* renamed from: qe3.k$a$a */
        public static class C118183a implements C118181k {

            /* renamed from: d */
            public IBinder f353304d;

            public C118183a(IBinder iBinder) {
                this.f353304d = iBinder;
            }

            /* renamed from: B */
            public String mo182456B() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(12, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Bh */
            public int mo182457Bh() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(16, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ct */
            public String mo182458Ct() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(15, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: D */
            public byte[] mo182459D() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(10, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int Df0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(5, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Jg */
            public byte[] mo182461Jg() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(17, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Om */
            public int mo182462Om() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(4, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: S */
            public byte[] mo182463S(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    obtain.writeInt(i);
                    if (!this.f353304d.transact(8, obtain, obtain2, 0)) {
                        int i2 = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: SE */
            public String mo182464SE() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(14, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Zi0(int i, byte[] bArr, byte[] bArr2, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.f353304d.transact(1, obtain, obtain2, 0)) {
                        int i2 = C118182a.f353303d;
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
                return this.f353304d;
            }

            public byte[] getCookie() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(2, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getErrMsg() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(6, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getUin() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(11, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void n80(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    obtain.writeByteArray(bArr);
                    if (!this.f353304d.transact(18, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public byte[] ou0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                    if (!this.f353304d.transact(9, obtain, obtain2, 0)) {
                        int i = C118182a.f353303d;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C118182a() {
            attachInterface(this, "com.tencent.mm.protocal.IMMBaseResp_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        boolean Zi0 = ((C117743k0) this).Zi0(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(Zi0 ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        byte[] bArr = ((C117743k0) this).f352112g;
                        parcel2.writeNoException();
                        parcel2.writeByteArray(bArr);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        ((C117743k0) this).f352110e.setRetCode(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        int Om = ((C117743k0) this).mo182462Om();
                        parcel2.writeNoException();
                        parcel2.writeInt(Om);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        int Df0 = ((C117743k0) this).Df0();
                        parcel2.writeNoException();
                        parcel2.writeInt(Df0);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        String errMsg = ((C117743k0) this).getErrMsg();
                        parcel2.writeNoException();
                        parcel2.writeString(errMsg);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        ((C117743k0) this).f352110e.setErrMsg(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        byte[] S = ((C117743k0) this).mo182463S(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeByteArray(S);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        byte[] ou02 = ((C117743k0) this).ou0();
                        parcel2.writeNoException();
                        parcel2.writeByteArray(ou02);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        byte[] D = ((C117743k0) this).mo182459D();
                        parcel2.writeNoException();
                        parcel2.writeByteArray(D);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        int uin = ((C117743k0) this).getUin();
                        parcel2.writeNoException();
                        parcel2.writeInt(uin);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        String B = ((C117743k0) this).mo182456B();
                        parcel2.writeNoException();
                        parcel2.writeString(B);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        int cmdId = ((C117743k0) this).f352110e.getCmdId();
                        parcel2.writeNoException();
                        parcel2.writeInt(cmdId);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        String SE = ((C117743k0) this).mo182464SE();
                        parcel2.writeNoException();
                        parcel2.writeString(SE);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        String Ct = ((C117743k0) this).mo182458Ct();
                        parcel2.writeNoException();
                        parcel2.writeString(Ct);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        int Bh = ((C117743k0) this).mo182457Bh();
                        parcel2.writeNoException();
                        parcel2.writeInt(Bh);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        byte[] Jg = ((C117743k0) this).mo182461Jg();
                        parcel2.writeNoException();
                        parcel2.writeByteArray(Jg);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                        ((C117743k0) this).n80(parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                return true;
            }
        }
    }

    /* renamed from: B */
    String mo182456B();

    /* renamed from: Bh */
    int mo182457Bh();

    /* renamed from: Ct */
    String mo182458Ct();

    /* renamed from: D */
    byte[] mo182459D();

    int Df0();

    /* renamed from: Jg */
    byte[] mo182461Jg();

    /* renamed from: Om */
    int mo182462Om();

    /* renamed from: S */
    byte[] mo182463S(int i);

    /* renamed from: SE */
    String mo182464SE();

    boolean Zi0(int i, byte[] bArr, byte[] bArr2, long j);

    byte[] getCookie();

    String getErrMsg();

    int getUin();

    void n80(byte[] bArr);

    byte[] ou0();
}
