package com.tencent.p014mm.sendtowework;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sendtowework/FileData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "a", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sendtowework.FileData */
public final class FileData extends BaseDataToWeWork {
    public static final C85770a CREATOR = new C85770a((C8480h) null);

    /* renamed from: d */
    public final String f249805d;

    /* renamed from: e */
    public final Long f249806e;

    /* renamed from: f */
    public final String f249807f;

    /* renamed from: com.tencent.mm.sendtowework.FileData$a */
    public static final class C85770a implements Parcelable.Creator<FileData> {
        public C85770a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            Object readValue = parcel.readValue(Long.TYPE.getClassLoader());
            return new FileData(readString, readValue instanceof Long ? (Long) readValue : null, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new FileData[i];
        }
    }

    public FileData(String str, Long l, String str2) {
        this.f249805d = str;
        this.f249806e = l;
        this.f249807f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f249805d);
        parcel.writeValue(this.f249806e);
        parcel.writeString(this.f249807f);
    }
}
