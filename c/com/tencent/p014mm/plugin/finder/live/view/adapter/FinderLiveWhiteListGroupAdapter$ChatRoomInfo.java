package com.tencent.p014mm.plugin.finder.live.view.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListGroupAdapter$ChatRoomInfo", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveWhiteListGroupAdapter$ChatRoomInfo */
public final class FinderLiveWhiteListGroupAdapter$ChatRoomInfo implements Parcelable {
    public static final C3203a CREATOR = new C3203a((C8480h) null);

    /* renamed from: d */
    public final String f15317d;

    /* renamed from: e */
    public final String f15318e;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveWhiteListGroupAdapter$ChatRoomInfo$a */
    public static final class C3203a implements Parcelable.Creator<FinderLiveWhiteListGroupAdapter$ChatRoomInfo> {
        public C3203a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new FinderLiveWhiteListGroupAdapter$ChatRoomInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new FinderLiveWhiteListGroupAdapter$ChatRoomInfo[i];
        }
    }

    public FinderLiveWhiteListGroupAdapter$ChatRoomInfo(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        this.f15317d = readString;
        this.f15318e = readString2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinderLiveWhiteListGroupAdapter$ChatRoomInfo)) {
            return false;
        }
        FinderLiveWhiteListGroupAdapter$ChatRoomInfo finderLiveWhiteListGroupAdapter$ChatRoomInfo = (FinderLiveWhiteListGroupAdapter$ChatRoomInfo) obj;
        return C87412m.m108589b(this.f15317d, finderLiveWhiteListGroupAdapter$ChatRoomInfo.f15317d) && C87412m.m108589b(this.f15318e, finderLiveWhiteListGroupAdapter$ChatRoomInfo.f15318e);
    }

    public int hashCode() {
        String str = this.f15317d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15318e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ChatRoomInfo(username=" + this.f15317d + ", nickname=" + this.f15318e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f15317d);
        parcel.writeString(this.f15318e);
    }
}
