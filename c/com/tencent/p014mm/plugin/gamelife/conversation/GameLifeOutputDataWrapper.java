package com.tencent.p014mm.plugin.gamelife.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelife/conversation/GameLifeOutputDataWrapper;", "Landroid/os/Parcelable;", "CREATOR", "a", "game-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper */
public final class GameLifeOutputDataWrapper implements Parcelable {
    public static final C42399a CREATOR = new C42399a((C8480h) null);

    /* renamed from: d */
    public String f114692d;

    /* renamed from: e */
    public String f114693e;

    /* renamed from: f */
    public String f114694f;

    /* renamed from: com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper$a */
    public static final class C42399a implements Parcelable.Creator<GameLifeOutputDataWrapper> {
        public C42399a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new GameLifeOutputDataWrapper(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new GameLifeOutputDataWrapper[i];
        }
    }

    public GameLifeOutputDataWrapper() {
        this("", "", "");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameLifeOutputDataWrapper)) {
            return false;
        }
        GameLifeOutputDataWrapper gameLifeOutputDataWrapper = (GameLifeOutputDataWrapper) obj;
        return C87412m.m108589b(this.f114692d, gameLifeOutputDataWrapper.f114692d) && C87412m.m108589b(this.f114693e, gameLifeOutputDataWrapper.f114693e) && C87412m.m108589b(this.f114694f, gameLifeOutputDataWrapper.f114694f);
    }

    public int hashCode() {
        String str = this.f114692d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f114693e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f114694f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "GameLifeOutputDataWrapper(sessionId=" + this.f114692d + ", talker=" + this.f114693e + ", selfUsername=" + this.f114694f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f114692d);
        parcel.writeString(this.f114693e);
        parcel.writeString(this.f114694f);
    }

    public GameLifeOutputDataWrapper(String str, String str2, String str3) {
        this.f114692d = str;
        this.f114693e = str2;
        this.f114694f = str3;
    }
}
