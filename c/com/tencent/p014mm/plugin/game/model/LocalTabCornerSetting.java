package com.tencent.p014mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/model/LocalTabCornerSetting;", "Landroid/os/Parcelable;", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.model.LocalTabCornerSetting */
public final class LocalTabCornerSetting implements Parcelable {
    public static final Parcelable.Creator<LocalTabCornerSetting> CREATOR = new C42026a();

    /* renamed from: d */
    public final String f113214d;

    /* renamed from: e */
    public final String f113215e;

    /* renamed from: f */
    public final String f113216f;

    /* renamed from: g */
    public final LocalJumpInfo f113217g;

    /* renamed from: com.tencent.mm.plugin.game.model.LocalTabCornerSetting$a */
    public static final class C42026a implements Parcelable.Creator<LocalTabCornerSetting> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LocalTabCornerSetting(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LocalJumpInfo.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new LocalTabCornerSetting[i];
        }
    }

    public LocalTabCornerSetting(String str, String str2, String str3, LocalJumpInfo localJumpInfo) {
        this.f113214d = str;
        this.f113215e = str2;
        this.f113216f = str3;
        this.f113217g = localJumpInfo;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTabCornerSetting)) {
            return false;
        }
        LocalTabCornerSetting localTabCornerSetting = (LocalTabCornerSetting) obj;
        return C87412m.m108589b(this.f113214d, localTabCornerSetting.f113214d) && C87412m.m108589b(this.f113215e, localTabCornerSetting.f113215e) && C87412m.m108589b(this.f113216f, localTabCornerSetting.f113216f) && C87412m.m108589b(this.f113217g, localTabCornerSetting.f113217g);
    }

    public int hashCode() {
        String str = this.f113214d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113215e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f113216f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalJumpInfo localJumpInfo = this.f113217g;
        if (localJumpInfo != null) {
            i = localJumpInfo.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "LocalTabCornerSetting(key=" + this.f113214d + ", iconUrl=" + this.f113215e + ", darkModeIconUrl=" + this.f113216f + ", jumpInfo=" + this.f113217g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f113214d);
        parcel.writeString(this.f113215e);
        parcel.writeString(this.f113216f);
        LocalJumpInfo localJumpInfo = this.f113217g;
        if (localJumpInfo == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        localJumpInfo.writeToParcel(parcel, i);
    }

    public LocalTabCornerSetting() {
        this((String) null, (String) null, (String) null, (LocalJumpInfo) null);
    }
}
