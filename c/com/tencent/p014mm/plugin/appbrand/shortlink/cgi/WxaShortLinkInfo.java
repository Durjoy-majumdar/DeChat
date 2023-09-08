package com.tencent.p014mm.plugin.appbrand.shortlink.cgi;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/shortlink/cgi/WxaShortLinkInfo;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo */
public final class WxaShortLinkInfo implements Parcelable {
    public static final Parcelable.Creator<WxaShortLinkInfo> CREATOR = new C40529a();

    /* renamed from: d */
    public final String f108862d;

    /* renamed from: e */
    public final String f108863e;

    /* renamed from: f */
    public final String f108864f;

    /* renamed from: g */
    public final int f108865g;

    /* renamed from: h */
    public final int f108866h;

    /* renamed from: i */
    public final String f108867i;

    /* renamed from: j */
    public final String f108868j;

    /* renamed from: com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo$a */
    public static final class C40529a implements Parcelable.Creator<WxaShortLinkInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new WxaShortLinkInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new WxaShortLinkInfo[i];
        }
    }

    public WxaShortLinkInfo(String str, String str2, String str3, int i, int i2, String str4, String str5) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "pageTitle");
        C87412m.m108594g(str3, "path");
        C87412m.m108594g(str4, "nickName");
        C87412m.m108594g(str5, "userName");
        this.f108862d = str;
        this.f108863e = str2;
        this.f108864f = str3;
        this.f108865g = i;
        this.f108866h = i2;
        this.f108867i = str4;
        this.f108868j = str5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxaShortLinkInfo)) {
            return false;
        }
        WxaShortLinkInfo wxaShortLinkInfo = (WxaShortLinkInfo) obj;
        return C87412m.m108589b(this.f108862d, wxaShortLinkInfo.f108862d) && C87412m.m108589b(this.f108863e, wxaShortLinkInfo.f108863e) && C87412m.m108589b(this.f108864f, wxaShortLinkInfo.f108864f) && this.f108865g == wxaShortLinkInfo.f108865g && this.f108866h == wxaShortLinkInfo.f108866h && C87412m.m108589b(this.f108867i, wxaShortLinkInfo.f108867i) && C87412m.m108589b(this.f108868j, wxaShortLinkInfo.f108868j);
    }

    public int hashCode() {
        return (((((((((((this.f108862d.hashCode() * 31) + this.f108863e.hashCode()) * 31) + this.f108864f.hashCode()) * 31) + this.f108865g) * 31) + this.f108866h) * 31) + this.f108867i.hashCode()) * 31) + this.f108868j.hashCode();
    }

    public String toString() {
        return "WxaShortLinkInfo(appId='" + this.f108862d + "', pageTitle='" + this.f108863e + "', path='" + this.f108864f + "', version=" + this.f108865g + ", versionType=" + this.f108866h + ", nickName='" + this.f108867i + "', userName=" + this.f108868j + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f108862d);
        parcel.writeString(this.f108863e);
        parcel.writeString(this.f108864f);
        parcel.writeInt(this.f108865g);
        parcel.writeInt(this.f108866h);
        parcel.writeString(this.f108867i);
        parcel.writeString(this.f108868j);
    }
}
