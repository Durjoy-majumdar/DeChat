package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/AddConversationParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.AddConversationParams */
public final class AddConversationParams implements Parcelable {
    public static final Parcelable.Creator<AddConversationParams> CREATOR = new C6443a();

    /* renamed from: d */
    public final String f23467d;

    /* renamed from: e */
    public final String f23468e;

    /* renamed from: f */
    public final String f23469f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.AddConversationParams$a */
    public static final class C6443a implements Parcelable.Creator<AddConversationParams> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AddConversationParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new AddConversationParams[i];
        }
    }

    public AddConversationParams(String str, String str2, String str3) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "selfUserName");
        C87412m.m108594g(str3, "talker");
        this.f23467d = str;
        this.f23468e = str2;
        this.f23469f = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f23467d);
        parcel.writeString(this.f23468e);
        parcel.writeString(this.f23469f);
    }
}
