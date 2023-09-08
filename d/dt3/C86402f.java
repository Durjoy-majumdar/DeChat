package dt3;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import ct3.C86142f;

/* renamed from: dt3.f */
public class C86402f extends C86142f {
    /* renamed from: b */
    public String mo120556b(Context context, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
            iBinder.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: d */
    public Intent mo120558d() {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        return intent;
    }
}
