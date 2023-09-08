package com.tencent.p014mm.plugin.appbrand.headless;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/headless/BindRemoteServiceData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceData */
final class BindRemoteServiceData implements Parcelable {
    public static final Parcelable.Creator<BindRemoteServiceData> CREATOR = new C81902a();

    /* renamed from: d */
    public final AppBrandInitConfigWC f240235d;

    /* renamed from: e */
    public final AppBrandStatObject f240236e;

    /* renamed from: f */
    public final int f240237f;

    /* renamed from: g */
    public final String f240238g;

    /* renamed from: com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceData$a */
    public static final class C81902a implements Parcelable.Creator<BindRemoteServiceData> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new BindRemoteServiceData((AppBrandInitConfigWC) parcel.readParcelable(BindRemoteServiceData.class.getClassLoader()), (AppBrandStatObject) parcel.readParcelable(BindRemoteServiceData.class.getClassLoader()), parcel.readInt(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new BindRemoteServiceData[i];
        }
    }

    public BindRemoteServiceData(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject, int i, String str) {
        C87412m.m108594g(appBrandInitConfigWC, "initConfig");
        C87412m.m108594g(appBrandStatObject, "stat");
        this.f240235d = appBrandInitConfigWC;
        this.f240236e = appBrandStatObject;
        this.f240237f = i;
        this.f240238g = str;
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
        return C87412m.m108589b(this.f240235d, bindRemoteServiceData.f240235d) && C87412m.m108589b(this.f240236e, bindRemoteServiceData.f240236e) && this.f240237f == bindRemoteServiceData.f240237f && C87412m.m108589b(this.f240238g, bindRemoteServiceData.f240238g);
    }

    public int hashCode() {
        int hashCode = ((((this.f240235d.hashCode() * 31) + this.f240236e.hashCode()) * 31) + this.f240237f) * 31;
        String str = this.f240238g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BindRemoteServiceData(initConfig=" + this.f240235d + ", stat=" + this.f240236e + ", requestId=" + this.f240237f + ", taskOnStartSuccessClassName=" + this.f240238g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f240235d, i);
        parcel.writeParcelable(this.f240236e, i);
        parcel.writeInt(this.f240237f);
        parcel.writeString(this.f240238g);
    }
}
