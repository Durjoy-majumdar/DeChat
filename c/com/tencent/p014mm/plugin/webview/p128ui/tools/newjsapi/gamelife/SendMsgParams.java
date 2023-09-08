package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/SendMsgParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.SendMsgParams */
public final class SendMsgParams implements Parcelable {
    public static final Parcelable.Creator<SendMsgParams> CREATOR = new C6454a();

    /* renamed from: d */
    public final String f23513d;

    /* renamed from: e */
    public final String f23514e;

    /* renamed from: f */
    public final String f23515f;

    /* renamed from: g */
    public final String f23516g;

    /* renamed from: h */
    public final int f23517h;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.SendMsgParams$a */
    public static final class C6454a implements Parcelable.Creator<SendMsgParams> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new SendMsgParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new SendMsgParams[i];
        }
    }

    public SendMsgParams(String str, String str2, String str3, String str4, int i) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "content");
        C87412m.m108594g(str3, "selfUserName");
        C87412m.m108594g(str4, "talker");
        this.f23513d = str;
        this.f23514e = str2;
        this.f23515f = str3;
        this.f23516g = str4;
        this.f23517h = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f23513d);
        parcel.writeString(this.f23514e);
        parcel.writeString(this.f23515f);
        parcel.writeString(this.f23516g);
        parcel.writeInt(this.f23517h);
    }
}
