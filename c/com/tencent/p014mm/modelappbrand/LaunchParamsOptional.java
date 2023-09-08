package com.tencent.p014mm.modelappbrand;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandWeishiParams;

/* renamed from: com.tencent.mm.modelappbrand.LaunchParamsOptional */
public final class LaunchParamsOptional implements Parcelable {
    public static final Parcelable.Creator<LaunchParamsOptional> CREATOR = new C80997a();

    /* renamed from: d */
    public String f237918d;

    /* renamed from: e */
    public String f237919e;

    /* renamed from: f */
    public String f237920f;

    /* renamed from: g */
    public AppBrandWeishiParams f237921g;

    /* renamed from: h */
    public int f237922h;

    /* renamed from: i */
    public String f237923i;

    /* renamed from: com.tencent.mm.modelappbrand.LaunchParamsOptional$a */
    public class C80997a implements Parcelable.Creator<LaunchParamsOptional> {
        public Object createFromParcel(Parcel parcel) {
            return new LaunchParamsOptional(parcel, (C80997a) null);
        }

        public Object[] newArray(int i) {
            return new LaunchParamsOptional[i];
        }
    }

    public LaunchParamsOptional() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f237918d);
        parcel.writeString(this.f237919e);
        parcel.writeParcelable(this.f237921g, i);
        parcel.writeInt(this.f237922h);
        parcel.writeString(this.f237923i);
        parcel.writeString(this.f237920f);
    }

    public LaunchParamsOptional(Parcel parcel, C80997a aVar) {
        this.f237918d = parcel.readString();
        this.f237919e = parcel.readString();
        this.f237921g = (AppBrandWeishiParams) parcel.readParcelable(AppBrandWeishiParams.class.getClassLoader());
        this.f237922h = parcel.readInt();
        this.f237923i = parcel.readString();
        this.f237920f = parcel.readString();
    }
}
