package com.tencent.p014mm.plugin.finder.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.finder.model.MediaSelectedData */
public class MediaSelectedData implements Parcelable {
    public static final Parcelable.Creator<MediaSelectedData> CREATOR = new C3263a();

    /* renamed from: d */
    public String f15492d;

    /* renamed from: e */
    public String f15493e;

    /* renamed from: f */
    public int f15494f;

    /* renamed from: com.tencent.mm.plugin.finder.model.MediaSelectedData$a */
    public class C3263a implements Parcelable.Creator<MediaSelectedData> {
        public Object createFromParcel(Parcel parcel) {
            return new MediaSelectedData(parcel);
        }

        public Object[] newArray(int i) {
            return new MediaSelectedData[i];
        }
    }

    public MediaSelectedData(Parcel parcel) {
        this.f15492d = parcel.readString();
        this.f15493e = parcel.readString();
        this.f15494f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaSelectedData{path='" + this.f15492d + '\'' + ", thumbPath='" + this.f15493e + '\'' + ", type=" + this.f15494f + ", cropInfo=" + null + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15492d);
        parcel.writeString(this.f15493e);
        parcel.writeInt(this.f15494f);
    }
}
