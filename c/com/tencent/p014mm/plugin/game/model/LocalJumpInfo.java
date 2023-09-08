package com.tencent.p014mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;", "Landroid/os/Parcelable;", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.model.LocalJumpInfo */
public final class LocalJumpInfo implements Parcelable {
    public static final Parcelable.Creator<LocalJumpInfo> CREATOR = new C42025a();

    /* renamed from: d */
    public final int f113210d;

    /* renamed from: e */
    public final String f113211e;

    /* renamed from: f */
    public final WeAppJumpInfo f113212f;

    /* renamed from: g */
    public final LocalHalfScreen f113213g;

    /* renamed from: com.tencent.mm.plugin.game.model.LocalJumpInfo$a */
    public static final class C42025a implements Parcelable.Creator<LocalJumpInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            LocalHalfScreen localHalfScreen = null;
            WeAppJumpInfo createFromParcel = parcel.readInt() == 0 ? null : WeAppJumpInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                localHalfScreen = LocalHalfScreen.CREATOR.createFromParcel(parcel);
            }
            return new LocalJumpInfo(readInt, readString, createFromParcel, localHalfScreen);
        }

        public Object[] newArray(int i) {
            return new LocalJumpInfo[i];
        }
    }

    public LocalJumpInfo(int i, String str, WeAppJumpInfo weAppJumpInfo, LocalHalfScreen localHalfScreen) {
        this.f113210d = i;
        this.f113211e = str;
        this.f113212f = weAppJumpInfo;
        this.f113213g = localHalfScreen;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalJumpInfo)) {
            return false;
        }
        LocalJumpInfo localJumpInfo = (LocalJumpInfo) obj;
        return this.f113210d == localJumpInfo.f113210d && C87412m.m108589b(this.f113211e, localJumpInfo.f113211e) && C87412m.m108589b(this.f113212f, localJumpInfo.f113212f) && C87412m.m108589b(this.f113213g, localJumpInfo.f113213g);
    }

    public int hashCode() {
        int i = this.f113210d * 31;
        String str = this.f113211e;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        WeAppJumpInfo weAppJumpInfo = this.f113212f;
        int hashCode2 = (hashCode + (weAppJumpInfo == null ? 0 : weAppJumpInfo.hashCode())) * 31;
        LocalHalfScreen localHalfScreen = this.f113213g;
        if (localHalfScreen != null) {
            i2 = localHalfScreen.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "LocalJumpInfo(jumpType=" + this.f113210d + ", jumpUrl=" + this.f113211e + ", weAppJumpInfo=" + this.f113212f + ", halfScreen=" + this.f113213g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f113210d);
        parcel.writeString(this.f113211e);
        WeAppJumpInfo weAppJumpInfo = this.f113212f;
        if (weAppJumpInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            weAppJumpInfo.writeToParcel(parcel, i);
        }
        LocalHalfScreen localHalfScreen = this.f113213g;
        if (localHalfScreen == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        localHalfScreen.writeToParcel(parcel, i);
    }

    public LocalJumpInfo() {
        this(0, (String) null, (WeAppJumpInfo) null, (LocalHalfScreen) null);
    }
}
