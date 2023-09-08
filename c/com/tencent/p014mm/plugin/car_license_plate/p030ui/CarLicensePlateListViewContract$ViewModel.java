package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C64186f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewModel", "Landroid/os/Parcelable;", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel */
public final class CarLicensePlateListViewContract$ViewModel implements Parcelable {
    public static final Parcelable.Creator<CarLicensePlateListViewContract$ViewModel> CREATOR = new C85127a();

    /* renamed from: d */
    public MMCarLicensePlateInfo f248031d;

    /* renamed from: e */
    public boolean f248032e;

    /* renamed from: f */
    public String f248033f;

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel$a */
    public static final class C85127a implements Parcelable.Creator<CarLicensePlateListViewContract$ViewModel> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new CarLicensePlateListViewContract$ViewModel(parcel.readInt() == 0 ? null : MMCarLicensePlateInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new CarLicensePlateListViewContract$ViewModel[i];
        }
    }

    public CarLicensePlateListViewContract$ViewModel() {
        this((MMCarLicensePlateInfo) null, false, (String) null, 7, (C8480h) null);
    }

    public CarLicensePlateListViewContract$ViewModel(MMCarLicensePlateInfo mMCarLicensePlateInfo, boolean z, String str) {
        this.f248031d = mMCarLicensePlateInfo;
        this.f248032e = z;
        this.f248033f = str;
    }

    /* renamed from: a */
    public final void mo118134a(String str) {
        C87412m.m108594g(str, "plate");
        if (C87412m.m108589b((Object) null, this.f248031d)) {
            MMCarLicensePlateInfo mMCarLicensePlateInfo = new MMCarLicensePlateInfo((ArrayList) null, (String) null, false, 0, 15, (C8480h) null);
            mMCarLicensePlateInfo.f247996d.add(str);
            this.f248031d = mMCarLicensePlateInfo;
            return;
        }
        MMCarLicensePlateInfo mMCarLicensePlateInfo2 = this.f248031d;
        C87412m.m108591d(mMCarLicensePlateInfo2);
        mMCarLicensePlateInfo2.f247996d.add(str);
    }

    /* renamed from: b */
    public final void mo118135b(List<String> list) {
        if (C87412m.m108589b((Object) null, this.f248031d)) {
            this.f248031d = new MMCarLicensePlateInfo((ArrayList) null, (String) null, false, 0, 15, (C8480h) null);
        }
        MMCarLicensePlateInfo mMCarLicensePlateInfo = this.f248031d;
        C87412m.m108591d(mMCarLicensePlateInfo);
        mMCarLicensePlateInfo.f247996d.clear();
        ArrayList<String> arrayList = mMCarLicensePlateInfo.f247996d;
        if (list == null) {
            list = C64186f0.f181907d;
        }
        arrayList.addAll(list);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        MMCarLicensePlateInfo mMCarLicensePlateInfo = this.f248031d;
        if (mMCarLicensePlateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mMCarLicensePlateInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f248032e ? 1 : 0);
        parcel.writeString(this.f248033f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CarLicensePlateListViewContract$ViewModel(MMCarLicensePlateInfo mMCarLicensePlateInfo, boolean z, String str, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : mMCarLicensePlateInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }
}
