package com.tencent.p014mm.plugin.gamesharecard;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamesharecard/LiteAppBizDataInfo;", "Landroid/os/Parcelable;", "plugin-gamesharecard.api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo */
public final class LiteAppBizDataInfo implements Parcelable {
    public static final Parcelable.Creator<LiteAppBizDataInfo> CREATOR = new C4597a();

    /* renamed from: d */
    public String f19382d;

    /* renamed from: e */
    public String f19383e;

    /* renamed from: f */
    public String f19384f;

    /* renamed from: g */
    public String f19385g;

    /* renamed from: h */
    public Integer f19386h;

    /* renamed from: i */
    public int f19387i;

    /* renamed from: com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo$a */
    public static final class C4597a implements Parcelable.Creator<LiteAppBizDataInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LiteAppBizDataInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new LiteAppBizDataInfo[i];
        }
    }

    public LiteAppBizDataInfo(String str, String str2, String str3, String str4, Integer num, int i) {
        this.f19382d = str;
        this.f19383e = str2;
        this.f19384f = str3;
        this.f19385g = str4;
        this.f19386h = num;
        this.f19387i = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiteAppBizDataInfo)) {
            return false;
        }
        LiteAppBizDataInfo liteAppBizDataInfo = (LiteAppBizDataInfo) obj;
        return C87412m.m108589b(this.f19382d, liteAppBizDataInfo.f19382d) && C87412m.m108589b(this.f19383e, liteAppBizDataInfo.f19383e) && C87412m.m108589b(this.f19384f, liteAppBizDataInfo.f19384f) && C87412m.m108589b(this.f19385g, liteAppBizDataInfo.f19385g) && C87412m.m108589b(this.f19386h, liteAppBizDataInfo.f19386h) && this.f19387i == liteAppBizDataInfo.f19387i;
    }

    public int hashCode() {
        String str = this.f19382d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19383e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19384f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19385g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f19386h;
        if (num != null) {
            i = num.hashCode();
        }
        return ((hashCode4 + i) * 31) + this.f19387i;
    }

    public String toString() {
        return "LiteAppBizDataInfo(id=" + this.f19382d + ", path=" + this.f19383e + ", query=" + this.f19384f + ", bizData=" + this.f19385g + ", source=" + this.f19386h + ", priority=" + this.f19387i + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f19382d);
        parcel.writeString(this.f19383e);
        parcel.writeString(this.f19384f);
        parcel.writeString(this.f19385g);
        Integer num = this.f19386h;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f19387i);
    }
}
