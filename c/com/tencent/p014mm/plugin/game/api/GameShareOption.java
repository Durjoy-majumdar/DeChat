package com.tencent.p014mm.plugin.game.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.game.api.GameShareOption */
public class GameShareOption implements Parcelable {
    public static final Parcelable.Creator<GameShareOption> CREATOR = new C94078a();

    /* renamed from: d */
    public int f271645d;

    /* renamed from: e */
    public String f271646e;

    /* renamed from: f */
    public boolean f271647f;

    /* renamed from: com.tencent.mm.plugin.game.api.GameShareOption$a */
    public class C94078a implements Parcelable.Creator<GameShareOption> {
        public Object createFromParcel(Parcel parcel) {
            return new GameShareOption(parcel);
        }

        public Object[] newArray(int i) {
            return new GameShareOption[i];
        }
    }

    public GameShareOption(int i, String str, boolean z) {
        this.f271645d = i;
        this.f271646e = str;
        this.f271647f = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f271645d);
        parcel.writeString(this.f271646e);
        parcel.writeInt(this.f271647f ? 1 : 0);
    }

    public GameShareOption(Parcel parcel) {
        boolean z = false;
        this.f271647f = false;
        this.f271645d = parcel.readInt();
        this.f271646e = parcel.readString();
        this.f271647f = parcel.readInt() == 1 ? true : z;
    }
}
