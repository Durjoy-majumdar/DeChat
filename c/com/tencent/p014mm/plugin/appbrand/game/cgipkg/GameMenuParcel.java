package com.tencent.p014mm.plugin.appbrand.game.cgipkg;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.extension.C80893c;
import te3.C49362f12;

/* renamed from: com.tencent.mm.plugin.appbrand.game.cgipkg.GameMenuParcel */
public class GameMenuParcel implements Parcelable {
    public static final Parcelable.Creator<GameMenuParcel> CREATOR = new C81886a();

    /* renamed from: d */
    public String f240187d;

    /* renamed from: e */
    public C49362f12 f240188e;

    /* renamed from: com.tencent.mm.plugin.appbrand.game.cgipkg.GameMenuParcel$a */
    public class C81886a implements Parcelable.Creator<GameMenuParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new GameMenuParcel(parcel, (C81886a) null);
        }

        public Object[] newArray(int i) {
            return new GameMenuParcel[i];
        }
    }

    public GameMenuParcel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f240187d);
        C80893c.m98763d(this.f240188e, parcel);
    }

    public GameMenuParcel(Parcel parcel, C81886a aVar) {
        this.f240187d = parcel.readString();
        this.f240188e = (C49362f12) C80893c.m98762c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
    }
}
