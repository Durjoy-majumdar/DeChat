package com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import lm0.C88588g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Parameter", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter */
public final class JsApiOperateRecentUsageList$Companion$Parameter implements Parcelable {
    public static final C82924a CREATOR = new C82924a((C8480h) null);

    /* renamed from: d */
    public final C88588g f242418d;

    /* renamed from: e */
    public final String f242419e;

    /* renamed from: f */
    public final String f242420f;

    /* renamed from: g */
    public final int f242421g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter$a */
    public static final class C82924a implements Parcelable.Creator<JsApiOperateRecentUsageList$Companion$Parameter> {
        public C82924a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new JsApiOperateRecentUsageList$Companion$Parameter(C88588g.valueOf(String.valueOf(parcel.readString())), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new JsApiOperateRecentUsageList$Companion$Parameter[i];
        }
    }

    public JsApiOperateRecentUsageList$Companion$Parameter(C88588g gVar, String str, String str2, int i) {
        C87412m.m108594g(gVar, "actionType");
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "appId");
        this.f242418d = gVar;
        this.f242419e = str;
        this.f242420f = str2;
        this.f242421g = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsApiOperateRecentUsageList$Companion$Parameter)) {
            return false;
        }
        JsApiOperateRecentUsageList$Companion$Parameter jsApiOperateRecentUsageList$Companion$Parameter = (JsApiOperateRecentUsageList$Companion$Parameter) obj;
        return this.f242418d == jsApiOperateRecentUsageList$Companion$Parameter.f242418d && C87412m.m108589b(this.f242419e, jsApiOperateRecentUsageList$Companion$Parameter.f242419e) && C87412m.m108589b(this.f242420f, jsApiOperateRecentUsageList$Companion$Parameter.f242420f) && this.f242421g == jsApiOperateRecentUsageList$Companion$Parameter.f242421g;
    }

    public int hashCode() {
        return (((((this.f242418d.hashCode() * 31) + this.f242419e.hashCode()) * 31) + this.f242420f.hashCode()) * 31) + this.f242421g;
    }

    public String toString() {
        return "Parameter(actionType=" + this.f242418d + ", username=" + this.f242419e + ", appId=" + this.f242420f + ", versionType=" + this.f242421g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f242418d.name());
        parcel.writeString(this.f242419e);
        parcel.writeString(this.f242420f);
        parcel.writeInt(this.f242421g);
    }
}
