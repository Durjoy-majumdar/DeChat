package p1223z3;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: z3.c */
public class C119030c implements C119031d {

    /* renamed from: d */
    public IBinder f356499d;

    public C119030c(IBinder iBinder) {
        this.f356499d = iBinder;
    }

    /* renamed from: UP */
    public void mo183690UP(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f356499d.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f356499d;
    }
}
