package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMAuthScopeRiskInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo */
public class MMAuthScopeRiskInfo implements Parcelable {
    public static final C1615a CREATOR = new C1615a((C8480h) null);

    /* renamed from: d */
    public int f11218d;

    /* renamed from: e */
    public int f11219e;

    /* renamed from: f */
    public String f11220f;

    /* renamed from: g */
    public String f11221g;

    /* renamed from: h */
    public String f11222h;

    /* renamed from: i */
    public String f11223i;

    /* renamed from: j */
    public MMAuthScopeRiskWxaAppInfo f11224j;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo$a */
    public static final class C1615a implements Parcelable.Creator<MMAuthScopeRiskInfo> {
        public C1615a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MMAuthScopeRiskInfo(parcel.readInt(), parcel.readInt(), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), (MMAuthScopeRiskWxaAppInfo) parcel.readParcelable(MMAuthScopeRiskWxaAppInfo.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new MMAuthScopeRiskInfo[i];
        }
    }

    public MMAuthScopeRiskInfo(int i, int i2, String str, String str2, String str3, String str4, MMAuthScopeRiskWxaAppInfo mMAuthScopeRiskWxaAppInfo) {
        this.f11218d = i;
        this.f11219e = i2;
        this.f11220f = str;
        this.f11221g = str2;
        this.f11222h = str3;
        this.f11223i = str4;
        this.f11224j = mMAuthScopeRiskWxaAppInfo;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f11218d);
        parcel.writeInt(this.f11219e);
        parcel.writeString(this.f11220f);
        parcel.writeString(this.f11221g);
        parcel.writeString(this.f11222h);
        parcel.writeString(this.f11223i);
        parcel.writeParcelable(this.f11224j, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MMAuthScopeRiskInfo(te3.C51608uw3 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "scopeRiskPopUpInfo"
            gy3.C87412m.m108594g(r15, r0)
            int r2 = r15.f143166d
            int r3 = r15.f143172j
            pe3.b r0 = r15.f143167e
            java.lang.String r4 = r0.mo123705h()
            pe3.b r0 = r15.f143168f
            java.lang.String r5 = r0.mo123705h()
            pe3.b r0 = r15.f143169g
            java.lang.String r6 = r0.mo123705h()
            pe3.b r0 = r15.f143170h
            java.lang.String r7 = r0.mo123705h()
            te3.vw3 r15 = r15.f143171i
            if (r15 == 0) goto L_0x0042
            com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo r0 = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo
            java.lang.String r9 = r15.f143749d
            java.lang.String r1 = "info.username"
            gy3.C87412m.m108593f(r9, r1)
            java.lang.String r10 = r15.f143750e
            java.lang.String r1 = "info.path"
            gy3.C87412m.m108593f(r10, r1)
            int r11 = r15.f143751f
            int r12 = r15.f143752g
            int r13 = r15.f143753h
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            r8 = r0
            goto L_0x0044
        L_0x0042:
            r15 = 0
            r8 = r15
        L_0x0044:
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo.<init>(te3.uw3):void");
    }
}
