package com.appaac.haptic.sync;

import android.os.Parcel;
import android.os.Parcelable;

public class VibrationPattern implements Parcelable {
    public static final Parcelable.Creator<VibrationPattern> CREATOR = new C23801a();

    /* renamed from: d */
    public String f68204d;

    /* renamed from: e */
    public int f68205e;

    /* renamed from: f */
    public int f68206f;

    /* renamed from: com.appaac.haptic.sync.VibrationPattern$a */
    public static class C23801a implements Parcelable.Creator<VibrationPattern> {
        public Object createFromParcel(Parcel parcel) {
            return new VibrationPattern(parcel);
        }

        public Object[] newArray(int i) {
            return new VibrationPattern[i];
        }
    }

    public VibrationPattern(String str, int i, int i2) {
        this.f68204d = str;
        this.f68205e = i;
        this.f68206f = i2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "loop='" + this.f68205e + "',interval='" + this.f68206f + "'," + this.f68204d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68204d);
        parcel.writeInt(this.f68205e);
        parcel.writeInt(this.f68206f);
    }

    public VibrationPattern(Parcel parcel) {
        this.f68204d = parcel.readString();
        this.f68205e = parcel.readInt();
        this.f68206f = parcel.readInt();
    }
}
