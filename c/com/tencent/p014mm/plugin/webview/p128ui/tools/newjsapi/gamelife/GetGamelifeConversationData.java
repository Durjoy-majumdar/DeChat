package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeConversationData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData */
public final class GetGamelifeConversationData implements Parcelable {
    public static final Parcelable.Creator<GetGamelifeConversationData> CREATOR = new C6449a();

    /* renamed from: d */
    public final List<GamelifeConversationData> f23497d;

    /* renamed from: e */
    public final String f23498e;

    /* renamed from: f */
    public final boolean f23499f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData$a */
    public static final class C6449a implements Parcelable.Creator<GetGamelifeConversationData> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C87412m.m108594g(parcel, "parcel");
            boolean z = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(GamelifeConversationData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new GetGamelifeConversationData(arrayList, readString, z);
        }

        public Object[] newArray(int i) {
            return new GetGamelifeConversationData[i];
        }
    }

    public GetGamelifeConversationData(List<GamelifeConversationData> list, String str, boolean z) {
        C87412m.m108594g(str, "errmsg");
        this.f23497d = list;
        this.f23498e = str;
        this.f23499f = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        List<GamelifeConversationData> list = this.f23497d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (GamelifeConversationData writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f23498e);
        parcel.writeInt(this.f23499f ? 1 : 0);
    }
}
