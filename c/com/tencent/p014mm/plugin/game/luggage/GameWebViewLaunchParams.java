package com.tencent.p014mm.plugin.game.luggage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams */
public class GameWebViewLaunchParams implements Parcelable {
    public static final Parcelable.Creator<GameWebViewLaunchParams> CREATOR = new C41879a();

    /* renamed from: d */
    public GameFloatLayerInfo f112849d;

    /* renamed from: com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams$a */
    public class C41879a implements Parcelable.Creator<GameWebViewLaunchParams> {
        public Object createFromParcel(Parcel parcel) {
            return new GameWebViewLaunchParams(parcel, (C41879a) null);
        }

        public Object[] newArray(int i) {
            return new GameWebViewLaunchParams[i];
        }
    }

    public GameWebViewLaunchParams() {
    }

    public GameWebViewLaunchParams(Parcel parcel, C41879a aVar) {
        this.f112849d = (GameFloatLayerInfo) parcel.readParcelable(GameFloatLayerInfo.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f112849d, i);
    }
}
