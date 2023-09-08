package com.tencent.p014mm.plugin.gamesharecard;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamesharecard/GameShareCardInfo;", "Landroid/os/Parcelable;", "plugin-gamesharecard.api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gamesharecard.GameShareCardInfo */
public final class GameShareCardInfo implements Parcelable {
    public static final Parcelable.Creator<GameShareCardInfo> CREATOR = new C4596a();

    /* renamed from: d */
    public LiteAppBizDataInfo f19375d;

    /* renamed from: e */
    public String f19376e;

    /* renamed from: f */
    public String f19377f;

    /* renamed from: g */
    public String f19378g;

    /* renamed from: h */
    public int f19379h;

    /* renamed from: i */
    public int f19380i;

    /* renamed from: j */
    public String f19381j;

    /* renamed from: com.tencent.mm.plugin.gamesharecard.GameShareCardInfo$a */
    public static final class C4596a implements Parcelable.Creator<GameShareCardInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new GameShareCardInfo(LiteAppBizDataInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new GameShareCardInfo[i];
        }
    }

    public GameShareCardInfo(LiteAppBizDataInfo liteAppBizDataInfo, String str, String str2, String str3, int i, int i2, String str4) {
        C87412m.m108594g(liteAppBizDataInfo, "liteAppInfo");
        C87412m.m108594g(str, "gameShareId");
        C87412m.m108594g(str2, "gameShareData");
        C87412m.m108594g(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str4, "srcId");
        this.f19375d = liteAppBizDataInfo;
        this.f19376e = str;
        this.f19377f = str2;
        this.f19378g = str3;
        this.f19379h = i;
        this.f19380i = i2;
        this.f19381j = str4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameShareCardInfo)) {
            return false;
        }
        GameShareCardInfo gameShareCardInfo = (GameShareCardInfo) obj;
        return C87412m.m108589b(this.f19375d, gameShareCardInfo.f19375d) && C87412m.m108589b(this.f19376e, gameShareCardInfo.f19376e) && C87412m.m108589b(this.f19377f, gameShareCardInfo.f19377f) && C87412m.m108589b(this.f19378g, gameShareCardInfo.f19378g) && this.f19379h == gameShareCardInfo.f19379h && this.f19380i == gameShareCardInfo.f19380i && C87412m.m108589b(this.f19381j, gameShareCardInfo.f19381j);
    }

    public int hashCode() {
        return (((((((((((this.f19375d.hashCode() * 31) + this.f19376e.hashCode()) * 31) + this.f19377f.hashCode()) * 31) + this.f19378g.hashCode()) * 31) + this.f19379h) * 31) + this.f19380i) * 31) + this.f19381j.hashCode();
    }

    public String toString() {
        return "GameShareCardInfo(liteAppInfo=" + this.f19375d + ", gameShareId=" + this.f19376e + ", gameShareData=" + this.f19377f + ", title=" + this.f19378g + ", isVideo=" + this.f19379h + ", duration=" + this.f19380i + ", srcId=" + this.f19381j + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        this.f19375d.writeToParcel(parcel, i);
        parcel.writeString(this.f19376e);
        parcel.writeString(this.f19377f);
        parcel.writeString(this.f19378g);
        parcel.writeInt(this.f19379h);
        parcel.writeInt(this.f19380i);
        parcel.writeString(this.f19381j);
    }
}
