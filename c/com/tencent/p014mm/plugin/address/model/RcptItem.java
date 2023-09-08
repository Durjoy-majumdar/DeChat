package com.tencent.p014mm.plugin.address.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.address.model.RcptItem */
public class RcptItem implements Parcelable {
    public static final Parcelable.Creator<RcptItem> CREATOR = new C68510a();

    /* renamed from: d */
    public String f196786d;

    /* renamed from: e */
    public String f196787e;

    /* renamed from: f */
    public String f196788f;

    /* renamed from: g */
    public int f196789g;

    /* renamed from: h */
    public int f196790h;

    /* renamed from: com.tencent.mm.plugin.address.model.RcptItem$a */
    public class C68510a implements Parcelable.Creator<RcptItem> {
        public Object createFromParcel(Parcel parcel) {
            return new RcptItem(parcel);
        }

        public Object[] newArray(int i) {
            return new RcptItem[i];
        }
    }

    public RcptItem(String str, String str2, String str3) {
        this.f196789g = -1;
        this.f196790h = 0;
        this.f196786d = str;
        this.f196787e = str2;
        this.f196788f = str3;
        if (str2 != null && str2.endsWith("0000000")) {
            this.f196789g = 0;
        } else if (str2 != null && str2.endsWith("00000")) {
            this.f196789g = 1;
            this.f196790h = (str2.substring(0, 2) + "0000000").hashCode();
        } else if (str2 == null || !str2.endsWith("000")) {
            this.f196789g = 3;
            this.f196790h = (str2.substring(0, 6) + "000").hashCode();
        } else {
            this.f196789g = 2;
            this.f196790h = (str2.substring(0, 4) + "00000").hashCode();
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f196786d);
        parcel.writeString(this.f196787e);
        parcel.writeString(this.f196788f);
        parcel.writeInt(this.f196789g);
        parcel.writeInt(this.f196790h);
    }

    public RcptItem(Parcel parcel) {
        this.f196786d = "";
        this.f196787e = "";
        this.f196788f = "";
        this.f196789g = -1;
        this.f196790h = 0;
        this.f196786d = parcel.readString();
        this.f196787e = parcel.readString();
        this.f196788f = parcel.readString();
        this.f196789g = parcel.readInt();
        this.f196790h = parcel.readInt();
    }
}
