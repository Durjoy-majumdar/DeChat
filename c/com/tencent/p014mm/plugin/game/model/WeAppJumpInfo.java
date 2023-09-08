package com.tencent.p014mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/model/WeAppJumpInfo;", "Landroid/os/Parcelable;", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.model.WeAppJumpInfo */
public final class WeAppJumpInfo implements Parcelable {
    public static final Parcelable.Creator<WeAppJumpInfo> CREATOR = new C42034a();

    /* renamed from: d */
    public final String f113233d;

    /* renamed from: e */
    public final String f113234e;

    /* renamed from: com.tencent.mm.plugin.game.model.WeAppJumpInfo$a */
    public static final class C42034a implements Parcelable.Creator<WeAppJumpInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new WeAppJumpInfo(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new WeAppJumpInfo[i];
        }
    }

    public WeAppJumpInfo(String str, String str2) {
        this.f113233d = str;
        this.f113234e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeAppJumpInfo)) {
            return false;
        }
        WeAppJumpInfo weAppJumpInfo = (WeAppJumpInfo) obj;
        return C87412m.m108589b(this.f113233d, weAppJumpInfo.f113233d) && C87412m.m108589b(this.f113234e, weAppJumpInfo.f113234e);
    }

    public int hashCode() {
        String str = this.f113233d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113234e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "WeAppJumpInfo(appId=" + this.f113233d + ", path=" + this.f113234e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f113233d);
        parcel.writeString(this.f113234e);
    }

    public WeAppJumpInfo() {
        this((String) null, (String) null);
    }
}
