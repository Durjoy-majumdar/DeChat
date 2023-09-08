package android.support.p427v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C112821a();

    /* renamed from: d */
    public int f337800d;

    /* renamed from: e */
    public int f337801e;

    /* renamed from: f */
    public int f337802f;

    /* renamed from: g */
    public int f337803g;

    /* renamed from: h */
    public int f337804h;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public class C112821a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f337800d = parcel.readInt();
        this.f337802f = parcel.readInt();
        this.f337803g = parcel.readInt();
        this.f337804h = parcel.readInt();
        this.f337801e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f337800d);
        parcel.writeInt(this.f337802f);
        parcel.writeInt(this.f337803g);
        parcel.writeInt(this.f337804h);
        parcel.writeInt(this.f337801e);
    }
}
