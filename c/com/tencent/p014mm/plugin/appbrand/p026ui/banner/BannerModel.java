package com.tencent.p014mm.plugin.appbrand.p026ui.banner;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.BannerModel */
final class BannerModel implements Parcelable {
    public static final Parcelable.Creator<BannerModel> CREATOR = new C84491a();

    /* renamed from: i */
    public static volatile BannerModel f246602i;

    /* renamed from: d */
    public String f246603d;

    /* renamed from: e */
    public int f246604e;

    /* renamed from: f */
    public String f246605f;

    /* renamed from: g */
    public String f246606g;

    /* renamed from: h */
    public String f246607h;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.BannerModel$a */
    public class C84491a implements Parcelable.Creator<BannerModel> {
        public Object createFromParcel(Parcel parcel) {
            return new BannerModel(parcel, (C84491a) null);
        }

        public Object[] newArray(int i) {
            return new BannerModel[i];
        }
    }

    public BannerModel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f246603d);
        parcel.writeInt(this.f246604e);
        parcel.writeString(this.f246605f);
        parcel.writeString(this.f246606g);
        parcel.writeString(this.f246607h);
    }

    public BannerModel(Parcel parcel, C84491a aVar) {
        this.f246603d = parcel.readString();
        this.f246604e = parcel.readInt();
        this.f246605f = parcel.readString();
        this.f246606g = parcel.readString();
        this.f246607h = parcel.readString();
    }
}
