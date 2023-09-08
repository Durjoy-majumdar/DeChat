package com.tencent.p014mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.game.model.GameTabData */
public class GameTabData implements Parcelable {
    public static final Parcelable.Creator<GameTabData> CREATOR = new C42023a();

    /* renamed from: d */
    public LinkedHashMap<String, TabItem> f113189d;

    /* renamed from: e */
    public StatusBar f113190e;

    /* renamed from: com.tencent.mm.plugin.game.model.GameTabData$TabItem */
    public static class TabItem implements Parcelable {
        public static final Parcelable.Creator<TabItem> CREATOR = new C42022a();

        /* renamed from: d */
        public String f113193d;

        /* renamed from: e */
        public String f113194e;

        /* renamed from: f */
        public String f113195f;

        /* renamed from: g */
        public boolean f113196g;

        /* renamed from: h */
        public boolean f113197h;

        /* renamed from: i */
        public int f113198i;

        /* renamed from: j */
        public int f113199j;

        /* renamed from: n */
        public String f113200n;

        /* renamed from: o */
        public String f113201o;

        /* renamed from: p */
        public String f113202p;

        /* renamed from: q */
        public boolean f113203q;

        /* renamed from: r */
        public int f113204r;

        /* renamed from: s */
        public int f113205s;

        /* renamed from: t */
        public String f113206t;

        /* renamed from: com.tencent.mm.plugin.game.model.GameTabData$TabItem$a */
        public class C42022a implements Parcelable.Creator<TabItem> {
            public Object createFromParcel(Parcel parcel) {
                return new TabItem(parcel);
            }

            public Object[] newArray(int i) {
                return new TabItem[i];
            }
        }

        public TabItem() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f113193d);
            parcel.writeString(this.f113194e);
            parcel.writeString(this.f113195f);
            parcel.writeByte(this.f113196g ? (byte) 1 : 0);
            parcel.writeByte(this.f113197h ? (byte) 1 : 0);
            parcel.writeInt(this.f113198i);
            parcel.writeInt(this.f113199j);
            parcel.writeString(this.f113200n);
            parcel.writeString(this.f113201o);
            parcel.writeString(this.f113202p);
            parcel.writeByte(this.f113203q ? (byte) 1 : 0);
            parcel.writeInt(this.f113204r);
            parcel.writeInt(this.f113205s);
            parcel.writeString(this.f113206t);
        }

        public TabItem(Parcel parcel) {
            this.f113193d = parcel.readString();
            this.f113194e = parcel.readString();
            this.f113195f = parcel.readString();
            boolean z = false;
            this.f113196g = parcel.readByte() != 0;
            this.f113197h = parcel.readByte() != 0;
            this.f113198i = parcel.readInt();
            this.f113199j = parcel.readInt();
            this.f113200n = parcel.readString();
            this.f113201o = parcel.readString();
            this.f113202p = parcel.readString();
            this.f113203q = parcel.readByte() != 0 ? true : z;
            this.f113204r = parcel.readInt();
            this.f113205s = parcel.readInt();
            this.f113206t = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.GameTabData$a */
    public class C42023a implements Parcelable.Creator<GameTabData> {
        public Object createFromParcel(Parcel parcel) {
            return new GameTabData(parcel, (C42023a) null);
        }

        public Object[] newArray(int i) {
            return new GameTabData[i];
        }
    }

    public GameTabData() {
        this.f113189d = new LinkedHashMap<>();
        this.f113190e = new StatusBar();
    }

    /* renamed from: a */
    public List<TabItem> mo65923a() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, TabItem> linkedHashMap = this.f113189d;
        if (linkedHashMap != null) {
            arrayList.addAll(linkedHashMap.values());
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f113189d.size());
        for (Map.Entry<String, TabItem> value : this.f113189d.entrySet()) {
            parcel.writeParcelable((Parcelable) value.getValue(), i);
        }
        parcel.writeParcelable(this.f113190e, i);
    }

    /* renamed from: com.tencent.mm.plugin.game.model.GameTabData$StatusBar */
    public static class StatusBar implements Parcelable {
        public static final Parcelable.Creator<StatusBar> CREATOR = new C42021a();

        /* renamed from: d */
        public String f113191d = null;

        /* renamed from: e */
        public int f113192e = 0;

        /* renamed from: com.tencent.mm.plugin.game.model.GameTabData$StatusBar$a */
        public class C42021a implements Parcelable.Creator<StatusBar> {
            public Object createFromParcel(Parcel parcel) {
                return new StatusBar(parcel);
            }

            public Object[] newArray(int i) {
                return new StatusBar[i];
            }
        }

        public StatusBar() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f113191d);
            parcel.writeInt(this.f113192e);
        }

        public StatusBar(Parcel parcel) {
            this.f113191d = parcel.readString();
            this.f113192e = parcel.readInt();
        }
    }

    public GameTabData(Parcel parcel, C42023a aVar) {
        int readInt = parcel.readInt();
        if (this.f113189d == null) {
            this.f113189d = new LinkedHashMap<>();
        }
        for (int i = 0; i < readInt; i++) {
            TabItem tabItem = (TabItem) parcel.readParcelable(TabItem.class.getClassLoader());
            if (tabItem != null) {
                this.f113189d.put(tabItem.f113193d, tabItem);
            }
        }
        this.f113190e = (StatusBar) parcel.readParcelable(StatusBar.class.getClassLoader());
    }
}
