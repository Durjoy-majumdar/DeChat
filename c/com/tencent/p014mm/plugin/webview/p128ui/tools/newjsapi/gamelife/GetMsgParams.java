package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetMsgParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgParams */
public final class GetMsgParams implements Parcelable {
    public static final Parcelable.Creator<GetMsgParams> CREATOR = new C6452a();

    /* renamed from: d */
    public final String f23506d;

    /* renamed from: e */
    public final long f23507e;

    /* renamed from: f */
    public final int f23508f;

    /* renamed from: g */
    public final boolean f23509g;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgParams$a */
    public static final class C6452a implements Parcelable.Creator<GetMsgParams> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new GetMsgParams(parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new GetMsgParams[i];
        }
    }

    public GetMsgParams(String str, long j, int i, boolean z) {
        C87412m.m108594g(str, "sessionId");
        this.f23506d = str;
        this.f23507e = j;
        this.f23508f = i;
        this.f23509g = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f23506d);
        parcel.writeLong(this.f23507e);
        parcel.writeInt(this.f23508f);
        parcel.writeInt(this.f23509g ? 1 : 0);
    }
}
