package com.tencent.p014mm.sendtowework;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sendtowework/TextData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "a", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sendtowework.TextData */
public final class TextData extends BaseDataToWeWork {
    public static final C72952a CREATOR = new C72952a((C8480h) null);

    /* renamed from: d */
    public final String f212634d;

    /* renamed from: com.tencent.mm.sendtowework.TextData$a */
    public static final class C72952a implements Parcelable.Creator<TextData> {
        public C72952a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new TextData(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new TextData[i];
        }
    }

    public TextData(String str) {
        this.f212634d = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f212634d);
    }
}
