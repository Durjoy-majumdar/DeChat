package coil.size;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcoil/size/PixelSize;", "Lcoil/size/Size;", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class PixelSize extends Size {
    public static final Parcelable.Creator<PixelSize> CREATOR = new C104386a();

    /* renamed from: d */
    public final int f309028d;

    /* renamed from: e */
    public final int f309029e;

    /* renamed from: coil.size.PixelSize$a */
    public static final class C104386a implements Parcelable.Creator<PixelSize> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new PixelSize(parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new PixelSize[i];
        }
    }

    public PixelSize(int i, int i2) {
        this.f309028d = i;
        this.f309029e = i2;
        if (!(i > 0 && i2 > 0)) {
            throw new IllegalArgumentException("width and height must be > 0.".toString());
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PixelSize)) {
            return false;
        }
        PixelSize pixelSize = (PixelSize) obj;
        return this.f309028d == pixelSize.f309028d && this.f309029e == pixelSize.f309029e;
    }

    public int hashCode() {
        return (this.f309028d * 31) + this.f309029e;
    }

    public String toString() {
        return "PixelSize(width=" + this.f309028d + ", height=" + this.f309029e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f309028d);
        parcel.writeInt(this.f309029e);
    }
}
