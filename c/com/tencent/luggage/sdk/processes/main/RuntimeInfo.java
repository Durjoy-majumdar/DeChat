package com.tencent.luggage.sdk.processes.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class RuntimeInfo implements Parcelable {
    public static final Parcelable.Creator<RuntimeInfo> CREATOR = new C80277a();

    /* renamed from: d */
    public final int f234988d;

    /* renamed from: e */
    public final String f234989e;

    /* renamed from: f */
    public final int f234990f;

    /* renamed from: g */
    public final boolean f234991g;

    /* renamed from: h */
    public final int f234992h;

    /* renamed from: i */
    public final String f234993i;

    /* renamed from: j */
    public final String f234994j;

    /* renamed from: n */
    public final AppBrandInitConfig f234995n;

    /* renamed from: o */
    public final boolean f234996o;

    /* renamed from: p */
    public final String f234997p;

    /* renamed from: com.tencent.luggage.sdk.processes.main.RuntimeInfo$a */
    public static final class C80277a implements Parcelable.Creator<RuntimeInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new RuntimeInfo(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), (AppBrandInitConfig) parcel.readParcelable(RuntimeInfo.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new RuntimeInfo[i];
        }
    }

    public RuntimeInfo(int i, String str, int i2, boolean z, int i3, String str2, String str3, AppBrandInitConfig appBrandInitConfig, boolean z2, String str4) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "instanceId");
        C87412m.m108594g(str3, "userName");
        C87412m.m108594g(appBrandInitConfig, "initConfig");
        C87412m.m108594g(str4, "stackTrace");
        this.f234988d = i;
        this.f234989e = str;
        this.f234990f = i2;
        this.f234991g = z;
        this.f234992h = i3;
        this.f234993i = str2;
        this.f234994j = str3;
        this.f234995n = appBrandInitConfig;
        this.f234996o = z2;
        this.f234997p = str4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuntimeInfo)) {
            return false;
        }
        RuntimeInfo runtimeInfo = (RuntimeInfo) obj;
        return this.f234988d == runtimeInfo.f234988d && C87412m.m108589b(this.f234989e, runtimeInfo.f234989e) && this.f234990f == runtimeInfo.f234990f && this.f234991g == runtimeInfo.f234991g && this.f234992h == runtimeInfo.f234992h && C87412m.m108589b(this.f234993i, runtimeInfo.f234993i) && C87412m.m108589b(this.f234994j, runtimeInfo.f234994j) && C87412m.m108589b(this.f234995n, runtimeInfo.f234995n) && this.f234996o == runtimeInfo.f234996o && C87412m.m108589b(this.f234997p, runtimeInfo.f234997p);
    }

    public int hashCode() {
        int hashCode = ((((this.f234988d * 31) + this.f234989e.hashCode()) * 31) + this.f234990f) * 31;
        boolean z = this.f234991g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((((((hashCode + (z ? 1 : 0)) * 31) + this.f234992h) * 31) + this.f234993i.hashCode()) * 31) + this.f234994j.hashCode()) * 31) + this.f234995n.hashCode()) * 31;
        boolean z3 = this.f234996o;
        if (!z3) {
            z2 = z3;
        }
        return ((hashCode2 + (z2 ? 1 : 0)) * 31) + this.f234997p.hashCode();
    }

    public String toString() {
        return "RuntimeInfo(processIndex=" + this.f234988d + ", appId=" + this.f234989e + ", versionType=" + this.f234990f + ", isGame=" + this.f234991g + ", appType=" + this.f234992h + ", instanceId=" + this.f234993i + ", userName=" + this.f234994j + ", initConfig=" + this.f234995n + ", isPersistentApp=" + this.f234996o + ", stackTrace=" + this.f234997p + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f234988d);
        parcel.writeString(this.f234989e);
        parcel.writeInt(this.f234990f);
        parcel.writeInt(this.f234991g ? 1 : 0);
        parcel.writeInt(this.f234992h);
        parcel.writeString(this.f234993i);
        parcel.writeString(this.f234994j);
        parcel.writeParcelable(this.f234995n, i);
        parcel.writeInt(this.f234996o ? 1 : 0);
        parcel.writeString(this.f234997p);
    }
}
