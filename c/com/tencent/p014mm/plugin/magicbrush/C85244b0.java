package com.tencent.p014mm.plugin.magicbrush;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g42.C87140c;

/* renamed from: com.tencent.mm.plugin.magicbrush.b0 */
public interface C85244b0 extends IInterface {

    /* renamed from: com.tencent.mm.plugin.magicbrush.b0$a */
    public static abstract class C85245a extends Binder implements C85244b0 {

        /* renamed from: d */
        public static final /* synthetic */ int f248379d = 0;

        /* renamed from: com.tencent.mm.plugin.magicbrush.b0$a$a */
        public static class C85246a implements C85244b0 {

            /* renamed from: d */
            public IBinder f248380d;

            public C85246a(IBinder iBinder) {
                this.f248380d = iBinder;
            }

            /* renamed from: LL */
            public void mo118379LL(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f248380d.transact(12, obtain, obtain2, 0)) {
                        int i = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: O */
            public void mo118380O(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.f248380d.transact(13, obtain, obtain2, 0)) {
                        int i = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: O3 */
            public void mo118381O3(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    if (!this.f248380d.transact(8, obtain, obtain2, 0)) {
                        int i = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: TY */
            public void mo118382TY(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    if (!this.f248380d.transact(6, obtain, obtain2, 0)) {
                        int i = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void Tn0(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (!this.f248380d.transact(14, obtain, obtain2, 0)) {
                        int i2 = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: WI */
            public void mo118384WI(String str, int i, int i2, int i3, int i4, int i5, int i6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f248380d.transact(2, obtain, obtain2, 0)) {
                        int i7 = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ym */
            public void mo118385Ym(String str, int i, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f248380d.transact(5, obtain, obtain2, 0)) {
                        int i2 = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f248380d;
            }

            public String fr0(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.f248380d.transact(9, obtain, obtain2, 0)) {
                        int i = C85245a.f248379d;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: gq */
            public void mo118387gq(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.f248380d.transact(3, obtain, obtain2, 0)) {
                        int i2 = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: hq */
            public void mo118388hq(String str, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f248380d.transact(11, obtain, obtain2, 0)) {
                        int i = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void p00(String str, String str2, String str3, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeInt(i);
                    if (!this.f248380d.transact(10, obtain, obtain2, 0)) {
                        int i2 = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void q80(String str, int i, int i2, int i3, int i4, int i5, int i6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f248380d.transact(1, obtain, obtain2, 0)) {
                        int i7 = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void x90(String str, int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeFloatArray(fArr);
                    obtain.writeFloatArray(fArr2);
                    obtain.writeFloatArray(fArr3);
                    obtain.writeFloatArray(fArr4);
                    if (!this.f248380d.transact(4, obtain, obtain2, 0)) {
                        int i2 = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: yu */
            public void mo118392yu(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                    obtain.writeString(str);
                    if (!this.f248380d.transact(7, obtain, obtain2, 0)) {
                        int i = C85245a.f248379d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C85245a() {
            attachInterface(this, "com.tencent.mm.plugin.magicbrush.IMBClientMgr");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            if (i3 != 1598968902) {
                boolean z = false;
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).q80(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).mo118384WI(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).mo118387gq(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).x90(parcel.readString(), parcel.readInt(), parcel.createFloatArray(), parcel.createFloatArray(), parcel.createFloatArray(), parcel.createFloatArray());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        String readString = parcel.readString();
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        ((C87140c) this).mo118385Ym(readString, readInt, z);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).mo118382TY(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).mo118392yu(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).mo118381O3(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        String fr02 = ((C87140c) this).fr0(parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel4.writeString(fr02);
                        return true;
                    case 10:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).p00(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        ((C87140c) this).mo118388hq(readString2, z);
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).mo118379LL(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).mo118380O(parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel3.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                        ((C87140c) this).Tn0(parcel.readString(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel4.writeString("com.tencent.mm.plugin.magicbrush.IMBClientMgr");
                return true;
            }
        }
    }

    /* renamed from: LL */
    void mo118379LL(String str, String str2);

    /* renamed from: O */
    void mo118380O(String str, String str2, String str3);

    /* renamed from: O3 */
    void mo118381O3(String str);

    /* renamed from: TY */
    void mo118382TY(String str);

    void Tn0(String str, int i, String str2);

    /* renamed from: WI */
    void mo118384WI(String str, int i, int i2, int i3, int i4, int i5, int i6);

    /* renamed from: Ym */
    void mo118385Ym(String str, int i, boolean z);

    String fr0(String str, String str2, String str3);

    /* renamed from: gq */
    void mo118387gq(String str, int i);

    /* renamed from: hq */
    void mo118388hq(String str, boolean z);

    void p00(String str, String str2, String str3, int i);

    void q80(String str, int i, int i2, int i3, int i4, int i5, int i6);

    void x90(String str, int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    /* renamed from: yu */
    void mo118392yu(String str);
}
