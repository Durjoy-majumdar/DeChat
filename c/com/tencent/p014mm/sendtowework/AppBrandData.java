package com.tencent.p014mm.sendtowework;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sendtowework/AppBrandData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "a", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sendtowework.AppBrandData */
public final class AppBrandData extends BaseDataToWeWork {
    public static final C85768a CREATOR = new C85768a((C8480h) null);

    /* renamed from: d */
    public final String f249798d;

    /* renamed from: e */
    public final String f249799e;

    /* renamed from: f */
    public final String f249800f;

    /* renamed from: g */
    public final String f249801g;

    /* renamed from: h */
    public final String f249802h;

    /* renamed from: i */
    public final String f249803i;

    /* renamed from: j */
    public final Integer f249804j;

    /* renamed from: com.tencent.mm.sendtowework.AppBrandData$a */
    public static final class C85768a implements Parcelable.Creator<AppBrandData> {
        public C85768a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Object readValue = parcel.readValue(Integer.TYPE.getClassLoader());
            return new AppBrandData(readString, readString2, readString3, readString4, readString5, readString6, readValue instanceof Integer ? (Integer) readValue : null);
        }

        public Object[] newArray(int i) {
            return new AppBrandData[i];
        }
    }

    public AppBrandData(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.f249798d = str;
        this.f249799e = str2;
        this.f249800f = str3;
        this.f249801g = str4;
        this.f249802h = str5;
        this.f249803i = str6;
        this.f249804j = num;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f249798d);
        parcel.writeString(this.f249799e);
        parcel.writeString(this.f249800f);
        parcel.writeString(this.f249801g);
        parcel.writeString(this.f249802h);
        parcel.writeString(this.f249803i);
        parcel.writeValue(this.f249804j);
    }
}
