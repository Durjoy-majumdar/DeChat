package com.tencent.p014mm.plugin.appbrand.shortlink;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import fy3.C32226l;
import gy3.C87412m;
import java.util.regex.Pattern;
import kotlin.Metadata;
import or0.C47398l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher */
public abstract class AbsWxaShortLinkLauncher {

    /* renamed from: a */
    public static final Pattern f108855a;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/shortlink/AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams */
    public static final class WxaShortLinkLaunchParams implements Parcelable {
        public static final Parcelable.Creator<WxaShortLinkLaunchParams> CREATOR = new C40528a();

        /* renamed from: d */
        public final String f108856d;

        /* renamed from: e */
        public final String f108857e;

        /* renamed from: f */
        public final int f108858f;

        /* renamed from: g */
        public final int f108859g;

        /* renamed from: h */
        public final String f108860h;

        /* renamed from: i */
        public final String f108861i;

        /* renamed from: com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams$a */
        public static final class C40528a implements Parcelable.Creator<WxaShortLinkLaunchParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new WxaShortLinkLaunchParams(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new WxaShortLinkLaunchParams[i];
            }
        }

        public WxaShortLinkLaunchParams(String str, String str2, int i, int i2, String str3, String str4) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "path");
            C87412m.m108594g(str3, "shortLink");
            C87412m.m108594g(str4, "userName");
            this.f108856d = str;
            this.f108857e = str2;
            this.f108858f = i;
            this.f108859g = i2;
            this.f108860h = str3;
            this.f108861i = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WxaShortLinkLaunchParams)) {
                return false;
            }
            WxaShortLinkLaunchParams wxaShortLinkLaunchParams = (WxaShortLinkLaunchParams) obj;
            return C87412m.m108589b(this.f108856d, wxaShortLinkLaunchParams.f108856d) && C87412m.m108589b(this.f108857e, wxaShortLinkLaunchParams.f108857e) && this.f108858f == wxaShortLinkLaunchParams.f108858f && this.f108859g == wxaShortLinkLaunchParams.f108859g && C87412m.m108589b(this.f108860h, wxaShortLinkLaunchParams.f108860h) && C87412m.m108589b(this.f108861i, wxaShortLinkLaunchParams.f108861i);
        }

        public int hashCode() {
            return (((((((((this.f108856d.hashCode() * 31) + this.f108857e.hashCode()) * 31) + this.f108858f) * 31) + this.f108859g) * 31) + this.f108860h.hashCode()) * 31) + this.f108861i.hashCode();
        }

        public String toString() {
            return "WxaShortLinkLaunchParams(appId=" + this.f108856d + ", path=" + this.f108857e + ", version=" + this.f108858f + ", versionType=" + this.f108859g + ", shortLink=" + this.f108860h + ", userName=" + this.f108861i + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f108856d);
            parcel.writeString(this.f108857e);
            parcel.writeInt(this.f108858f);
            parcel.writeInt(this.f108859g);
            parcel.writeString(this.f108860h);
            parcel.writeString(this.f108861i);
        }
    }

    static {
        Pattern compile = Pattern.compile("^mp://\\w+");
        C87412m.m108593f(compile, "compile(\"^$SHORT_LINK_SCHEME\\\\w+\")");
        f108855a = compile;
    }

    /* renamed from: a */
    public abstract C47398l mo63355a();

    /* renamed from: b */
    public abstract void mo63356b(Context context, WxaShortLinkLaunchParams wxaShortLinkLaunchParams, C32226l<? super Boolean, C13598b0> lVar);

    /* renamed from: c */
    public void mo63357c(Activity activity, String str, boolean z) {
        C87412m.m108594g(activity, "ctx");
        C87412m.m108594g(str, "url");
    }

    /* renamed from: d */
    public abstract boolean mo63358d(Activity activity, boolean z);

    /* renamed from: e */
    public void mo63359e(Activity activity, String str) {
        C87412m.m108594g(activity, "ctx");
        C87412m.m108594g(str, "url");
    }
}
