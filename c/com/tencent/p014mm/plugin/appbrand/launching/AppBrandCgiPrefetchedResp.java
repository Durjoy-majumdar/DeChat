package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchedResp;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp */
public final class AppBrandCgiPrefetchedResp implements Parcelable {
    public static final C1924a CREATOR = new C1924a((C8480h) null);

    /* renamed from: d */
    public final String f11795d;

    /* renamed from: e */
    public final int f11796e;

    /* renamed from: f */
    public final String f11797f;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp$a */
    public static final class C1924a implements Parcelable.Creator<AppBrandCgiPrefetchedResp> {
        public C1924a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            C87412m.m108591d(readString);
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            C87412m.m108591d(readString2);
            return new AppBrandCgiPrefetchedResp(readString, readInt, readString2);
        }

        public Object[] newArray(int i) {
            return new AppBrandCgiPrefetchedResp[i];
        }
    }

    public AppBrandCgiPrefetchedResp(String str, int i, String str2) {
        C87412m.m108594g(str, "result");
        C87412m.m108594g(str2, "errMsg");
        this.f11795d = str;
        this.f11796e = i;
        this.f11797f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "AppBrandCgiPrefetchedResp(result='" + this.f11795d + "', errCode=" + this.f11796e + ", errMsg='" + this.f11797f + "')";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f11795d);
        parcel.writeInt(this.f11796e);
        parcel.writeString(this.f11797f);
    }
}
