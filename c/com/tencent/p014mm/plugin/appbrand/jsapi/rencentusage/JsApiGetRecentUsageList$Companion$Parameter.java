package com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Parameter", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter */
public final class JsApiGetRecentUsageList$Companion$Parameter implements Parcelable {
    public static final C82922a CREATOR = new C82922a((C8480h) null);

    /* renamed from: d */
    public final int f242412d;

    /* renamed from: e */
    public final long f242413e;

    /* renamed from: f */
    public final int f242414f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter$a */
    public static final class C82922a implements Parcelable.Creator<JsApiGetRecentUsageList$Companion$Parameter> {
        public C82922a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new JsApiGetRecentUsageList$Companion$Parameter(parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new JsApiGetRecentUsageList$Companion$Parameter[i];
        }
    }

    public JsApiGetRecentUsageList$Companion$Parameter(int i, long j, int i2) {
        this.f242412d = i;
        this.f242413e = j;
        this.f242414f = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsApiGetRecentUsageList$Companion$Parameter)) {
            return false;
        }
        JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter = (JsApiGetRecentUsageList$Companion$Parameter) obj;
        return this.f242412d == jsApiGetRecentUsageList$Companion$Parameter.f242412d && this.f242413e == jsApiGetRecentUsageList$Companion$Parameter.f242413e && this.f242414f == jsApiGetRecentUsageList$Companion$Parameter.f242414f;
    }

    public int hashCode() {
        long j = this.f242413e;
        return (((this.f242412d * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f242414f;
    }

    public String toString() {
        return "Parameter(count=" + this.f242412d + ", lastUpdateTime=" + this.f242413e + ", requestId=" + this.f242414f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f242412d);
        parcel.writeLong(this.f242413e);
        parcel.writeInt(this.f242414f);
    }
}
