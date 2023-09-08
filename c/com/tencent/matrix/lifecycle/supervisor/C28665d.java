package com.tencent.matrix.lifecycle.supervisor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.lifecycle.supervisor.C80481h;
import com.tencent.matrix.util.MemInfo;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.d */
public interface C28665d extends IInterface {

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.d$a */
    public static abstract class C28666a extends Binder implements C28665d {

        /* renamed from: d */
        public static final /* synthetic */ int f78638d = 0;

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.d$a$a */
        public static class C28667a implements C28665d {

            /* renamed from: d */
            public IBinder f78639d;

            public C28667a(IBinder iBinder) {
                this.f78639d = iBinder;
            }

            /* renamed from: DX */
            public void mo56254DX(String str, String str2, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f78639d.transact(1, obtain, obtain2, 0)) {
                        int i = C28666a.f78638d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void F60(String str, String str2, int i, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f78639d.transact(3, obtain, obtain2, 0)) {
                        int i2 = C28666a.f78638d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f78639d;
            }

            /* renamed from: b9 */
            public void mo56256b9(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    if (!this.f78639d.transact(2, obtain, obtain2, 0)) {
                        int i2 = C28666a.f78638d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: uY */
            public MemInfo mo56257uY() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                    if (!this.f78639d.transact(4, obtain, obtain2, 0)) {
                        int i = C28666a.f78638d;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MemInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C28666a() {
            attachInterface(this, "com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            if (i == 1) {
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                ((C80481h.C80484b) this).mo56254DX(readString, readString2, z);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                ((C80481h.C80484b) this).mo56256b9(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                ((C80481h.C80484b) this).F60(readString3, readString4, readInt, z);
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                MemInfo uY = ((C80481h.C80484b) this).mo56257uY();
                parcel2.writeNoException();
                parcel2.writeInt(1);
                uY.writeToParcel(parcel2, 1);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                return true;
            }
        }
    }

    /* renamed from: DX */
    void mo56254DX(String str, String str2, boolean z);

    void F60(String str, String str2, int i, boolean z);

    /* renamed from: b9 */
    void mo56256b9(String str, String str2, int i);

    /* renamed from: uY */
    MemInfo mo56257uY();
}
