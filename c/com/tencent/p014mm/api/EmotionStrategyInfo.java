package com.tencent.p014mm.api;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/api/EmotionStrategyInfo;", "Landroid/os/Parcelable;", "emojisdk-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.api.EmotionStrategyInfo */
public final class EmotionStrategyInfo implements Parcelable {
    public static final Parcelable.Creator<EmotionStrategyInfo> CREATOR = new C92460a();

    /* renamed from: d */
    public String f264619d;

    /* renamed from: e */
    public String f264620e;

    /* renamed from: com.tencent.mm.api.EmotionStrategyInfo$a */
    public static final class C92460a implements Parcelable.Creator<EmotionStrategyInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new EmotionStrategyInfo(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new EmotionStrategyInfo[i];
        }
    }

    public EmotionStrategyInfo(String str, String str2) {
        C87412m.m108594g(str, "md5");
        C87412m.m108594g(str2, "queryWording");
        this.f264619d = str;
        this.f264620e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmotionStrategyInfo)) {
            return false;
        }
        EmotionStrategyInfo emotionStrategyInfo = (EmotionStrategyInfo) obj;
        return C87412m.m108589b(this.f264619d, emotionStrategyInfo.f264619d) && C87412m.m108589b(this.f264620e, emotionStrategyInfo.f264620e);
    }

    public int hashCode() {
        return (this.f264619d.hashCode() * 31) + this.f264620e.hashCode();
    }

    public String toString() {
        return "EmotionStrategyInfo(md5=" + this.f264619d + ", queryWording=" + this.f264620e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f264619d);
        parcel.writeString(this.f264620e);
    }

    public EmotionStrategyInfo() {
        this("", "");
    }
}
