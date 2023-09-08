package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p584k4.C108882c;
import p584k4.C108883d;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C103839a();

    /* renamed from: d */
    public final C108883d f306789d;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C103839a implements Parcelable.Creator<ParcelImpl> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public Object[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f306789d = new C108882c(parcel).mo160009o();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C108882c(parcel).mo160018x(this.f306789d);
    }
}
