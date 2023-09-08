package com.tencent.p014mm.plugin.game.luggage.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.game.luggage.api.GameInputConfig */
public class GameInputConfig implements Parcelable {
    public static final Parcelable.Creator<GameInputConfig> CREATOR = new C4448a();

    /* renamed from: d */
    public String f19190d;

    /* renamed from: e */
    public String f19191e;

    /* renamed from: f */
    public String f19192f;

    /* renamed from: g */
    public boolean f19193g = false;

    /* renamed from: h */
    public boolean f19194h = false;

    /* renamed from: i */
    public int f19195i = 1000;

    /* renamed from: j */
    public boolean f19196j = false;

    /* renamed from: n */
    public String f19197n;

    /* renamed from: o */
    public boolean f19198o = true;

    /* renamed from: p */
    public boolean f19199p;

    /* renamed from: q */
    public int f19200q;

    /* renamed from: r */
    public boolean f19201r;

    /* renamed from: s */
    public String f19202s;

    /* renamed from: t */
    public boolean f19203t = false;

    /* renamed from: u */
    public String f19204u;

    /* renamed from: v */
    public String f19205v;

    /* renamed from: w */
    public int f19206w;

    /* renamed from: x */
    public int f19207x = 1000;

    /* renamed from: y */
    public String f19208y = "send";

    /* renamed from: com.tencent.mm.plugin.game.luggage.api.GameInputConfig$a */
    public class C4448a implements Parcelable.Creator<GameInputConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new GameInputConfig(parcel);
        }

        public Object[] newArray(int i) {
            return new GameInputConfig[i];
        }
    }

    public GameInputConfig() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19190d);
        parcel.writeString(this.f19191e);
        parcel.writeString(this.f19192f);
        parcel.writeInt(this.f19193g ? 1 : 0);
        parcel.writeInt(this.f19194h ? 1 : 0);
        parcel.writeInt(this.f19195i);
        parcel.writeInt(this.f19196j ? 1 : 0);
        parcel.writeString(this.f19197n);
        parcel.writeInt(this.f19198o ? 1 : 0);
        parcel.writeInt(this.f19199p ? 1 : 0);
        parcel.writeInt(this.f19200q);
        parcel.writeInt(this.f19201r ? 1 : 0);
        parcel.writeString(this.f19202s);
        parcel.writeInt(this.f19207x);
        parcel.writeString(this.f19208y);
        parcel.writeInt(this.f19203t ? 1 : 0);
        parcel.writeString(this.f19204u);
        parcel.writeString(this.f19205v);
        parcel.writeInt(this.f19206w);
    }

    public GameInputConfig(Parcel parcel) {
        boolean z = false;
        this.f19190d = parcel.readString();
        this.f19191e = parcel.readString();
        this.f19192f = parcel.readString();
        this.f19193g = parcel.readInt() == 1;
        this.f19194h = parcel.readInt() == 1;
        this.f19195i = parcel.readInt();
        this.f19196j = parcel.readInt() == 1;
        this.f19197n = parcel.readString();
        this.f19198o = parcel.readInt() == 1;
        this.f19199p = parcel.readInt() == 1;
        this.f19200q = parcel.readInt();
        this.f19201r = parcel.readInt() == 1;
        this.f19202s = parcel.readString();
        this.f19207x = parcel.readInt();
        this.f19208y = parcel.readString();
        this.f19203t = parcel.readInt() == 1 ? true : z;
        this.f19204u = parcel.readString();
        this.f19205v = parcel.readString();
        this.f19206w = parcel.readInt();
    }
}
