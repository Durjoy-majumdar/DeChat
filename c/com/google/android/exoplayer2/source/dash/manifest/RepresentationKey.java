package com.google.android.exoplayer2.source.dash.manifest;

import android.os.Parcel;
import android.os.Parcelable;

public final class RepresentationKey implements Parcelable, Comparable<RepresentationKey> {
    public static final Parcelable.Creator<RepresentationKey> CREATOR = new C0903a();

    /* renamed from: d */
    public final int f2122d;

    /* renamed from: e */
    public final int f2123e;

    /* renamed from: f */
    public final int f2124f;

    /* renamed from: com.google.android.exoplayer2.source.dash.manifest.RepresentationKey$a */
    public static class C0903a implements Parcelable.Creator<RepresentationKey> {
        public Object createFromParcel(Parcel parcel) {
            return new RepresentationKey(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new RepresentationKey[i];
        }
    }

    public RepresentationKey(int i, int i2, int i3) {
        this.f2122d = i;
        this.f2123e = i2;
        this.f2124f = i3;
    }

    public int compareTo(Object obj) {
        RepresentationKey representationKey = (RepresentationKey) obj;
        int i = this.f2122d - representationKey.f2122d;
        if (i != 0) {
            return i;
        }
        int i2 = this.f2123e - representationKey.f2123e;
        return i2 == 0 ? this.f2124f - representationKey.f2124f : i2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f2122d + "." + this.f2123e + "." + this.f2124f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2122d);
        parcel.writeInt(this.f2123e);
        parcel.writeInt(this.f2124f);
    }
}
