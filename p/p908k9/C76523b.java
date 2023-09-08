package p908k9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p908k9.C76518a;

/* renamed from: k9.b */
public interface C76523b extends IInterface {

    /* renamed from: k9.b$a */
    public static abstract class C76524a extends Binder implements C76523b {
        public C76524a() {
            attachInterface(this, "com.huawei.securitymgr.IAuthenticationClient");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.securitymgr.IAuthenticationClient");
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                byte[] createByteArray = parcel.createByteArray();
                C76518a.C76521c cVar = C76518a.this.f223972c;
                cVar.sendMessage(cVar.obtainMessage(readInt, readInt2, readInt3, createByteArray));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.securitymgr.IAuthenticationClient");
                return true;
            }
        }
    }
}
