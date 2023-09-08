package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C103736a();

    /* renamed from: e */
    public static final AbsSavedState f306433e = new AbsSavedState() {
    };

    /* renamed from: d */
    public final Parcelable f306434d;

    public AbsSavedState(C1037351 r1) {
        this.f306434d = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f306434d, i);
    }

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    public static class C103736a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return AbsSavedState.f306433e;
            }
            throw new IllegalStateException("superState must be null");
        }

        public Object[] newArray(int i) {
            return new AbsSavedState[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f306433e;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f306434d = parcelable == f306433e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f306434d = readParcelable == null ? f306433e : readParcelable;
    }
}
