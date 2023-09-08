package com.tencent.p014mm.pluginsdk.location;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.pluginsdk.location.Location */
public class Location implements Parcelable {
    public static final Parcelable.Creator<Location> CREATOR = new C106586a();

    /* renamed from: d */
    public final float f318471d;

    /* renamed from: e */
    public final float f318472e;

    /* renamed from: com.tencent.mm.pluginsdk.location.Location$a */
    public class C106586a implements Parcelable.Creator<Location> {
        public Object createFromParcel(Parcel parcel) {
            return new Location(parcel);
        }

        public Object[] newArray(int i) {
            return new Location[i];
        }
    }

    public Location(float f, float f2) {
        this.f318471d = f;
        this.f318472e = f2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f318471d);
        parcel.writeFloat(this.f318472e);
    }

    public Location(Parcel parcel) {
        this.f318471d = parcel.readFloat();
        this.f318472e = parcel.readFloat();
    }
}
