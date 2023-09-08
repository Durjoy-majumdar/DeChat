package com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import lm0.C88589h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Result", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result */
public final class JsApiOperateRecentUsageList$Companion$Result implements Parcelable {
    public static final Parcelable.Creator<JsApiOperateRecentUsageList$Companion$Result> CREATOR = new C82925a();

    /* renamed from: g */
    public static final JsApiOperateRecentUsageList$Companion$Result f242422g = new JsApiOperateRecentUsageList$Companion$Result(true, C88589h.OK, (String) null, 4, (C8480h) null);

    /* renamed from: h */
    public static final JsApiOperateRecentUsageList$Companion$Result f242423h = new JsApiOperateRecentUsageList$Companion$Result(false, C88589h.FAIL_OTHER, (String) null, 4, (C8480h) null);

    /* renamed from: d */
    public final boolean f242424d;

    /* renamed from: e */
    public final C88589h f242425e;

    /* renamed from: f */
    public final String f242426f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result$a */
    public static final class C82925a implements Parcelable.Creator<JsApiOperateRecentUsageList$Companion$Result> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new JsApiOperateRecentUsageList$Companion$Result(parcel.readByte() != 0, C88589h.valueOf(String.valueOf(parcel.readString())), String.valueOf(parcel.readString()));
        }

        public Object[] newArray(int i) {
            return new JsApiOperateRecentUsageList$Companion$Result[i];
        }
    }

    public JsApiOperateRecentUsageList$Companion$Result(boolean z, C88589h hVar, String str) {
        C87412m.m108594g(hVar, OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        C87412m.m108594g(str, OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
        this.f242424d = z;
        this.f242425e = hVar;
        this.f242426f = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsApiOperateRecentUsageList$Companion$Result)) {
            return false;
        }
        JsApiOperateRecentUsageList$Companion$Result jsApiOperateRecentUsageList$Companion$Result = (JsApiOperateRecentUsageList$Companion$Result) obj;
        return this.f242424d == jsApiOperateRecentUsageList$Companion$Result.f242424d && this.f242425e == jsApiOperateRecentUsageList$Companion$Result.f242425e && C87412m.m108589b(this.f242426f, jsApiOperateRecentUsageList$Companion$Result.f242426f);
    }

    public int hashCode() {
        boolean z = this.f242424d;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + this.f242425e.hashCode()) * 31) + this.f242426f.hashCode();
    }

    public String toString() {
        return "Result(success=" + this.f242424d + ", errorCode=" + this.f242425e + ", errorMsg=" + this.f242426f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeByte(this.f242424d ? (byte) 1 : 0);
        parcel.writeString(this.f242425e.name());
        parcel.writeString(this.f242426f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsApiOperateRecentUsageList$Companion$Result(boolean z, C88589h hVar, String str, int i, C8480h hVar2) {
        this(z, hVar, (i & 4) != 0 ? "" : str);
    }
}
