package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeContactData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeContactData */
public final class GetGamelifeContactData implements Parcelable {
    public static final Parcelable.Creator<GetGamelifeContactData> CREATOR = new C6448a();

    /* renamed from: d */
    public final LinkedList<Map<String, String>> f23494d;

    /* renamed from: e */
    public final String f23495e;

    /* renamed from: f */
    public final boolean f23496f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeContactData$a */
    public static final class C6448a implements Parcelable.Creator<GetGamelifeContactData> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new GetGamelifeContactData((LinkedList) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new GetGamelifeContactData[i];
        }
    }

    public GetGamelifeContactData(LinkedList<Map<String, String>> linkedList, String str, boolean z) {
        C87412m.m108594g(str, "errmsg");
        this.f23494d = linkedList;
        this.f23495e = str;
        this.f23496f = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeSerializable(this.f23494d);
        parcel.writeString(this.f23495e);
        parcel.writeInt(this.f23496f ? 1 : 0);
    }
}
