package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeGeneralReturnParam;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam */
public final class GamelifeGeneralReturnParam implements Parcelable {
    public static final Parcelable.Creator<GamelifeGeneralReturnParam> CREATOR = new C6447a();

    /* renamed from: d */
    public final boolean f23492d;

    /* renamed from: e */
    public final String f23493e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam$a */
    public static final class C6447a implements Parcelable.Creator<GamelifeGeneralReturnParam> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new GamelifeGeneralReturnParam(parcel.readInt() != 0, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new GamelifeGeneralReturnParam[i];
        }
    }

    public GamelifeGeneralReturnParam(boolean z, String str) {
        C87412m.m108594g(str, "errmsg");
        this.f23492d = z;
        this.f23493e = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f23492d ? 1 : 0);
        parcel.writeString(this.f23493e);
    }
}
