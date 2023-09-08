package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/DeleteMsgParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.DeleteMsgParams */
public final class DeleteMsgParams implements Parcelable {
    public static final Parcelable.Creator<DeleteMsgParams> CREATOR = new C6444a();

    /* renamed from: d */
    public final String f23470d;

    /* renamed from: e */
    public final String f23471e;

    /* renamed from: f */
    public final boolean f23472f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.DeleteMsgParams$a */
    public static final class C6444a implements Parcelable.Creator<DeleteMsgParams> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new DeleteMsgParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new DeleteMsgParams[i];
        }
    }

    public DeleteMsgParams(String str, String str2, boolean z) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "messageList");
        this.f23470d = str;
        this.f23471e = str2;
        this.f23472f = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f23470d);
        parcel.writeString(this.f23471e);
        parcel.writeInt(this.f23472f ? 1 : 0);
    }
}
