package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetMsgList;", "Landroid/os/Parcelable;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgList */
public final class GetMsgList implements Parcelable {
    public static final Parcelable.Creator<GetMsgList> CREATOR = new C6451a();

    /* renamed from: d */
    public final List<GameLifeMsg> f23503d;

    /* renamed from: e */
    public final boolean f23504e;

    /* renamed from: f */
    public final String f23505f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgList$a */
    public static final class C6451a implements Parcelable.Creator<GetMsgList> {
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
                    arrayList2.add(GameLifeMsg.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new GetMsgList(arrayList, z, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new GetMsgList[i];
        }
    }

    public GetMsgList(List<GameLifeMsg> list, boolean z, String str) {
        C87412m.m108594g(str, "errmsg");
        this.f23503d = list;
        this.f23504e = z;
        this.f23505f = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        List<GameLifeMsg> list = this.f23503d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (GameLifeMsg writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.f23504e ? 1 : 0);
        parcel.writeString(this.f23505f);
    }
}
