package p516f9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.iid.zzi;

/* renamed from: f9.x */
public final class C116845x implements Parcelable.Creator<zzi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new zzi(readStrongBinder);
        }
        return null;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
