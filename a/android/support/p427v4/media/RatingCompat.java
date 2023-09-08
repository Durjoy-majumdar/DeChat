package android.support.p427v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C79593a();

    /* renamed from: d */
    public final int f233415d;

    /* renamed from: e */
    public final float f233416e;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public class C79593a implements Parcelable.Creator<RatingCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f233415d = i;
        this.f233416e = f;
    }

    public int describeContents() {
        return this.f233415d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f233415d);
        sb.append(" rating=");
        float f = this.f233416e;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f233415d);
        parcel.writeFloat(this.f233416e);
    }
}
