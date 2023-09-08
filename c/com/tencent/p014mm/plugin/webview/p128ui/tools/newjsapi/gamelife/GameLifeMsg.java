package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GameLifeMsg;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GameLifeMsg */
public final class GameLifeMsg implements Parcelable {
    public static final Parcelable.Creator<GameLifeMsg> CREATOR = new C6445a();

    /* renamed from: d */
    public final String f23473d;

    /* renamed from: e */
    public final String f23474e;

    /* renamed from: f */
    public final double f23475f;

    /* renamed from: g */
    public final String f23476g;

    /* renamed from: h */
    public final int f23477h;

    /* renamed from: i */
    public final String f23478i;

    /* renamed from: j */
    public final int f23479j;

    /* renamed from: n */
    public final String f23480n;

    /* renamed from: o */
    public final String f23481o;

    /* renamed from: p */
    public final int f23482p;

    /* renamed from: q */
    public final int f23483q;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GameLifeMsg$a */
    public static final class C6445a implements Parcelable.Creator<GameLifeMsg> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new GameLifeMsg(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new GameLifeMsg[i];
        }
    }

    public GameLifeMsg(String str, String str2, double d, String str3, int i, String str4, int i2, String str5, String str6, int i3, int i4) {
        C87412m.m108594g(str, "toUsername");
        C87412m.m108594g(str2, "fromUsername");
        C87412m.m108594g(str3, "content");
        C87412m.m108594g(str4, "sessionId");
        C87412m.m108594g(str5, "msgSource");
        C87412m.m108594g(str6, "appId");
        this.f23473d = str;
        this.f23474e = str2;
        this.f23475f = d;
        this.f23476g = str3;
        this.f23477h = i;
        this.f23478i = str4;
        this.f23479j = i2;
        this.f23480n = str5;
        this.f23481o = str6;
        this.f23482p = i3;
        this.f23483q = i4;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f23473d);
        parcel.writeString(this.f23474e);
        parcel.writeDouble(this.f23475f);
        parcel.writeString(this.f23476g);
        parcel.writeInt(this.f23477h);
        parcel.writeString(this.f23478i);
        parcel.writeInt(this.f23479j);
        parcel.writeString(this.f23480n);
        parcel.writeString(this.f23481o);
        parcel.writeInt(this.f23482p);
        parcel.writeInt(this.f23483q);
    }
}
