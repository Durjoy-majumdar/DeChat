package com.tencent.p014mm.plugin.game.luggage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo */
public class GameFloatLayerInfo implements Parcelable {
    public static final Parcelable.Creator<GameFloatLayerInfo> CREATOR = new C41878a();

    /* renamed from: d */
    public String f112846d;

    /* renamed from: e */
    public boolean f112847e = false;

    /* renamed from: f */
    public int f112848f = -1;

    /* renamed from: com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo$a */
    public class C41878a implements Parcelable.Creator<GameFloatLayerInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new GameFloatLayerInfo(parcel, (C41878a) null);
        }

        public Object[] newArray(int i) {
            return new GameFloatLayerInfo[i];
        }
    }

    public GameFloatLayerInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112846d);
        parcel.writeInt(this.f112847e ? 1 : 0);
        parcel.writeInt(this.f112848f);
    }

    public GameFloatLayerInfo(Parcel parcel, C41878a aVar) {
        boolean z = false;
        this.f112846d = parcel.readString();
        this.f112847e = parcel.readInt() == 1 ? true : z;
        this.f112848f = parcel.readInt();
    }
}
