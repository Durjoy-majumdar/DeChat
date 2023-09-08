package androidx.paging.compose;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Landroidx/paging/compose/PagingPlaceholderKey;", "Landroid/os/Parcelable;", "paging-compose_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
final class PagingPlaceholderKey implements Parcelable {
    public static final Parcelable.Creator<PagingPlaceholderKey> CREATOR = new C0126a();

    /* renamed from: d */
    public final int f556d;

    /* renamed from: androidx.paging.compose.PagingPlaceholderKey$a */
    public static final class C0126a implements Parcelable.Creator<PagingPlaceholderKey> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new PagingPlaceholderKey(parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new PagingPlaceholderKey[i];
        }
    }

    public PagingPlaceholderKey(int i) {
        this.f556d = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagingPlaceholderKey) && this.f556d == ((PagingPlaceholderKey) obj).f556d;
    }

    public int hashCode() {
        return this.f556d;
    }

    public String toString() {
        return "PagingPlaceholderKey(index=" + this.f556d + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f556d);
    }
}
