package com.tencent.p014mm.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.api.QueryImageData */
public class QueryImageData implements Parcelable {
    public static final Parcelable.Creator<QueryImageData> CREATOR = new C55105a();

    /* renamed from: d */
    public long f154723d;

    /* renamed from: e */
    public long f154724e;

    /* renamed from: f */
    public String f154725f;

    /* renamed from: g */
    public String f154726g;

    /* renamed from: h */
    public String f154727h;

    /* renamed from: i */
    public String f154728i;

    /* renamed from: j */
    public String f154729j;

    /* renamed from: com.tencent.mm.api.QueryImageData$a */
    public class C55105a implements Parcelable.Creator<QueryImageData> {
        public Object createFromParcel(Parcel parcel) {
            return new QueryImageData(parcel);
        }

        public Object[] newArray(int i) {
            return new QueryImageData[i];
        }
    }

    public QueryImageData(Parcel parcel) {
        this.f154727h = "";
        this.f154728i = "";
        this.f154729j = "";
        this.f154723d = parcel.readLong();
        this.f154724e = parcel.readLong();
        this.f154725f = parcel.readString();
        this.f154726g = parcel.readString();
        this.f154727h = parcel.readString();
        this.f154728i = parcel.readString();
        this.f154729j = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f154723d);
        parcel.writeLong(this.f154724e);
        parcel.writeString(this.f154725f);
        parcel.writeString(this.f154726g);
        parcel.writeString(this.f154727h);
        parcel.writeString(this.f154728i);
        parcel.writeString(this.f154729j);
    }

    public QueryImageData(long j, long j2, String str, String str2) {
        this.f154727h = "";
        this.f154728i = "";
        this.f154729j = "";
        this.f154723d = j2;
        this.f154724e = j;
        this.f154725f = str;
        this.f154726g = str2;
    }

    public QueryImageData(long j, long j2, String str, String str2, String str3, String str4, String str5) {
        this.f154723d = j2;
        this.f154724e = j;
        this.f154725f = str;
        this.f154726g = str2;
        this.f154727h = str3;
        this.f154728i = str4;
        this.f154729j = str5;
    }
}
