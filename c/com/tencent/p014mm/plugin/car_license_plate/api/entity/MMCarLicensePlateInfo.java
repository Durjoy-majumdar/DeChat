package com.tencent.p014mm.plugin.car_license_plate.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;", "Landroid/os/Parcelable;", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo */
public final class MMCarLicensePlateInfo implements Parcelable {
    public static final Parcelable.Creator<MMCarLicensePlateInfo> CREATOR = new C85114a();

    /* renamed from: d */
    public ArrayList<String> f247996d;

    /* renamed from: e */
    public String f247997e;

    /* renamed from: f */
    public boolean f247998f;

    /* renamed from: g */
    public int f247999g;

    /* renamed from: com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo$a */
    public static final class C85114a implements Parcelable.Creator<MMCarLicensePlateInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MMCarLicensePlateInfo(parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new MMCarLicensePlateInfo[i];
        }
    }

    public MMCarLicensePlateInfo() {
        this((ArrayList) null, (String) null, false, 0, 15, (C8480h) null);
    }

    public MMCarLicensePlateInfo(ArrayList<String> arrayList, String str, boolean z, int i) {
        C87412m.m108594g(arrayList, "plateNoList");
        C87412m.m108594g(str, "defaultPlateNo");
        this.f247996d = arrayList;
        this.f247997e = str;
        this.f247998f = z;
        this.f247999g = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MMCarLicensePlateInfo)) {
            return false;
        }
        MMCarLicensePlateInfo mMCarLicensePlateInfo = (MMCarLicensePlateInfo) obj;
        return C87412m.m108589b(this.f247996d, mMCarLicensePlateInfo.f247996d) && C87412m.m108589b(this.f247997e, mMCarLicensePlateInfo.f247997e) && this.f247998f == mMCarLicensePlateInfo.f247998f && this.f247999g == mMCarLicensePlateInfo.f247999g;
    }

    public int hashCode() {
        int hashCode = ((this.f247996d.hashCode() * 31) + this.f247997e.hashCode()) * 31;
        boolean z = this.f247998f;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f247999g;
    }

    public String toString() {
        return "MMCarLicensePlateInfo(plateNoList=" + this.f247996d + ", defaultPlateNo=" + this.f247997e + ", isModifyBanned=" + this.f247998f + ", maxCount=" + this.f247999g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeStringList(this.f247996d);
        parcel.writeString(this.f247997e);
        parcel.writeInt(this.f247998f ? 1 : 0);
        parcel.writeInt(this.f247999g);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MMCarLicensePlateInfo(ArrayList arrayList, String str, boolean z, int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? new ArrayList() : arrayList, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? Integer.MAX_VALUE : i);
    }
}
