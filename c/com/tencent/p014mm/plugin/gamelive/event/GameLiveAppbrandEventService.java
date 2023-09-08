package com.tencent.p014mm.plugin.gamelive.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService */
public final class GameLiveAppbrandEventService {

    /* renamed from: a */
    public AppBrandRuntimeWC f248277a;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$SimpleLiveStateChangePayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload */
    public static final class SimpleLiveStateChangePayload implements Parcelable {
        public static final Parcelable.Creator<SimpleLiveStateChangePayload> CREATOR = new C4594a();

        /* renamed from: d */
        public final Map<String, Integer> f19362d;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload$a */
        public static final class C4594a implements Parcelable.Creator<SimpleLiveStateChangePayload> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
                return new SimpleLiveStateChangePayload(linkedHashMap);
            }

            public Object[] newArray(int i) {
                return new SimpleLiveStateChangePayload[i];
            }
        }

        public SimpleLiveStateChangePayload(Map<String, Integer> map) {
            C87412m.m108594g(map, "data");
            this.f19362d = map;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SimpleLiveStateChangePayload) && C87412m.m108589b(this.f19362d, ((SimpleLiveStateChangePayload) obj).f19362d);
        }

        public int hashCode() {
            return this.f19362d.hashCode();
        }

        public String toString() {
            return "SimpleLiveStateChangePayload(data=" + this.f19362d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            Map<String, Integer> map = this.f19362d;
            parcel.writeInt(map.size());
            for (Map.Entry next : map.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeInt(((Number) next.getValue()).intValue());
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveTopicPayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload */
    public static final class LiveTopicPayload implements Parcelable {
        public static final Parcelable.Creator<LiveTopicPayload> CREATOR = new C85228a();

        /* renamed from: d */
        public String f248297d;

        /* renamed from: e */
        public boolean f248298e;

        /* renamed from: f */
        public String f248299f;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload$a */
        public static final class C85228a implements Parcelable.Creator<LiveTopicPayload> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new LiveTopicPayload(parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            public Object[] newArray(int i) {
                return new LiveTopicPayload[i];
            }
        }

        public LiveTopicPayload(String str, boolean z, String str2) {
            C87412m.m108594g(str, "topic");
            this.f248297d = str;
            this.f248298e = z;
            this.f248299f = str2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveTopicPayload)) {
                return false;
            }
            LiveTopicPayload liveTopicPayload = (LiveTopicPayload) obj;
            return C87412m.m108589b(this.f248297d, liveTopicPayload.f248297d) && this.f248298e == liveTopicPayload.f248298e && C87412m.m108589b(this.f248299f, liveTopicPayload.f248299f);
        }

        public int hashCode() {
            int hashCode = this.f248297d.hashCode() * 31;
            boolean z = this.f248298e;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            String str = this.f248299f;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LiveTopicPayload(topic=" + this.f248297d + ", ret=" + this.f248298e + ", errMsg=" + this.f248299f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f248297d);
            parcel.writeInt(this.f248298e ? 1 : 0);
            parcel.writeString(this.f248299f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$a */
    public static final class C85229a extends C82926s {
        private static final int CTRL_INDEX = 1035;
        public static final String NAME = "onGameLiveInfo";
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$b */
    public static final class C85230b extends C82926s {
        private static final int CTRL_INDEX = 1037;
        public static final String NAME = "onGameLiveMicStateChange";
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$c */
    public static final class C85231c extends C82926s {
        private static final int CTRL_INDEX = 1038;
        public static final String NAME = "onGameLiveNetStateChange";
    }

    public GameLiveAppbrandEventService(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f248277a = appBrandRuntimeWC;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveIntPayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload */
    public static final class LiveIntPayload implements Parcelable {
        public static final Parcelable.Creator<LiveIntPayload> CREATOR = new C85223a();

        /* renamed from: d */
        public int f248281d;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload$a */
        public static final class C85223a implements Parcelable.Creator<LiveIntPayload> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new LiveIntPayload(parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new LiveIntPayload[i];
            }
        }

        public LiveIntPayload(int i) {
            this.f248281d = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LiveIntPayload) && this.f248281d == ((LiveIntPayload) obj).f248281d;
        }

        public int hashCode() {
            return this.f248281d;
        }

        public String toString() {
            return "LiveIntPayload(param=" + this.f248281d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f248281d);
        }

        public LiveIntPayload() {
            this(0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveMemberInfoListPayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload */
    public static final class LiveMemberInfoListPayload implements Parcelable {
        public static final Parcelable.Creator<LiveMemberInfoListPayload> CREATOR = new C85224a();

        /* renamed from: d */
        public List<LiveMemberInfoPayload> f248282d;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload$a */
        public static final class C85224a implements Parcelable.Creator<LiveMemberInfoListPayload> {
            public Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                C87412m.m108594g(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList2.add(LiveMemberInfoPayload.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new LiveMemberInfoListPayload(arrayList);
            }

            public Object[] newArray(int i) {
                return new LiveMemberInfoListPayload[i];
            }
        }

        public LiveMemberInfoListPayload() {
            this((List) null, 1, (C8480h) null);
        }

        public LiveMemberInfoListPayload(List<LiveMemberInfoPayload> list) {
            this.f248282d = list;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LiveMemberInfoListPayload) && C87412m.m108589b(this.f248282d, ((LiveMemberInfoListPayload) obj).f248282d);
        }

        public int hashCode() {
            List<LiveMemberInfoPayload> list = this.f248282d;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "LiveMemberInfoListPayload(msgList=" + this.f248282d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            List<LiveMemberInfoPayload> list = this.f248282d;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (LiveMemberInfoPayload writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LiveMemberInfoListPayload(List list, int i, C8480h hVar) {
            this((i & 1) != 0 ? null : list);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload */
    public static final class LiveCurrentRoomInfoPayload implements Parcelable {
        public static final Parcelable.Creator<LiveCurrentRoomInfoPayload> CREATOR = new C30119a();

        /* renamed from: d */
        public int f81439d;

        /* renamed from: e */
        public String f81440e;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload$a */
        public static final class C30119a implements Parcelable.Creator<LiveCurrentRoomInfoPayload> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new LiveCurrentRoomInfoPayload(parcel.readInt(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new LiveCurrentRoomInfoPayload[i];
            }
        }

        public LiveCurrentRoomInfoPayload(int i, String str) {
            this.f81439d = i;
            this.f81440e = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveCurrentRoomInfoPayload)) {
                return false;
            }
            LiveCurrentRoomInfoPayload liveCurrentRoomInfoPayload = (LiveCurrentRoomInfoPayload) obj;
            return this.f81439d == liveCurrentRoomInfoPayload.f81439d && C87412m.m108589b(this.f81440e, liveCurrentRoomInfoPayload.f81440e);
        }

        public int hashCode() {
            int i = this.f81439d * 31;
            String str = this.f81440e;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LiveCurrentRoomInfoPayload(startTime=" + this.f81439d + ", topic=" + this.f81440e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f81439d);
            parcel.writeString(this.f81440e);
        }

        public LiveCurrentRoomInfoPayload() {
            this(0, (String) null);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveMemberInfoPayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload */
    public static final class LiveMemberInfoPayload implements Parcelable {
        public static final Parcelable.Creator<LiveMemberInfoPayload> CREATOR = new C85225a();

        /* renamed from: d */
        public String f248283d;

        /* renamed from: e */
        public int f248284e;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload$a */
        public static final class C85225a implements Parcelable.Creator<LiveMemberInfoPayload> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new LiveMemberInfoPayload(parcel.readString(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new LiveMemberInfoPayload[i];
            }
        }

        public LiveMemberInfoPayload() {
            this((String) null, 0, 3, (C8480h) null);
        }

        public LiveMemberInfoPayload(String str, int i) {
            this.f248283d = str;
            this.f248284e = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveMemberInfoPayload)) {
                return false;
            }
            LiveMemberInfoPayload liveMemberInfoPayload = (LiveMemberInfoPayload) obj;
            return C87412m.m108589b(this.f248283d, liveMemberInfoPayload.f248283d) && this.f248284e == liveMemberInfoPayload.f248284e;
        }

        public int hashCode() {
            String str = this.f248283d;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f248284e;
        }

        public String toString() {
            return "LiveMemberInfoPayload(nickname=" + this.f248283d + ", rewardAmountInHeat=" + this.f248284e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f248283d);
            parcel.writeInt(this.f248284e);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LiveMemberInfoPayload(String str, int i, int i2, C8480h hVar) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveNetWorkPayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveNetWorkPayload */
    public static final class LiveNetWorkPayload implements Parcelable {
        public static final Parcelable.Creator<LiveNetWorkPayload> CREATOR = new C85226a();

        /* renamed from: d */
        public int f248285d;

        /* renamed from: e */
        public int f248286e;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveNetWorkPayload$a */
        public static final class C85226a implements Parcelable.Creator<LiveNetWorkPayload> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new LiveNetWorkPayload(parcel.readInt(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new LiveNetWorkPayload[i];
            }
        }

        public LiveNetWorkPayload(int i, int i2) {
            this.f248285d = i;
            this.f248286e = i2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveNetWorkPayload)) {
                return false;
            }
            LiveNetWorkPayload liveNetWorkPayload = (LiveNetWorkPayload) obj;
            return this.f248285d == liveNetWorkPayload.f248285d && this.f248286e == liveNetWorkPayload.f248286e;
        }

        public int hashCode() {
            return (this.f248285d * 31) + this.f248286e;
        }

        public String toString() {
            return "LiveNetWorkPayload(netQuality=" + this.f248285d + ", threshold=" + this.f248286e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f248285d);
            parcel.writeInt(this.f248286e);
        }

        public LiveNetWorkPayload() {
            this(0, 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$AnchorLiveEntrance;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$AnchorLiveEntrance */
    public static final class AnchorLiveEntrance implements Parcelable {
        public static final Parcelable.Creator<AnchorLiveEntrance> CREATOR = new C85222a();

        /* renamed from: d */
        public int f248278d;

        /* renamed from: e */
        public int f248279e;

        /* renamed from: f */
        public long f248280f;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$AnchorLiveEntrance$a */
        public static final class C85222a implements Parcelable.Creator<AnchorLiveEntrance> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new AnchorLiveEntrance(parcel.readInt(), parcel.readInt(), parcel.readLong());
            }

            public Object[] newArray(int i) {
                return new AnchorLiveEntrance[i];
            }
        }

        public AnchorLiveEntrance(int i, int i2, long j) {
            this.f248278d = i;
            this.f248279e = i2;
            this.f248280f = j;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorLiveEntrance)) {
                return false;
            }
            AnchorLiveEntrance anchorLiveEntrance = (AnchorLiveEntrance) obj;
            return this.f248278d == anchorLiveEntrance.f248278d && this.f248279e == anchorLiveEntrance.f248279e && this.f248280f == anchorLiveEntrance.f248280f;
        }

        public int hashCode() {
            long j = this.f248280f;
            return (((this.f248278d * 31) + this.f248279e) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "AnchorLiveEntrance(id=" + this.f248278d + ", entranceType=" + this.f248279e + ", entranceId=" + this.f248280f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f248278d);
            parcel.writeInt(this.f248279e);
            parcel.writeLong(this.f248280f);
        }

        public AnchorLiveEntrance() {
            this(0, 0, 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveStartInfoPayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload */
    public static final class LiveStartInfoPayload implements Parcelable {
        public static final Parcelable.Creator<LiveStartInfoPayload> CREATOR = new C4593a();

        /* renamed from: d */
        public String f19357d;

        /* renamed from: e */
        public String f19358e;

        /* renamed from: f */
        public String f19359f;

        /* renamed from: g */
        public long f19360g;

        /* renamed from: h */
        public String f19361h;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload$a */
        public static final class C4593a implements Parcelable.Creator<LiveStartInfoPayload> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new LiveStartInfoPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new LiveStartInfoPayload[i];
            }
        }

        public LiveStartInfoPayload(String str, String str2, String str3, long j, String str4) {
            this.f19357d = str;
            this.f19358e = str2;
            this.f19359f = str3;
            this.f19360g = j;
            this.f19361h = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveStartInfoPayload)) {
                return false;
            }
            LiveStartInfoPayload liveStartInfoPayload = (LiveStartInfoPayload) obj;
            return C87412m.m108589b(this.f19357d, liveStartInfoPayload.f19357d) && C87412m.m108589b(this.f19358e, liveStartInfoPayload.f19358e) && C87412m.m108589b(this.f19359f, liveStartInfoPayload.f19359f) && this.f19360g == liveStartInfoPayload.f19360g && C87412m.m108589b(this.f19361h, liveStartInfoPayload.f19361h);
        }

        public int hashCode() {
            String str = this.f19357d;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f19358e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f19359f;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            long j = this.f19360g;
            int i2 = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            String str4 = this.f19361h;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "LiveStartInfoPayload(nickname=" + this.f19357d + ", headerUrl=" + this.f19358e + ", joinLiveTips=" + this.f19359f + ", liveId=" + this.f19360g + ", finderUsrName=" + this.f19361h + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f19357d);
            parcel.writeString(this.f19358e);
            parcel.writeString(this.f19359f);
            parcel.writeLong(this.f19360g);
            parcel.writeString(this.f19361h);
        }

        public LiveStartInfoPayload() {
            this((String) null, (String) null, (String) null, 0, (String) null);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload */
    public static final class LiveCommentWrapperInfoPayload implements Parcelable {
        public static final Parcelable.Creator<LiveCommentWrapperInfoPayload> CREATOR = new C30118a();

        /* renamed from: d */
        public long f81433d;

        /* renamed from: e */
        public long f81434e;

        /* renamed from: f */
        public long f81435f;

        /* renamed from: g */
        public long f81436g;

        /* renamed from: h */
        public long f81437h;

        /* renamed from: i */
        public List<LiveSingleCommentPayload> f81438i;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload$a */
        public static final class C30118a implements Parcelable.Creator<LiveCommentWrapperInfoPayload> {
            public Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                C87412m.m108594g(parcel, "parcel");
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                long readLong3 = parcel.readLong();
                long readLong4 = parcel.readLong();
                long readLong5 = parcel.readLong();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList2.add(LiveSingleCommentPayload.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new LiveCommentWrapperInfoPayload(readLong, readLong2, readLong3, readLong4, readLong5, arrayList);
            }

            public Object[] newArray(int i) {
                return new LiveCommentWrapperInfoPayload[i];
            }
        }

        public LiveCommentWrapperInfoPayload() {
            this(0, 0, 0, 0, 0, (List) null, 63, (C8480h) null);
        }

        public LiveCommentWrapperInfoPayload(long j, long j2, long j3, long j4, long j5, List<LiveSingleCommentPayload> list) {
            this.f81433d = j;
            this.f81434e = j2;
            this.f81435f = j3;
            this.f81436g = j4;
            this.f81437h = j5;
            this.f81438i = list;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveCommentWrapperInfoPayload)) {
                return false;
            }
            LiveCommentWrapperInfoPayload liveCommentWrapperInfoPayload = (LiveCommentWrapperInfoPayload) obj;
            return this.f81433d == liveCommentWrapperInfoPayload.f81433d && this.f81434e == liveCommentWrapperInfoPayload.f81434e && this.f81435f == liveCommentWrapperInfoPayload.f81435f && this.f81436g == liveCommentWrapperInfoPayload.f81436g && this.f81437h == liveCommentWrapperInfoPayload.f81437h && C87412m.m108589b(this.f81438i, liveCommentWrapperInfoPayload.f81438i);
        }

        public int hashCode() {
            long j = this.f81433d;
            long j2 = this.f81434e;
            long j3 = this.f81435f;
            long j4 = this.f81436g;
            long j5 = this.f81437h;
            int i = ((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            List<LiveSingleCommentPayload> list = this.f81438i;
            return i + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "LiveCommentWrapperInfoPayload(liveId=" + this.f81433d + ", currOnlineCount=" + this.f81434e + ", totalViewCount=" + this.f81435f + ", currLikeCount=" + this.f81436g + ", totalRewardCount=" + this.f81437h + ", msgList=" + this.f81438i + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeLong(this.f81433d);
            parcel.writeLong(this.f81434e);
            parcel.writeLong(this.f81435f);
            parcel.writeLong(this.f81436g);
            parcel.writeLong(this.f81437h);
            List<LiveSingleCommentPayload> list = this.f81438i;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (LiveSingleCommentPayload writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ LiveCommentWrapperInfoPayload(long r12, long r14, long r16, long r18, long r20, java.util.List r22, int r23, gy3.C8480h r24) {
            /*
                r11 = this;
                r0 = r23 & 1
                r1 = 0
                if (r0 == 0) goto L_0x0008
                r3 = r1
                goto L_0x0009
            L_0x0008:
                r3 = r12
            L_0x0009:
                r0 = r23 & 2
                if (r0 == 0) goto L_0x000f
                r5 = r1
                goto L_0x0010
            L_0x000f:
                r5 = r14
            L_0x0010:
                r0 = r23 & 4
                if (r0 == 0) goto L_0x0016
                r7 = r1
                goto L_0x0018
            L_0x0016:
                r7 = r16
            L_0x0018:
                r0 = r23 & 8
                if (r0 == 0) goto L_0x001e
                r9 = r1
                goto L_0x0020
            L_0x001e:
                r9 = r18
            L_0x0020:
                r0 = r23 & 16
                if (r0 == 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r1 = r20
            L_0x0027:
                r0 = r23 & 32
                if (r0 == 0) goto L_0x002d
                r0 = 0
                goto L_0x002f
            L_0x002d:
                r0 = r22
            L_0x002f:
                r12 = r11
                r13 = r3
                r15 = r5
                r17 = r7
                r19 = r9
                r21 = r1
                r23 = r0
                r12.<init>(r13, r15, r17, r19, r21, r23)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveCommentWrapperInfoPayload.<init>(long, long, long, long, long, java.util.List, int, gy3.h):void");
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LivePlayGamePayLoad;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad */
    public static final class LivePlayGamePayLoad implements Parcelable {
        public static final Parcelable.Creator<LivePlayGamePayLoad> CREATOR = new C85227a();

        /* renamed from: d */
        public int f248287d;

        /* renamed from: e */
        public String f248288e;

        /* renamed from: f */
        public String f248289f;

        /* renamed from: g */
        public String f248290g;

        /* renamed from: h */
        public String f248291h;

        /* renamed from: i */
        public String f248292i;

        /* renamed from: j */
        public int f248293j;

        /* renamed from: n */
        public String f248294n;

        /* renamed from: o */
        public int f248295o;

        /* renamed from: p */
        public int f248296p;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad$a */
        public static final class C85227a implements Parcelable.Creator<LivePlayGamePayLoad> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new LivePlayGamePayLoad(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new LivePlayGamePayLoad[i];
            }
        }

        public LivePlayGamePayLoad(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, int i3, int i4) {
            this.f248287d = i;
            this.f248288e = str;
            this.f248289f = str2;
            this.f248290g = str3;
            this.f248291h = str4;
            this.f248292i = str5;
            this.f248293j = i2;
            this.f248294n = str6;
            this.f248295o = i3;
            this.f248296p = i4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LivePlayGamePayLoad)) {
                return false;
            }
            LivePlayGamePayLoad livePlayGamePayLoad = (LivePlayGamePayLoad) obj;
            return this.f248287d == livePlayGamePayLoad.f248287d && C87412m.m108589b(this.f248288e, livePlayGamePayLoad.f248288e) && C87412m.m108589b(this.f248289f, livePlayGamePayLoad.f248289f) && C87412m.m108589b(this.f248290g, livePlayGamePayLoad.f248290g) && C87412m.m108589b(this.f248291h, livePlayGamePayLoad.f248291h) && C87412m.m108589b(this.f248292i, livePlayGamePayLoad.f248292i) && this.f248293j == livePlayGamePayLoad.f248293j && C87412m.m108589b(this.f248294n, livePlayGamePayLoad.f248294n) && this.f248295o == livePlayGamePayLoad.f248295o && this.f248296p == livePlayGamePayLoad.f248296p;
        }

        public int hashCode() {
            int i = this.f248287d * 31;
            String str = this.f248288e;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f248289f;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f248290g;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f248291h;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f248292i;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f248293j) * 31;
            String str6 = this.f248294n;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            return ((((hashCode5 + i2) * 31) + this.f248295o) * 31) + this.f248296p;
        }

        public String toString() {
            return "LivePlayGamePayLoad(join_team_mode=" + this.f248287d + ", title=" + this.f248288e + ", teamup_desc=" + this.f248289f + ", member_desc=" + this.f248290g + ", teamup_extra_data=" + this.f248291h + ", appid=" + this.f248292i + ", versionType=" + this.f248293j + ", path=" + this.f248294n + ", sourceId=" + this.f248295o + ", type=" + this.f248296p + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f248287d);
            parcel.writeString(this.f248288e);
            parcel.writeString(this.f248289f);
            parcel.writeString(this.f248290g);
            parcel.writeString(this.f248291h);
            parcel.writeString(this.f248292i);
            parcel.writeInt(this.f248293j);
            parcel.writeString(this.f248294n);
            parcel.writeInt(this.f248295o);
            parcel.writeInt(this.f248296p);
        }

        public LivePlayGamePayLoad() {
            this(0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0, 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveSingleCommentPayload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload */
    public static final class LiveSingleCommentPayload implements Parcelable {
        public static final Parcelable.Creator<LiveSingleCommentPayload> CREATOR = new C30120a();

        /* renamed from: d */
        public Integer f81441d;

        /* renamed from: e */
        public String f81442e;

        /* renamed from: f */
        public String f81443f;

        /* renamed from: g */
        public String f81444g;

        /* renamed from: h */
        public Integer f81445h;

        /* renamed from: i */
        public Long f81446i;

        /* renamed from: j */
        public Integer f81447j;

        /* renamed from: n */
        public Integer f81448n;

        /* renamed from: o */
        public String f81449o;

        /* renamed from: p */
        public String f81450p;

        /* renamed from: q */
        public String f81451q;

        /* renamed from: r */
        public int f81452r;

        /* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload$a */
        public static final class C30120a implements Parcelable.Creator<LiveSingleCommentPayload> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new LiveSingleCommentPayload(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new LiveSingleCommentPayload[i];
            }
        }

        public LiveSingleCommentPayload() {
            this((Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Long) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, 0, 4095, (C8480h) null);
        }

        public LiveSingleCommentPayload(Integer num, String str, String str2, String str3, Integer num2, Long l, Integer num3, Integer num4, String str4, String str5, String str6, int i) {
            this.f81441d = num;
            this.f81442e = str;
            this.f81443f = str2;
            this.f81444g = str3;
            this.f81445h = num2;
            this.f81446i = l;
            this.f81447j = num3;
            this.f81448n = num4;
            this.f81449o = str4;
            this.f81450p = str5;
            this.f81451q = str6;
            this.f81452r = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveSingleCommentPayload)) {
                return false;
            }
            LiveSingleCommentPayload liveSingleCommentPayload = (LiveSingleCommentPayload) obj;
            return C87412m.m108589b(this.f81441d, liveSingleCommentPayload.f81441d) && C87412m.m108589b(this.f81442e, liveSingleCommentPayload.f81442e) && C87412m.m108589b(this.f81443f, liveSingleCommentPayload.f81443f) && C87412m.m108589b(this.f81444g, liveSingleCommentPayload.f81444g) && C87412m.m108589b(this.f81445h, liveSingleCommentPayload.f81445h) && C87412m.m108589b(this.f81446i, liveSingleCommentPayload.f81446i) && C87412m.m108589b(this.f81447j, liveSingleCommentPayload.f81447j) && C87412m.m108589b(this.f81448n, liveSingleCommentPayload.f81448n) && C87412m.m108589b(this.f81449o, liveSingleCommentPayload.f81449o) && C87412m.m108589b(this.f81450p, liveSingleCommentPayload.f81450p) && C87412m.m108589b(this.f81451q, liveSingleCommentPayload.f81451q) && this.f81452r == liveSingleCommentPayload.f81452r;
        }

        public int hashCode() {
            Integer num = this.f81441d;
            int i = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f81442e;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f81443f;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f81444g;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.f81445h;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Long l = this.f81446i;
            int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num3 = this.f81447j;
            int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f81448n;
            int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str4 = this.f81449o;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f81450p;
            int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f81451q;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return ((hashCode10 + i) * 31) + this.f81452r;
        }

        public String toString() {
            return "LiveSingleCommentPayload(msgType=" + this.f81441d + ", senderNickName=" + this.f81442e + ", senderHeadImgUrl=" + this.f81443f + ", content=" + this.f81444g + ", msgCreateTime=" + this.f81445h + ", msgSeq=" + this.f81446i + ", comboRewardCount=" + this.f81447j + ", rankingPosition=" + this.f81448n + ", rewardProductId=" + this.f81449o + ", thumbnailFileUrl=" + this.f81450p + ", giftName=" + this.f81451q + ", comboProductCount=" + this.f81452r + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            Integer num = this.f81441d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.f81442e);
            parcel.writeString(this.f81443f);
            parcel.writeString(this.f81444g);
            Integer num2 = this.f81445h;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            Long l = this.f81446i;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Integer num3 = this.f81447j;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
            Integer num4 = this.f81448n;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num4.intValue());
            }
            parcel.writeString(this.f81449o);
            parcel.writeString(this.f81450p);
            parcel.writeString(this.f81451q);
            parcel.writeInt(this.f81452r);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ LiveSingleCommentPayload(java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.Long r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, int r27, gy3.C8480h r28) {
            /*
                r14 = this;
                r0 = r27
                r1 = r0 & 1
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                if (r1 == 0) goto L_0x000d
                r1 = r3
                goto L_0x000e
            L_0x000d:
                r1 = r15
            L_0x000e:
                r4 = r0 & 2
                r5 = 0
                if (r4 == 0) goto L_0x0015
                r4 = r5
                goto L_0x0017
            L_0x0015:
                r4 = r16
            L_0x0017:
                r6 = r0 & 4
                if (r6 == 0) goto L_0x001d
                r6 = r5
                goto L_0x001f
            L_0x001d:
                r6 = r17
            L_0x001f:
                r7 = r0 & 8
                if (r7 == 0) goto L_0x0025
                r7 = r5
                goto L_0x0027
            L_0x0025:
                r7 = r18
            L_0x0027:
                r8 = r0 & 16
                if (r8 == 0) goto L_0x002d
                r8 = r3
                goto L_0x002f
            L_0x002d:
                r8 = r19
            L_0x002f:
                r9 = r0 & 32
                if (r9 == 0) goto L_0x003a
                r9 = 0
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                goto L_0x003c
            L_0x003a:
                r9 = r20
            L_0x003c:
                r10 = r0 & 64
                if (r10 == 0) goto L_0x0042
                r10 = r3
                goto L_0x0044
            L_0x0042:
                r10 = r21
            L_0x0044:
                r11 = r0 & 128(0x80, float:1.794E-43)
                if (r11 == 0) goto L_0x0049
                goto L_0x004b
            L_0x0049:
                r3 = r22
            L_0x004b:
                r11 = r0 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L_0x0051
                r11 = r5
                goto L_0x0053
            L_0x0051:
                r11 = r23
            L_0x0053:
                r12 = r0 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L_0x0059
                r12 = r5
                goto L_0x005b
            L_0x0059:
                r12 = r24
            L_0x005b:
                r13 = r0 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L_0x0060
                goto L_0x0062
            L_0x0060:
                r5 = r25
            L_0x0062:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x0067
                goto L_0x0069
            L_0x0067:
                r2 = r26
            L_0x0069:
                r15 = r14
                r16 = r1
                r17 = r4
                r18 = r6
                r19 = r7
                r20 = r8
                r21 = r9
                r22 = r10
                r23 = r3
                r24 = r11
                r25 = r12
                r26 = r5
                r27 = r2
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveSingleCommentPayload.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int, gy3.h):void");
        }
    }
}
