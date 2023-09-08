package com.tencent.p014mm.plugin.appbrand.report;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandStatObject */
public final class AppBrandStatObject implements Parcelable {
    public static final Parcelable.Creator<AppBrandStatObject> CREATOR = new C84098a();

    /* renamed from: d */
    public int f245531d;

    /* renamed from: e */
    public String f245532e;

    /* renamed from: f */
    public int f245533f;

    /* renamed from: g */
    public String f245534g;

    /* renamed from: h */
    public int f245535h;

    /* renamed from: i */
    public int f245536i;

    /* renamed from: j */
    public String f245537j;

    /* renamed from: n */
    public String f245538n;

    /* renamed from: o */
    public AppBrandRecommendStatObj f245539o;

    /* renamed from: p */
    public Bundle f245540p;

    /* renamed from: q */
    public int f245541q = -1;

    /* renamed from: r */
    public int f245542r = 0;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandStatObject$a */
    public class C84098a implements Parcelable.Creator<AppBrandStatObject> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandStatObject(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandStatObject[i];
        }
    }

    public AppBrandStatObject() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "AppBrandStatObject{preScene=" + this.f245531d + ", preSceneNote='" + this.f245532e + '\'' + ", scene=" + this.f245533f + ", sceneNote='" + this.f245534g + '\'' + ", usedState=" + this.f245535h + '\'' + ", codeScene=" + this.f245542r + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f245531d);
        parcel.writeString(this.f245532e);
        parcel.writeInt(this.f245533f);
        parcel.writeString(this.f245534g);
        parcel.writeInt(this.f245535h);
        parcel.writeInt(this.f245536i);
        parcel.writeString(this.f245537j);
        parcel.writeParcelable(this.f245539o, i);
        parcel.writeString(this.f245538n);
        parcel.writeBundle(this.f245540p);
        parcel.writeInt(this.f245541q);
        parcel.writeInt(this.f245542r);
    }

    public AppBrandStatObject(Parcel parcel) {
        this.f245531d = parcel.readInt();
        this.f245532e = parcel.readString();
        this.f245533f = parcel.readInt();
        this.f245534g = parcel.readString();
        this.f245535h = parcel.readInt();
        this.f245536i = parcel.readInt();
        this.f245537j = parcel.readString();
        this.f245539o = (AppBrandRecommendStatObj) parcel.readParcelable(AppBrandRecommendStatObj.class.getClassLoader());
        this.f245538n = parcel.readString();
        this.f245540p = parcel.readBundle(AppBrandStatObject.class.getClassLoader());
        this.f245541q = parcel.readInt();
        this.f245542r = parcel.readInt();
    }
}
