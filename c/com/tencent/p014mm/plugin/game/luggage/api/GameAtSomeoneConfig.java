package com.tencent.p014mm.plugin.game.luggage.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig */
public class GameAtSomeoneConfig implements Parcelable {
    public static final Parcelable.Creator<GameAtSomeoneConfig> CREATOR = new C41899a();

    /* renamed from: d */
    public String f112889d;

    /* renamed from: e */
    public boolean f112890e = false;

    /* renamed from: f */
    public boolean f112891f = false;

    /* renamed from: g */
    public boolean f112892g = false;

    /* renamed from: h */
    public String f112893h;

    /* renamed from: i */
    public String f112894i;

    /* renamed from: j */
    public String f112895j;

    /* renamed from: n */
    public String f112896n;

    /* renamed from: o */
    public int f112897o;

    /* renamed from: p */
    public int f112898p;

    /* renamed from: com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig$a */
    public class C41899a implements Parcelable.Creator<GameAtSomeoneConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new GameAtSomeoneConfig(parcel);
        }

        public Object[] newArray(int i) {
            return new GameAtSomeoneConfig[i];
        }
    }

    public GameAtSomeoneConfig() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112889d);
        parcel.writeInt(this.f112890e ? 1 : 0);
        parcel.writeInt(this.f112891f ? 1 : 0);
        parcel.writeInt(this.f112892g ? 1 : 0);
        parcel.writeString(this.f112893h);
        parcel.writeString(this.f112894i);
        parcel.writeString(this.f112895j);
        parcel.writeString(this.f112896n);
        parcel.writeInt(this.f112897o);
        parcel.writeInt(this.f112898p);
    }

    public GameAtSomeoneConfig(Parcel parcel) {
        boolean z = false;
        this.f112889d = parcel.readString();
        this.f112890e = parcel.readInt() == 1;
        this.f112891f = parcel.readInt() == 1;
        this.f112892g = parcel.readInt() == 1 ? true : z;
        this.f112893h = parcel.readString();
        this.f112894i = parcel.readString();
        this.f112895j = parcel.readString();
        this.f112896n = parcel.readString();
        this.f112897o = parcel.readInt();
        this.f112898p = parcel.readInt();
    }
}
