package com.tencent.p014mm.plugin.appbrand.report;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj */
public class AppBrandRecommendStatObj implements Parcelable {
    public static final Parcelable.Creator<AppBrandRecommendStatObj> CREATOR = new C55547a();

    /* renamed from: d */
    public String f158158d;

    /* renamed from: e */
    public String f158159e;

    /* renamed from: f */
    public String f158160f;

    /* renamed from: g */
    public String f158161g;

    /* renamed from: h */
    public String f158162h;

    /* renamed from: i */
    public String f158163i;

    /* renamed from: j */
    public int f158164j;

    /* renamed from: n */
    public String f158165n;

    /* renamed from: o */
    public int f158166o;

    /* renamed from: p */
    public float f158167p;

    /* renamed from: q */
    public float f158168q;

    /* renamed from: r */
    public long f158169r;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj$a */
    public class C55547a implements Parcelable.Creator<AppBrandRecommendStatObj> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandRecommendStatObj(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandRecommendStatObj[i];
        }
    }

    public AppBrandRecommendStatObj() {
    }

    public AppBrandRecommendStatObj(Parcel parcel) {
        this.f158158d = parcel.readString();
        this.f158159e = parcel.readString();
        this.f158160f = parcel.readString();
        this.f158161g = parcel.readString();
        this.f158162h = parcel.readString();
        this.f158163i = parcel.readString();
        this.f158164j = parcel.readInt();
        this.f158165n = parcel.readString();
        this.f158166o = parcel.readInt();
        this.f158167p = parcel.readFloat();
        this.f158168q = parcel.readFloat();
        this.f158169r = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "AppBrandRecommendStatObj{username=" + this.f158158d + ", recommend_id='" + this.f158159e + '\'' + ", strategy_info=" + this.f158160f + ", appid='" + this.f158161g + '\'' + ", page_path=" + this.f158162h + ", page_param=" + this.f158163i + ", card_type=" + this.f158164j + ", pass_str=" + this.f158165n + ", position=" + this.f158166o + ", longitude=" + this.f158167p + ", latitude=" + this.f158168q + ", sessionId=" + this.f158169r + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f158158d);
        parcel.writeString(this.f158159e);
        parcel.writeString(this.f158160f);
        parcel.writeString(this.f158161g);
        parcel.writeString(this.f158162h);
        parcel.writeString(this.f158163i);
        parcel.writeInt(this.f158164j);
        parcel.writeString(this.f158165n);
        parcel.writeInt(this.f158166o);
        parcel.writeFloat(this.f158167p);
        parcel.writeFloat(this.f158168q);
        parcel.writeLong(this.f158169r);
    }
}
