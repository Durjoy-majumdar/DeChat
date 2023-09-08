package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetSessionIdParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetSessionIdParams */
public final class GetSessionIdParams implements Parcelable {
    public static final Parcelable.Creator<GetSessionIdParams> CREATOR = new C6453a();

    /* renamed from: d */
    public final String f23510d;

    /* renamed from: e */
    public final String f23511e;

    /* renamed from: f */
    public final int f23512f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetSessionIdParams$a */
    public static final class C6453a implements Parcelable.Creator<GetSessionIdParams> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new GetSessionIdParams(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new GetSessionIdParams[i];
        }
    }

    public GetSessionIdParams(String str, String str2, int i) {
        C87412m.m108594g(str, "selfUserName");
        C87412m.m108594g(str2, "talker");
        this.f23510d = str;
        this.f23511e = str2;
        this.f23512f = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f23510d);
        parcel.writeString(this.f23511e);
        parcel.writeInt(this.f23512f);
    }
}
