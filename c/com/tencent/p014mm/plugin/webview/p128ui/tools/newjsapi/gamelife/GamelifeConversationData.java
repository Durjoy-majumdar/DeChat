package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeConversationData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData */
public final class GamelifeConversationData implements Parcelable {
    public static final Parcelable.Creator<GamelifeConversationData> CREATOR = new C6446a();

    /* renamed from: d */
    public final String f23484d;

    /* renamed from: e */
    public final int f23485e;

    /* renamed from: f */
    public final int f23486f;

    /* renamed from: g */
    public final String f23487g;

    /* renamed from: h */
    public final int f23488h;

    /* renamed from: i */
    public final String f23489i;

    /* renamed from: j */
    public final String f23490j;

    /* renamed from: n */
    public final String f23491n;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData$a */
    public static final class C6446a implements Parcelable.Creator<GamelifeConversationData> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new GamelifeConversationData(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new GamelifeConversationData[i];
        }
    }

    public GamelifeConversationData(String str, int i, int i2, String str2, int i3, String str3, String str4, String str5) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "draftMsg");
        C87412m.m108594g(str3, "selfUsername");
        C87412m.m108594g(str4, "talker");
        C87412m.m108594g(str5, "digest");
        this.f23484d = str;
        this.f23485e = i;
        this.f23486f = i2;
        this.f23487g = str2;
        this.f23488h = i3;
        this.f23489i = str3;
        this.f23490j = str4;
        this.f23491n = str5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f23484d);
        parcel.writeInt(this.f23485e);
        parcel.writeInt(this.f23486f);
        parcel.writeString(this.f23487g);
        parcel.writeInt(this.f23488h);
        parcel.writeString(this.f23489i);
        parcel.writeString(this.f23490j);
        parcel.writeString(this.f23491n);
    }
}
