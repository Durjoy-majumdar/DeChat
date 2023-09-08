package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "foundation_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new C0115a();

    /* renamed from: d */
    public final int f551d;

    /* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$a */
    public static final class C0115a implements Parcelable.Creator<DefaultLazyKey> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new DefaultLazyKey[i];
        }
    }

    public DefaultLazyKey(int i) {
        this.f551d = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f551d == ((DefaultLazyKey) obj).f551d;
    }

    public int hashCode() {
        return this.f551d;
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f551d + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f551d);
    }
}
