package coil.size;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcoil/size/OriginalSize;", "Lcoil/size/Size;", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class OriginalSize extends Size {
    public static final Parcelable.Creator<OriginalSize> CREATOR = new C104385a();

    /* renamed from: d */
    public static final OriginalSize f309027d = new OriginalSize();

    /* renamed from: coil.size.OriginalSize$a */
    public static final class C104385a implements Parcelable.Creator<OriginalSize> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            parcel.readInt();
            return OriginalSize.f309027d;
        }

        public Object[] newArray(int i) {
            return new OriginalSize[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "coil.size.OriginalSize";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(1);
    }
}
