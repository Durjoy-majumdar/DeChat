package p1176ca;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ca.b */
public interface C113260b extends IInterface {

    /* renamed from: ca.b$a */
    public static abstract class C113261a extends Binder implements C113260b {
        private static final String DESCRIPTOR = "com.tencent.assistant.sdk.SDKActionCallback";
        public static final int TRANSACTION_onActionResult = 1;

        /* renamed from: ca.b$a$a */
        public static class C113262a implements C113260b {

            /* renamed from: d */
            public IBinder f338871d;

            public C113262a(IBinder iBinder) {
                this.f338871d = iBinder;
            }

            public IBinder asBinder() {
                return this.f338871d;
            }
        }

        public C113261a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static C113260b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C113260b)) ? new C113262a(iBinder) : (C113260b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onActionResult(parcel.createByteArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onActionResult(byte[] bArr);
}
