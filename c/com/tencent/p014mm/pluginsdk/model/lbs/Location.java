package com.tencent.p014mm.pluginsdk.model.lbs;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.pluginsdk.model.lbs.Location */
public class Location implements Parcelable {
    public static final Parcelable.Creator<Location> CREATOR = new C72712a();

    /* renamed from: d */
    public float f211578d;

    /* renamed from: e */
    public float f211579e;

    /* renamed from: f */
    public int f211580f;

    /* renamed from: g */
    public int f211581g;

    /* renamed from: h */
    public String f211582h;

    /* renamed from: i */
    public String f211583i;

    /* renamed from: com.tencent.mm.pluginsdk.model.lbs.Location$a */
    public class C72712a implements Parcelable.Creator<Location> {
        public Object createFromParcel(Parcel parcel) {
            Location location = new Location();
            location.f211578d = parcel.readFloat();
            location.f211579e = parcel.readFloat();
            location.f211580f = parcel.readInt();
            location.f211581g = parcel.readInt();
            location.f211582h = parcel.readString();
            location.f211583i = parcel.readString();
            return location;
        }

        public Object[] newArray(int i) {
            return new Location[i];
        }
    }

    public Location() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f211578d);
        parcel.writeFloat(this.f211579e);
        parcel.writeInt(this.f211580f);
        parcel.writeInt(this.f211581g);
        parcel.writeString(this.f211582h);
        parcel.writeString(this.f211583i);
    }

    public Location(float f, float f2, int i, int i2, String str, String str2) {
        this.f211578d = f;
        this.f211579e = f2;
        this.f211580f = i;
        this.f211581g = i2;
        this.f211582h = str;
        this.f211583i = str2;
    }
}
