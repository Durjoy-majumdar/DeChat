package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeSessionIdData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeSessionIdData */
public final class GetGamelifeSessionIdData implements Parcelable {
    public static final Parcelable.Creator<GetGamelifeSessionIdData> CREATOR = new C6450a();

    /* renamed from: d */
    public final String f23500d;

    /* renamed from: e */
    public final String f23501e;

    /* renamed from: f */
    public final boolean f23502f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeSessionIdData$a */
    public static final class C6450a implements Parcelable.Creator<GetGamelifeSessionIdData> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new GetGamelifeSessionIdData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new GetGamelifeSessionIdData[i];
        }
    }

    public GetGamelifeSessionIdData(String str, String str2, boolean z) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "errmsg");
        this.f23500d = str;
        this.f23501e = str2;
        this.f23502f = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f23500d);
        parcel.writeString(this.f23501e);
        parcel.writeInt(this.f23502f ? 1 : 0);
    }
}
