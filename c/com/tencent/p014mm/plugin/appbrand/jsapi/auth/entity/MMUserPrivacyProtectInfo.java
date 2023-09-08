package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMUserPrivacyProtectInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo */
public final class MMUserPrivacyProtectInfo implements Parcelable {
    public static final C82135a CREATOR = new C82135a((C8480h) null);

    /* renamed from: f */
    public static final MMUserPrivacyProtectInfo f240926f = new MMUserPrivacyProtectInfo(false, "");

    /* renamed from: d */
    public final boolean f240927d;

    /* renamed from: e */
    public final String f240928e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo$a */
    public static final class C82135a implements Parcelable.Creator<MMUserPrivacyProtectInfo> {
        public C82135a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            boolean z = parcel.readByte() != 0;
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            return new MMUserPrivacyProtectInfo(z, readString);
        }

        public Object[] newArray(int i) {
            return new MMUserPrivacyProtectInfo[i];
        }
    }

    public MMUserPrivacyProtectInfo(boolean z, String str) {
        this.f240927d = z;
        this.f240928e = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeByte(this.f240927d ? (byte) 1 : 0);
        parcel.writeString(this.f240928e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MMUserPrivacyProtectInfo(te3.gp4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r3, r0)
            boolean r0 = r3.f183354d
            java.lang.String r3 = r3.f183355e
            java.lang.String r1 = "info.wording"
            gy3.C87412m.m108593f(r3, r1)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo.<init>(te3.gp4):void");
    }
}
