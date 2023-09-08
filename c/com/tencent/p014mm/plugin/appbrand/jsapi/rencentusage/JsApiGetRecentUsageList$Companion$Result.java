package com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Result", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result */
public final class JsApiGetRecentUsageList$Companion$Result implements Parcelable {
    public static final Parcelable.Creator<JsApiGetRecentUsageList$Companion$Result> CREATOR = new C82923a();

    /* renamed from: d */
    public final String f242415d;

    /* renamed from: e */
    public final int f242416e;

    /* renamed from: f */
    public final String f242417f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result$a */
    public static final class C82923a implements Parcelable.Creator<JsApiGetRecentUsageList$Companion$Result> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            C87412m.m108591d(readString);
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            C87412m.m108591d(readString2);
            return new JsApiGetRecentUsageList$Companion$Result(readString, readInt, readString2);
        }

        public Object[] newArray(int i) {
            return new JsApiGetRecentUsageList$Companion$Result[i];
        }
    }

    public JsApiGetRecentUsageList$Companion$Result(String str, int i, String str2) {
        C87412m.m108594g(str, "data");
        C87412m.m108594g(str2, OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
        this.f242415d = str;
        this.f242416e = i;
        this.f242417f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsApiGetRecentUsageList$Companion$Result)) {
            return false;
        }
        JsApiGetRecentUsageList$Companion$Result jsApiGetRecentUsageList$Companion$Result = (JsApiGetRecentUsageList$Companion$Result) obj;
        return C87412m.m108589b(this.f242415d, jsApiGetRecentUsageList$Companion$Result.f242415d) && this.f242416e == jsApiGetRecentUsageList$Companion$Result.f242416e && C87412m.m108589b(this.f242417f, jsApiGetRecentUsageList$Companion$Result.f242417f);
    }

    public int hashCode() {
        return (((this.f242415d.hashCode() * 31) + this.f242416e) * 31) + this.f242417f.hashCode();
    }

    public String toString() {
        return "Result(data=" + this.f242415d + ", errorCode=" + this.f242416e + ", errorMsg=" + this.f242417f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f242415d);
        parcel.writeInt(this.f242416e);
        parcel.writeString(this.f242417f);
    }
}
