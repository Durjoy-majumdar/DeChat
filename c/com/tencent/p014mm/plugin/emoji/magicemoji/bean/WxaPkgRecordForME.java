package com.tencent.p014mm.plugin.emoji.magicemoji.bean;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/magicemoji/bean/WxaPkgRecordForME;", "Landroid/os/Parcelable;", "plugin-magic-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.magicemoji.bean.WxaPkgRecordForME */
public final class WxaPkgRecordForME implements Parcelable {
    public static final Parcelable.Creator<WxaPkgRecordForME> CREATOR = new C85163a();

    /* renamed from: d */
    public final String f248141d;

    /* renamed from: e */
    public final String f248142e;

    /* renamed from: f */
    public final int f248143f;

    /* renamed from: g */
    public final String f248144g;

    /* renamed from: com.tencent.mm.plugin.emoji.magicemoji.bean.WxaPkgRecordForME$a */
    public static final class C85163a implements Parcelable.Creator<WxaPkgRecordForME> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            C87412m.m108591d(readString);
            String readString2 = parcel.readString();
            C87412m.m108591d(readString2);
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            C87412m.m108591d(readString3);
            return new WxaPkgRecordForME(readString, readString2, readInt, readString3);
        }

        public Object[] newArray(int i) {
            return new WxaPkgRecordForME[i];
        }
    }

    public WxaPkgRecordForME(String str, String str2, int i, String str3) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "pkgPath");
        C87412m.m108594g(str3, "versionMD5");
        this.f248141d = str;
        this.f248142e = str2;
        this.f248143f = i;
        this.f248144g = str3;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "appId=" + this.f248141d + ", pkgPath=" + this.f248142e + ", version=" + this.f248143f + ", MD5=" + this.f248144g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f248141d);
        parcel.writeString(this.f248142e);
        parcel.writeInt(this.f248143f);
        parcel.writeString(this.f248144g);
    }
}
