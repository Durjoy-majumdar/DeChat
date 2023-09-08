package com.tencent.p014mm.plugin.webview.p128ui.tools.game;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams */
public class GameSettingParams implements Parcelable {
    public static final Parcelable.Creator<GameSettingParams> CREATOR = new C44005a();

    /* renamed from: d */
    public String f119219d;

    /* renamed from: e */
    public String f119220e;

    /* renamed from: f */
    public String f119221f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams$a */
    public class C44005a implements Parcelable.Creator<GameSettingParams> {
        public Object createFromParcel(Parcel parcel) {
            return new GameSettingParams(parcel, (C44005a) null);
        }

        public Object[] newArray(int i) {
            return new GameSettingParams[i];
        }
    }

    public GameSettingParams() {
    }

    public GameSettingParams(Parcel parcel, C44005a aVar) {
        this.f119219d = parcel.readString();
        this.f119220e = parcel.readString();
        this.f119221f = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f119219d);
        parcel.writeString(this.f119220e);
        parcel.writeString(this.f119221f);
    }
}
