package com.tencent.p014mm.plugin.kidswatch.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo */
public class KidsWatchAcctInfo implements Parcelable {
    public static final Parcelable.Creator<KidsWatchAcctInfo> CREATOR = new C42465a();

    /* renamed from: d */
    public int f114954d;

    /* renamed from: e */
    public String f114955e;

    /* renamed from: f */
    public String f114956f;

    /* renamed from: g */
    public String f114957g;

    /* renamed from: h */
    public String f114958h;

    /* renamed from: com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo$a */
    public class C42465a implements Parcelable.Creator<KidsWatchAcctInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new KidsWatchAcctInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new KidsWatchAcctInfo[i];
        }
    }

    public KidsWatchAcctInfo(String str, String str2, String str3, String str4, int i) {
        this.f114954d = i;
        this.f114957g = str;
        this.f114955e = str2;
        this.f114958h = str4;
        this.f114956f = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f114954d);
        parcel.writeString(this.f114957g);
        parcel.writeString(this.f114955e);
        parcel.writeString(this.f114958h);
        parcel.writeString(this.f114956f);
    }

    public KidsWatchAcctInfo(Parcel parcel) {
        this.f114954d = parcel.readInt();
        this.f114957g = parcel.readString();
        this.f114955e = parcel.readString();
        this.f114958h = parcel.readString();
        this.f114956f = parcel.readString();
    }
}
