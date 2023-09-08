package com.tencent.p014mm.sendtowework;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sendtowework/LocationData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "a", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sendtowework.LocationData */
public final class LocationData extends BaseDataToWeWork {
    public static final C96920a CREATOR = new C96920a((C8480h) null);

    /* renamed from: d */
    public final String f283920d;

    /* renamed from: e */
    public final String f283921e;

    /* renamed from: f */
    public final Double f283922f;

    /* renamed from: g */
    public final Double f283923g;

    /* renamed from: h */
    public final Double f283924h;

    /* renamed from: com.tencent.mm.sendtowework.LocationData$a */
    public static final class C96920a implements Parcelable.Creator<LocationData> {
        public C96920a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Object readValue = parcel.readValue(Double.TYPE.getClassLoader());
            Double d = readValue instanceof Double ? (Double) readValue : null;
            Object readValue2 = parcel.readValue(Double.TYPE.getClassLoader());
            Double d2 = readValue2 instanceof Double ? (Double) readValue2 : null;
            Object readValue3 = parcel.readValue(Double.TYPE.getClassLoader());
            return new LocationData(readString, readString2, d, d2, readValue3 instanceof Double ? (Double) readValue3 : null);
        }

        public Object[] newArray(int i) {
            return new LocationData[i];
        }
    }

    public LocationData(String str, String str2, Double d, Double d2, Double d3) {
        this.f283920d = str;
        this.f283921e = str2;
        this.f283922f = d;
        this.f283923g = d2;
        this.f283924h = d3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f283920d);
        parcel.writeString(this.f283921e);
        parcel.writeValue(this.f283922f);
        parcel.writeValue(this.f283923g);
        parcel.writeValue(this.f283924h);
    }
}
