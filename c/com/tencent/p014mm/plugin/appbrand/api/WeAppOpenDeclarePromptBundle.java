package com.tencent.p014mm.plugin.appbrand.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/api/WeAppOpenDeclarePromptBundle;", "Landroid/os/Parcelable;", "protocol-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle */
public final class WeAppOpenDeclarePromptBundle implements Parcelable {
    public static final Parcelable.Creator<WeAppOpenDeclarePromptBundle> CREATOR = new C55441a();

    /* renamed from: d */
    public int f157919d;

    /* renamed from: e */
    public String f157920e;

    /* renamed from: f */
    public String f157921f;

    /* renamed from: g */
    public String f157922g;

    /* renamed from: h */
    public String f157923h;

    /* renamed from: i */
    public boolean f157924i;

    /* renamed from: com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle$a */
    public static final class C55441a implements Parcelable.Creator<WeAppOpenDeclarePromptBundle> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new WeAppOpenDeclarePromptBundle(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new WeAppOpenDeclarePromptBundle[i];
        }
    }

    public WeAppOpenDeclarePromptBundle(int i, String str, String str2, String str3, String str4, boolean z) {
        this.f157919d = i;
        this.f157920e = str;
        this.f157921f = str2;
        this.f157922g = str3;
        this.f157923h = str4;
        this.f157924i = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeAppOpenDeclarePromptBundle)) {
            return false;
        }
        WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = (WeAppOpenDeclarePromptBundle) obj;
        return this.f157919d == weAppOpenDeclarePromptBundle.f157919d && C87412m.m108589b(this.f157920e, weAppOpenDeclarePromptBundle.f157920e) && C87412m.m108589b(this.f157921f, weAppOpenDeclarePromptBundle.f157921f) && C87412m.m108589b(this.f157922g, weAppOpenDeclarePromptBundle.f157922g) && C87412m.m108589b(this.f157923h, weAppOpenDeclarePromptBundle.f157923h) && this.f157924i == weAppOpenDeclarePromptBundle.f157924i;
    }

    public int hashCode() {
        int i = this.f157919d * 31;
        String str = this.f157920e;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f157921f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f157922g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f157923h;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z = this.f157924i;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        return "WeAppOpenDeclarePromptBundle(bizType=" + this.f157919d + ", funcI=" + this.f157920e + ", promptTitle=" + Util.nullAs(this.f157921f, "") + ", promptMessage=" + Util.nullAs(this.f157922g, "") + ", promptOkBtnText=" + Util.nullAs(this.f157923h, "") + ", cancelabl=" + Util.nullAs(Boolean.valueOf(this.f157924i), false);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f157919d);
        parcel.writeString(this.f157920e);
        parcel.writeString(this.f157921f);
        parcel.writeString(this.f157922g);
        parcel.writeString(this.f157923h);
        parcel.writeInt(this.f157924i ? 1 : 0);
    }

    public WeAppOpenDeclarePromptBundle() {
        this(0, (String) null, (String) null, (String) null, (String) null, false);
    }
}
