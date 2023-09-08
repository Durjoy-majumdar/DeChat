package com.tencent.p014mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/BindRemoteServiceData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.BindRemoteServiceData */
final class BindRemoteServiceData implements Parcelable {
    public static final Parcelable.Creator<BindRemoteServiceData> CREATOR = new C81097a();

    /* renamed from: d */
    public final AppBrandInitConfigWC f238355d;

    /* renamed from: e */
    public final AppBrandStatObject f238356e;

    /* renamed from: f */
    public final int f238357f;

    /* renamed from: com.tencent.mm.plugin.appbrand.BindRemoteServiceData$a */
    public static final class C81097a implements Parcelable.Creator<BindRemoteServiceData> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new BindRemoteServiceData((AppBrandInitConfigWC) parcel.readParcelable(BindRemoteServiceData.class.getClassLoader()), (AppBrandStatObject) parcel.readParcelable(BindRemoteServiceData.class.getClassLoader()), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new BindRemoteServiceData[i];
        }
    }

    public BindRemoteServiceData(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject, int i) {
        C87412m.m108594g(appBrandInitConfigWC, "initConfig");
        C87412m.m108594g(appBrandStatObject, "stat");
        this.f238355d = appBrandInitConfigWC;
        this.f238356e = appBrandStatObject;
        this.f238357f = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindRemoteServiceData)) {
            return false;
        }
        BindRemoteServiceData bindRemoteServiceData = (BindRemoteServiceData) obj;
        return C87412m.m108589b(this.f238355d, bindRemoteServiceData.f238355d) && C87412m.m108589b(this.f238356e, bindRemoteServiceData.f238356e) && this.f238357f == bindRemoteServiceData.f238357f;
    }

    public int hashCode() {
        return (((this.f238355d.hashCode() * 31) + this.f238356e.hashCode()) * 31) + this.f238357f;
    }

    public String toString() {
        return "BindRemoteServiceData(initConfig=" + this.f238355d + ", stat=" + this.f238356e + ", loaderId=" + this.f238357f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f238355d, i);
        parcel.writeParcelable(this.f238356e, i);
        parcel.writeInt(this.f238357f);
    }
}
