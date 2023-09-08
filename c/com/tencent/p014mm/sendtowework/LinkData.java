package com.tencent.p014mm.sendtowework;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sendtowework/LinkData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "a", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sendtowework.LinkData */
public final class LinkData extends BaseDataToWeWork {
    public static final C72951a CREATOR = new C72951a((C8480h) null);

    /* renamed from: d */
    public final String f212630d;

    /* renamed from: e */
    public final String f212631e;

    /* renamed from: f */
    public final String f212632f;

    /* renamed from: g */
    public final String f212633g;

    /* renamed from: com.tencent.mm.sendtowework.LinkData$a */
    public static final class C72951a implements Parcelable.Creator<LinkData> {
        public C72951a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LinkData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new LinkData[i];
        }
    }

    public LinkData(String str, String str2, String str3, String str4) {
        this.f212630d = str;
        this.f212631e = str2;
        this.f212632f = str3;
        this.f212633g = str4;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f212630d);
        parcel.writeString(this.f212631e);
        parcel.writeString(this.f212632f);
        parcel.writeString(this.f212633g);
    }
}
