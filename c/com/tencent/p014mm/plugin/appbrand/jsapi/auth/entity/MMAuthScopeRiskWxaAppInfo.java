package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMAuthScopeRiskWxaAppInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo */
public class MMAuthScopeRiskWxaAppInfo implements Parcelable {
    public static final C1616a CREATOR = new C1616a((C8480h) null);

    /* renamed from: d */
    public String f11225d;

    /* renamed from: e */
    public String f11226e;

    /* renamed from: f */
    public int f11227f;

    /* renamed from: g */
    public int f11228g;

    /* renamed from: h */
    public int f11229h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo$a */
    public static final class C1616a implements Parcelable.Creator<MMAuthScopeRiskWxaAppInfo> {
        public C1616a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MMAuthScopeRiskWxaAppInfo(String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new MMAuthScopeRiskWxaAppInfo[i];
        }
    }

    public MMAuthScopeRiskWxaAppInfo(String str, String str2, int i, int i2, int i3) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "path");
        this.f11225d = str;
        this.f11226e = str2;
        this.f11227f = i;
        this.f11228g = i2;
        this.f11229h = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f11225d);
        parcel.writeString(this.f11226e);
        parcel.writeInt(this.f11227f);
        parcel.writeInt(this.f11228g);
        parcel.writeInt(this.f11229h);
    }
}
