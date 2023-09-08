package com.tencent.p014mm.plugin.appbrand.launching.report;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/report/AppBrandRuntimeReloadReportBundle;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle */
public final class AppBrandRuntimeReloadReportBundle implements Parcelable {
    public static final Parcelable.Creator<AppBrandRuntimeReloadReportBundle> CREATOR = new C83456a();

    /* renamed from: d */
    public String f243875d;

    /* renamed from: e */
    public String f243876e;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle$a */
    public static final class C83456a implements Parcelable.Creator<AppBrandRuntimeReloadReportBundle> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandRuntimeReloadReportBundle(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new AppBrandRuntimeReloadReportBundle[i];
        }
    }

    public AppBrandRuntimeReloadReportBundle(String str, String str2) {
        C87412m.m108594g(str, "refererInstanceId");
        this.f243875d = str;
        this.f243876e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppBrandRuntimeReloadReportBundle)) {
            return false;
        }
        AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle = (AppBrandRuntimeReloadReportBundle) obj;
        return C87412m.m108589b(this.f243875d, appBrandRuntimeReloadReportBundle.f243875d) && C87412m.m108589b(this.f243876e, appBrandRuntimeReloadReportBundle.f243876e);
    }

    public int hashCode() {
        int hashCode = this.f243875d.hashCode() * 31;
        String str = this.f243876e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AppBrandRuntimeReloadReportBundle(refererInstanceId=" + this.f243875d + ", reloadReason=" + this.f243876e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f243875d);
        parcel.writeString(this.f243876e);
    }
}
